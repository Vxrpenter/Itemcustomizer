package vxrp.me.itemcustomizer.Menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.ConfirmMaps;

import java.util.ArrayList;
import java.util.List;

public class ConfirmMenu implements Listener {
    public static String confirm_menuname = "&cPlease Confirm your action";

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', confirm_menuname))) {
            if (event.getSlot() == 4) {
                player.playSound(player, Sound.BLOCK_GRINDSTONE_USE, 10, 1);
                ConfirmMaps.confirmed.put(player.getUniqueId(), true);
                CreateCustomMenu.OpenMenu(player);
            }
        }
    }

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 9, ChatColor.translateAlternateColorCodes('&', confirm_menuname));
        ItemStack reset = new ItemStack(Material.BARRIER);
        ItemMeta resetmeta = reset.getItemMeta();
        resetmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        resetmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bConfirm"));
        List<String> resetlore = new ArrayList<>();
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&cWARNING: This change cannot be reverted"));
        resetmeta.setLore(resetlore);
        reset.setItemMeta(resetmeta);

        gui.setItem(4, reset);
        player.openInventory(gui);
    }
}
