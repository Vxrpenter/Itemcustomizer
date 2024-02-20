package me.vxrp.itemcustomizer.menus.enchants;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
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
import me.vxrp.itemcustomizer.menus.setValues.IgnoreLevelRestrictionsMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class EnchantsPickMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EnchantsPickMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("PickEnchants")
                .provider(new EnchantsPickMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.GRAY + "Pick " + ChatColor.AQUA + "Enchants")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());

        //Enchants
        final ItemStack enchants = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Enchants")
                .lore(ChatColor.GRAY + "Set the Enchant")
                .build();
        contents.set(2, 4, ClickableItem.of(enchants, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchantsOne.openMenu(player, plugin);
            }
        }));
        //Levels
        final ItemStack levels = new ItemBuilder(Material.EXPERIENCE_BOTTLE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Levels")
                .lore(ChatColor.GRAY + "Here you can choose from the levels", ChatColor.GRAY + "that are available for this enchantment")
                .build();
        contents.set(0, 4, ClickableItem.of(levels, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                SetLevelMenus.openMenu(player, plugin);
            }
        }));
        //Remove
        contents.set(1, 2, ClickableItem.of(GeneralItems.remove(), e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ITEM_SPYGLASS_USE, 10, 1);
                itemMeta.removeEnchant(EditingStorage.getEnchantment(player.getUniqueId()));
                EditMenu.openMenu(player, plugin);
            }
        }));
        //IgnoreLevelRestrictions
        final ItemStack ignoreLevelRestrictions = new ItemBuilder(Material.CAULDRON)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "IgnoreLevelRestrictions")
                .lore(ChatColor.GRAY + "Here you can add a custom level ranging", ChatColor.GRAY + "up to level 255, ignoring the level restrictions")
                .build();
        contents.set(1, 6, ClickableItem.of(ignoreLevelRestrictions, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                IgnoreLevelRestrictionsMenu.openMenu(player, plugin);
            }
        }));
        //Add Enchantment
        final ItemStack addEnchantment = new ItemBuilder(Material.ENCHANTING_TABLE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Add Enchantment")
                .lore(ChatColor.GRAY + "Click to add the enchantment to your item")
                .build();
        contents.set(1, 4, ClickableItem.of(addEnchantment, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 10, 1);
                if (EditingStorage.getEnchantment(player.getUniqueId()) == Enchantment.BINDING_CURSE | EditingStorage.getEnchantment(player.getUniqueId()) == Enchantment.VANISHING_CURSE ) {
                    EditingStorage.setEnchantingLevel(player.getUniqueId(), 1);
                }
                itemMeta.addEnchant(EditingStorage.getEnchantment(player.getUniqueId()),EditingStorage.getEnchantingLevel(player.getUniqueId()), true);
                EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
                EditMenu.openMenu(player, plugin);
            }
        }));
        //Back
        contents.set(2, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
