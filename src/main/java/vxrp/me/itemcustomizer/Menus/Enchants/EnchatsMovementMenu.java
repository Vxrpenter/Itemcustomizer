package vxrp.me.itemcustomizer.Menus.Enchants;

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

public class EnchatsMovementMenu {
    public static String menuname = "&bEnchants &7Movements";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        ItemStack depthstrider = new ItemStack(Material.WATER_BUCKET);
        ItemMeta depthstridermeta = depthstrider.getItemMeta();
        depthstridermeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.DEPTH_STRIDER)) {
            depthstridermeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        depthstridermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDepth Strider"));
        List<String> depthstriderlore = new ArrayList<>();
        depthstriderlore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases walking speed while in water"));
        depthstridermeta.setLore(depthstriderlore);
        depthstrider.setItemMeta(depthstridermeta);

        ItemStack frostwalker = new ItemStack(Material.PACKED_ICE);
        ItemMeta frostwalkermeta = frostwalker.getItemMeta();
        frostwalkermeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.FROST_WALKER)) {
            frostwalkermeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        frostwalkermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFrost Walker"));
        List<String> frostwalkerlore = new ArrayList<>();
        frostwalkerlore.add(ChatColor.translateAlternateColorCodes('&', "&7Freezes any still water adjacent to ice / frost which"));
        frostwalkerlore.add(ChatColor.translateAlternateColorCodes('&', "&7player is walking on"));
        frostwalkermeta.setLore(frostwalkerlore);
        frostwalker.setItemMeta(frostwalkermeta);

        ItemStack riptide = new ItemStack(Material.ENDER_PEARL);
        ItemMeta riptidemeta = riptide.getItemMeta();
        riptidemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.RIPTIDE)) {
            riptidemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        riptidemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRiptide"));
        List<String> riptidelore = new ArrayList<>();
        riptidelore.add(ChatColor.translateAlternateColorCodes('&', "&7When it is rainy, launches the player in the direction"));
        riptidelore.add(ChatColor.translateAlternateColorCodes('&', "&7their trident is thrown"));
        riptidemeta.setLore(riptidelore);
        riptide.setItemMeta(riptidemeta);

        ItemStack soulspeed = new ItemStack(Material.SOUL_SAND);
        ItemMeta soulspeedmeta = soulspeed.getItemMeta();
        soulspeedmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.SOUL_SPEED)) {
            soulspeedmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        soulspeedmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSoul Speed"));
        List<String> soulspeedlore = new ArrayList<>();
        soulspeedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Walk quicker on soul blocks"));
        soulspeedmeta.setLore(soulspeedlore);
        soulspeed.setItemMeta(soulspeedmeta);

        ItemStack swiftsneak = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta swiftsneakmeta = swiftsneak.getItemMeta();
        swiftsneakmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.SWIFT_SNEAK)) {
            swiftsneakmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        swiftsneakmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSwift Sneak"));
        List<String> swiftsneaklore = new ArrayList<>();
        swiftsneaklore.add(ChatColor.translateAlternateColorCodes('&', "&7Walk quicker while sneaking"));
        swiftsneakmeta.setLore(swiftsneaklore);
        swiftsneak.setItemMeta(swiftsneakmeta);

        gui.setItem(11, depthstrider);
        gui.setItem(12, frostwalker);
        gui.setItem(13, riptide);
        gui.setItem(14, soulspeed);
        gui.setItem(15, swiftsneak);
        player.openInventory(gui);
    }
}
