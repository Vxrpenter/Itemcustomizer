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

public class EnchantsProtectionMenu {
    public static String menuname = "&bEnchants &7Protection";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 4*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        ItemStack blastprotection = new ItemStack(Material.TNT);
        ItemMeta blastprotectionmeta = blastprotection.getItemMeta();
        blastprotectionmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)) {
            blastprotectionmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        blastprotectionmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBlast Protection"));
        List<String> blastprotectionlore = new ArrayList<>();
        blastprotectionlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides protection against explosive damage"));
        blastprotectionmeta.setLore(blastprotectionlore);
        blastprotection.setItemMeta(blastprotectionmeta);

        ItemStack featherfalling = new ItemStack(Material.FEATHER);
        ItemMeta featherfallingmeta = featherfalling.getItemMeta();
        featherfallingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.PROTECTION_FALL)) {
            featherfallingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        featherfallingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFeather Falling"));
        List<String> featherfallinglore = new ArrayList<>();
        featherfallinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides protection against fall damage"));
        featherfallingmeta.setLore(featherfallinglore);
        featherfalling.setItemMeta(featherfallingmeta);

        ItemStack fireprotection = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta fireprotectionmeta = fireprotection.getItemMeta();
        fireprotectionmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.PROTECTION_FIRE)) {
            fireprotectionmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        fireprotectionmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFire Protection"));
        List<String> fireprotectionlore = new ArrayList<>();
        fireprotectionlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides protection against fire damage"));
        fireprotectionmeta.setLore(fireprotectionlore);
        fireprotection.setItemMeta(fireprotectionmeta);

        ItemStack aquaaffinity = new ItemStack(Material.IRON_HELMET);
        ItemMeta aquaaffinitymeta = aquaaffinity.getItemMeta();
        aquaaffinitymeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.WATER_WORKER)) {
            aquaaffinitymeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        aquaaffinitymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAqua Affinity"));
        List<String> aquaaffinitylore = new ArrayList<>();
        aquaaffinitylore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases the speed at which a player may mine underwater"));
        aquaaffinitymeta.setLore(aquaaffinitylore);
        aquaaffinity.setItemMeta(aquaaffinitymeta);

        ItemStack projectileprotection = new ItemStack(Material.ARROW);
        ItemMeta projectileprotectionmeta = projectileprotection.getItemMeta();
        projectileprotectionmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.PROTECTION_PROJECTILE)) {
            projectileprotectionmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        projectileprotectionmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bProjectile Protection"));
        List<String> projectileprotectionlore = new ArrayList<>();
        projectileprotectionlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides protection against projectile damage"));
        projectileprotectionmeta.setLore(projectileprotectionlore);
        projectileprotection.setItemMeta(projectileprotectionmeta);

        ItemStack protection = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta protectionmeta = protection.getItemMeta();
        protectionmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)) {
            protectionmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        protectionmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bProtection"));
        List<String> protectionlore = new ArrayList<>();
        protectionlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides protection against projectile damage"));
        protectionmeta.setLore(protectionlore);
        protection.setItemMeta(protectionmeta);

        ItemStack respiration = new ItemStack(Material.WATER_BUCKET);
        ItemMeta respirationmeta = respiration.getItemMeta();
        respirationmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.OXYGEN)) {
            respirationmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        respirationmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRespiration"));
        List<String> respirationlore = new ArrayList<>();
        respirationlore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases the rate of air loss whilst underwater"));
        respirationmeta.setLore(respirationlore);
        respiration.setItemMeta(respirationmeta);

        ItemStack thorns = new ItemStack(Material.CACTUS);
        ItemMeta thornsmeta = thorns.getItemMeta();
        thornsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.THORNS)) {
            thornsmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        thornsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bThorns"));
        List<String> thornslore = new ArrayList<>();
        thornslore.add(ChatColor.translateAlternateColorCodes('&', "&7Damages the attacker"));
        thornsmeta.setLore(thornslore);
        thorns.setItemMeta(thornsmeta);

        gui.setItem(10, blastprotection);
        gui.setItem(11, featherfalling);
        gui.setItem(12, fireprotection);
        gui.setItem(13, aquaaffinity);
        gui.setItem(14, projectileprotection);
        gui.setItem(15, protection);
        gui.setItem(16, respiration);
        gui.setItem(19, thorns);
        player.openInventory(gui);
    }
}
