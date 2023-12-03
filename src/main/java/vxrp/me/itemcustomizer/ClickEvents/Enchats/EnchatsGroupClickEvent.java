package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsAttackMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchatsMovementMenu;

public class EnchatsGroupClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsGroupMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchatsMovementMenu.OpenMenu(player);
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsAttackMenu.OpenMenu(player);
        }
    }
}
