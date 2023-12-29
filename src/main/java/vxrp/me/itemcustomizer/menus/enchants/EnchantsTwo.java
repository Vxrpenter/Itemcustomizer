package vxrp.me.itemcustomizer.menus.enchants;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.menus.items.GeneralItems;
import vxrp.me.itemcustomizer.util.ItemBuilder;

public class EnchantsTwo implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EnchantsTwo(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("Enchants2")
                .provider(new EnchantsTwo(itemcustomizer))
                .size(6, 9)
                .title(ChatColor.AQUA + "Enchants " + ChatColor.GRAY + "Page 2")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Borders
        contents.fill(ClickableItem.empty(GeneralItems.filler()));
        //Sharpness
        final ItemStack sharpness = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Sharpness")
                .addEnchantment(Enchantment.DAMAGE_ALL, 0)
                .lore(ChatColor.GRAY + "Increases damage against all targets")
                .build();
        contents.set(1, 1, ClickableItem.of(sharpness, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.DAMAGE_ALL);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Silk Touch
        final ItemStack silkTouch = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Silk Touch")
                .addEnchantment(Enchantment.SILK_TOUCH, 0)
                .lore(ChatColor.GRAY + "Allows blocks to drop themselves instead of", ChatColor.GRAY + "fragments")
                .build();
        contents.set(1, 2, ClickableItem.of(silkTouch, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.SILK_TOUCH);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Smite
        final ItemStack smite = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Smite")
                .addEnchantment(Enchantment.DAMAGE_UNDEAD, 0)
                .lore(ChatColor.GRAY + "Increases damage against undead targets")
                .build();
        contents.set(1, 3, ClickableItem.of(smite, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.DAMAGE_UNDEAD);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Soul Speed
        final ItemStack soulSpeed = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Soul Speed")
                .addEnchantment(Enchantment.SOUL_SPEED, 0)
                .lore(ChatColor.GRAY + "Walk quicker on soul blocks")
                .build();
        contents.set(1, 4, ClickableItem.of(soulSpeed, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.SOUL_SPEED);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Sweeping Edge
        final ItemStack sweepingEdge = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Sweeping Edge")
                .addEnchantment(Enchantment.SWEEPING_EDGE, 0)
                .lore(ChatColor.GRAY + "Increases damage against targets when using a", ChatColor.GRAY + "sweep attack")
                .build();
        contents.set(1, 5, ClickableItem.of(sweepingEdge, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.SWEEPING_EDGE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Swift Sneak
        final ItemStack swiftSneak = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Swift Sneak")
                .addEnchantment(Enchantment.SWIFT_SNEAK, 0)
                .lore(ChatColor.GRAY + "Walk quicker while sneaking")
                .build();
        contents.set(1, 6, ClickableItem.of(swiftSneak, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.SWIFT_SNEAK);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Thorns
        final ItemStack thorns = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Thorns")
                .addEnchantment(Enchantment.THORNS, 0)
                .lore(ChatColor.GRAY + "Damages the attacker")
                .build();
        contents.set(1, 7, ClickableItem.of(thorns, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.THORNS);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Unbreaking
        final ItemStack unbreaking = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Unbreaking")
                .addEnchantment(Enchantment.DURABILITY, 0)
                .lore(ChatColor.GRAY + "Decreases the rate at which a tool looses durability")
                .build();
        contents.set(2, 1, ClickableItem.of(unbreaking, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.DURABILITY);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //LastPage
        contents.set(5, 0, ClickableItem.of(GeneralItems.lastPage(), e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchantsOne.openMenu(player, plugin);
            }
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
