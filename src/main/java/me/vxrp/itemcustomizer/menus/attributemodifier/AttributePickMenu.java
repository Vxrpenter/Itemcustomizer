package me.vxrp.itemcustomizer.menus.attributemodifier;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.menus.EditMenu;
import me.vxrp.itemcustomizer.menus.setValues.SetNumberMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.ItemBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AttributePickMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public AttributePickMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("pickAttributes")
                .provider(new AttributePickMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.GRAY + "Pick " + ChatColor.AQUA + "Attributes")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());
        Attribute attribute = EditingStorage.getAttribute(player.getUniqueId());

        //Attributes
        final ItemStack attributes = new ItemBuilder(Material.COMMAND_BLOCK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Attributes")
                .lore(ChatColor.GRAY + "Set the Attribute")
                .build();
        contents.set(2, 4, ClickableItem.of(attributes, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            AttributeModifierMenu.openMenu(player, plugin);
        }));
        //Add Number
        ItemStack addNumber = new ItemStack(Material.STRUCTURE_VOID);
        ItemMeta addNumberMeta = addNumber.getItemMeta();
        addNumberMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        addNumberMeta.displayName(Component.text(ChatColor.AQUA + "Add Number"));
        List<Component> addNumberLore = new ArrayList<>();
        addNumberLore.add(Component.text(ChatColor.GREEN + "Add numbers to attribute"));
        if (EditingStorage.getNumber(player.getUniqueId()) == 0) {
            addNumberLore.add(Component.text(ChatColor.RED + "Not set"));
        } else {
            addNumberLore.add(Component.text(ChatColor.GREEN + "Set"));
        }
        addNumberMeta.lore(addNumberLore);
        addNumber.setItemMeta(addNumberMeta);
        contents.set(1, 6, ClickableItem.of(addNumber, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            SetNumberMenu.openMenu(player, plugin);
        }));
        //EquipmentSlot
        ItemStack equipmentSlot = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta equipmentSlotMeta = equipmentSlot.getItemMeta();
        equipmentSlotMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        equipmentSlotMeta.displayName(Component.text(ChatColor.AQUA + "EquipmentSlot"));
        List<Component> equipmentSlotLore = new ArrayList<>();
        equipmentSlotLore.add(Component.text(ChatColor.GRAY + "The slot in which the attribute takes effect"));
        if (EditingStorage.getEquipmentSlot(player.getUniqueId()) == null) {
            equipmentSlotLore.add(Component.text(ChatColor.RED + "Not set"));
        } else {
            equipmentSlotLore.add(Component.text(ChatColor.GREEN + "Set"));
        }
        equipmentSlotMeta.lore(equipmentSlotLore);
        equipmentSlot.setItemMeta(equipmentSlotMeta);
        contents.set(0, 4, ClickableItem.of(equipmentSlot, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EquipmentSlotMenu.openMenu(player, plugin);
        }));
        //Add Attribute
        final ItemStack addAttribute = new ItemBuilder(Material.BREWING_STAND)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Add Attributes")
                .lore(ChatColor.GRAY + "Click to add the attribute to your item")
                .build();
        contents.set(1, 4, ClickableItem.of(addAttribute, e -> {
            if (!e.isLeftClick()) return;
            if (EditingStorage.getNumber(player.getUniqueId()) == 0.0 || EditingStorage.getEquipmentSlot(player.getUniqueId()) == null) {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThe number and equipment slot must be set"));
            } else {
                player.playSound(player, Sound.BLOCK_ANVIL_USE, 10, 1);
                AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), attribute.toString(), EditingStorage.getNumber(player.getUniqueId()),
                        AttributeModifier.Operation.ADD_NUMBER, EditingStorage.getEquipmentSlot(player.getUniqueId()));
                itemMeta.removeAttributeModifier(attribute);
                itemMeta.addAttributeModifier(attribute, modifier);
                EditMenu.openMenu(player, plugin);
            }
        }));
        //Remove
        contents.set(1, 2, ClickableItem.of(GeneralItems.remove(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ITEM_SPYGLASS_USE, 10, 1);
            itemMeta.removeAttributeModifier(attribute);
            EditMenu.openMenu(player, plugin);
        }));
        //Back
        contents.set(2, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
