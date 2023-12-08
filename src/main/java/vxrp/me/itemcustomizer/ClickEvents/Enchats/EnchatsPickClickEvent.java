package vxrp.me.itemcustomizer.ClickEvents.Enchats;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Menus.EditMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.SetLevelMenus;

public class EnchatsPickClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsPickMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            SetLevelMaps.running.put(player.getUniqueId(), true);
            player.closeInventory();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please type a value from 1 &7to 255 &c!!!"));
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.BLOCK_ENCHANTMENT_TABLE_USE, 10, 1);
            if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.BINDING_CURSE | EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.VANISHING_CURSE ) {
                EnchantsPickMaps.level.put(player.getUniqueId(), 1);
            }
            itemMeta.addEnchant(EnchantsPickMaps.enchantment.get(player.getUniqueId()),EnchantsPickMaps.level.get(player.getUniqueId()), true);
            EditMaps.itemmeta.put(player.getUniqueId(), itemMeta);

            EditMenu.OpenMenu(player);
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            SetLevelMenus.OpenMenu(player);
        }
    }
}
