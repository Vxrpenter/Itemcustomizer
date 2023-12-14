package vxrp.me.itemcustomizer.ClickEvents.ItemFlags;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Menus.EditMenu;
import vxrp.me.itemcustomizer.Menus.ItemFlags.ItemFlagMenu;

public class ItemFlagClickEvent implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', ItemFlagMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_ENCHANTS);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            }
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DYE)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_DYE);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_DYE);
            }
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_DESTROYS);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
            }
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_PLACED_ON);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
            }
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            }
        }
        if (event.getSlot() == 16) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            }
        }
        if (event.getSlot() == 25) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_DYE) &
                    itemMeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON) & itemMeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS) &
                    itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
                itemMeta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_PLACED_ON, ItemFlag.HIDE_POTION_EFFECTS, ItemFlag.HIDE_UNBREAKABLE);
            } else {
                itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_PLACED_ON, ItemFlag.HIDE_POTION_EFFECTS, ItemFlag.HIDE_UNBREAKABLE);
            }
        }
        if (event.getSlot() == 26) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.OpenMenu(player);
        }
        try {
            if (event.getCurrentItem().getType() != Material.AIR) {
                EditMenu.OpenMenu(player);
            }
        }catch (NullPointerException e) {
            //do nothing
        }
        EditMaps.itemmeta.put(player.getUniqueId(), itemMeta);
    }
}
