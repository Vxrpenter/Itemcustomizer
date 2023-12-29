package vxrp.me.itemcustomizer.menus.enchants;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.util.SkullBuilder;

public class SetLevelMenus implements InventoryProvider {
    private final Itemcustomizer plugin;
    public SetLevelMenus(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("setLevel")
                .provider(new SetLevelMenus(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.AQUA + "SetLevel")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        if (EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() > 1 || EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() == 1) {
            contents.set(1, 2, ClickableItem.of(SkullBuilder.createCustomSkull("ca516fbae16058f251aef9a68d3078549f48f6d5b683f19cf5a1745217d72cc",
                    "&7Level &b1"), e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    EditingStorage.setEnchantingLevel(player.getUniqueId(), 1);
                    EnchantsPickMenu.openMenu(player, plugin);
                }
            }));
        }
        if (EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() > 2 || EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() == 2) {
            contents.set(1, 3, ClickableItem.of(SkullBuilder.createCustomSkull("4698add39cf9e4ea92d42fadefdec3be8a7dafa11fb359de752e9f54aecedc9a",
                    "&7Level &b2"), e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    EditingStorage.setEnchantingLevel(player.getUniqueId(), 2);
                    EnchantsPickMenu.openMenu(player, plugin);
                }
            }));
        }
        if (EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() > 3 || EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() == 3) {
            contents.set(1, 4, ClickableItem.of(SkullBuilder.createCustomSkull("fd9e4cd5e1b9f3c8d6ca5a1bf45d86edd1d51e535dbf855fe9d2f5d4cffcd2",
                    "&7Level &b3"), e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    EditingStorage.setEnchantingLevel(player.getUniqueId(), 3);
                    EnchantsPickMenu.openMenu(player, plugin);
                }
            }));
        }
        if (EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() > 4 || EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() == 4) {
            contents.set(1, 5, ClickableItem.of(SkullBuilder.createCustomSkull("f2a3d53898141c58d5acbcfc87469a87d48c5c1fc82fb4e72f7015a3648058",
                    "&7Level &b4"), e -> {
                if (!e.isLeftClick()) return;
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantingLevel(player.getUniqueId(), 4);
                EnchantsPickMenu.openMenu(player, plugin);
            }));
        }
        if (EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() > 5 || EditingStorage.getEnchantment(player.getUniqueId()).getMaxLevel() == 5) {
            contents.set(1, 6, ClickableItem.of(SkullBuilder.createCustomSkull("d1fe36c4104247c87ebfd358ae6ca7809b61affd6245fa984069275d1cba763",
                    "&7Level &b5"), e -> {
                if (!e.isLeftClick()) return;
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantingLevel(player.getUniqueId(), 5);
                EnchantsPickMenu.openMenu(player, plugin);
            }));
        }
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
