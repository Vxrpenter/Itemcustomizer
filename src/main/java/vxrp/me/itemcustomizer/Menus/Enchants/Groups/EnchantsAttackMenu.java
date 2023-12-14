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
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import java.util.ArrayList;
import java.util.List;

public class EnchantsAttackMenu {
    public static String menuname = "&bEnchants &7Attack";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 5 * 9, ChatColor.translateAlternateColorCodes('&', menuname));
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());

        ItemStack baneofarthropods = new ItemStack(Material.SPIDER_EYE);
        ItemMeta baneofarthropodsmeta = baneofarthropods.getItemMeta();
        baneofarthropodsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.DAMAGE_ARTHROPODS)) {
            baneofarthropodsmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        baneofarthropodsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBane of Arthropods"));
        List<String> baneofarthropodslore = new ArrayList<>();
        baneofarthropodslore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against arthropod targets"));
        baneofarthropodsmeta.setLore(baneofarthropodslore);
        baneofarthropods.setItemMeta(baneofarthropodsmeta);

        ItemStack channeling = new ItemStack(Material.LANTERN);
        ItemMeta channelingmeta = channeling.getItemMeta();
        channelingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.CHANNELING)) {
            channelingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        channelingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bChanneling"));
        List<String> channelinglore = new ArrayList<>();
        channelinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Strikes lightning when a mob is hit with a trident if"));
        channelinglore.add(ChatColor.translateAlternateColorCodes('&', "&7conditions are stormy"));
        channelingmeta.setLore(channelinglore);
        channeling.setItemMeta(channelingmeta);

        ItemStack fireaspect = new ItemStack(Material.FLINT_AND_STEEL);
        ItemMeta fireaspectmeta = fireaspect.getItemMeta();
        fireaspectmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.FIRE_ASPECT)) {
            fireaspectmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        fireaspectmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFire Aspect"));
        List<String> fireaspectlore = new ArrayList<>();
        fireaspectlore.add(ChatColor.translateAlternateColorCodes('&', "&7When attacking a target, has a chance to set them on"));
        fireaspectlore.add(ChatColor.translateAlternateColorCodes('&', "&7fire"));
        fireaspectmeta.setLore(fireaspectlore);
        fireaspect.setItemMeta(fireaspectmeta);

        ItemStack flame = new ItemStack(Material.CAMPFIRE);
        ItemMeta flamemeta = flame.getItemMeta();
        flamemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.ARROW_FIRE)) {
            flamemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        flamemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFlame"));
        List<String> flamelore = new ArrayList<>();
        flamelore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets entities on fire when hit by arrows shot from a"));
        flamelore.add(ChatColor.translateAlternateColorCodes('&', "&7bow"));
        flamemeta.setLore(flamelore);
        flame.setItemMeta(flamemeta);

        ItemStack impaling = new ItemStack(Material.TRIDENT);
        ItemMeta impalingmeta = impaling.getItemMeta();
        impalingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.IMPALING)) {
            impalingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        impalingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bImpaling"));
        List<String> impalinglore = new ArrayList<>();
        impalinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Deals more damage to mobs that live in the ocean"));
        impalingmeta.setLore(impalinglore);
        impaling.setItemMeta(impalingmeta);

        ItemStack infinity = new ItemStack(Material.SPECTRAL_ARROW);
        ItemMeta infinitymeta = infinity.getItemMeta();
        infinitymeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.ARROW_INFINITE)) {
            infinitymeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        infinitymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bInfinity"));
        List<String> infinitylore = new ArrayList<>();
        infinitylore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides infinite arrows when shooting a bow"));
        infinitymeta.setLore(infinitylore);
        infinity.setItemMeta(infinitymeta);

        ItemStack knockback = new ItemStack(Material.STICK);
        ItemMeta knockbackmeta = knockback.getItemMeta();
        knockbackmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.KNOCKBACK)) {
            knockbackmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        knockbackmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bKnockback"));
        List<String> knockbacklore = new ArrayList<>();
        knockbacklore.add(ChatColor.translateAlternateColorCodes('&', "&7All damage to other targets will knock them back"));
        knockbacklore.add(ChatColor.translateAlternateColorCodes('&', "&7when hit"));
        knockbackmeta.setLore(knockbacklore);
        knockback.setItemMeta(knockbackmeta);

        ItemStack loyalty = new ItemStack(Material.LEAD);
        ItemMeta loyaltymeta = loyalty.getItemMeta();
        loyaltymeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.LOYALTY)) {
            loyaltymeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        loyaltymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLoyalty"));
        List<String> loyaltylore = new ArrayList<>();
        loyaltylore.add(ChatColor.translateAlternateColorCodes('&', "&7Causes a thrown trident to return to the player who"));
        loyaltylore.add(ChatColor.translateAlternateColorCodes('&', "&7threw it"));
        loyaltymeta.setLore(loyaltylore);
        loyalty.setItemMeta(loyaltymeta);

        ItemStack multishot = new ItemStack(Material.BEETROOT);
        ItemMeta multishotmeta = multishot.getItemMeta();
        multishotmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.MULTISHOT)) {
            multishotmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        multishotmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMultishot"));
        List<String> multishotlore = new ArrayList<>();
        multishotlore.add(ChatColor.translateAlternateColorCodes('&', "&7Shoot multiple arrows from crossbows"));
        multishotmeta.setLore(multishotlore);
        multishot.setItemMeta(multishotmeta);

        ItemStack piercing = new ItemStack(Material.CROSSBOW);
        ItemMeta piercingmeta = piercing.getItemMeta();
        piercingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.PIERCING)) {
            piercingmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        piercingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPiercing"));
        List<String> piercinglore = new ArrayList<>();
        piercinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Crossbow projectiles pierce entities"));
        piercingmeta.setLore(piercinglore);
        piercing.setItemMeta(piercingmeta);

        ItemStack power = new ItemStack(Material.ARROW);
        ItemMeta powermeta = power.getItemMeta();
        powermeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.ARROW_DAMAGE)) {
            powermeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        powermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPower"));
        List<String> powerlore = new ArrayList<>();
        powerlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides extra damage when shooting arrows from"));
        powerlore.add(ChatColor.translateAlternateColorCodes('&', "&7bows"));
        powermeta.setLore(powerlore);
        power.setItemMeta(powermeta);

        ItemStack punch = new ItemStack(Material.SLIME_BLOCK);
        ItemMeta punchmeta = punch.getItemMeta();
        punchmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.ARROW_KNOCKBACK)) {
            punchmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        punchmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPunch"));
        List<String> punchlore = new ArrayList<>();
        punchlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides a knockback when an entity is hit by an"));
        punchlore.add(ChatColor.translateAlternateColorCodes('&', "&7arrow from a bow"));
        punchmeta.setLore(punchlore);
        punch.setItemMeta(punchmeta);

        ItemStack quickcharge = new ItemStack(Material.STRING);
        ItemMeta quickchargemeta = quickcharge.getItemMeta();
        quickchargemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.QUICK_CHARGE)) {
            quickchargemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        quickchargemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bQuick Charge"));
        List<String> quickchargelore = new ArrayList<>();
        quickchargelore.add(ChatColor.translateAlternateColorCodes('&', "&7Charges crossbows quickly"));
        quickchargemeta.setLore(quickchargelore);
        quickcharge.setItemMeta(quickchargemeta);

        ItemStack sharpness = new ItemStack(Material.IRON_SWORD);
        ItemMeta sharpnessmeta = sharpness.getItemMeta();
        sharpnessmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.DAMAGE_ALL)) {
            sharpnessmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        sharpnessmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSharpness"));
        List<String> sharpnesslore = new ArrayList<>();
        sharpnesslore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against all targets"));
        sharpnessmeta.setLore(sharpnesslore);
        sharpness.setItemMeta(sharpnessmeta);

        ItemStack smite = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta smitemeta = smite.getItemMeta();
        smitemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.DAMAGE_UNDEAD)) {
            smitemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        smitemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSmite"));
        List<String> smitelore = new ArrayList<>();
        smitelore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against undead targets"));
        smitemeta.setLore(smitelore);
        smite.setItemMeta(smitemeta);

        ItemStack sweepingedge = new ItemStack(Material.TNT);
        ItemMeta sweepingedgemeta = sweepingedge.getItemMeta();
        sweepingedgemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (itemMeta.hasEnchant(Enchantment.SWEEPING_EDGE)) {
            sweepingedgemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        sweepingedgemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSweeping Edge"));
        List<String> sweepingedgelore = new ArrayList<>();
        sweepingedgelore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against targets when using a"));
        sweepingedgelore.add(ChatColor.translateAlternateColorCodes('&', "&7sweep attack"));
        sweepingedgemeta.setLore(sweepingedgelore);
        sweepingedge.setItemMeta(sweepingedgemeta);

        gui.setItem(10, baneofarthropods);
        gui.setItem(11, channeling);
        gui.setItem(12, fireaspect);
        gui.setItem(13, flame);
        gui.setItem(14, impaling);
        gui.setItem(15, infinity);
        gui.setItem(16, knockback);
        gui.setItem(19, loyalty);
        gui.setItem(20, multishot);
        gui.setItem(21, piercing);
        gui.setItem(22, power);
        gui.setItem(23, punch);
        gui.setItem(24, quickcharge);
        gui.setItem(25, sharpness);
        gui.setItem(28, smite);
        gui.setItem(29, sweepingedge);
        player.openInventory(gui);
    }
}
