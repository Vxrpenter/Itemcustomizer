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

public class EnchantsFarmingMenu {
    public static String menuname = "&bEnchants &7Farming";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        ItemStack looting = new ItemStack(Material.EMERALD);
        ItemMeta lootingmeta = looting.getItemMeta();
        lootingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.LOOT_BONUS_MOBS)) {
            lootingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        lootingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLooting"));
        List<String> lootinglore = new ArrayList<>();
        lootinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides a chance of gaining extra loot when killing monsters"));
        lootingmeta.setLore(lootinglore);
        looting.setItemMeta(lootingmeta);

        ItemStack luckofthesea = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta luckoftheseameta = luckofthesea.getItemMeta();
        luckoftheseameta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.LUCK)) {
            luckoftheseameta.addEnchant(Enchantment.LUCK, 1, false);
        }
        luckoftheseameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLuck of the Sea"));
        List<String> luckofthesealore = new ArrayList<>();
        luckofthesealore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases odds of catching worthless junk"));
        luckoftheseameta.setLore(luckofthesealore);
        luckofthesea.setItemMeta(luckoftheseameta);

        ItemStack lure = new ItemStack(Material.FISHING_ROD);
        ItemMeta luremeta = lure.getItemMeta();
        luremeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.LURE)) {
            luremeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        luremeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLure"));
        List<String> lurelore = new ArrayList<>();
        lurelore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases rate of fish biting your hook"));
        luremeta.setLore(lurelore);
        lure.setItemMeta(luremeta);

        gui.setItem(10, looting);
        gui.setItem(11, luckofthesea);
        gui.setItem(12, lure);
        player.openInventory(gui);
    }
}
