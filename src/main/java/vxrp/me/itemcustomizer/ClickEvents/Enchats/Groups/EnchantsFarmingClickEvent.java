package vxrp.me.itemcustomizer.ClickEvents.Enchats.Groups;

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
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.Groups.EnchantsFarmingMenu;

public class EnchantsFarmingClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsFarmingMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.LOOT_BONUS_MOBS)) {
                itemMeta.removeEnchant(Enchantment.LOOT_BONUS_MOBS);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.LOOT_BONUS_MOBS);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.LURE)) {
                itemMeta.removeEnchant(Enchantment.LURE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.LURE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.LURE)) {
                itemMeta.removeEnchant(Enchantment.LURE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.LURE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
    }
}
