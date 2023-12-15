package vxrp.me.itemcustomizer.Menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ConfirmMenu {
    public static String confirm_menuname = "&cPlease Confirm your action";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 9, ChatColor.translateAlternateColorCodes('&', confirm_menuname));
        ItemStack reset = new ItemStack(Material.BARRIER);
        ItemMeta resetmeta = reset.getItemMeta();
        resetmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        resetmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cConfirm"));
        List<String> resetlore = new ArrayList<>();
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&7This cannot be reverted"));
        resetmeta.setLore(resetlore);
        reset.setItemMeta(resetmeta);

        gui.setItem(4, reset);
        player.openInventory(gui);
    }
}
