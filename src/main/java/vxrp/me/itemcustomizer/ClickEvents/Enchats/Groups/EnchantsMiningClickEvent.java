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
import vxrp.me.itemcustomizer.Menus.Enchants.Groups.EnchantsMiningMenu;

public class EnchantsMiningClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsMiningMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.DIG_SPEED)) {
                itemMeta.removeEnchant(Enchantment.DIG_SPEED);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.DIG_SPEED);
                EnchantsPickMenu.OpenMenu(player);;
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
                itemMeta.removeEnchant(Enchantment.LOOT_BONUS_BLOCKS);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.LOOT_BONUS_BLOCKS);
                EnchantsPickMenu.OpenMenu(player);;
            }
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.SILK_TOUCH)) {
                itemMeta.removeEnchant(Enchantment.SILK_TOUCH);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.BINDING_CURSE);
                EnchantsPickMenu.OpenMenu(player);;
            }
        }
    }
}
