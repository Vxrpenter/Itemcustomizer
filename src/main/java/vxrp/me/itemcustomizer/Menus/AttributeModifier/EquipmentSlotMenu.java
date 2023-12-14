package vxrp.me.itemcustomizer.Menus.AttributeModifier;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;

import java.util.UUID;

public class EquipmentSlotMenu {
    public static String menuname = "&bEquipmentSlot";
    public static void OpenMenu(Player player) {
        UUID uuid = player.getUniqueId();
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());

        ItemStack chest = new ItemStack(Material.CHEST);
        ItemMeta chestMeta = chest.getItemMeta();
        chestMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        chestMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bChest"));
        chest.setItemMeta(chestMeta);

        ItemStack feet = new ItemStack(Material.IRON_BOOTS);
        ItemMeta feetMeta = feet.getItemMeta();
        feetMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        feetMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFeet"));
        feet.setItemMeta(feetMeta);

        ItemStack hand = new ItemStack(Material.TRIDENT);
        ItemMeta handMeta = hand.getItemMeta();
        handMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        handMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHand"));
        hand.setItemMeta(handMeta);

        ItemStack head = new ItemStack(Material.IRON_HELMET);
        ItemMeta headMeta = head.getItemMeta();
        headMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        headMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHead"));
        head.setItemMeta(headMeta);

        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta legsMeta = legs.getItemMeta();
        legsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        legsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLegs"));
        legs.setItemMeta(legsMeta);

        ItemStack offHand = new ItemStack(Material.SHIELD);
        ItemMeta offHandMeta = offHand.getItemMeta();
        offHandMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        offHandMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bOffHand"));
        offHand.setItemMeta(offHandMeta);

        gui.setItem(10, chest);
        gui.setItem(11, feet);
        gui.setItem(12, hand);
        gui.setItem(13, head);
        gui.setItem(14, legs);
        gui.setItem(15, offHand);
        player.openInventory(gui);
    }
}
