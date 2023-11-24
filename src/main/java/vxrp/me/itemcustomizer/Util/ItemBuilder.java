package vxrp.me.itemcustomizer.Util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {
    public static ItemStack createItem(Material item, String displayname, Boolean hideattributes, PotionType potionType) {
        ItemStack itemstack = new ItemStack(item);
        ItemMeta itemmeta = itemstack.getItemMeta();
        PotionMeta potionMeta = (PotionMeta) itemstack.getItemMeta();

        itemmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', displayname));
        if (hideattributes) {
            itemmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        }
        if (potionType != null) {
            potionMeta.setBasePotionData(new PotionData(potionType));
        }
        List<String> lore = new ArrayList<>();
        lore.add("");
        itemmeta.setLore(lore);
        itemstack.setItemMeta(itemmeta);

        return itemstack;

    }
}
