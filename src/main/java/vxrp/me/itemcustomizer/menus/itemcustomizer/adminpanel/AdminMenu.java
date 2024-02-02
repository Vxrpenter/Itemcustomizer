package vxrp.me.itemcustomizer.menus.itemcustomizer.adminpanel;

import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Itemcustomizer;

public class AdminMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public AdminMenu(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
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

    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
