package vxrp.me.itemcustomizer.Menus.Enchants;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;

import java.util.ArrayList;
import java.util.List;

public class EnchantsPickMenu {
    public static String menuname = "&bEnchants &7Pick";
    public static void OpenMenu(Player player) {
        SetLevelMaps.running.putIfAbsent(player.getUniqueId(), false);
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack levels = new ItemStack(Material.EXPERIENCE_BOTTLE);
        ItemMeta levelsmeta = levels.getItemMeta();
        levelsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        levelsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLevels"));
        List<String> levelslore = new ArrayList<>();
        levelslore.add(ChatColor.translateAlternateColorCodes('&', "&7Here you can choose from the levels"));
        levelslore.add(ChatColor.translateAlternateColorCodes('&', "&7that are available for this enchantment"));
        levelsmeta.setLore(levelslore);
        levels.setItemMeta(levelsmeta);

        ItemStack ignorelevelrestrictions = new ItemStack(Material.BARRIER);
        ItemMeta ignorelevelrestrictionsmeta = ignorelevelrestrictions.getItemMeta();
        ignorelevelrestrictionsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        ignorelevelrestrictionsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bIgnoreLevelRestrictions"));
        List<String> ignorelevelrestrictionslore = new ArrayList<>();
        ignorelevelrestrictionslore.add(ChatColor.translateAlternateColorCodes('&', "&7Here you can add a custom level ranging"));
        ignorelevelrestrictionslore.add(ChatColor.translateAlternateColorCodes('&', "&7up to level 255, ignoring the level restrictions"));
        ignorelevelrestrictionsmeta.setLore(ignorelevelrestrictionslore);
        ignorelevelrestrictions.setItemMeta(ignorelevelrestrictionsmeta);

        gui.setItem(14, ignorelevelrestrictions);
        gui.setItem(12, levels);
        //Movement
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.DEPTH_STRIDER) {
            ItemStack enchantment = new ItemStack(Material.WATER_BUCKET);
            ItemMeta enchantmentmeta = enchantment.getItemMeta();
            enchantment.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            enchantmentmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDepth Strider"));
            List<String> enchantmentlore = new ArrayList<>();
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases walking speed while in water"));
            enchantmentmeta.setLore(enchantmentlore);
            enchantment.setItemMeta(enchantmentmeta);

            gui.setItem(13, enchantment);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.FROST_WALKER) {
            ItemStack enchantment = new ItemStack(Material.PACKED_ICE);
            ItemMeta enchantmentmeta = enchantment.getItemMeta();
            enchantmentmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            enchantmentmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFrost Walker"));
            List<String> enchantmentlore = new ArrayList<>();
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7Freezes any still water adjacent to ice / frost which"));
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7player is walking on"));
            enchantmentmeta.setLore(enchantmentlore);
            enchantment.setItemMeta(enchantmentmeta);

            gui.setItem(13, enchantment);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.RIPTIDE) {
            ItemStack enchantment = new ItemStack(Material.ENDER_PEARL);
            ItemMeta enchantmentmeta = enchantment.getItemMeta();
            enchantmentmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            enchantmentmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRiptide"));
            List<String> enchantmentlore = new ArrayList<>();
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7When it is rainy, launches the player in the direction"));
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7their trident is thrown"));
            enchantmentmeta.setLore(enchantmentlore);
            enchantment.setItemMeta(enchantmentmeta);

            gui.setItem(13, enchantment);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.SOUL_SPEED) {
            ItemStack enchantment = new ItemStack(Material.SOUL_SAND);
            ItemMeta enchantmentmeta = enchantment.getItemMeta();
            enchantmentmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            enchantmentmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSoul Speed"));
            List<String> enchantmentlore = new ArrayList<>();
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7Walk quicker on soul blocks"));
            enchantmentmeta.setLore(enchantmentlore);
            enchantment.setItemMeta(enchantmentmeta);

            gui.setItem(13, enchantment);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.SWIFT_SNEAK) {
            ItemStack enchantment = new ItemStack(Material.IRON_LEGGINGS);
            ItemMeta enchantmentmeta = enchantment.getItemMeta();
            enchantmentmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            enchantmentmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSwift Sneak"));
            List<String> enchantmentlore = new ArrayList<>();
            enchantmentlore.add(ChatColor.translateAlternateColorCodes('&', "&7Walk quicker while sneaking"));
            enchantmentmeta.setLore(enchantmentlore);
            enchantment.setItemMeta(enchantmentmeta);

            gui.setItem(13, enchantment);
        }
        //Attack
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.DAMAGE_ARTHROPODS) {
            ItemStack baneofarthropods = new ItemStack(Material.SPIDER_EYE);
            ItemMeta baneofarthropodsmeta = baneofarthropods.getItemMeta();
            baneofarthropodsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            baneofarthropodsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBane of Arthropods"));
            List<String> baneofarthropodslore = new ArrayList<>();
            baneofarthropodslore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against arthropod targets"));
            baneofarthropodsmeta.setLore(baneofarthropodslore);
            baneofarthropods.setItemMeta(baneofarthropodsmeta);

            gui.setItem(13, baneofarthropods);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.CHANNELING) {
            ItemStack channeling = new ItemStack(Material.LANTERN);
            ItemMeta channelingmeta = channeling.getItemMeta();
            channelingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            channelingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bChanneling"));
            List<String> channelinglore = new ArrayList<>();
            channelinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Strikes lightning when a mob is hit with a trident if"));
            channelinglore.add(ChatColor.translateAlternateColorCodes('&', "&7conditions are stormy"));
            channelingmeta.setLore(channelinglore);
            channeling.setItemMeta(channelingmeta);

            gui.setItem(13, channeling);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.FIRE_ASPECT) {
            ItemStack fireaspect = new ItemStack(Material.FLINT_AND_STEEL);
            ItemMeta fireaspectmeta = fireaspect.getItemMeta();
            fireaspectmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            fireaspectmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFire Aspect"));
            List<String> fireaspectlore = new ArrayList<>();
            fireaspectlore.add(ChatColor.translateAlternateColorCodes('&', "&7When attacking a target, has a chance to set them on"));
            fireaspectlore.add(ChatColor.translateAlternateColorCodes('&', "&7fire"));
            fireaspectmeta.setLore(fireaspectlore);
            fireaspect.setItemMeta(fireaspectmeta);

            gui.setItem(13, fireaspect);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.ARROW_FIRE) {
            ItemStack flame = new ItemStack(Material.CAMPFIRE);
            ItemMeta flamemeta = flame.getItemMeta();
            flamemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            flamemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFlame"));
            List<String> flamelore = new ArrayList<>();
            flamelore.add(ChatColor.translateAlternateColorCodes('&', "&7Sets entities on fire when hit by arrows shot from a"));
            flamelore.add(ChatColor.translateAlternateColorCodes('&', "&7bow"));
            flamemeta.setLore(flamelore);
            flame.setItemMeta(flamemeta);

            gui.setItem(13, flame);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.IMPALING) {
            ItemStack impaling = new ItemStack(Material.TRIDENT);
            ItemMeta impalingmeta = impaling.getItemMeta();
            impalingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            impalingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bImpaling"));
            List<String> impalinglore = new ArrayList<>();
            impalinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Deals more damage to mobs that live in the ocean"));
            impalingmeta.setLore(impalinglore);
            impaling.setItemMeta(impalingmeta);

            gui.setItem(13, impaling);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.ARROW_INFINITE) {
            ItemStack infinity = new ItemStack(Material.SPECTRAL_ARROW);
            ItemMeta infinitymeta = infinity.getItemMeta();
            infinitymeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            infinitymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bInfinity"));
            List<String> infinitylore = new ArrayList<>();
            infinitylore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides infinite arrows when shooting a bow"));
            infinitymeta.setLore(infinitylore);
            infinity.setItemMeta(infinitymeta);

            gui.setItem(13, infinity);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.KNOCKBACK) {
            ItemStack knockback = new ItemStack(Material.STICK);
            ItemMeta knockbackmeta = knockback.getItemMeta();
            knockbackmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            knockbackmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bKnockback"));
            List<String> knockbacklore = new ArrayList<>();
            knockbacklore.add(ChatColor.translateAlternateColorCodes('&', "&7All damage to other targets will knock them back"));
            knockbacklore.add(ChatColor.translateAlternateColorCodes('&', "&7when hit"));
            knockbackmeta.setLore(knockbacklore);
            knockback.setItemMeta(knockbackmeta);

            gui.setItem(13, knockback);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.LOYALTY) {
            ItemStack loyalty = new ItemStack(Material.LEAD);
            ItemMeta loyaltymeta = loyalty.getItemMeta();
            loyaltymeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            loyaltymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLoyalty"));
            List<String> loyaltylore = new ArrayList<>();
            loyaltylore.add(ChatColor.translateAlternateColorCodes('&', "&7Causes a thrown trident to return to the player who"));
            loyaltylore.add(ChatColor.translateAlternateColorCodes('&', "&7threw it"));
            loyaltymeta.setLore(loyaltylore);
            loyalty.setItemMeta(loyaltymeta);

            gui.setItem(13, loyalty);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.MULTISHOT) {
            ItemStack multishot = new ItemStack(Material.BEETROOT);
            ItemMeta multishotmeta = multishot.getItemMeta();
            multishotmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            multishotmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMultishot"));
            List<String> multishotlore = new ArrayList<>();
            multishotlore.add(ChatColor.translateAlternateColorCodes('&', "&7Shoot multiple arrows from crossbows"));
            multishotmeta.setLore(multishotlore);
            multishot.setItemMeta(multishotmeta);

            gui.setItem(13, multishot);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.PIERCING) {
            ItemStack piercing = new ItemStack(Material.CROSSBOW);
            ItemMeta piercingmeta = piercing.getItemMeta();
            piercingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            piercingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPiercing"));
            List<String> piercinglore = new ArrayList<>();
            piercinglore.add(ChatColor.translateAlternateColorCodes('&', "&7Crossbow projectiles pierce entities"));
            piercingmeta.setLore(piercinglore);
            piercing.setItemMeta(piercingmeta);

            gui.setItem(13, piercing);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.ARROW_DAMAGE) {
            ItemStack power = new ItemStack(Material.ARROW);
            ItemMeta powermeta = power.getItemMeta();
            powermeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            powermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPower"));
            List<String> powerlore = new ArrayList<>();
            powerlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides extra damage when shooting arrows from"));
            powerlore.add(ChatColor.translateAlternateColorCodes('&', "&7bows"));
            powermeta.setLore(powerlore);
            power.setItemMeta(powermeta);

            gui.setItem(13, power);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.ARROW_KNOCKBACK) {
            ItemStack punch = new ItemStack(Material.SLIME_BLOCK);
            ItemMeta punchmeta = punch.getItemMeta();
            punchmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            punchmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPunch"));
            List<String> punchlore = new ArrayList<>();
            punchlore.add(ChatColor.translateAlternateColorCodes('&', "&7Provides a knockback when an entity is hit by an"));
            punchlore.add(ChatColor.translateAlternateColorCodes('&', "&7arrow from a bow"));
            punchmeta.setLore(punchlore);
            punch.setItemMeta(punchmeta);

            gui.setItem(13, punch);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.QUICK_CHARGE) {
            ItemStack quickcharge = new ItemStack(Material.STRING);
            ItemMeta quickchargemeta = quickcharge.getItemMeta();
            quickchargemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            quickchargemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bQuick Charge"));
            List<String> quickchargelore = new ArrayList<>();
            quickchargelore.add(ChatColor.translateAlternateColorCodes('&', "&7Charges crossbows quickly"));
            quickchargemeta.setLore(quickchargelore);
            quickcharge.setItemMeta(quickchargemeta);

            gui.setItem(13, quickcharge);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.DAMAGE_ALL) {
            ItemStack sharpness = new ItemStack(Material.IRON_SWORD);
            ItemMeta sharpnessmeta = sharpness.getItemMeta();
            sharpnessmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            sharpnessmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSharpness"));
            List<String> sharpnesslore = new ArrayList<>();
            sharpnesslore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against all targets"));
            sharpnessmeta.setLore(sharpnesslore);
            sharpness.setItemMeta(sharpnessmeta);

            gui.setItem(13, sharpness);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.DAMAGE_UNDEAD) {
            ItemStack smite = new ItemStack(Material.ROTTEN_FLESH);
            ItemMeta smitemeta = smite.getItemMeta();
            smitemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            smitemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSmite"));
            List<String> smitelore = new ArrayList<>();
            smitelore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against undead targets"));
            smitemeta.setLore(smitelore);
            smite.setItemMeta(smitemeta);

            gui.setItem(13, smite);
        }
        if (EnchantsPickMaps.enchantment.get(player.getUniqueId()) == Enchantment.SWEEPING_EDGE) {
            ItemStack sweepingedge = new ItemStack(Material.TNT);
            ItemMeta sweepingedgemeta = sweepingedge.getItemMeta();
            sweepingedgemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
            sweepingedgemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSweeping Edge"));
            List<String> sweepingedgelore = new ArrayList<>();
            sweepingedgelore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage against targets when using a"));
            sweepingedgelore.add(ChatColor.translateAlternateColorCodes('&', "&7sweep attack"));
            sweepingedgemeta.setLore(sweepingedgelore);
            sweepingedge.setItemMeta(sweepingedgemeta);

            gui.setItem(13, sweepingedge);
        }
        player.openInventory(gui);
    }
}
