package vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants;

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
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

import java.util.ArrayList;
import java.util.List;

public class EnchantsPickMenu implements Listener {
    public static String menuname = "&bEnchants &7Pick";

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', menuname))) {
            if (event.getSlot() == 14) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                SetLevelMaps.running.put(player.getUniqueId(), true);
                player.closeInventory();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please type a value from 1 &7to 255 &c!!!"));
            }
            if (event.getSlot() == 13) {
                if (EnchantsPickMaps.depthstrider.get(player.getUniqueId())) {
                    EnchantsPickMaps.depthstrider.put(player.getUniqueId(), false);
                    EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.depthstriderlevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
                }
                if (EnchantsPickMaps.frostwalker.get(player.getUniqueId())) {
                    EnchantsPickMaps.frostwalker.put(player.getUniqueId(), false);
                    EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.frostwalkerlevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
                }
                if (EnchantsPickMaps.riptide.get(player.getUniqueId())) {
                    EnchantsPickMaps.riptide.put(player.getUniqueId(), false);
                    EnchantsMovementMaps.riptide.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.riptidelevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
                }
                if (EnchantsPickMaps.soulspeed.get(player.getUniqueId())) {
                    EnchantsPickMaps.soulspeed.put(player.getUniqueId(), false);
                    EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.soulspeedlevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
                }
                if (EnchantsPickMaps.swiftsneak.get(player.getUniqueId())) {
                    EnchantsPickMaps.swiftsneak.put(player.getUniqueId(), false);
                    EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.swiftsneaklevel.put(player.getUniqueId(), EnchantsPickMaps.level.get(player.getUniqueId()));
                }


                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 12) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                SetLevelMenus.OpenMenu(player);
            }
        }
    }

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

        if (EnchantsPickMaps.depthstrider.get(player.getUniqueId())) {
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
        if (EnchantsPickMaps.frostwalker.get(player.getUniqueId())) {
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
        if (EnchantsPickMaps.riptide.get(player.getUniqueId())) {
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
        if (EnchantsPickMaps.soulspeed.get(player.getUniqueId())) {
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
        if (EnchantsPickMaps.swiftsneak.get(player.getUniqueId())) {
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
        player.openInventory(gui);
    }
}
