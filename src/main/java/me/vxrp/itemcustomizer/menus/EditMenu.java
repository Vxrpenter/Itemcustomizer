package me.vxrp.itemcustomizer.menus;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import me.vxrp.itemcustomizer.CreateItem;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.Storage.ResetStorage;
import me.vxrp.itemcustomizer.menus.lore.LoreMenu;
import me.vxrp.itemcustomizer.menus.setValues.SetDisplayNameMenu;
import me.vxrp.itemcustomizer.menus.attributemodifier.AttributeModifierMenu;
import me.vxrp.itemcustomizer.menus.color.ColorMenu;
import me.vxrp.itemcustomizer.menus.effects.effectstypeonetwo.EffectsTypeMenuOne;
import me.vxrp.itemcustomizer.menus.enchants.EnchantsOne;
import me.vxrp.itemcustomizer.menus.itemflags.ItemFlagMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.ItemBuilder;

import java.util.ArrayList;
import java.util.List;

public class EditMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EditMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("editMenu")
                .provider(new EditMenu(itemcustomizer))
                .size(6, 9)
                .title(ChatColor.AQUA + "EditMenu")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }
    @Override
    public void init(Player player, InventoryContents contents) {
        EditingStorage.setStorage(player.getUniqueId());
        String permissionMessage =  plugin.getConfig().getString("missing_permission");
        String featureDisabled = plugin.getConfig().getString("feature_disabled");
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());
        Material type = EditingStorage.getItem(player.getUniqueId()).getType();

        if (EditingStorage.getConfirmed(player.getUniqueId())) {
            ResetStorage.reset(player);
            itemMeta.setUnbreakable(false);
            openMenu(player, plugin);
        }
        //Item
        if (EditingStorage.getItem(player.getUniqueId()) != null) {
            contents.set(1, 4, ClickableItem.empty(CreateItem.create(player)));
        } else if (EditingStorage.getItem(player.getUniqueId()) == null) {
            contents.set(1, 4, ClickableItem.empty(new ItemStack(Material.LIGHT)));
        }
        //ItemFlags
        final ItemStack itemFlags = new ItemBuilder(Material.GLASS)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "ItemFlags")
                .lore(ChatColor.GRAY + "With ItemFlags you can hide certain", ChatColor.GRAY + "Attributes on an Item")
                .build();
        contents.set(2, 2, ClickableItem.of(itemFlags, e -> {
            if (e.isLeftClick()) {
                if (plugin.getConfig().getBoolean("customize_edit.set_itemFlags")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagMenu.openMenu(player, plugin);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionMessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                }
            }
        }));
        //DisplayName
        final ItemStack displayName = new ItemBuilder(Material.NAME_TAG)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "DisplayName")
                .lore(ChatColor.GRAY + "Sets the display name,", ChatColor.GRAY + "'you can use color codes too'")
                .build();
        contents.set(2, 4, ClickableItem.of(displayName, e -> {
            if (e.isLeftClick()) {
                if (plugin.getConfig().getBoolean("customize_edit.set_displayName")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    SetDisplayNameMenu.openMenu(player, plugin);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionMessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                }
            }
        }));
        //Enchants
        final ItemStack enchants = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Enchants")
                .lore(ChatColor.GRAY + "Adds the specified enchantment to this item")
                .build();
        contents.set(2, 6, ClickableItem.of(enchants, e -> {
            if (e.isLeftClick()) {
                if (plugin.getConfig().getBoolean("customize_edit.set_enchants")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    EnchantsOne.openMenu(player, plugin);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionMessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                }
            }
        }));
        //Color
        if (type == Material.LEATHER_HELMET || type == Material.LEATHER_CHESTPLATE || type == Material.LEATHER_LEGGINGS || type == Material.LEATHER_BOOTS) {
            final ItemStack color = new ItemBuilder(Material.CAULDRON)
                    .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                    .displayName(ChatColor.AQUA + "Color")
                    .lore(ChatColor.GRAY + "Sets the color of the armor")
                    .build();
            contents.set(3, 1, ClickableItem.of(color, e -> {
                if (e.isLeftClick()) {
                    if (plugin.getConfig().getBoolean("customize_edit.set_color")) {
                        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                        ColorMenu.openMenu(player, plugin);
                    } else {
                        player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                        assert permissionMessage != null;
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                    }
                }
            }));
        } else {
            contents.set(3, 1, ClickableItem.of(GeneralItems.featureDisabled(), e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert featureDisabled != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', featureDisabled));
                }
            }));
        }

        //Unbreakable
        ItemStack unbreakable = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta unbreakableMeta = unbreakable.getItemMeta();
        if (itemMeta.isUnbreakable()) {
            unbreakableMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        unbreakableMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        unbreakableMeta.displayName(Component.text(ChatColor.AQUA + "Unbreakable"));
        List<Component> unbreakableLore = new ArrayList<>();
        unbreakableLore.add(Component.text(ChatColor.GRAY + "Sets the unbreakable tag. An unbreakable item will"));
        unbreakableLore.add(Component.text(ChatColor.GRAY + "not lose durability"));
        unbreakableMeta.lore(unbreakableLore);
        unbreakable.setItemMeta(unbreakableMeta);
        contents.set(3, 3, ClickableItem.of(unbreakable, e -> {
            if (e.isLeftClick()) {
                if (plugin.getConfig().getBoolean("customize_edit.set_unbreakable")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    itemMeta.setUnbreakable(!itemMeta.isUnbreakable());
                    openMenu(player, plugin);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionMessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                }
            }
        }));
        //AttributeModifier
        final ItemStack attributeModifier = new ItemBuilder(Material.COMMAND_BLOCK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Attribute Modifiers")
                .lore(ChatColor.GRAY + "Set all Attributes and their AttributeModifiers")
                .build();
        contents.set(3, 5, ClickableItem.of(attributeModifier, e -> {
            if (e.isLeftClick()) {
                if (plugin.getConfig().getBoolean("customize_edit.set_attributeModifier")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    EditingStorage.setNumber(player.getUniqueId(), 0.0);
                    EditingStorage.setEquipmentSlot(player.getUniqueId(), null);
                    AttributeModifierMenu.openMenu(player, plugin);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionMessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                }
            }
        }));
        //Effects
        if (type == Material.POTION || type == Material.LINGERING_POTION || type == Material.SPLASH_POTION) {
            final ItemStack effects = new ItemBuilder(Material.POTION)
                    .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                    .displayName(ChatColor.AQUA + "Effects")
                    .lore(ChatColor.GRAY + "Sets the effect of a potion")
                    .build();
            contents.set(3, 7, ClickableItem.of(effects, e -> {
                if (e.isLeftClick()) {
                    if (plugin.getConfig().getBoolean("customize_edit.set_effects")) {
                        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                        EditingStorage.setTimeIn(player.getUniqueId(), 0);
                        EditingStorage.setColor(player.getUniqueId(), null);
                        EditingStorage.setTime(player.getUniqueId(), 0);
                        EditingStorage.setAmplifier(player.getUniqueId(), 0);
                        EditingStorage.setPotionMeta(player.getUniqueId(), null);
                        EffectsTypeMenuOne.openMenu(player, plugin);
                    } else {
                        player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                        assert permissionMessage != null;
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionMessage));
                    }
                }
            }));

        } else {
            contents.set(3, 7, ClickableItem.of(GeneralItems.featureDisabled(), e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert featureDisabled != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', featureDisabled));
                }
            }));
        }
        //Lore
        final ItemStack lore = new ItemBuilder(Material.WRITABLE_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Lore")
                .lore(ChatColor.GRAY + "Sets the lore of the item")
                .build();
        contents.set(4, 2, ClickableItem.of(lore, e -> {
            if (e.isLeftClick()) {
                LoreMenu.openMenu(player, plugin);
            }
        }));

        //Reset
        final ItemStack reset = new ItemBuilder(Material.BARRIER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Reset")
                .lore(ChatColor.GRAY + "This will reset all changes that", ChatColor.GRAY + "have been made in this configuration")
                .build();
        contents.set(5, 8, ClickableItem.of(reset, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ConfirmMenu.openMenu(player, plugin);
            }
        }));
        //Finish
        final ItemStack finish = new ItemBuilder(Material.ANVIL)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.GREEN + "Finish")
                .lore(ChatColor.GRAY + "This finishes the item creation", ChatColor.GRAY + "all the attributes and effects you chose",
                        ChatColor.GRAY + "will be added to your item of choice")
                .build();
        contents.set(5, 4, ClickableItem.of(finish, e -> {
            if (e.isLeftClick()) {
                if (EditingStorage.getItem(player.getUniqueId()) == null) {
                    EditingStorage.setItem(player.getUniqueId(),new ItemStack(player.getInventory().getItemInMainHand().getType()));
                }
                player.playSound(player, Sound.BLOCK_ANVIL_USE, 10, 1);
                player.getInventory().addItem(CreateItem.create(player));
                player.closeInventory();
            }
        }));
    }
    @Override
    public void update(Player player, InventoryContents contents) {

    }
}
