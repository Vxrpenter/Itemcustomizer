package vxrp.me.itemcustomizer.ClickEvents;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Hashmaps.ConfirmMaps;
import vxrp.me.itemcustomizer.Menus.ConfirmMenu;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

public class ConfirmClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', ConfirmMenu.confirm_menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 4) {
            player.playSound(player, Sound.BLOCK_GRINDSTONE_USE, 10, 1);
            ConfirmMaps.confirmed.put(player.getUniqueId(), true);
            CreateCustomMenu.OpenMenu(player);
        }
    }
}
