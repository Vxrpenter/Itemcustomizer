package vxrp.me.itemcustomizer.Menus.Enchants.Groups;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;

import java.util.ArrayList;
import java.util.List;

public class EnchantsMiningMenu {
    public static String menuname = "&bEnchants &7Mining";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        ItemStack efficiency = new ItemStack(Material.TNT);
        ItemMeta efficiencymeta = efficiency.getItemMeta();
        efficiencymeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.DIG_SPEED)) {
            efficiencymeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        efficiencymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEfficiency"));
        List<String> efficiencylore = new ArrayList<>();
        efficiencylore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases the rate at which you mine/dig"));
        efficiencymeta.setLore(efficiencylore);
        efficiency.setItemMeta(efficiencymeta);

        ItemStack fortune = new ItemStack(Material.GOLD_INGOT);
        ItemMeta fortunemeta = fortune.getItemMeta();
        fortunemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)) {
            fortunemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        fortunemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMining"));
        List<String> fortunelore = new ArrayList<>();
        fortunelore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides a chance of gaining extra loot when destroying blocks"));
        fortunemeta.setLore(fortunelore);
        fortune.setItemMeta(fortunemeta);

        ItemStack silktouch = new ItemStack(Material.COBWEB);
        ItemMeta silktouchmeta = silktouch.getItemMeta();
        silktouchmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.SILK_TOUCH)) {
            silktouchmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        silktouchmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMining"));
        List<String> silktouchlore = new ArrayList<>();
        silktouchlore.add(ChatColor.translateAlternateColorCodes('&', "&7Allows blocks to drop themselves instead of fragments"));
        silktouchlore.add(ChatColor.translateAlternateColorCodes('&', "&7(for example, stone instead of cobblestone)"));
        silktouchmeta.setLore(silktouchlore);
        silktouch.setItemMeta(silktouchmeta);

        gui.setItem(10, efficiency);
        gui.setItem(11, fortune);
        gui.setItem(12, silktouch);
        player.openInventory(gui);
    }
}
