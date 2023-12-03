package vxrp.me.itemcustomizer.ClickEvents.ItemFlags;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;
import vxrp.me.itemcustomizer.Menus.ItemFlags.ItemFlagMenu;

public class ItemFlagClickEvent implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', ItemFlagMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            if (ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideattributes.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideattributes.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 11) {
            if (ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideenchants.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideenchants.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 12) {
            if (ItemFlagsMap.hidedye.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hidedye.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hidedye.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hidedye.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 13) {
            if (ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hidedestroys.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hidedestroys.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 14) {
            if (ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideplacedon.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideplacedon.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 15) {
            if (ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 16) {
            if (ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), false);
            } else if (!ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 26) {
            if (ItemFlagsMap.hideattributes.get(player.getUniqueId()) && ItemFlagsMap.hidepotioneffects.get(player.getUniqueId()) && ItemFlagsMap.hideplacedon.get(player.getUniqueId())
                    && ItemFlagsMap.hidedestroys.get(player.getUniqueId()) && ItemFlagsMap.hidedye.get(player.getUniqueId()) && ItemFlagsMap.hideenchants.get(player.getUniqueId())
                    && ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), false);
                ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), false);
                ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), false);
                ItemFlagsMap.hideplacedon.put(player.getUniqueId(), false);
                ItemFlagsMap.hidedestroys.put(player.getUniqueId(), false);
                ItemFlagsMap.hidedye.put(player.getUniqueId(), false);
                ItemFlagsMap.hideenchants.put(player.getUniqueId(), false);
                ItemFlagsMap.hideattributes.put(player.getUniqueId(), false);
            } else {
                player.playSound(player, Sound.ENTITY_PLAYER_LEVELUP, 10, 1);
                ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), true);
                ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), true);
                ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), true);
                ItemFlagsMap.hideplacedon.put(player.getUniqueId(), true);
                ItemFlagsMap.hidedestroys.put(player.getUniqueId(), true);
                ItemFlagsMap.hidedye.put(player.getUniqueId(), true);
                ItemFlagsMap.hideenchants.put(player.getUniqueId(), true);
                ItemFlagsMap.hideattributes.put(player.getUniqueId(), true);
            }
            CreateCustomMenu.OpenMenu(player);
        }
    }
}
