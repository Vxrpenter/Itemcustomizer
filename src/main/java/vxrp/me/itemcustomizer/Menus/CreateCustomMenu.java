package vxrp.me.itemcustomizer.Menus;

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
import vxrp.me.itemcustomizer.Hashmaps.ConfirmMaps;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsAttackMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;
import vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.ItemFlags.ItemFlagMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.ItemSelection.ItemSelectMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CreateCustomMenu implements Listener {
    public static String menuname = "&bCreateCustom-Item";

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', menuname))) {
            if (event.getSlot() == 13) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemSelectMenu.OpenMenu(player);
            }
            if (event.getSlot() == 20) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagMenu.OpenMenu(player);
            }
            if (event.getSlot() == 53) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ConfirmMenu.OpenMenu(player);
            }
            if (event.getSlot() == 49) {
                player.playSound(player, Sound.BLOCK_ANVIL_USE, 10, 1);
                player.getInventory().addItem(CreateItem(player));
                player.closeInventory();
            }
            if (event.getSlot() == 22) {
                SetDisplayNameMaps.running.put(player.getUniqueId(), true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please enter the DisplayName in the chat &c!!!"));
                player.closeInventory();
            }
            if (event.getSlot() == 24) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchantsGroupMenu.OpenMenu(player);
            }
        }
    }

    public static ItemStack CreateItem(Player player) {
        PutIfAbsent.PutIfAbsent(player);

        ItemStack output = new ItemStack(CreateCustomMaps.item.get(player.getUniqueId()));
        ItemMeta outputmeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());
        if (ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        } else if (!ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        }

        if (ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }else if (!ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        if (ItemFlagsMap.hidedye.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_DYE);
        }else if (!ItemFlagsMap.hidedye.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_DYE);
        }
        if (ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        }else if (!ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_DESTROYS);
        }
        if (ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        }else if (!ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_PLACED_ON);
        }
        if (ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        }else if (!ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        }
        if (ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        }else if (!ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        }
        //Enchants: Movement
        if (EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DEPTH_STRIDER, EnchantsMovementMaps.depthstriderlevel.get(player.getUniqueId()), EnchantsMovementMaps.depthstriderlevel.get(player.getUniqueId()) > 3);
        } else if (!EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.DEPTH_STRIDER);
        }
        if (EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.FROST_WALKER, EnchantsMovementMaps.frostwalkerlevel.get(player.getUniqueId()), EnchantsMovementMaps.frostwalkerlevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.FROST_WALKER);
        }
        if (EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.RIPTIDE, EnchantsMovementMaps.riptidelevel.get(player.getUniqueId()), EnchantsMovementMaps.riptidelevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.RIPTIDE);
        }
        if (EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.SOUL_SPEED, EnchantsMovementMaps.soulspeedlevel.get(player.getUniqueId()), EnchantsMovementMaps.soulspeedlevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.SOUL_SPEED);
        }
        if (EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.SWIFT_SNEAK, EnchantsMovementMaps.swiftsneaklevel.get(player.getUniqueId()), EnchantsMovementMaps.swiftsneaklevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.SWIFT_SNEAK);
        }
        //Attack
        if (EnchantsAttackMaps.baneofarthropods.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, EnchantsAttackMaps.baneofarthropodslevel.get(player.getUniqueId()), EnchantsAttackMaps.baneofarthropodslevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.channeling.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.CHANNELING, EnchantsAttackMaps.channelinglevel.get(player.getUniqueId()), EnchantsAttackMaps.channelinglevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.fireaspect.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.FIRE_ASPECT, EnchantsAttackMaps.fireaspectlevel.get(player.getUniqueId()), EnchantsAttackMaps.fireaspectlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.flame.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_INFINITE, EnchantsAttackMaps.flamelevel.get(player.getUniqueId()), EnchantsAttackMaps.flamelevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.impaling.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.IMPALING, EnchantsAttackMaps.impalinglevel.get(player.getUniqueId()), EnchantsAttackMaps.impalinglevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.infinity.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_INFINITE, EnchantsAttackMaps.infinitylevel.get(player.getUniqueId()), EnchantsAttackMaps.infinitylevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.knockback.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.KNOCKBACK, EnchantsAttackMaps.knockbacklevel.get(player.getUniqueId()), EnchantsAttackMaps.knockbacklevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.loyalty.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.LOYALTY, EnchantsAttackMaps.loyaltylevel.get(player.getUniqueId()), EnchantsAttackMaps.loyaltylevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.multishot.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.MULTISHOT,EnchantsAttackMaps.multishotlevel.get(player.getUniqueId()), EnchantsAttackMaps.multishotlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.piercing.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.PIERCING, EnchantsAttackMaps.piercinglevel.get(player.getUniqueId()), EnchantsAttackMaps.piercinglevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.power.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_DAMAGE, EnchantsAttackMaps.powerlevel.get(player.getUniqueId()), EnchantsAttackMaps.powerlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.punch.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_KNOCKBACK, EnchantsAttackMaps.punchlevel.get(player.getUniqueId()), EnchantsAttackMaps.punchlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.quickcharge.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.QUICK_CHARGE, EnchantsAttackMaps.quickchargelevel.get(player.getUniqueId()), EnchantsAttackMaps.quickchargelevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.sharpness.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DAMAGE_ALL, EnchantsAttackMaps.sharpnesslevel.get(player.getUniqueId()), EnchantsAttackMaps.sharpnesslevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.smite.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DAMAGE_UNDEAD, EnchantsAttackMaps.smitelevel.get(player.getUniqueId()), EnchantsAttackMaps.smitelevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.sweepingedge.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.SWEEPING_EDGE, EnchantsAttackMaps.sweepingedgelevel.get(player.getUniqueId()), EnchantsAttackMaps.sweepingedgelevel.get(player.getUniqueId()) > 3);
        }


        EnchantsPickMaps.level.put(player.getUniqueId(), 0);

        if (SetDisplayNameMaps.displayname.get(player.getUniqueId()) != null) {
            outputmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', SetDisplayNameMaps.displayname.get(player.getUniqueId())));
        }
        output.setItemMeta(outputmeta);
        return output;
    }

    public static void OpenMenu(Player player) {
        ConfirmMaps.confirmed.putIfAbsent(player.getUniqueId(), false);
        CreateCustomMaps.finished.putIfAbsent(player.getUniqueId(), false);

        UUID uuid = player.getUniqueId();
        Inventory gui = Bukkit.createInventory(null, 6*9, ChatColor.translateAlternateColorCodes('&', menuname));
        if (ConfirmMaps.confirmed.get(player.getUniqueId()) | CreateCustomMaps.finished.get(player.getUniqueId())) {
            CreateCustomMaps.finished.put(player.getUniqueId(), false);
            ConfirmMaps.confirmed.put(player.getUniqueId(), false);
            CreateCustomMaps.item.put(player.getUniqueId(), null);
            CreateCustomMaps.itemmeta.put(player.getUniqueId(), null);
            ItemFlagsMap.hidedye.put(player.getUniqueId(), false);
            ItemFlagsMap.hideenchants.put(player.getUniqueId(), false);
            ItemFlagsMap.hideattributes.put(player.getUniqueId(), false);
            ItemFlagsMap.hidedestroys.put(player.getUniqueId(), false);
            ItemFlagsMap.hideplacedon.put(player.getUniqueId(), false);
            ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), false);
            ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), false);
            SetDisplayNameMaps.displayname.put(player.getUniqueId(), null);
            OpenMenu(player);
        }

        if (CreateCustomMaps.item.get(uuid) == null) {
            gui.setItem(13, new ItemStack(Material.LIGHT));
        } else if (CreateCustomMaps.item.get(uuid) != null) {
            gui.setItem(13, CreateItem(player));
        }

        ItemStack reset = new ItemStack(Material.BARRIER);
        ItemMeta resetmeta = reset.getItemMeta();
        resetmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        resetmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bReset"));
        List<String> resetlore = new ArrayList<>();
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&7This will reset all changes that"));
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&7have been made in this configuration"));
        resetlore.add(" ");
        resetlore.add(ChatColor.translateAlternateColorCodes('&', "&cWARNING: This cannot be reverted"));
        resetmeta.setLore(resetlore);
        reset.setItemMeta(resetmeta);

        ItemStack itemflags = new ItemStack(Material.GLASS);
        ItemMeta itemflagsmeta = itemflags.getItemMeta();
        itemflagsmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemflagsmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bItemFlags"));
        List<String> itemflaglore = new ArrayList<>();
        itemflaglore.add(ChatColor.translateAlternateColorCodes('&', "&7With ItemFlags you can hide certain"));
        itemflaglore.add(ChatColor.translateAlternateColorCodes('&', "&7&bAttributes on an Item"));
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

        gui.setItem(24, enchants);
        gui.setItem(22, displayname);
        gui.setItem(49, finish);
        gui.setItem(20, itemflags);
        gui.setItem(53, reset);
        player.openInventory(gui);
    }

}
