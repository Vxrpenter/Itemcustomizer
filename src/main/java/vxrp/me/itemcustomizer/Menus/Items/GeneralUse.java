package vxrp.me.itemcustomizer.Menus.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GeneralUse {
    public static ItemStack FeatureDisabled() {
        ItemStack featureDisabled = new ItemStack(Material.BARRIER);
        ItemMeta featureDisabledMeta = featureDisabled.getItemMeta();
        featureDisabledMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        featureDisabledMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cFeature disabled"));
        List<String> featureDisabledLore = new ArrayList<>();
        featureDisabledLore.add(ChatColor.translateAlternateColorCodes('&', "&7This feature is not available for this item"));
        featureDisabledMeta.setLore(featureDisabledLore);
        featureDisabled.setItemMeta(featureDisabledMeta);

        return featureDisabled;
    }
    public static ItemStack Back() {
        ItemStack back = new ItemStack(Material.ARROW);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBack"));
        List<String> backLore = new ArrayList<>();
        backLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sends you back to the edit menu"));
        backMeta.setLore(backLore);
        back.setItemMeta(backMeta);

        return back;
    }
}
