package vxrp.me.itemcustomizer.menus.effects;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.menus.items.GeneralItems;
import vxrp.me.itemcustomizer.util.ItemBuilder;

public class EffectsColorMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EffectsColorMenu(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("effectColor")
                .provider(new EffectsColorMenu(itemcustomizer))
                .size(5, 9)
                .title(ChatColor.AQUA + "Effects " + ChatColor.GRAY + "Color")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Aqua
        final ItemStack colorAqua = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.AQUA)
                .displayName(ChatColor.AQUA + "Aqua")
                .build();
        contents.set(1,1, ClickableItem.of(colorAqua, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.AQUA);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Black
        final ItemStack colorBlack = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.BLACK)
                .displayName(ChatColor.AQUA + "Black")
                .build();
        contents.set(1,2, ClickableItem.of(colorBlack, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.BLACK);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Blue
        final ItemStack colorBlue = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.BLUE)
                .displayName(ChatColor.AQUA + "Blue")
                .build();
        contents.set(1,3, ClickableItem.of(colorBlue, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.BLUE);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Fuchsia
        final ItemStack colorFuchsia = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.FUCHSIA)
                .displayName(ChatColor.AQUA + "Fuchsia")
                .build();
        contents.set(1,4, ClickableItem.of(colorFuchsia, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.FUCHSIA);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Gray
        final ItemStack colorGray = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.GRAY)
                .displayName(ChatColor.AQUA + "Gray")
                .build();
        contents.set(1,5, ClickableItem.of(colorGray, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.GRAY);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Green
        final ItemStack colorGreen = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.GREEN)
                .displayName(ChatColor.AQUA + "Green")
                .build();
        contents.set(1,6, ClickableItem.of(colorGreen, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.GREEN);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Lime
        final ItemStack colorLime = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.LIME)
                .displayName(ChatColor.AQUA + "Lime")
                .build();
        contents.set(1,7, ClickableItem.of(colorLime, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.LIME);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Maroon
        final ItemStack colorMaroon = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.MAROON)
                .displayName(ChatColor.AQUA + "Maroon")
                .build();
        contents.set(2,1, ClickableItem.of(colorMaroon, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.MAROON);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Navy
        final ItemStack colorNavy = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.NAVY)
                .displayName(ChatColor.AQUA + "Navy")
                .build();
        contents.set(2,2, ClickableItem.of(colorNavy, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.NAVY);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Olive
        final ItemStack colorOlive = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.OLIVE)
                .displayName(ChatColor.AQUA + "Olive")
                .build();
        contents.set(2,3, ClickableItem.of(colorOlive, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.OLIVE);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Orange
        final ItemStack colorOrange = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.ORANGE)
                .displayName(ChatColor.AQUA + "Orange")
                .build();
        contents.set(2,4, ClickableItem.of(colorOrange, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.ORANGE);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Purple
        final ItemStack colorPurple = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.PURPLE)
                .displayName(ChatColor.AQUA + "Purple")
                .build();
        contents.set(2,5, ClickableItem.of(colorPurple, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.PURPLE);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Red
        final ItemStack colorRed = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.RED)
                .displayName(ChatColor.AQUA + "Red")
                .build();
        contents.set(2,6, ClickableItem.of(colorRed, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.RED);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Silver
        final ItemStack colorSilver = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.SILVER)
                .displayName(ChatColor.AQUA + "Silver")
                .build();
        contents.set(2,7, ClickableItem.of(colorSilver, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.SILVER);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Teal
        final ItemStack colorTeal = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.TEAL)
                .displayName(ChatColor.AQUA + "Teal")
                .build();
        contents.set(3,1, ClickableItem.of(colorTeal, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.TEAL);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //White
        final ItemStack colorWhite = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.WHITE)
                .displayName(ChatColor.AQUA + "White")
                .build();
        contents.set(3,2, ClickableItem.of(colorWhite, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.WHITE);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Yellow
        final ItemStack colorYellow = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .potionColor(Color.YELLOW)
                .displayName(ChatColor.AQUA + "Yellow")
                .build();
        contents.set(3,3, ClickableItem.of(colorYellow, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setColor(player.getUniqueId(), Color.YELLOW);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Borders
        contents.fillBorders(ClickableItem.empty(GeneralItems.filler()));
        //Back
        contents.set(4, 8, ClickableItem.of(GeneralItems.lastPage(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsPickMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
