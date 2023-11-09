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
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;

import java.util.ArrayList;
import java.util.List;

public class EnchantsGroupMenu implements Listener {
    public static String menuname = "&bEnchants &7Groups";

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', menuname))) {
            if (event.getSlot() == 10) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchatsMovementMenu.OpenMenu(player);
            }
            if (event.getSlot() == 11) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchantsAttackMenu.OpenMenu(player);
            }
        }
    }
    public static void OpenMenu(Player player) {
        PutIfAbsent.PutIfAbsent(player);
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack movement = new ItemStack(Material.IRON_BOOTS);
        ItemMeta movementmeta = movement.getItemMeta();
        movementmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        movementmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMovement"));
        List<String> movementlore = new ArrayList<>();
        movementlore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        movementlore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that are about movement"));
        movementmeta.setLore(movementlore);
        movement.setItemMeta(movementmeta);

        ItemStack attack = new ItemStack(Material.IRON_SWORD);
        ItemMeta attackmeta = attack.getItemMeta();
        attackmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        attackmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAttack"));
        List<String> attacklore = new ArrayList<>();
        attacklore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        attacklore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that are about attacking"));
        attackmeta.setLore(attacklore);
        attack.setItemMeta(attackmeta);

        ItemStack protection = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta protectionmeta = protection.getItemMeta();
        protectionmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        protectionmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bProtection"));
        List<String> protectionlore = new ArrayList<>();
        protectionlore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        protectionlore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that are about protection"));
        protectionmeta.setLore(protectionlore);
        protection.setItemMeta(protectionmeta);

        ItemStack curses = new ItemStack(Material.CRIMSON_FUNGUS);
        ItemMeta cursesmeta = curses.getItemMeta();
        cursesmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        cursesmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bCurses"));
        List<String> curseslore = new ArrayList<>();
        curseslore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        curseslore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that are about curses"));
        cursesmeta.setLore(curseslore);
        curses.setItemMeta(cursesmeta);

        ItemStack mining = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta miningmeta = mining.getItemMeta();
        miningmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        miningmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMining"));
        List<String> mininglore = new ArrayList<>();
        mininglore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        mininglore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that are about mining"));
        miningmeta.setLore(mininglore);
        mining.setItemMeta(miningmeta);

        ItemStack farming = new ItemStack(Material.GOLDEN_HOE);
        ItemMeta farmingmeta = farming.getItemMeta();
        farmingmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        farmingmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFarming"));
        List<String> farminglore = new ArrayList<>();
        farminglore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        farminglore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that are about farming"));
        farmingmeta.setLore(farminglore);
        farming.setItemMeta(farmingmeta);

        ItemStack general = new ItemStack(Material.IRON_AXE);
        ItemMeta generalmeta = general.getItemMeta();
        generalmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        generalmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGeneral"));
        List<String> generallore = new ArrayList<>();
        generallore.add(ChatColor.translateAlternateColorCodes('&', "&7In this group you can find all"));
        generallore.add(ChatColor.translateAlternateColorCodes('&', "&7enchantments that can be applied to"));
        generallore.add(ChatColor.translateAlternateColorCodes('&', "&7almost every item."));
        generalmeta.setLore(generallore);
        general.setItemMeta(generalmeta);

        gui.setItem(10, movement);
        gui.setItem(11, attack);
        gui.setItem(12, protection);
        gui.setItem(13, curses);
        gui.setItem(14, mining);
        gui.setItem(15, farming);
        gui.setItem(16, general);
        player.openInventory(gui);
    }
}
