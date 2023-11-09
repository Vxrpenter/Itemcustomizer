package vxrp.me.itemcustomizer.Menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class ItemcustomizerMenu implements Listener {

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 5*9, ChatColor.translateAlternateColorCodes('&', "&bItemCustomizer"));

        player.openInventory(gui);
    }
}
