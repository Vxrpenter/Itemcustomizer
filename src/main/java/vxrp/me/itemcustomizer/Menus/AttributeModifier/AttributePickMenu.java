package vxrp.me.itemcustomizer.Menus.AttributeModifier;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.CreateItem;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.ConfirmMaps;
import vxrp.me.itemcustomizer.Menus.Items.GeneralUse;

import java.util.ArrayList;
import java.util.List;

public class AttributePickMenu {
    public static String menuname = "&bAttribute &7Pick";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null,3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        double number = AttributeModifierMaps.number.get(player.getUniqueId());

        ItemStack attribute = new ItemStack(Material.BREWING_STAND);
        ItemMeta attributeMeta = attribute.getItemMeta();
        attributeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        attributeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAdd Attribute"));
        List<String> attributeLore = new ArrayList<>();
        attributeLore.add(ChatColor.translateAlternateColorCodes('&', "&7Click to add the attribute to your item"));
        attributeMeta.setLore(attributeLore);
        attribute.setItemMeta(attributeMeta);

        ItemStack addNumber = new ItemStack(Material.STRUCTURE_VOID);
        ItemMeta addNumberMeta = addNumber.getItemMeta();
        addNumberMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        addNumberMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAdd Number"));
        List<String> addNumberLore = new ArrayList<>();
        addNumberLore.add(ChatColor.translateAlternateColorCodes('&', "&7Add numbers to attribute"));
        if (number == 0) {
            addNumberLore.add(ChatColor.translateAlternateColorCodes('&', "&cNot set"));
        } else {
            addNumberLore.add(ChatColor.translateAlternateColorCodes('&', "&aSet"));
        }
        addNumberMeta.setLore(addNumberLore);
        addNumber.setItemMeta(addNumberMeta);

        ItemStack equipmentSlot = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta equipmentSlotMeta = equipmentSlot.getItemMeta();
        equipmentSlotMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        equipmentSlotMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEquipmentSlot"));
        List<String> equipmentSlotLore = new ArrayList<>();
        equipmentSlotLore.add(ChatColor.translateAlternateColorCodes('&', "&7The slot in which the attribute takes effect"));
        if (AttributeModifierMaps.equipmentSlot.get(player.getUniqueId()) == null) {
            equipmentSlotLore.add(ChatColor.translateAlternateColorCodes('&', "&cNot set"));
        } else {
            equipmentSlotLore.add(ChatColor.translateAlternateColorCodes('&', "&aSet"));
        }
        equipmentSlotMeta.setLore(equipmentSlotLore);
        equipmentSlot.setItemMeta(equipmentSlotMeta);

        gui.setItem(11, GeneralUse.Remove());
        gui.setItem(13, attribute);
        gui.setItem(15, addNumber);
        gui.setItem(22, equipmentSlot);
        player.openInventory(gui);
    }
}
