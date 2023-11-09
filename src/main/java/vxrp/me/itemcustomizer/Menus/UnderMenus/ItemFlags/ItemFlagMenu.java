package vxrp.me.itemcustomizer.Menus.UnderMenus.ItemFlags;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

import java.util.ArrayList;
import java.util.List;

public class ItemFlagMenu implements Listener {
    public static String menuname = "&bItemFlags";

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', menuname))) {
            if (event.getSlot() == 10) {
                if (ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideattributes.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideattributes.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 11) {
                if (ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideenchants.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideenchants.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 12) {
                if (ItemFlagsMap.hidedye.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hidedye.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hidedye.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hidedye.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 13) {
                if (ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hidedestroys.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hidedestroys.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 14) {
                if (ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideplacedon.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideplacedon.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 15) {
                if (ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 16) {
                if (ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), false);
                } else if (!ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), true);
                }
                CreateCustomMenu.OpenMenu(player);
            }
        }
    }

    public static void OpenMenu(Player player) {
        ItemFlagsMap.hideattributes.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hideenchants.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hidedye.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hidedestroys.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hideplacedon.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hidepotioneffects.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hideunbreakable.putIfAbsent(player.getUniqueId(), false);

        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack hide_attributes = new ItemStack(Material.ENDER_EYE);
        ItemMeta hide_attributesmeta = hide_attributes.getItemMeta();
        if (ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
            hide_attributesmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hide_attributesmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hide_attributesmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Attributes"));
        List<String> hide_attributeslore = new ArrayList<>();
        hide_attributeslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide Attributes &7like Damage"));
        hide_attributesmeta.setLore(hide_attributeslore);
        hide_attributes.setItemMeta(hide_attributesmeta);

        ItemStack hide_enchants = new ItemStack(Material.BOOK);
        ItemMeta hide_enchantsmeta = hide_enchants.getItemMeta();
        if (ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
            hide_enchantsmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hide_enchantsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hide_enchantsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Enchants"));
        List<String> hide_enchantslore = new ArrayList<>();
        hide_enchantslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide enchants"));
        hide_enchantsmeta.setLore(hide_enchantslore);
        hide_enchants.setItemMeta(hide_enchantsmeta);

        ItemStack hidedye = new ItemStack(Material.WHITE_DYE);
        ItemMeta hidedyemeta = hidedye.getItemMeta();
        if (ItemFlagsMap.hidedye.get(player.getUniqueId())) {
            hidedyemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidedyemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE);
        hidedyemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Dye"));
        List<String> hidedyelore = new ArrayList<>();
        hidedyelore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide dyes from coloured &7leather"));
        hidedyelore.add(ChatColor.translateAlternateColorCodes('&', "&7armour"));
        hidedyemeta.setLore(hidedyelore);
        hidedye.setItemMeta(hidedyemeta);

        ItemStack hidedestroys = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta hidedestroysmeta = hidedestroys.getItemMeta();
        if (ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
            hidedestroysmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidedestroysmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hidedestroysmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Destroys"));
        List<String> hidedestroyslore = new ArrayList<>();
        hidedestroyslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide what the ItemStack"));
        hidedestroyslore.add(ChatColor.translateAlternateColorCodes('&', "&7can break/destroy"));
        hidedestroysmeta.setLore(hidedestroyslore);
        hidedestroys.setItemMeta(hidedestroysmeta);

        ItemStack hideplacedon = new ItemStack(Material.SPYGLASS);
        ItemMeta hideplacedonmeta = hideplacedon.getItemMeta();
        if (ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
            hideplacedonmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideplacedonmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hideplacedonmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Placed On"));
        List<String> hideplacedonlore = new ArrayList<>();
        hideplacedonlore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide where this ItemStack can be"));
        hideplacedonlore.add(ChatColor.translateAlternateColorCodes('&', "&7build/placed on"));
        hideplacedonmeta.setLore(hideplacedonlore);
        hideplacedon.setItemMeta(hideplacedonmeta);

        ItemStack hidepotioneffects = new ItemStack(Material.HONEY_BOTTLE);
        ItemMeta hidepotioneffectsmeta = hidepotioneffects.getItemMeta();
        if (ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
            hidepotioneffectsmeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hidepotioneffectsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        hidepotioneffectsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Potion Effects"));
        List<String> hidepotioneffectslore = new ArrayList<>();
        hidepotioneffectslore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide potion effects, book and"));
        hidepotioneffectslore.add(ChatColor.translateAlternateColorCodes('&', "&7firework information, map tooltips, patterns of"));
        hidepotioneffectslore.add(ChatColor.translateAlternateColorCodes('&', "&7banners, and enchantments of enchanted books."));
        hidepotioneffectsmeta.setLore(hidepotioneffectslore);
        hidepotioneffects.setItemMeta(hidepotioneffectsmeta);

        ItemStack hideunbreakable = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta hideunbreakablemeta = hideunbreakable.getItemMeta();
        if (ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
            hideunbreakablemeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        hideunbreakablemeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        hideunbreakablemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHide Unbreakable"));
        List<String> hideunbreakablelore = new ArrayList<>();
        hideunbreakablelore.add(ChatColor.translateAlternateColorCodes('&', "&7Setting to show/hide the unbreakable State"));
        hideunbreakablemeta.setLore(hideunbreakablelore);
        hideunbreakable.setItemMeta(hideunbreakablemeta);

        gui.setItem(16, hideunbreakable);
        gui.setItem(15, hidepotioneffects);
        gui.setItem(14, hideplacedon);
        gui.setItem(13, hidedestroys);
        gui.setItem(12, hidedye);
        gui.setItem(11, hide_enchants);
        gui.setItem(10, hide_attributes);
        player.openInventory(gui);
    }
}
