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
import vxrp.me.itemcustomizer.Menus.Enchants.Groups.EnchantsAttackMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;

public class EnchatsAttackClickEvent implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EnchantsAttackMenu.menuname))) return;
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.DAMAGE_ARTHROPODS)) {
                itemMeta.removeEnchant(Enchantment.DAMAGE_ARTHROPODS);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.DAMAGE_ARTHROPODS);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.CHANNELING)) {
                itemMeta.removeEnchant(Enchantment.CHANNELING);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.CHANNELING);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.FIRE_ASPECT)) {
                itemMeta.removeEnchant(Enchantment.FIRE_ASPECT);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.FIRE_ASPECT);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.ARROW_FIRE)) {
                itemMeta.removeEnchant(Enchantment.ARROW_FIRE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.ARROW_FIRE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.IMPALING)) {
                itemMeta.removeEnchant(Enchantment.IMPALING);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.IMPALING);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.ARROW_INFINITE)) {
                itemMeta.removeEnchant(Enchantment.ARROW_INFINITE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.ARROW_INFINITE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 16) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.KNOCKBACK)) {
                itemMeta.removeEnchant(Enchantment.KNOCKBACK);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.KNOCKBACK);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 19) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.LOYALTY)) {
                itemMeta.removeEnchant(Enchantment.LOYALTY);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.LOYALTY);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 20) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.MULTISHOT)) {
                itemMeta.removeEnchant(Enchantment.MULTISHOT);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.MULTISHOT);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 21) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.PIERCING)) {
                itemMeta.removeEnchant(Enchantment.PIERCING);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.PIERCING);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 22) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.ARROW_DAMAGE)) {
                itemMeta.removeEnchant(Enchantment.ARROW_DAMAGE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.ARROW_DAMAGE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 23) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.ARROW_KNOCKBACK)) {
                itemMeta.removeEnchant(Enchantment.ARROW_KNOCKBACK);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.ARROW_KNOCKBACK);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 24) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.QUICK_CHARGE)) {
                itemMeta.removeEnchant(Enchantment.QUICK_CHARGE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.QUICK_CHARGE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 25) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.DAMAGE_ALL)) {
                itemMeta.removeEnchant(Enchantment.DAMAGE_ALL);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.DAMAGE_ALL);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 28) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.DAMAGE_UNDEAD)) {
                itemMeta.removeEnchant(Enchantment.DAMAGE_UNDEAD);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.DAMAGE_UNDEAD);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 29) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (itemMeta.hasEnchant(Enchantment.SWEEPING_EDGE)) {
                itemMeta.removeEnchant(Enchantment.SWEEPING_EDGE);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                EnchantsPickMaps.enchantment.put(player.getUniqueId(), Enchantment.SWEEPING_EDGE);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
    }
}
