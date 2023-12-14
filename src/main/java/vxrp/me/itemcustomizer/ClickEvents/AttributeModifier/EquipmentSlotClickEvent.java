package vxrp.me.itemcustomizer.ClickEvents.AttributeModifier;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Menus.AttributeModifier.AttributePickMenu;
import vxrp.me.itemcustomizer.Menus.AttributeModifier.EquipmentSlotMenu;

public class EquipmentSlotClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EquipmentSlotMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), EquipmentSlot.CHEST);
            AttributePickMenu.OpenMenu(player);
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), EquipmentSlot.FEET);
            AttributePickMenu.OpenMenu(player);
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), EquipmentSlot.HAND);
            AttributePickMenu.OpenMenu(player);
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), EquipmentSlot.HEAD);
            AttributePickMenu.OpenMenu(player);
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), EquipmentSlot.LEGS);
            AttributePickMenu.OpenMenu(player);
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), EquipmentSlot.OFF_HAND);
            AttributePickMenu.OpenMenu(player);
        }
    }
}
