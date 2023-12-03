package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchatsMovementMenu;

public class EnchantsMovementClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchatsMovementMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 11) {
            if (EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
                EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.depthstrider.get(player.getUniqueId())) {
                EnchantsPickMaps.depthstrider.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 12) {
            if (EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
                EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.frostwalker.get(player.getUniqueId())) {
                EnchantsPickMaps.frostwalker.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 13) {
            if (EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
                EnchantsMovementMaps.riptide.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.riptide.get(player.getUniqueId())) {
                EnchantsPickMaps.riptide.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 14) {
            if (EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
                EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.soulspeed.get(player.getUniqueId())) {
                EnchantsPickMaps.soulspeed.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 15) {
            if (EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
                EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.swiftsneak.get(player.getUniqueId())) {
                EnchantsPickMaps.swiftsneak.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
    }
}
