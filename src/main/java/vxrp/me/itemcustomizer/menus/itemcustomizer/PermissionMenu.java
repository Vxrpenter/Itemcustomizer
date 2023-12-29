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
import vxrp.me.itemcustomizer.menus.items.GeneralItems;
import vxrp.me.itemcustomizer.util.ItemBuilder;

public class PermissionMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public PermissionMenu(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("permissions")
                .provider(new PermissionMenu(itemcustomizer))
                .size(4, 9)
                .title(ChatColor.AQUA + "Permissions")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Set ItemFlags
        final ItemStack setItemFlags = new ItemBuilder(Material.GLASS)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Set ItemFlags")
                .build();
        contents.set(1,1, ClickableItem.empty(setItemFlags));
        //Set DisplayName
        final ItemStack setDisplayName = new ItemBuilder(Material.NAME_TAG)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Set DisplayName")
                .build();
        contents.set(1,2, ClickableItem.empty(setDisplayName));
        //Set Enchants
        final ItemStack setEnchants = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Set Enchants")
                .build();
        contents.set(1,3, ClickableItem.empty(setEnchants));
        //Set Unbreakable
        final ItemStack setUnbreakable = new ItemBuilder(Material.NETHERITE_INGOT)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Set Unbreakable")
                .build();
        contents.set(1,4, ClickableItem.empty(setUnbreakable));
        //Set AttributeModifiers
        final ItemStack setAttributeModifiers = new ItemBuilder(Material.COMMAND_BLOCK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Set AttributeModifiers")
                .build();
        contents.set(1,5, ClickableItem.empty(setAttributeModifiers));
        //Set Color
        final ItemStack setColor = new ItemBuilder(Material.CAULDRON)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Set Color")
                .build();
        contents.set(1,6, ClickableItem.empty(setColor));
        //Set Effects
        final ItemStack setEffects = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .displayName(ChatColor.AQUA + "Set Effects")
                .build();
        contents.set(1,7, ClickableItem.empty(setEffects));
        //True and False
        final ItemStack isTrue = new ItemBuilder(Material.EMERALD)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.GREEN + "True")
                .build();
        final ItemStack isFalse = new ItemBuilder(Material.REDSTONE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.RED + "False")
                .build();
        if (plugin.getConfig().getBoolean("customize_edit.set_itemFlags")) {
            contents.set(2,1,ClickableItem.empty(isTrue));
        } else {
            contents.set(2,1,ClickableItem.empty(isFalse));
        }
        if (plugin.getConfig().getBoolean("customize_edit.set_displayName")) {
            contents.set(2,2,ClickableItem.empty(isTrue));
        }else {
            contents.set(2,1,ClickableItem.empty(isFalse));
        }
        if (plugin.getConfig().getBoolean("customize_edit.set_enchants")) {
            contents.set(2,3,ClickableItem.empty(isTrue));
        }else {
            contents.set(2,3,ClickableItem.empty(isFalse));
        }
        if (plugin.getConfig().getBoolean("customize_edit.set_unbreakable")) {
            contents.set(2,4,ClickableItem.empty(isTrue));
        }else {
            contents.set(2,4,ClickableItem.empty(isFalse));
        }
        if (plugin.getConfig().getBoolean("customize_edit.set_attributeModifier")) {
            contents.set(2,5,ClickableItem.empty(isTrue));
        }else {
            contents.set(2,5,ClickableItem.empty(isFalse));
        }
        if (plugin.getConfig().getBoolean("customize_edit.set_color")) {
            contents.set(2,6,ClickableItem.empty(isTrue));
        }else {
            contents.set(2,6,ClickableItem.empty(isFalse));
        }
        if (plugin.getConfig().getBoolean("customize_edit.set_effects")) {
            contents.set(2,7,ClickableItem.empty(isTrue));
        }else {
            contents.set(2,7,ClickableItem.empty(isFalse));
        }
        //Borders
        contents.fillBorders(ClickableItem.empty(GeneralItems.filler()));
        //Back
        contents.set(3, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            ItemCustomizerMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
