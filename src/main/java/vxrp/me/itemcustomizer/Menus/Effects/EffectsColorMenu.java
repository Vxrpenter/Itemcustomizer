package vxrp.me.itemcustomizer.Menus.Effects;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class EffectsColorMenu {
    public static String menuname = "&bEffect &7Color";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 5*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack colorAqua = new ItemStack(Material.POTION);
        ItemMeta colorAquaMeta = colorAqua.getItemMeta();
        PotionMeta colorAquaPotionMeta = (PotionMeta) colorAquaMeta;
        colorAquaPotionMeta.setColor(org.bukkit.Color.AQUA);
        colorAquaMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorAquaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAqua"));
        colorAqua.setItemMeta(colorAquaMeta);

        ItemStack colorBlack = new ItemStack(Material.POTION);
        ItemMeta colorBlackMeta = colorAqua.getItemMeta();
        PotionMeta colorBlackPotionMeta = (PotionMeta) colorBlackMeta;
        colorBlackPotionMeta.setColor(org.bukkit.Color.BLACK);
        colorBlackMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorBlackMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBlack"));
        colorBlack.setItemMeta(colorBlackMeta);

        ItemStack colorBlue = new ItemStack(Material.POTION);
        ItemMeta colorBlueMeta = colorAqua.getItemMeta();
        PotionMeta colorBluePotionMeta = (PotionMeta) colorBlueMeta;
        colorBluePotionMeta.setColor(org.bukkit.Color.BLUE);
        colorBlueMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorBlueMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBlue"));
        colorBlue.setItemMeta(colorBlueMeta);

        ItemStack colorFuchsia = new ItemStack(Material.POTION);
        ItemMeta colorFuchsiaMeta = colorAqua.getItemMeta();
        PotionMeta colorFuchsiaPotionMeta = (PotionMeta) colorFuchsiaMeta;
        colorFuchsiaPotionMeta.setColor(org.bukkit.Color.FUCHSIA);
        colorFuchsiaMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorFuchsiaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFuchsia"));
        colorFuchsia.setItemMeta(colorFuchsiaMeta);

        ItemStack colorGray = new ItemStack(Material.POTION);
        ItemMeta colorGrayMeta = colorAqua.getItemMeta();
        PotionMeta colorGrayPotionMeta = (PotionMeta) colorGrayMeta;
        colorGrayPotionMeta.setColor(org.bukkit.Color.GRAY);
        colorGrayMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorGrayMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGray"));
        colorGray.setItemMeta(colorGrayMeta);

        ItemStack colorGreen = new ItemStack(Material.POTION);
        ItemMeta colorGreenMeta = colorAqua.getItemMeta();
        PotionMeta colorGreenPotionMeta = (PotionMeta) colorGreenMeta;
        colorGreenPotionMeta.setColor(org.bukkit.Color.GREEN);
        colorGreenMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorGreenMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGreen"));
        colorGreen.setItemMeta(colorGreenMeta);

        ItemStack colorLime = new ItemStack(Material.POTION);
        ItemMeta colorLimeMeta = colorAqua.getItemMeta();
        PotionMeta colorLimePotionMeta = (PotionMeta) colorLimeMeta;
        colorLimePotionMeta.setColor(org.bukkit.Color.LIME);
        colorLimeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorLimeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLime"));
        colorLime.setItemMeta(colorLimeMeta);

        ItemStack colorMaroon = new ItemStack(Material.POTION);
        ItemMeta colorMaroonMeta = colorAqua.getItemMeta();
        PotionMeta colorMaroonPotionMeta = (PotionMeta) colorMaroonMeta;
        colorMaroonPotionMeta.setColor(org.bukkit.Color.MAROON);
        colorMaroonMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorMaroonMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMaroon"));
        colorMaroon.setItemMeta(colorMaroonMeta);

        ItemStack colorNavy = new ItemStack(Material.POTION);
        ItemMeta colorNavyMeta = colorAqua.getItemMeta();
        PotionMeta colorNavyPotionMeta = (PotionMeta) colorNavyMeta;
        colorNavyPotionMeta.setColor(org.bukkit.Color.NAVY);
        colorNavyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorNavyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bNavy"));
        colorNavy.setItemMeta(colorNavyMeta);

        ItemStack colorOlive = new ItemStack(Material.POTION);
        ItemMeta colorOliveMeta = colorAqua.getItemMeta();
        PotionMeta colorOliveMetaPotionMeta = (PotionMeta) colorOliveMeta;
        colorOliveMetaPotionMeta.setColor(org.bukkit.Color.OLIVE);
        colorOliveMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorOliveMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bOlive"));
        colorOlive.setItemMeta(colorOliveMeta);

        ItemStack colorOrange = new ItemStack(Material.POTION);
        ItemMeta colorOrangeMeta = colorAqua.getItemMeta();
        PotionMeta colorOrangePotionMeta = (PotionMeta) colorOrangeMeta;
        colorOrangePotionMeta.setColor(org.bukkit.Color.ORANGE);
        colorOrangeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorOrangeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bOrange"));
        colorOrange.setItemMeta(colorOrangeMeta);

        ItemStack colorPurple = new ItemStack(Material.POTION);
        ItemMeta colorPurpleMeta = colorAqua.getItemMeta();
        PotionMeta colorPurplePotionMeta = (PotionMeta) colorPurpleMeta;
        colorPurplePotionMeta.setColor(org.bukkit.Color.PURPLE);
        colorPurpleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorPurpleMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPurple"));
        colorPurple.setItemMeta(colorPurpleMeta);

        ItemStack colorRed = new ItemStack(Material.POTION);
        ItemMeta colorRedMeta = colorAqua.getItemMeta();
        PotionMeta colorRedPotionMeta = (PotionMeta) colorRedMeta;
        colorRedPotionMeta.setColor(org.bukkit.Color.RED);
        colorRedMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorRedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRed"));
        colorRed.setItemMeta(colorRedMeta);

        ItemStack colorSilver = new ItemStack(Material.POTION);
        ItemMeta colorSilverMeta = colorAqua.getItemMeta();
        PotionMeta colorSilverPotionMeta = (PotionMeta) colorSilverMeta;
        colorSilverPotionMeta.setColor(org.bukkit.Color.SILVER);
        colorSilverMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorSilverMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSilver"));
        colorSilver.setItemMeta(colorSilverMeta);

        ItemStack colorTeal = new ItemStack(Material.POTION);
        ItemMeta colorTealMeta = colorAqua.getItemMeta();
        PotionMeta colorTealPotionMeta = (PotionMeta) colorTealMeta;
        colorTealPotionMeta.setColor(org.bukkit.Color.TEAL);
        colorTealMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorTealMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bTeal"));
        colorTeal.setItemMeta(colorTealMeta);

        ItemStack colorWhite = new ItemStack(Material.POTION);
        ItemMeta colorWhiteMeta = colorAqua.getItemMeta();
        PotionMeta colorWhitePotionMeta = (PotionMeta) colorWhiteMeta;
        colorWhitePotionMeta.setColor(org.bukkit.Color.WHITE);
        colorWhiteMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorWhiteMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bWhite"));
        colorWhite.setItemMeta(colorWhiteMeta);

        ItemStack colorYellow = new ItemStack(Material.POTION);
        ItemMeta colorYellowMeta = colorAqua.getItemMeta();
        PotionMeta colorYellowPotionMeta = (PotionMeta) colorYellowMeta;
        colorYellowPotionMeta.setColor(org.bukkit.Color.YELLOW);
        colorYellowMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        colorYellowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bYellow"));
        colorYellow.setItemMeta(colorYellowMeta);

        gui.setItem(10, colorAqua);
        gui.setItem(11, colorBlack);
        gui.setItem(12, colorBlue);
        gui.setItem(13, colorFuchsia);
        gui.setItem(14, colorGray);
        gui.setItem(15, colorGreen);
        gui.setItem(16, colorLime);
        gui.setItem(19, colorMaroon);
        gui.setItem(20, colorNavy);
        gui.setItem(21, colorOlive);
        gui.setItem(22, colorOrange);
        gui.setItem(23, colorPurple);
        gui.setItem(24, colorRed);
        gui.setItem(25, colorSilver);
        gui.setItem(28, colorTeal);
        gui.setItem(29, colorWhite);
        gui.setItem(30, colorYellow);
        player.openInventory(gui);
    }
}
