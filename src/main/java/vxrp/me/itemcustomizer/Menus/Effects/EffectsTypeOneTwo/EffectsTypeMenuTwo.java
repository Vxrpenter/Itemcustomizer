package vxrp.me.itemcustomizer.Menus.Effects.EffectsTypeOneTwo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Menus.Items.GeneralUse;

import java.util.ArrayList;
import java.util.List;

public class EffectsTypeMenuTwo {
    public static String menuname = "&bEffects &72";
    public static void OpenMenu(Player player) {
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        Inventory gui = Bukkit.createInventory(null, 6*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack speed = new ItemStack(Material.POTION);
        ItemMeta speedMeta = speed.getItemMeta();
        PotionMeta speedPotionMeta = (PotionMeta) speedMeta;
        speedPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0), false);
        speedPotionMeta.setColor(Color.fromRGB(244, 238, 208));
        speedMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        speedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSpeed"));
        List<String> speedLore = new ArrayList<>();
        speedLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases movement speed"));
        speedMeta.setLore(speedLore);
        speed.setItemMeta(speedMeta);

        ItemStack unLuck = new ItemStack(Material.POTION);
        ItemMeta unLuckMeta = unLuck.getItemMeta();
        PotionMeta unLuckPotionMeta = (PotionMeta) unLuckMeta;
        unLuckPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.UNLUCK, 0, 0), false);
        unLuckPotionMeta.setColor(Color.fromRGB(19, 104, 11));
        unLuckMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        unLuckMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bUnluck"));
        List<String> unLuckLore = new ArrayList<>();
        unLuckLore.add(ChatColor.translateAlternateColorCodes('&', "&7Loot table unluck"));
        unLuckMeta.setLore(unLuckLore);
        unLuck.setItemMeta(unLuckMeta);

        ItemStack waterBreathing = new ItemStack(Material.POTION);
        ItemMeta waterBreathingMeta = waterBreathing.getItemMeta();
        PotionMeta waterBreathingPotionMeta = (PotionMeta) waterBreathingMeta;
        waterBreathingPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 0, 0), false);
        waterBreathingPotionMeta.setColor(Color.fromRGB(27, 106, 196));
        waterBreathingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        waterBreathingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bWater Breathing"));
        List<String> waterBreathingLore = new ArrayList<>();
        waterBreathingLore.add(ChatColor.translateAlternateColorCodes('&', "&7Allows breathing underwater"));
        waterBreathingMeta.setLore(waterBreathingLore);
        waterBreathing.setItemMeta(waterBreathingMeta);

        ItemStack weakness = new ItemStack(Material.POTION);
        ItemMeta weaknessMeta = weakness.getItemMeta();
        PotionMeta weaknessPotionMeta = (PotionMeta) weaknessMeta;
        weaknessPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 0, 0), false);
        weaknessPotionMeta.setColor(Color.fromRGB(129, 140, 139));
        weaknessMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        weaknessMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bWeakness"));
        List<String> weaknessLore = new ArrayList<>();
        weaknessLore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases damage dealt by an entity"));
        weaknessMeta.setLore(weaknessLore);
        weakness.setItemMeta(weaknessMeta);

        ItemStack wither = new ItemStack(Material.POTION);
        ItemMeta witherMeta = wither.getItemMeta();
        PotionMeta witherPotionMeta = (PotionMeta) witherMeta;
        witherPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.WITHER, 0, 0), false);
        witherPotionMeta.setColor(Color.fromRGB(30, 33, 32));
        witherMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        witherMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bWither"));
        List<String> witherLore = new ArrayList<>();
        witherLore.add(ChatColor.translateAlternateColorCodes('&', "&7Deals damage to an entity over time and gives the"));
        witherLore.add(ChatColor.translateAlternateColorCodes('&', "&7health to the shooter"));
        witherMeta.setLore(witherLore);
        wither.setItemMeta(witherMeta);

        for (int i = 0; i < 54; i++) {
            gui.setItem(i, GeneralUse.Filler());
        }
        gui.setItem(10, speed);
        gui.setItem(11, unLuck);
        gui.setItem(12, waterBreathing);
        gui.setItem(13, weakness);
        gui.setItem(14, wither);

        gui.setItem(45, GeneralUse.LastPage());
        player.openInventory(gui);
    }
}
