package vxrp.me.itemcustomizer.Menus.Enchants.Groups;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;

import java.util.ArrayList;
import java.util.List;

public class EnchantsGeneralMenu {
    public static String menuname = "&bEnchants &7General";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        ItemStack mending = new ItemStack(Material.EXPERIENCE_BOTTLE);
        ItemMeta mendingmeta = mending.getItemMeta();
        mendingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.MENDING)) {
            mendingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        mendingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMending"));
        List<String> mendinglore = new ArrayList<>();
        mendinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Allows mending the item using experience orbs"));
        mendingmeta.setLore(mendinglore);
        mending.setItemMeta(mendingmeta);

        ItemStack unbreaking = new ItemStack(Material.SHIELD);
        ItemMeta unbreakingmeta = unbreaking.getItemMeta();
        unbreakingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.DURABILITY)) {
            unbreakingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        unbreakingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bUnbreaking"));
        List<String> unbreakinglore = new ArrayList<>();
        unbreakinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases the rate at which a tool looses durability"));
        unbreakingmeta.setLore(unbreakinglore);
        unbreaking.setItemMeta(unbreakingmeta);

        gui.setItem(10, mending);
        gui.setItem(11, unbreaking);
        player.openInventory(gui);
    }
}
