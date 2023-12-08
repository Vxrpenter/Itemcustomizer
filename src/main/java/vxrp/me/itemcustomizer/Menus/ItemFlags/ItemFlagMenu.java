package vxrp.me.itemcustomizer.Menus.ItemFlags;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;

import java.util.ArrayList;
import java.util.List;

public class ItemFlagMenu {
    public static String menuname = "&bItemFlags";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());

        ItemStack hide_attributes = new ItemStack(Material.ENDER_EYE);
        ItemMeta hide_attributesmeta = hide_attributes.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
            hide_attributesmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hide_attributesmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hide_attributesmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Attributes"));
        List<String> hide_attributeslore = new ArrayList<>();
        hide_attributeslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide Attributes &7like Damage"));
        hide_attributesmeta.setLore(hide_attributeslore);
        hide_attributes.setItemMeta(hide_attributesmeta);

        ItemStack hide_enchants = new ItemStack(Material.BOOK);
        ItemMeta hide_enchantsmeta = hide_enchants.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS)) {
            hide_enchantsmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hide_enchantsmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ENCHANTS);
        hide_enchantsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Enchants"));
        List<String> hide_enchantslore = new ArrayList<>();
        hide_enchantslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide enchants"));
        hide_enchantsmeta.setLore(hide_enchantslore);
        hide_enchants.setItemMeta(hide_enchantsmeta);

        ItemStack hidedye = new ItemStack(Material.WHITE_DYE);
        ItemMeta hidedyemeta = hidedye.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DYE)) {
            hidedyemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidedyemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        hidedyemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Dye"));
        List<String> hidedyelore = new ArrayList<>();
        hidedyelore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide dyes from coloured &7leather"));
        hidedyelore.add(ChatColor.translateAlternateColorCodes('&', "&7armour"));
        hidedyemeta.setLore(hidedyelore);
        hidedye.setItemMeta(hidedyemeta);

        ItemStack hidedestroys = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta hidedestroysmeta = hidedestroys.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS)) {
            hidedestroysmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidedestroysmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hidedestroysmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Destroys"));
        List<String> hidedestroyslore = new ArrayList<>();
        hidedestroyslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide what the ItemStack"));
        hidedestroyslore.add(ChatColor.translateAlternateColorCodes('&', "&7can break/destroy"));
        hidedestroysmeta.setLore(hidedestroyslore);
        hidedestroys.setItemMeta(hidedestroysmeta);

        ItemStack hideplacedon = new ItemStack(Material.SPYGLASS);
        ItemMeta hideplacedonmeta = hideplacedon.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON)) {
            hideplacedonmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideplacedonmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hideplacedonmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Placed On"));
        List<String> hideplacedonlore = new ArrayList<>();
        hideplacedonlore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide where this ItemStack can be"));
        hideplacedonlore.add(ChatColor.translateAlternateColorCodes('&', "&7build/placed on"));
        hideplacedonmeta.setLore(hideplacedonlore);
        hideplacedon.setItemMeta(hideplacedonmeta);

        ItemStack hidepotioneffects = new ItemStack(Material.HONEY_BOTTLE);
        ItemMeta hidepotioneffectsmeta = hidepotioneffects.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS)) {
            hidepotioneffectsmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidepotioneffectsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        hidepotioneffectsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Potion Effects"));
        List<String> hidepotioneffectslore = new ArrayList<>();
        hidepotioneffectslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide potion effects, book and"));
        hidepotioneffectslore.add(ChatColor.translateAlternateColorCodes('&', "&7firework information, map tooltips, patterns of"));
        hidepotioneffectslore.add(ChatColor.translateAlternateColorCodes('&', "&7banners, and enchantments of enchanted books."));
        hidepotioneffectsmeta.setLore(hidepotioneffectslore);
        hidepotioneffects.setItemMeta(hidepotioneffectsmeta);

        ItemStack hideunbreakable = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta hideunbreakablemeta = hideunbreakable.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
            hideunbreakablemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideunbreakablemeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE, ItemFlag.HIDE_ENCHANTS);
        hideunbreakablemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Unbreakable"));
        List<String> hideunbreakablelore = new ArrayList<>();
        hideunbreakablelore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide the unbreakable State"));
        hideunbreakablemeta.setLore(hideunbreakablelore);
        hideunbreakable.setItemMeta(hideunbreakablemeta);

        ItemStack addall = new ItemStack(Material.ENDER_CHEST);
        ItemMeta addallmeta = addall.getItemMeta();
        if (itemMeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
            hideunbreakablemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        addallmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        addallmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAdd all Itemflags"));
        List<String> addalllore = new ArrayList<>();
        addalllore.add(ChatColor.translateAlternateColorCodes('&', "&7Adds all Itemflags to your item"));
        addallmeta.setLore(addalllore);
        addall.setItemMeta(addallmeta);

        gui.setItem(26, addall);
        gui.setItem(16, hideunbreakable);
        gui.setItem(15, hidepotioneffects);
        gui.setItem(14, hideplacedon);
        gui.setItem(13, hidedestroys);
        gui.setItem(12, hidedye);
        gui.setItem(11, hide_enchants);
        gui.setItem(10, hide_attributes);
        player.openInventory(gui);
    }
}
