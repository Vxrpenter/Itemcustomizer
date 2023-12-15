package vxrp.me.itemcustomizer.Menus.Color;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ColorMenu {
    public static String menuname = "&bColor &7Picker";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 5*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack colorAqua = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorAquaMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorAquaLMeta = (LeatherArmorMeta) colorAquaMeta;
        colorAquaLMeta.setColor(org.bukkit.Color.AQUA);
        colorAquaMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorAquaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAqua"));
        colorAqua.setItemMeta(colorAquaMeta);

        ItemStack colorBlack = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorBlackMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorBlackLMeta = (LeatherArmorMeta) colorBlackMeta;
        colorBlackLMeta.setColor(org.bukkit.Color.BLACK);
        colorBlackMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorBlackMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBlack"));
        colorBlack.setItemMeta(colorBlackMeta);

        ItemStack colorBlue = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorBlueMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorBlueLMeta = (LeatherArmorMeta) colorBlueMeta;
        colorBlueLMeta.setColor(org.bukkit.Color.BLUE);
        colorBlueMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorBlueMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBlue"));
        colorBlue.setItemMeta(colorBlueMeta);

        ItemStack colorFuchsia = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorFuchsiaMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorFuchsiaLMeta = (LeatherArmorMeta) colorFuchsiaMeta;
        colorFuchsiaLMeta.setColor(org.bukkit.Color.FUCHSIA);
        colorFuchsiaMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorFuchsiaMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFuchsia"));
        colorFuchsia.setItemMeta(colorFuchsiaMeta);

        ItemStack colorGray = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorGrayMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorGrayLMeta = (LeatherArmorMeta) colorGrayMeta;
        colorGrayLMeta.setColor(org.bukkit.Color.GRAY);
        colorGrayMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorGrayMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGray"));
        colorGray.setItemMeta(colorGrayMeta);

        ItemStack colorGreen = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorGreenMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorGreenLMeta = (LeatherArmorMeta) colorGreenMeta;
        colorGreenLMeta.setColor(org.bukkit.Color.GREEN);
        colorGreenMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorGreenMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGreen"));
        colorGreen.setItemMeta(colorGreenMeta);

        ItemStack colorLime = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorLimeMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorLimeLMeta = (LeatherArmorMeta) colorLimeMeta;
        colorLimeLMeta.setColor(org.bukkit.Color.LIME);
        colorLimeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorLimeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLime"));
        colorLime.setItemMeta(colorLimeMeta);

        ItemStack colorMaroon = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorMaroonMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorMaroonLMeta = (LeatherArmorMeta) colorMaroonMeta;
        colorMaroonLMeta.setColor(org.bukkit.Color.MAROON);
        colorMaroonMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorMaroonMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMaroon"));
        colorMaroon.setItemMeta(colorMaroonMeta);

        ItemStack colorNavy = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorNavyMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorNavyLMeta = (LeatherArmorMeta) colorNavyMeta;
        colorNavyLMeta.setColor(org.bukkit.Color.NAVY);
        colorNavyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorNavyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bNavy"));
        colorNavy.setItemMeta(colorNavyMeta);

        ItemStack colorOlive = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorOliveMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorOliveMetaLMeta = (LeatherArmorMeta) colorOliveMeta;
        colorOliveMetaLMeta.setColor(org.bukkit.Color.OLIVE);
        colorOliveMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorOliveMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bOlive"));
        colorOlive.setItemMeta(colorOliveMeta);

        ItemStack colorOrange = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorOrangeMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorOrangeLMeta = (LeatherArmorMeta) colorOrangeMeta;
        colorOrangeLMeta.setColor(org.bukkit.Color.ORANGE);
        colorOrangeMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorOrangeMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bOrange"));
        colorOrange.setItemMeta(colorOrangeMeta);

        ItemStack colorPurple = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorPurpleMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorPurpleLMeta = (LeatherArmorMeta) colorPurpleMeta;
        colorPurpleLMeta.setColor(org.bukkit.Color.PURPLE);
        colorPurpleMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorPurpleMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPurple"));
        colorPurple.setItemMeta(colorPurpleMeta);

        ItemStack colorRed = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorRedMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorRedLMeta = (LeatherArmorMeta) colorRedMeta;
        colorRedLMeta.setColor(org.bukkit.Color.RED);
        colorRedMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorRedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRed"));
        colorRed.setItemMeta(colorRedMeta);

        ItemStack colorSilver = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorSilverMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorSilverLMeta = (LeatherArmorMeta) colorSilverMeta;
        colorSilverLMeta.setColor(org.bukkit.Color.SILVER);
        colorSilverMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorSilverMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSilver"));
        colorSilver.setItemMeta(colorSilverMeta);

        ItemStack colorTeal = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorTealMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorTealLMeta = (LeatherArmorMeta) colorTealMeta;
        colorTealLMeta.setColor(org.bukkit.Color.TEAL);
        colorTealMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorTealMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bTeal"));
        colorTeal.setItemMeta(colorTealMeta);

        ItemStack colorWhite = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorWhiteMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorWhiteLMeta = (LeatherArmorMeta) colorWhiteMeta;
        colorWhiteLMeta.setColor(org.bukkit.Color.WHITE);
        colorWhiteMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        colorWhiteMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bWhite"));
        colorWhite.setItemMeta(colorWhiteMeta);

        ItemStack colorYellow = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta colorYellowMeta = colorAqua.getItemMeta();
        LeatherArmorMeta colorYellowLMeta = (LeatherArmorMeta) colorYellowMeta;
        colorYellowLMeta.setColor(org.bukkit.Color.YELLOW);
        colorYellowMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
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
        gui.setItem(29, colorYellow);
        player.openInventory(gui);
    }
}
