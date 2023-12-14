package vxrp.me.itemcustomizer.ClickEvents.AttributeModifier;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;
import vxrp.me.itemcustomizer.Menus.AttributeModifier.AttributeModifierMenu;
import vxrp.me.itemcustomizer.Menus.AttributeModifier.AttributePickMenu;
import vxrp.me.itemcustomizer.Menus.EditMenu;

import java.util.List;


public class AttributeModifierClickEvent implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        PutIfAbsent.PutIfAbsent(player);
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        List<Attribute> attributeList = AttributeModifierMaps.attributeList.get(player.getUniqueId());
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', AttributeModifierMenu.menuname))) return;
        event.setCancelled(true);
        AttributeModifierMaps.number.put(player.getUniqueId(), 0.0);
        AttributeModifierMaps.equipmentSlot.put(player.getUniqueId(), null);

        if (event.getSlot() == 10) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_ARMOR)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_ARMOR);
                attributeList.remove(Attribute.GENERIC_ARMOR);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_ARMOR);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 11) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_ARMOR_TOUGHNESS)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS);
                attributeList.remove(Attribute.GENERIC_ARMOR);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_ARMOR_TOUGHNESS);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 12) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_ATTACK_DAMAGE)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
                attributeList.remove(Attribute.GENERIC_ATTACK_DAMAGE);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_ATTACK_DAMAGE);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 13) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_ATTACK_KNOCKBACK)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_KNOCKBACK);
                attributeList.remove(Attribute.GENERIC_ATTACK_KNOCKBACK);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_ATTACK_KNOCKBACK);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 14) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_ATTACK_SPEED)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
                attributeList.remove(Attribute.GENERIC_ATTACK_SPEED);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_ATTACK_SPEED);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 15) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_FLYING_SPEED)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_FLYING_SPEED);
                attributeList.remove(Attribute.GENERIC_FLYING_SPEED);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_FLYING_SPEED);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 16) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_KNOCKBACK_RESISTANCE)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE);
                attributeList.remove(Attribute.GENERIC_KNOCKBACK_RESISTANCE);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_KNOCKBACK_RESISTANCE);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 21) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_MAX_HEALTH)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_MAX_HEALTH);
                attributeList.remove(Attribute.GENERIC_MAX_HEALTH);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_MAX_HEALTH);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 22) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_LUCK)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_LUCK);
                attributeList.remove(Attribute.GENERIC_LUCK);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_LUCK);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 23) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            if (attributeList.contains(Attribute.GENERIC_MOVEMENT_SPEED)) {
                itemMeta.removeAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED);
                attributeList.remove(Attribute.GENERIC_MOVEMENT_SPEED);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                AttributeModifierMaps.attribute.put(player.getUniqueId(), Attribute.GENERIC_MOVEMENT_SPEED);
                AttributePickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 35) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.OpenMenu(player);
        }
    }
}
