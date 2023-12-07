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

public class EnchantsCurseMenu {
    public static String menuname = "&bEnchants &7Curses";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        ItemStack bindingcurse = new ItemStack(Material.CHAIN);
        ItemMeta bindingcursemeta = bindingcurse.getItemMeta();
        bindingcursemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.BINDING_CURSE)) {
            bindingcursemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        bindingcursemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bCurse of Binding"));
        List<String> bindingcurselore = new ArrayList<>();
        bindingcurselore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide Attributes like Damage"));
        bindingcursemeta.setLore(bindingcurselore);
        bindingcurse.setItemMeta(bindingcursemeta);

        ItemStack vanishingcurse = new ItemStack(Material.RED_DYE);
        ItemMeta vanishingcursemeta = vanishingcurse.getItemMeta();
        vanishingcursemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.VANISHING_CURSE)) {
            vanishingcursemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        vanishingcursemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bCurse of Vanishing"));
        List<String> vanishingcurselore = new ArrayList<>();
        vanishingcurselore.add(ChatColor.translateAlternateColorCodes('&', "&7Item disappears instead of dropping"));
        vanishingcursemeta.setLore(vanishingcurselore);
        vanishingcurse.setItemMeta(vanishingcursemeta);

        gui.setItem(10, bindingcurse);
        gui.setItem(11, vanishingcurse);
        player.openInventory(gui);
    }
}
