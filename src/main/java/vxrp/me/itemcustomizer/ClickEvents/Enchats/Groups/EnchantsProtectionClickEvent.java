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
import vxrp.me.itemcustomizer.Menus.Enchants.Groups.EnchantsProtectionMenu;

public class EnchantsProtectionClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsProtectionMenu.menuname))) return;
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)) {
                itemMeta.removeEnchant(Enchantment.PROTECTION_EXPLOSIONS);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.PROTECTION_EXPLOSIONS);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.PROTECTION_FALL)) {
                itemMeta.removeEnchant(Enchantment.PROTECTION_FALL);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.PROTECTION_FALL);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.PROTECTION_FIRE)) {
                itemMeta.removeEnchant(Enchantment.PROTECTION_FIRE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.PROTECTION_FIRE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.WATER_WORKER)) {
                itemMeta.removeEnchant(Enchantment.WATER_WORKER);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.WATER_WORKER);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.PROTECTION_PROJECTILE)) {
                itemMeta.removeEnchant(Enchantment.PROTECTION_PROJECTILE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.PROTECTION_PROJECTILE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)) {
                itemMeta.removeEnchant(Enchantment.PROTECTION_ENVIRONMENTAL);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.PROTECTION_ENVIRONMENTAL);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 16) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.OXYGEN)) {
                itemMeta.removeEnchant(Enchantment.OXYGEN);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.OXYGEN);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 19) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.THORNS)) {
                itemMeta.removeEnchant(Enchantment.THORNS);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.THORNS);
                EnchantsPickMenu.OpenMenu(player);
            }
        }

        EditMaps.itemmeta.put(player.getUniqueId(), itemMeta);
    }
}
