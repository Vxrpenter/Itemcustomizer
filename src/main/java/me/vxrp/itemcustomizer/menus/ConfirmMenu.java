package me.vxrp.itemcustomizer.menus;

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
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class ConfirmMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public ConfirmMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }

    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("confirmMenu")
                .provider(new ConfirmMenu(itemcustomizer))
                .size(1, 9)
                .title(ChatColor.AQUA + "Confirm")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        final ItemStack confirm = new ItemBuilder(Material.BARRIER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "Confirm")
                .lore(ChatColor.GRAY + "This cannot be reverted")
                .build();
        contents.set(0, 4, ClickableItem.of(confirm, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.BLOCK_GRINDSTONE_USE, 10, 1);
                EditingStorage.setConfirmed(player.getUniqueId(), true);
                EditMenu.openMenu(player, plugin);
            }
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}