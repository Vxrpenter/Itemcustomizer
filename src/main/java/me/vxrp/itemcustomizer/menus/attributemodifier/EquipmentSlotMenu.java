package me.vxrp.itemcustomizer.menus.attributemodifier;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class EquipmentSlotMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EquipmentSlotMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("equipmentSlot")
                .provider(new EquipmentSlotMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.AQUA + "EquipmentSlot")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Chest
        final ItemStack chest = new ItemBuilder(Material.IRON_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Chest")
                .build();
        contents.set(1, 1, ClickableItem.of(chest, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setEquipmentSlot(player.getUniqueId(), EquipmentSlot.CHEST);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Feet
        final ItemStack feet = new ItemBuilder(Material.IRON_BOOTS)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Feet")
                .build();
        contents.set(1, 2, ClickableItem.of(feet, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setEquipmentSlot(player.getUniqueId(), EquipmentSlot.FEET);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Hand
        final ItemStack hand = new ItemBuilder(Material.TRIDENT)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Hand")
                .build();
        contents.set(1, 3, ClickableItem.of(hand, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setEquipmentSlot(player.getUniqueId(), EquipmentSlot.HAND);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Head
        final ItemStack head = new ItemBuilder(Material.IRON_HELMET)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Head")
                .build();
        contents.set(1, 4, ClickableItem.of(head, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setEquipmentSlot(player.getUniqueId(), EquipmentSlot.HEAD);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Legs
        final ItemStack legs = new ItemBuilder(Material.IRON_LEGGINGS)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Legs")
                .build();
        contents.set(1, 5, ClickableItem.of(legs, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setEquipmentSlot(player.getUniqueId(), EquipmentSlot.LEGS);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //OffHand
        final ItemStack offHand = new ItemBuilder(Material.SHIELD)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "OffHand")
                .build();
        contents.set(1, 6, ClickableItem.of(offHand, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setEquipmentSlot(player.getUniqueId(), EquipmentSlot.OFF_HAND);
            AttributePickMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
