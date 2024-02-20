package me.vxrp.itemcustomizer.menus.itemflags;

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
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.menus.EditMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;

import java.util.ArrayList;
import java.util.List;

public class ItemFlagMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public ItemFlagMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }

    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("itemFlags")
                .provider(new ItemFlagMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.AQUA + "ItemFlags")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());
        //HideAttributes
        ItemStack hideAttributes = new ItemStack(Material.ENDER_EYE);
        ItemMeta hideAttributesMeta = hideAttributes.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
            hideAttributesMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideAttributesMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hideAttributesMeta.displayName(Component.text( ChatColor.AQUA + "Hide Attributes"));
        List<Component> hideAttributesLore = new ArrayList<>();
        hideAttributesLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide Attributes like Damage"));
        hideAttributesMeta.lore(hideAttributesLore);
        hideAttributes.setItemMeta(hideAttributesMeta);
        contents.set(1, 1, ClickableItem.of(hideAttributes, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                    openMenu(player, plugin);
                }
            }
        }));
        //HideEnchants
        ItemStack hideEnchants = new ItemStack(Material.BOOK);
        ItemMeta hideEnchantsMeta = hideEnchants.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS)) {
            hideEnchantsMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideEnchantsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ENCHANTS);
        hideEnchantsMeta.displayName(Component.text(ChatColor.AQUA + "Hide Enchants"));
        List<Component> hideEnchantsLore = new ArrayList<>();
        hideEnchantsLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide enchants"));
        hideEnchantsMeta.lore(hideEnchantsLore);
        hideEnchants.setItemMeta(hideEnchantsMeta);
        contents.set(1, 2, ClickableItem.of(hideEnchants, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_ENCHANTS);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    openMenu(player, plugin);
                }
            }
        }));
        //HideDye
        ItemStack hideDye = new ItemStack(Material.WHITE_DYE);
        ItemMeta hideDyeMeta = hideDye.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DYE)) {
            hideDyeMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideDyeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        hideDyeMeta.displayName(Component.text(ChatColor.AQUA + "Hide Dye"));
        List<Component> hideDyeLore = new ArrayList<>();
        hideDyeLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide dyes from coloured leather"));
        hideDyeLore.add(Component.text(ChatColor.GRAY + "armour"));
        hideDyeMeta.lore(hideDyeLore);
        hideDye.setItemMeta(hideDyeMeta);
        contents.set(1, 3, ClickableItem.of(hideDye, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DYE)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_DYE);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_DYE);
                    openMenu(player, plugin);
                }
            }
        }));
        //HideDestroys
        ItemStack hideDestroys = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta hideDestroysMeta = hideDestroys.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS)) {
            hideDestroysMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideDestroysMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hideDestroysMeta.displayName(Component.text(ChatColor.AQUA + "Hide Destroys"));
        List<Component> hideDestroysLore = new ArrayList<>();
        hideDestroysLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide what the ItemStack"));
        hideDestroysLore.add(Component.text(ChatColor.GRAY + "can break/destroy"));
        hideDestroysMeta.lore(hideDestroysLore);
        hideDestroys.setItemMeta(hideDestroysMeta);
        contents.set(1, 4, ClickableItem.of(hideDestroys, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_DESTROYS);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
                    openMenu(player, plugin);
                }
            }
        }));
        //HidePlacedOn
        ItemStack hidePlacedOn = new ItemStack(Material.SPYGLASS);
        ItemMeta hidePlacedOnMeta = hidePlacedOn.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON)) {
            hidePlacedOnMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidePlacedOnMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hidePlacedOnMeta.displayName(Component.text(ChatColor.AQUA + "Hide Placed On"));
        List<Component> hidePlacedOnLore = new ArrayList<>();
        hidePlacedOnLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide where this ItemStack can be"));
        hidePlacedOnLore.add(Component.text(ChatColor.GRAY + "build/placed on"));
        hidePlacedOnMeta.lore(hidePlacedOnLore);
        hidePlacedOn.setItemMeta(hidePlacedOnMeta);
        contents.set(1, 5, ClickableItem.of(hidePlacedOn, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_PLACED_ON);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
                    openMenu(player, plugin);
                }
            }
        }));
        //HidePotionEffects
        ItemStack hidePotionEffects = new ItemStack(Material.HONEY_BOTTLE);
        ItemMeta hidePotionEffectsMeta = hidePotionEffects.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS)) {
            hidePotionEffectsMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidePotionEffectsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        hidePotionEffectsMeta.displayName(Component.text(ChatColor.AQUA + "Hide Potion Effects"));
        List<Component> hidePotionEffectsLore = new ArrayList<>();
        hidePotionEffectsLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide potion effects, book and"));
        hidePotionEffectsLore.add(Component.text(ChatColor.GRAY + "firework information, map tooltips, patterns of"));
        hidePotionEffectsLore.add(Component.text(ChatColor.GRAY + "banners, and enchantments of enchanted books"));
        hidePotionEffectsMeta.lore(hidePotionEffectsLore);
        hidePotionEffects.setItemMeta(hidePotionEffectsMeta);
        contents.set(1, 6, ClickableItem.of(hidePotionEffects, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
                    openMenu(player, plugin);
                }
            }
        }));
        //HideUnbreakable
        ItemStack hideUnbreakable = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta hideUnbreakableMeta = hideUnbreakable.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
            hideUnbreakableMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideUnbreakableMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        hideUnbreakableMeta.displayName(Component.text(ChatColor.AQUA + "Hide Unbreakable"));
        List<Component> hideUnbreakableLore = new ArrayList<>();
        hideUnbreakableLore.add(Component.text(ChatColor.GRAY + "Setting to show/hide the unbreakable State"));
        hideUnbreakableMeta.lore(hideUnbreakableLore);
        hideUnbreakable.setItemMeta(hideUnbreakableMeta);
        contents.set(1, 7, ClickableItem.of(hideUnbreakable, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_UNBREAKABLE);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
                    openMenu(player, plugin);
                }
            }
        }));
        //AddAll
        ItemStack addAll = new ItemStack(Material.ENDER_CHEST);
        ItemMeta addAllMeta = addAll.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
            addAllMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        addAllMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        addAllMeta.displayName(Component.text(ChatColor.AQUA + "Add all Itemflags"));
        List<Component> addAllLore = new ArrayList<>();
        addAllLore.add(Component.text(ChatColor.GRAY + "Adds all Itemflags to your item"));
        addAllMeta.lore(addAllLore);
        addAll.setItemMeta(addAllMeta);
        contents.set(2, 7, ClickableItem.of(addAll, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_DYE) &
                        itemMeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS) &
                        itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
                    itemMeta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_PLACED_ON, ItemFlag.HIDE_POTION_EFFECTS, ItemFlag.HIDE_UNBREAKABLE);
                    openMenu(player, plugin);
                } else {
                    itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_PLACED_ON, ItemFlag.HIDE_POTION_EFFECTS, ItemFlag.HIDE_UNBREAKABLE);
                    openMenu(player, plugin);
                }
            }
        }));
        //back
        contents.set(2, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditMenu.openMenu(player, plugin);
            }
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
