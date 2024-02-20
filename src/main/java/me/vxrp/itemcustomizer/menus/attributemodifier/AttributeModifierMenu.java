package me.vxrp.itemcustomizer.menus.attributemodifier;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.menus.EditMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class AttributeModifierMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public AttributeModifierMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("attributes")
                .provider(new AttributeModifierMenu(itemcustomizer))
                .size(4, 9)
                .title(ChatColor.AQUA + "Attributes")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Armor
        final ItemStack armor = new ItemBuilder(Material.IRON_CHESTPLATE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Armor")
                .lore(ChatColor.GRAY + "Set's the armor bonus of an Entity")
                .build();
        contents.set(1, 1, ClickableItem.of(armor, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_ARMOR);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Armor Toughness
        final ItemStack armorToughness = new ItemBuilder(Material.NETHERITE_INGOT)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Armor Toughness")
                .lore(ChatColor.GRAY + "Set's the armor durability bonus of an Entity")
                .build();
        contents.set(1, 2, ClickableItem.of(armorToughness, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_ARMOR_TOUGHNESS);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Attack Damage
        final ItemStack attackDamage = new ItemBuilder(Material.IRON_SWORD)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Attack Damage")
                .lore(ChatColor.GRAY + "Set's the attack damage of an Entity")
                .build();
        contents.set(1, 3, ClickableItem.of(attackDamage, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_ATTACK_DAMAGE);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Attack Knockback
        final ItemStack attackKnockback = new ItemBuilder(Material.STICK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Knockback")
                .lore(ChatColor.GRAY + "Set's the knockback of an Entity")
                .build();
        contents.set(1, 4, ClickableItem.of(attackKnockback, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_ATTACK_KNOCKBACK);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Attack Speed
        final ItemStack attackSpeed = new ItemBuilder(Material.SUGAR)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Attack Speed")
                .lore(ChatColor.GRAY + "Set's the attack speed of an Entity")
                .build();
        contents.set(1, 5, ClickableItem.of(attackSpeed, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_ATTACK_SPEED);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Flying Speed
        final ItemStack flyingSpeed = new ItemBuilder(Material.FEATHER)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Flying Speed")
                .lore(ChatColor.GRAY + "Set's the flying speed of an Entity")
                .build();
        contents.set(1, 6, ClickableItem.of(flyingSpeed, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_FLYING_SPEED);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Knockback Resistance
        final ItemStack knockbackResistance = new ItemBuilder(Material.SHIELD)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Knockback Resistance")
                .lore(ChatColor.GRAY + "Set's the resistance of an Entity to knockback")
                .build();
        contents.set(1, 7, ClickableItem.of(knockbackResistance, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_KNOCKBACK_RESISTANCE);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Max Health
        final ItemStack maxHealth = new ItemBuilder(Material.COOKED_BEEF)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Max Health")
                .lore(ChatColor.GRAY + "Set's the maximum health of an Entity")
                .build();
        contents.set(2, 3, ClickableItem.of(maxHealth, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_MAX_HEALTH);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Luck
        final ItemStack luck = new ItemBuilder(Material.EMERALD)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Luck")
                .lore(ChatColor.GRAY + "Set's the luck bonus of an Entity")
                .build();
        contents.set(2, 4, ClickableItem.of(luck, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_LUCK);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Movement Speed
        final ItemStack movementSpeed = new ItemBuilder(Material.IRON_BOOTS)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES)
                .displayName(ChatColor.AQUA + "Movement Speed")
                .lore(ChatColor.GRAY + "Set's the movement speed of an Entity")
                .build();
        contents.set(2, 5, ClickableItem.of(movementSpeed, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditingStorage.setAttribute(player.getUniqueId(), Attribute.GENERIC_MOVEMENT_SPEED);
            AttributePickMenu.openMenu(player, plugin);
        }));
        //Back
        contents.set(3, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}