package me.vxrp.itemcustomizer.menus.itemcustomizer.adminpanel;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.menus.itemcustomizer.ItemCustomizerMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.SkullBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class UpdatingMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public UpdatingMenu(Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("updatingMenu")
                .provider(new UpdatingMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.AQUA + "Updating")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }
    @Override
    public void init(Player player, InventoryContents contents) {
        contents.fillBorders(ClickableItem.empty(GeneralItems.filler()));
        //Github
        final ItemStack gitHub = SkullBuilder
                .createCustomSkull("26e27da12819a8b053da0cc2b62dec4cda91de6eeec21ccf3bfe6dd8d4436a7", "&7Github");
        contents.set(1, 3, ClickableItem.of(gitHub, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player , Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            player.sendMessage(ChatColor.GRAY + "Github " + ChatColor.BLUE + ChatColor.UNDERLINE + "https://github.com/Vxrpenter/Itemcustomizer");
        }));
        //Where to update
        final ItemStack questionMark = SkullBuilder
                .createCustomSkull("badc048a7ce78f7dad72a07da27d85c0916881e5522eeed1e3daf217a38c1a", "&7Where to update");
        contents.set(1, 4, ClickableItem.of(questionMark, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player , Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            player.sendMessage(ChatColor.GRAY + "Modrinth " + ChatColor.BLUE  + ChatColor.UNDERLINE + "https://modrinth.com/plugin/itemcustomizer");
        }));
        //Hanger
        final ItemStack hangar = SkullBuilder
                .createCustomSkull("33d64fdbdd4d559b51746c29adad7139b6d92a584f797189462e552ee7327f25", "&7HangarMc");
        contents.set(1, 5, ClickableItem.of(hangar, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player , Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            player.sendMessage(ChatColor.GRAY + "HangerMc " + ChatColor.BLUE + ChatColor.UNDERLINE + "https://hangar.papermc.io/Vxrpenter/Itemcustomizer");
        }));
        //Back
        contents.set(2, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemCustomizerMenu.openMenu(player, plugin);
            }
        }));
    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }
}
