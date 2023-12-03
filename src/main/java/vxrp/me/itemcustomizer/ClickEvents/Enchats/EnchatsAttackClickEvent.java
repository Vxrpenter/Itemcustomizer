package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsAttackMenu;

public class EnchatsAttackClickEvent implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsAttackMenu.menuname))) return;
        event.setCancelled(true);

    }
}
