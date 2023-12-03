package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.SetLevelMenus;

public class EnchatsPickClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsPickMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            SetLevelMaps.running.put(player.getUniqueId(), true);
            player.closeInventory();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please type a value from 1 &7to 255 &c!!!"));
        }
        if (event.getSlot() == 13) {
            if (EnchantsPickMaps.depthstrider.get(player.getUniqueId())) {
                EnchantsPickMaps.depthstrider.put(player.getUniqueId(), false);
                EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), true);
                EnchantsMovementMaps.depthstriderlevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
            }
            if (EnchantsPickMaps.frostwalker.get(player.getUniqueId())) {
                EnchantsPickMaps.frostwalker.put(player.getUniqueId(), false);
                EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), true);
                EnchantsMovementMaps.frostwalkerlevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
            }
            if (EnchantsPickMaps.riptide.get(player.getUniqueId())) {
                EnchantsPickMaps.riptide.put(player.getUniqueId(), false);
                EnchantsMovementMaps.riptide.put(player.getUniqueId(), true);
                EnchantsMovementMaps.riptidelevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
            }
            if (EnchantsPickMaps.soulspeed.get(player.getUniqueId())) {
                EnchantsPickMaps.soulspeed.put(player.getUniqueId(), false);
                EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), true);
                EnchantsMovementMaps.soulspeedlevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
            }
            if (EnchantsPickMaps.swiftsneak.get(player.getUniqueId())) {
                EnchantsPickMaps.swiftsneak.put(player.getUniqueId(), false);
                EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), true);
                EnchantsMovementMaps.swiftsneaklevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
            }


            CreateCustomMenu.OpenMenu(player);
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            SetLevelMenus.OpenMenu(player);
        }
    }
}
