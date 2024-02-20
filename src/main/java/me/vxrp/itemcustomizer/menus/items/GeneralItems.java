package me.vxrp.itemcustomizer.menus.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class GeneralItems {
    public static ItemStack featureDisabled() {
        return new ItemBuilder(Material.BARRIER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "Feature Disabled")
                .lore(ChatColor.GRAY + "This feature is not available")
                .build();
    }
    public static ItemStack back() {
        return new ItemBuilder(Material.ARROW)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Back")
                .build();
    }
    public static ItemStack filler() {
        return new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(" ")
                .build();
    }
    public static ItemStack remove() {
        return new ItemBuilder(Material.BARRIER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "Remove")
                .lore(ChatColor.GRAY + "Click to remove")
                .build();
    }
    public static ItemStack nextPage() {
        return new ItemBuilder(Material.ARROW)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "Next Page")
                .build();
    }
    public static ItemStack lastPage() {
        return new ItemBuilder(Material.ARROW)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "Last Page")
                .build();
    }
    public static ItemStack noPermission() {
        return new ItemBuilder(Material.BARRIER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "No Permission")
                .lore(ChatColor.GRAY + "You're not permitted to use this feature")
                .build();
    }

}
