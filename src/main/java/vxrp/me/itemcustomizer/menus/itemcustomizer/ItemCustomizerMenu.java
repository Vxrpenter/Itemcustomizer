package vxrp.me.itemcustomizer.menus.itemcustomizer;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.menus.itemcustomizer.adminpanel.AdminMenu;
import vxrp.me.itemcustomizer.menus.items.GeneralItems;
import vxrp.me.itemcustomizer.util.ItemBuilder;

import java.util.Objects;

public class ItemCustomizerMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public ItemCustomizerMenu(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("itemCustomizer")
                .provider(new ItemCustomizerMenu(itemcustomizer))
                .size(6, 9)
                .title(ChatColor.AQUA + "ItemCustomizer")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Edit
        final ItemStack edit = new ItemBuilder(Material.CRAFTING_TABLE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Edit")
                .lore(ChatColor.GRAY + "Opens the Edit menu if you have an", ChatColor.GRAY + "item in your hand")
                .build();
        contents.set(1,4, ClickableItem.of(edit, e -> {
            if (!e.isLeftClick()) return;
            if (player.getInventory().getItemInMainHand() .getType()!= Material.AIR) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            }
            player.performCommand("edit");
        }));
        //Permissions
        final ItemStack permissions = new ItemBuilder(Material.COMMAND_BLOCK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Permissions")
                .lore(ChatColor.GRAY + "View the permissions in game")
                .build();
        contents.set(2,2, ClickableItem.of(permissions, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            PermissionMenu.openMenu(player, plugin);
        }));
        //AdminPanel
        final ItemStack adminPanel = new ItemBuilder(Material.BARRIER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Admin Panel")
                .lore(ChatColor.GRAY + "ItemCustomizer admin panel")
                .build();
        if (player.hasPermission("customize.admin")) {
            contents.set(2,6, ClickableItem.of(adminPanel, e -> {
                if (!e.isLeftClick()) return;
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                AdminMenu.openMenu(player, plugin);
            }));
        } else {
            contents.set(2, 6, ClickableItem.of(GeneralItems.noPermission(), e -> {
                if (!e.isLeftClick()) return;
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        Objects.requireNonNull(plugin.getConfig().getString("missing_permission"))));
                AdminMenu.openMenu(player, plugin);
            }));
        }
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
