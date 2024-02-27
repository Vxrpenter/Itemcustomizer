package dev.vxrp.itemcustomizer.menus.itemcustomizer.adminpanel;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import dev.vxrp.itemcustomizer.Itemcustomizer;
import dev.vxrp.itemcustomizer.util.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public class AdminMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public AdminMenu(dev.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("adminMenu")
                .provider(new AdminMenu(itemcustomizer))
                .size(5, 9)
                .title(ChatColor.AQUA + "Admin Panel")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        final ItemStack wip = new ItemBuilder(Material.BARRIER)
                .displayName(ChatColor.RED + "WIP")
                .build();
        contents.set(1, 4, ClickableItem.empty(wip));
        contents.set(2, 5, ClickableItem.empty(wip));
        contents.set(3, 4, ClickableItem.empty(wip));
        //Updating
        final ItemStack updating = new ItemBuilder(Material.LECTERN)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Updating")
                .lore(ChatColor.GRAY + "Where can I find the newest version e.g.")
                .build();
        contents.set(2,3, ClickableItem.of(updating, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            UpdatingMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
