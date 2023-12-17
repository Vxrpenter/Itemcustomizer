package vxrp.me.itemcustomizer.Menus.Effects;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Menus.Items.GeneralUse;

import java.util.ArrayList;
import java.util.List;

public class EffectsPickMenu {
    public static String menuname = "&bEffects &7Pick";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null,3*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack effect = new ItemStack(Material.POTION);
        ItemMeta effectMeta = effect.getItemMeta();
        effectMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        effectMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEffect"));
        List<String> effectLore = new ArrayList<>();
        effectLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the effect"));
        effectMeta.setLore(effectLore);
        effect.setItemMeta(effectMeta);

        ItemStack potion = new ItemStack(Material.BREWING_STAND);
        ItemMeta potionMeta = potion.getItemMeta();
        potionMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        potionMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPotion"));
        potion.setItemMeta(potionMeta);

        ItemStack time = new ItemStack(Material.CLOCK);
        ItemMeta timeMeta = time.getItemMeta();
        timeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> timeLore = new ArrayList<>();
        if (EffectsMaps.timeIn.get(player.getUniqueId()) == 0) {
            timeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bTime in Seconds"));
            timeLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets how long the effect lasts in seconds"));
            timeLore.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to change -> minutes"));
            timeMeta.setLore(timeLore);
            time.setItemMeta(timeMeta);
            gui.setItem(15, time);
        }
        if (EffectsMaps.timeIn.get(player.getUniqueId()) == 1) {
            timeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bTime in Minutes"));
            timeLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets how long the effect lasts in minutes"));
            timeLore.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to change -> ticks"));
            timeMeta.setLore(timeLore);
            time.setItemMeta(timeMeta);
            gui.setItem(15, time);
        }
        if (EffectsMaps.timeIn.get(player.getUniqueId()) == 2) {
            timeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bTime in Ticks"));
            List<String> timeInTicksLore = new ArrayList<>();
            timeInTicksLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets how long the effect lasts in ticks"));
            timeInTicksLore.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to change -> seconds"));
            timeMeta.setLore(timeInTicksLore);
            time.setItemMeta(timeMeta);
            gui.setItem(15, time);
        }

        ItemStack amplifier = new ItemStack(Material.CAMPFIRE);
        ItemMeta amplifierMeta = amplifier.getItemMeta();
        amplifierMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAmplifier"));
        List<String> amplifierLore = new ArrayList<>();
        amplifierLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the level of the effect"));
        amplifierMeta.setLore(amplifierLore);
        amplifier.setItemMeta(amplifierMeta);

        ItemStack color = new ItemStack(Material.CAULDRON);
        ItemMeta colorMeta = amplifier.getItemMeta();
        colorMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bColor"));
        List<String> colorLore = new ArrayList<>();
        colorLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the Color of the Potion"));
        colorLore.add(" ");
        colorLore.add(ChatColor.translateAlternateColorCodes('&', "&7&o'color is going to be reset if you already"));
        colorLore.add(ChatColor.translateAlternateColorCodes('&', "&7&oset a color for your potion'"));
        colorMeta.setLore(colorLore);
        color.setItemMeta(colorMeta);

        gui.setItem(26,GeneralUse.Back());
        gui.setItem(3, color);
        gui.setItem(5, amplifier);
        gui.setItem(11, GeneralUse.Remove());
        gui.setItem(22, effect);
        gui.setItem(13, potion);
        player.openInventory(gui);
    }
}
