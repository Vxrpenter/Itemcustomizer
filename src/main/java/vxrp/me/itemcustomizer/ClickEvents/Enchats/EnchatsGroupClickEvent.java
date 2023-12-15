package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Menus.EditMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.*;
import vxrp.me.itemcustomizer.Menus.Enchants.Groups.*;

public class EnchatsGroupClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsGroupMenu.menuname))) return;
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchatsMovementMenu.OpenMenu(player);
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsAttackMenu.OpenMenu(player);
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsProtectionMenu.OpenMenu(player);
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsCurseMenu.OpenMenu(player);
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsMiningMenu.OpenMenu(player);
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsFarmingMenu.OpenMenu(player);
        }
        if (event.getSlot() == 16) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsGeneralMenu.OpenMenu(player);
        }
        if (event.getSlot() == 26) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.OpenMenu(player);
        }
    }
}
