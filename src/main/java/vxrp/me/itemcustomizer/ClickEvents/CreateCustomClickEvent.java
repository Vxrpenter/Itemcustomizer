package vxrp.me.itemcustomizer.ClickEvents;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import vxrp.me.itemcustomizer.CreateItem;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Menus.ConfirmMenu;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.ItemFlags.ItemFlagMenu;

public class CreateCustomClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', CreateCustomMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 20) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            ItemFlagMenu.OpenMenu(player);
        }
        if (event.getSlot() == 53) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            ConfirmMenu.OpenMenu(player);
        }
        if (event.getSlot() == 49) {
            player.playSound(player, Sound.BLOCK_ANVIL_USE, 10, 1);
            player.getInventory().addItem(CreateItem.Create(player));
            player.closeInventory();
        }
        if (event.getSlot() == 22) {
            SetDisplayNameMaps.running.put(player.getUniqueId(), true);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please enter the DisplayName in the chat &c!!!"));
            player.closeInventory();
        }
        if (event.getSlot() == 24) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EnchantsGroupMenu.OpenMenu(player);
        }
    }
}
