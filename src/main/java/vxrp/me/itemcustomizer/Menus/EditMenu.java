package vxrp.me.itemcustomizer.Menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.CreateItem;
import vxrp.me.itemcustomizer.Hashmaps.ConfirmMaps;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Reset;
import vxrp.me.itemcustomizer.Itemcustomizer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EditMenu {
    public static String menuname = "&bEdit-Item";

    public static void OpenMenu(Player player) {
        ConfirmMaps.confirmed.putIfAbsent(player.getUniqueId(), false);
        UUID uuid = player.getUniqueId();
        Inventory gui = Bukkit.createInventory(null, 6*9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());

        if (ConfirmMaps.confirmed.get(player.getUniqueId())) {
            Reset.reset(player);
            EditMaps.item.put(player.getUniqueId(), player.getItemInHand());
            EditMaps.itemmeta.put(player.getUniqueId(), player.getItemInHand().getItemMeta());
            itemMeta.setUnbreakable(false);
            OpenMenu(player);
        }

        if (EditMaps.item.get(uuid) == null) {
            gui.setItem(13, new ItemStack(Material.LIGHT));
        } else if (EditMaps.item.get(uuid) != null) {
            gui.setItem(13, CreateItem.Create(player));
        }

        ItemStack reset = new ItemStack(Material.BARRIER);
        ItemMeta resetmeta = reset.getItemMeta();
        resetmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        resetmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bReset"));
        List<String> resetlore = new ArrayList<>();
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&7This will reset all changes that"));
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&7have been made in this configuration"));
        resetmeta.setLore(resetlore);
        reset.setItemMeta(resetmeta);

        ItemStack itemflags = new ItemStack(Material.GLASS);
        ItemMeta itemflagsmeta = itemflags.getItemMeta();
        itemflagsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemflagsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bItemFlags"));
        List<String> itemflaglore = new ArrayList<>();
        itemflaglore.add(ChatColor.translateAlternateColorCodes('&', "&7With ItemFlags you can hide certain"));
        itemflaglore.add(ChatColor.translateAlternateColorCodes('&', "&7Attributes on an Item"));
        itemflagsmeta.setLore(itemflaglore);
        itemflags.setItemMeta(itemflagsmeta);

        ItemStack finish = new ItemStack(Material.ANVIL);
        ItemMeta finishmeta = finish.getItemMeta();
        finishmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        finishmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aFinish"));
        List<String> finishlore = new ArrayList<>();
        finishlore.add(ChatColor.translateAlternateColorCodes('&', "&7This finishes the item creation"));
        finishlore.add(ChatColor.translateAlternateColorCodes('&', "&7all the attributes and effects you chose"));
        finishlore.add(ChatColor.translateAlternateColorCodes('&', "&7will be added to your item of choice"));
        finishmeta.setLore(finishlore);
        finish.setItemMeta(finishmeta);

        ItemStack displayname = new ItemStack(Material.NAME_TAG);
        ItemMeta displaynamemeta = displayname.getItemMeta();
        displaynamemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        displaynamemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDisplayName"));
        List<String> displaynamelore = new ArrayList<>();
        displaynamelore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the display name,"));
        displaynamelore.add(ChatColor.translateAlternateColorCodes('&', "&7'you can use color codes too'"));
        displaynamemeta.setLore(displaynamelore);
        displayname.setItemMeta(displaynamemeta);

        ItemStack enchants = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta enchantsmeta = displayname.getItemMeta();
        enchantsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        enchantsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEnchants"));
        List<String> enchantslore = new ArrayList<>();
        enchantslore.add(ChatColor.translateAlternateColorCodes('&', "&7Adds the specified enchantment to this item"));
        enchantsmeta.setLore(enchantslore);
        enchants.setItemMeta(enchantsmeta);

        ItemStack unbreakable = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta unbreakablemeta = displayname.getItemMeta();
        if (itemMeta.isUnbreakable()) {
            unbreakablemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        unbreakablemeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        unbreakablemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bUnbreakable"));
        List<String> unbreakablelore = new ArrayList<>();
        unbreakablelore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the unbreakable tag. An unbreakable item will"));
        unbreakablelore.add(ChatColor.translateAlternateColorCodes('&', "&7not lose durability."));
        unbreakablemeta.setLore(unbreakablelore);
        unbreakable.setItemMeta(unbreakablemeta);

        gui.setItem(30, unbreakable);
        gui.setItem(24, enchants);
        gui.setItem(22, displayname);
        gui.setItem(49, finish);
        gui.setItem(20, itemflags);
        gui.setItem(53, reset);
        player.openInventory(gui);
    }

}