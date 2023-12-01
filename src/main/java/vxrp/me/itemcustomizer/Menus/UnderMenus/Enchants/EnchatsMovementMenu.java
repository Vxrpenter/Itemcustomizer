package vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
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

import java.util.ArrayList;
import java.util.List;

public class EnchatsMovementMenu implements Listener {
    public static String menuname = "&bEnchants &7Movements";

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', menuname))) return;

        if (event.getSlot() == 11) {
            if (EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
                EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.depthstrider.get(player.getUniqueId())) {
                EnchantsPickMaps.depthstrider.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 12) {
            if (EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
                EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.frostwalker.get(player.getUniqueId())) {
                EnchantsPickMaps.frostwalker.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 13) {
            if (EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
                EnchantsMovementMaps.riptide.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.riptide.get(player.getUniqueId())) {
                EnchantsPickMaps.riptide.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 14) {
            if (EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
                EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.soulspeed.get(player.getUniqueId())) {
                EnchantsPickMaps.soulspeed.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 15) {
            if (EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
                EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), false);
                EnchantsGroupMenu.OpenMenu(player);
            } else if (!EnchantsPickMaps.swiftsneak.get(player.getUniqueId())) {
                EnchantsPickMaps.swiftsneak.put(player.getUniqueId(), true);
                EnchantsPickMenu.OpenMenu(player);
            }
        }
    }

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack depthstrider = new ItemStack(Material.WATER_BUCKET);
        ItemMeta depthstridermeta = depthstrider.getItemMeta();
        depthstridermeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
            depthstridermeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        depthstridermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDepth Strider"));
        List<String> depthstriderlore = new ArrayList<>();
        depthstriderlore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases walking speed while in water"));
        depthstridermeta.setLore(depthstriderlore);
        depthstrider.setItemMeta(depthstridermeta);

        ItemStack frostwalker = new ItemStack(Material.PACKED_ICE);
        ItemMeta frostwalkermeta = frostwalker.getItemMeta();
        frostwalkermeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
            frostwalkermeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        frostwalkermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFrost Walker"));
        List<String> frostwalkerlore = new ArrayList<>();
        frostwalkerlore.add(ChatColor.translateAlternateColorCodes('&', "&7Freezes any still water adjacent to ice / frost which"));
        frostwalkerlore.add(ChatColor.translateAlternateColorCodes('&', "&7player is walking on"));
        frostwalkermeta.setLore(frostwalkerlore);
        frostwalker.setItemMeta(frostwalkermeta);

        ItemStack riptide = new ItemStack(Material.ENDER_PEARL);
        ItemMeta riptidemeta = riptide.getItemMeta();
        riptidemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
            riptidemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        riptidemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRiptide"));
        List<String> riptidelore = new ArrayList<>();
        riptidelore.add(ChatColor.translateAlternateColorCodes('&', "&7When it is rainy, launches the player in the direction"));
        riptidelore.add(ChatColor.translateAlternateColorCodes('&', "&7their trident is thrown"));
        riptidemeta.setLore(riptidelore);
        riptide.setItemMeta(riptidemeta);

        ItemStack soulspeed = new ItemStack(Material.SOUL_SAND);
        ItemMeta soulspeedmeta = soulspeed.getItemMeta();
        soulspeedmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
            soulspeedmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        soulspeedmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSoul Speed"));
        List<String> soulspeedlore = new ArrayList<>();
        soulspeedlore.add(ChatColor.translateAlternateColorCodes('&', "&7Walk quicker on soul blocks"));
        soulspeedmeta.setLore(soulspeedlore);
        soulspeed.setItemMeta(soulspeedmeta);

        ItemStack swiftsneak = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta swiftsneakmeta = swiftsneak.getItemMeta();
        swiftsneakmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
            swiftsneakmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        swiftsneakmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSwift Sneak"));
        List<String> swiftsneaklore = new ArrayList<>();
        swiftsneaklore.add(ChatColor.translateAlternateColorCodes('&', "&7Walk quicker while sneaking"));
        swiftsneakmeta.setLore(swiftsneaklore);
        swiftsneak.setItemMeta(swiftsneakmeta);

        gui.setItem(11, depthstrider);
        gui.setItem(12, frostwalker);
        gui.setItem(13, riptide);
        gui.setItem(14, soulspeed);
        gui.setItem(15, swiftsneak);
        player.openInventory(gui);
    }
}
