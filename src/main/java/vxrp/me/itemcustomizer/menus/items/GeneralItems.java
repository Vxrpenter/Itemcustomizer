package vxrp.me.itemcustomizer.menus.items;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GeneralItems {
    public static ItemStack featureDisabled() {
        ItemStack featureDisabled = new ItemStack(Material.BARRIER);
        ItemMeta featureDisabledMeta = featureDisabled.getItemMeta();
        featureDisabledMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        featureDisabledMeta.displayName(Component.text(ChatColor.RED + "Feature disabled"));
        List<Component> featureDisabledLore = new ArrayList<>();
        featureDisabledLore.add(Component.text(ChatColor.GRAY + "This feature is not available for this item"));
        featureDisabledMeta.lore(featureDisabledLore);
        featureDisabled.setItemMeta(featureDisabledMeta);

        return featureDisabled;
    }
    public static ItemStack back() {
        ItemStack back = new ItemStack(Material.ARROW);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backMeta.displayName(Component.text(ChatColor.AQUA + "Back"));
        List<Component> backLore = new ArrayList<>();
        backLore.add(Component.text(ChatColor.GRAY + "Sends you back to the edit menu"));
        backMeta.lore(backLore);
        back.setItemMeta(backMeta);

        return back;
    }
    public static ItemStack filler() {
        ItemStack filler = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta fillerMeta = filler.getItemMeta();
        fillerMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fillerMeta.displayName(Component.text(" "));
        filler.setItemMeta(fillerMeta);

        return filler;
    }
    public static ItemStack remove() {
        ItemStack remove = new ItemStack(Material.BARRIER);
        ItemMeta removeMeta = remove.getItemMeta();
        removeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        removeMeta.displayName(Component.text(ChatColor.RED + "Remove"));
        List<Component> removeLore = new ArrayList<>();
        removeLore.add(Component.text(ChatColor.GRAY + "Click to remove"));
        removeMeta.lore(removeLore);
        remove.setItemMeta(removeMeta);

        return remove;
    }
    public static ItemStack nextPage() {
        ItemStack nextPage = new ItemStack(Material.ARROW);
        ItemMeta nextPageMeta = nextPage.getItemMeta();
        nextPageMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        nextPageMeta.displayName(Component.text(ChatColor.AQUA + "Next Page"));
        nextPage.setItemMeta(nextPageMeta);

        return nextPage;
    }
    public static ItemStack lastPage() {
        ItemStack lastPage = new ItemStack(Material.ARROW);
        ItemMeta lastPageMeta = lastPage.getItemMeta();
        lastPageMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lastPageMeta.displayName(Component.text(ChatColor.AQUA + "Last Page"));
        lastPage.setItemMeta(lastPageMeta);

        return lastPage;
    }

}
