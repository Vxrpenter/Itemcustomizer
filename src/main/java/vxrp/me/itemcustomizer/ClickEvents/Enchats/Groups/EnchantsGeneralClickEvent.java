package vxrp.me.itemcustomizer.ClickEvents.Enchats.Groups;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.Groups.EnchantsGeneralMenu;

public class EnchantsGeneralClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsGeneralMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.MENDING)) {
                itemMeta.removeEnchant(Enchantment.MENDING);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.MENDING);
                EnchantsPickMenu.OpenMenu(player);;
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.DURABILITY)) {
                itemMeta.removeEnchant(Enchantment.DURABILITY);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.DURABILITY);
                EnchantsPickMenu.OpenMenu(player);;
            }
        }
    }

}
