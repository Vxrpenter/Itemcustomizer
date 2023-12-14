package vxrp.me.itemcustomizer.ClickEvents.AttributeModifier;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
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
import vxrp.me.itemcustomizer.Menus.EditMenu;

import java.util.UUID;

public class AttributePickClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        Attribute attribute = AttributeModifierMaps.attribute.get(player.getUniqueId());
        double number = AttributeModifierMaps.number.get(player.getUniqueId());
        EquipmentSlot equipmentSlot = AttributeModifierMaps.equipmentSlot.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', AttributePickMenu.menuname))) return;
        event.setCancelled(true);

        if (event.getSlot() == 11) {

        }
        if (event.getSlot() == 13) {
            if (number == 0.0 || equipmentSlot == null) {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThe number and equipmentslot must be set"));
            } else {
                player.playSound(player, Sound.BLOCK_ANVIL_USE, 10, 1);
                AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), attribute.toString(), number, AttributeModifier.Operation.ADD_NUMBER, equipmentSlot);
                itemMeta.removeAttributeModifier(attribute);
                AttributeModifierMaps.attributeList.get(player.getUniqueId()).add(attribute);
                itemMeta.addAttributeModifier(attribute, modifier);
                EditMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMaps.running.put(player.getUniqueId(), true);
            player.closeInventory();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please type the value &c!!!"));
        }
        if (event.getSlot() == 22) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EquipmentSlotMenu.OpenMenu(player);
        }
    }
}
