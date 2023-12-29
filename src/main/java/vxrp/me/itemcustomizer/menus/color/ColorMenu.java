package vxrp.me.itemcustomizer.menus.color;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.menus.EditMenu;
import vxrp.me.itemcustomizer.menus.items.GeneralItems;
import vxrp.me.itemcustomizer.util.ItemBuilder;

public class ColorMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public ColorMenu(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("color")
                .provider(new ColorMenu(itemcustomizer))
                .size(5, 9)
                .title(ChatColor.AQUA + "Color")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());
        LeatherArmorMeta itemLMeta = (LeatherArmorMeta) itemMeta;

        //Aqua
        final ItemStack colorAqua = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.AQUA)
                .displayName(ChatColor.AQUA + "Aqua")
                .build();
        contents.set(1,1, ClickableItem.of(colorAqua, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.AQUA);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Black
        final ItemStack colorBlack = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.BLACK)
                .displayName(ChatColor.AQUA + "Black")
                .build();
        contents.set(1,2, ClickableItem.of(colorBlack, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.BLACK);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Blue
        final ItemStack colorBlue = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.BLUE)
                .displayName(ChatColor.AQUA + "Blue")
                .build();
        contents.set(1,3, ClickableItem.of(colorBlue, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.BLUE);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Fuchsia
        final ItemStack colorFuchsia = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.FUCHSIA)
                .displayName(ChatColor.AQUA + "Fuchsia")
                .build();
        contents.set(1,4, ClickableItem.of(colorFuchsia, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.FUCHSIA);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Gray
        final ItemStack colorGray = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.GRAY)
                .displayName(ChatColor.AQUA + "Gray")
                .build();
        contents.set(1,5, ClickableItem.of(colorGray, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.GRAY);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Green
        final ItemStack colorGreen = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.GREEN)
                .displayName(ChatColor.AQUA + "Green")
                .build();
        contents.set(1,6, ClickableItem.of(colorGreen, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.GREEN);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Lime
        final ItemStack colorLime = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.LIME)
                .displayName(ChatColor.AQUA + "Lime")
                .build();
        contents.set(1,7, ClickableItem.of(colorLime, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.LIME);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Maroon
        final ItemStack colorMaroon = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.MAROON)
                .displayName(ChatColor.AQUA + "Maroon")
                .build();
        contents.set(2,1, ClickableItem.of(colorMaroon, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.MAROON);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Navy
        final ItemStack colorNavy = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.NAVY)
                .displayName(ChatColor.AQUA + "Navy")
                .build();
        contents.set(2,2, ClickableItem.of(colorNavy, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.NAVY);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Olive
        final ItemStack colorOlive = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.OLIVE)
                .displayName(ChatColor.AQUA + "Olive")
                .build();
        contents.set(2,3, ClickableItem.of(colorOlive, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.OLIVE);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Orange
        final ItemStack colorOrange = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.ORANGE)
                .displayName(ChatColor.AQUA + "Orange")
                .build();
        contents.set(2,4, ClickableItem.of(colorOrange, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.ORANGE);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Purple
        final ItemStack colorPurple = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.PURPLE)
                .displayName(ChatColor.AQUA + "Purple")
                .build();
        contents.set(2,5, ClickableItem.of(colorPurple, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.PURPLE);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Red
        final ItemStack colorRed = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.RED)
                .displayName(ChatColor.AQUA + "Red")
                .build();
        contents.set(2,6, ClickableItem.of(colorRed, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.RED);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Silver
        final ItemStack colorSilver = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.SILVER)
                .displayName(ChatColor.AQUA + "Silver")
                .build();
        contents.set(2,7, ClickableItem.of(colorSilver, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.SILVER);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Teal
        final ItemStack colorTeal = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.TEAL)
                .displayName(ChatColor.AQUA + "Teal")
                .build();
        contents.set(3,1, ClickableItem.of(colorTeal, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.TEAL);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //White
        final ItemStack colorWhite = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.WHITE)
                .displayName(ChatColor.AQUA + "White")
                .build();
        contents.set(3,2, ClickableItem.of(colorWhite, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.WHITE);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Yellow
        final ItemStack colorYellow = new ItemBuilder(Material.LEATHER_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE)
                .dye(Color.YELLOW)
                .displayName(ChatColor.AQUA + "Yellow")
                .build();
        contents.set(3,3, ClickableItem.of(colorYellow, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            itemLMeta.setColor(Color.YELLOW);
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            EditMenu.openMenu(player, plugin);
        }));
        //Borders
        contents.fillBorders(ClickableItem.empty(GeneralItems.filler()));
        //Back
        contents.set(4, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
