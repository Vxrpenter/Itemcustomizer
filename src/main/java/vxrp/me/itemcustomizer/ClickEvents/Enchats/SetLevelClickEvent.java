package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.SetLevelMenus;

public class SetLevelClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', SetLevelMenus.menuname))) return;
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsPickMaps.level.put(player.getUniqueId(), 1);
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsPickMaps.level.put(player.getUniqueId(), 2);
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsPickMaps.level.put(player.getUniqueId(), 3);
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsPickMaps.level.put(player.getUniqueId(), 4);
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsPickMaps.level.put(player.getUniqueId(), 5);
        }
        EnchantsPickMenu.OpenMenu(player);
    }
}
