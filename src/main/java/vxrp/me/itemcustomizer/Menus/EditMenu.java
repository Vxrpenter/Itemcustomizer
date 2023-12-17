package vxrp.me.itemcustomizer.Menus;

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import vxrp.me.itemcustomizer.CreateItem;
import vxrp.me.itemcustomizer.Hashmaps.ConfirmMaps;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Reset;
import vxrp.me.itemcustomizer.Menus.Items.GeneralUse;

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
        Material type = EditMaps.item.get(player.getUniqueId()).getType();
        ItemStack filler = GeneralUse.Filler();

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
        ItemMeta finishMeta = finish.getItemMeta();
        finishMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        finishMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aFinish"));
        List<String> finishLore = new ArrayList<>();
        finishLore.add(ChatColor.translateAlternateColorCodes('&', "&7This finishes the item creation"));
        finishLore.add(ChatColor.translateAlternateColorCodes('&', "&7all the attributes and effects you chose"));
        finishLore.add(ChatColor.translateAlternateColorCodes('&', "&7will be added to your item of choice"));
        finishMeta.setLore(finishLore);
        finish.setItemMeta(finishMeta);

        ItemStack displayName = new ItemStack(Material.NAME_TAG);
        ItemMeta displaynameMeta = displayName.getItemMeta();
        displaynameMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        displaynameMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDisplayName"));
        List<String> displayNameLore = new ArrayList<>();
        displayNameLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the display name,"));
        displayNameLore.add(ChatColor.translateAlternateColorCodes('&', "&7'you can use color codes too'"));
        displaynameMeta.setLore(displayNameLore);
        displayName.setItemMeta(displaynameMeta);

        ItemStack enchants = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta enchantsMeta = displayName.getItemMeta();
        enchantsMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        enchantsMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEnchants"));
        List<String> enchantsLore = new ArrayList<>();
        enchantsLore.add(ChatColor.translateAlternateColorCodes('&', "&7Adds the specified enchantment to this item"));
        enchantsMeta.setLore(enchantsLore);
        enchants.setItemMeta(enchantsMeta);

        ItemStack unbreakable = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta unbreakableMeta = displayName.getItemMeta();
        if (itemMeta.isUnbreakable()) {
            unbreakableMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        unbreakableMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        unbreakableMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bUnbreakable"));
        List<String> unbreakableLore = new ArrayList<>();
        unbreakableLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the unbreakable tag. An unbreakable item will"));
        unbreakableLore.add(ChatColor.translateAlternateColorCodes('&', "&7not lose durability."));
        unbreakableMeta.setLore(unbreakableLore);
        unbreakable.setItemMeta(unbreakableMeta);

        ItemStack attributeModifier = new ItemStack(Material.COMMAND_BLOCK);
        ItemMeta attributeModifierMeta = attributeModifier.getItemMeta();
        attributeModifierMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        attributeModifierMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAttribute Modifiers"));
        List<String> attributeModifierLore = new ArrayList<>();
        attributeModifierLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set all Attributes and their AttributeModifiers"));
        attributeModifierMeta.setLore(attributeModifierLore);
        attributeModifier.setItemMeta(attributeModifierMeta);

        if (type == Material.LEATHER_HELMET || type == Material.LEATHER_CHESTPLATE || type == Material.LEATHER_LEGGINGS || type == Material.LEATHER_BOOTS) {
            ItemStack color = new ItemStack(Material.CAULDRON);
            ItemMeta colorMeta = color.getItemMeta();
            colorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            colorMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bColor"));
            List<String> colorLore = new ArrayList<>();
            colorLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the color of the armor"));
            colorMeta.setLore(colorLore);
            color.setItemMeta(colorMeta);
            gui.setItem(28, color);
        } else {
            gui.setItem(28, GeneralUse.FeatureDisabled());

        }

        if (type == Material.POTION || type == Material.LINGERING_POTION || type == Material.SPLASH_POTION) {
            ItemStack effect = new ItemStack(Material.POTION);
            ItemMeta effectMeta = effect.getItemMeta();
            effectMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
            effectMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bEffect"));
            List<String> effectLore = new ArrayList<>();
            effectLore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets the effect of a potion"));
            effectMeta.setLore(effectLore);
            effect.setItemMeta(effectMeta);
            gui.setItem(34, effect);
        } else {
            gui.setItem(34, GeneralUse.FeatureDisabled());
        }

        gui.setItem(32, attributeModifier);
        gui.setItem(30, unbreakable);
        gui.setItem(24, enchants);
        gui.setItem(22, displayName);
        gui.setItem(49, finish);
        gui.setItem(20, itemflags);
        gui.setItem(53, reset);
        player.openInventory(gui);
    }

}
