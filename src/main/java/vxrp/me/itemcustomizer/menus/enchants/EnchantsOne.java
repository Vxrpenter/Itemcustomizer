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

public class EnchantsOne implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EnchantsOne(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("Enchants1")
                .provider(new EnchantsOne(itemcustomizer))
                .size(6, 9)
                .title(ChatColor.AQUA + "Enchants " + ChatColor.GRAY + "Page 1")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        //Aqua Affinity
        final ItemStack aquaAffinity = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Aqua Affinity")
                .addEnchantment(Enchantment.WATER_WORKER, 0)
                .lore(ChatColor.GRAY + "Increases the speed at which a player may mine", ChatColor.GRAY + "underwater")
                .build();
        contents.set(1, 1, ClickableItem.of(aquaAffinity, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.WATER_WORKER);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Bane of Arthropods
        final ItemStack baneOfArthropods = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Bane of Arthropods")
                .addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 0)
                .lore(ChatColor.GRAY + "Increases damage against arthropod targets")
                .build();
        contents.set(1, 2, ClickableItem.of(baneOfArthropods, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.DAMAGE_ARTHROPODS);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Channeling
        final ItemStack channeling = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Channeling")
                .addEnchantment(Enchantment.CHANNELING, 0)
                .lore(ChatColor.GRAY + "Strikes lightning when a mob is hit with a trident if", ChatColor.GRAY + "conditions are stormy")
                .build();
        contents.set(1, 3, ClickableItem.of(channeling, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.CHANNELING);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Curse of Binding
        final ItemStack curseOfBinding = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Curse of Binding")
                .addEnchantment(Enchantment.BINDING_CURSE, 0)
                .lore(ChatColor.GRAY + "Item cannot be removed")
                .build();
        contents.set(1, 4, ClickableItem.of(curseOfBinding, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.BINDING_CURSE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Depth Strider
        final ItemStack depthStrider = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Depth Strider")
                .addEnchantment(Enchantment.DEPTH_STRIDER, 0)
                .lore(ChatColor.GRAY + "Increases walking speed while in water")
                .build();
        contents.set(1, 5, ClickableItem.of(depthStrider, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.DEPTH_STRIDER);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Efficiency
        final ItemStack efficiency = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Efficiency")
                .addEnchantment(Enchantment.DIG_SPEED, 0)
                .lore(ChatColor.GRAY + "Increases the rate at which you mine/dig")
                .build();
        contents.set(1, 6, ClickableItem.of(efficiency, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.DIG_SPEED);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Feather Falling
        final ItemStack featherFalling = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Feather Falling")
                .addEnchantment(Enchantment.PROTECTION_FALL, 0)
                .lore(ChatColor.GRAY + "Provides protection against fall damage")
                .build();
        contents.set(1, 7, ClickableItem.of(featherFalling, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.PROTECTION_FALL);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Fire Aspect
        final ItemStack fireAspect = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Fire Aspect")
                .addEnchantment(Enchantment.FIRE_ASPECT, 0)
                .lore(ChatColor.GRAY + "When attacking a target, has a chance to set them", ChatColor.GRAY + "on fire")
                .build();
        contents.set(2, 1, ClickableItem.of(fireAspect, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.FIRE_ASPECT);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Fire Protection
        final ItemStack fireProtection = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Fire Protection")
                .addEnchantment(Enchantment.PROTECTION_FIRE, 0)
                .lore(ChatColor.GRAY + "Provides protection against fire damage")
                .build();
        contents.set(2, 2, ClickableItem.of(fireProtection, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.PROTECTION_FIRE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Flame
        final ItemStack flame = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Flame")
                .addEnchantment(Enchantment.ARROW_FIRE, 0)
                .lore(ChatColor.GRAY + "Sets entities on fire when hit by arrows shot from a", ChatColor.GRAY + "bow")
                .build();
        contents.set(2, 3, ClickableItem.of(flame, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.ARROW_FIRE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Fortune
        final ItemStack fortune = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Fortune")
                .addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 0)
                .lore(ChatColor.GRAY + "Provides a chance of gaining extra loot when", ChatColor.GRAY + "destroying blocks")
                .build();
        contents.set(2, 4, ClickableItem.of(fortune, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.LOOT_BONUS_BLOCKS);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Frost Walker
        final ItemStack frostWalker = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Frost Walker")
                .addEnchantment(Enchantment.FROST_WALKER, 0)
                .lore(ChatColor.GRAY + "Freezes any still water adjacent to ice / frost which", ChatColor.GRAY + "player is walking on")
                .build();
        contents.set(2, 5, ClickableItem.of(frostWalker, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.FROST_WALKER);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Impaling
        final ItemStack impaling = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Impaling")
                .addEnchantment(Enchantment.IMPALING, 0)
                .lore(ChatColor.GRAY + "Deals more damage to mobs that live in the ocean")
                .build();
        contents.set(2, 6, ClickableItem.of(impaling, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.IMPALING);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Infinity
        final ItemStack infinity = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Infinity")
                .addEnchantment(Enchantment.ARROW_INFINITE, 0)
                .lore(ChatColor.GRAY + "Provides infinite arrows when shooting a bow")
                .build();
        contents.set(2, 7, ClickableItem.of(infinity, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.ARROW_INFINITE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Knockback
        final ItemStack knockback = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Knockback")
                .addEnchantment(Enchantment.KNOCKBACK, 0)
                .lore(ChatColor.GRAY + "All damage to other targets will knock them back", ChatColor.GRAY + "when hit")
                .build();
        contents.set(3, 1, ClickableItem.of(knockback, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.KNOCKBACK);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Looting
        final ItemStack looting = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Looting")
                .addEnchantment(Enchantment.LOOT_BONUS_MOBS, 0)
                .lore(ChatColor.GRAY + "Provides a chance of gaining extra loot when killing", ChatColor.GRAY + "monsters")
                .build();
        contents.set(3, 1, ClickableItem.of(looting, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.LOOT_BONUS_MOBS);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Loyalty
        final ItemStack loyalty = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Loyalty")
                .addEnchantment(Enchantment.LOYALTY, 0)
                .lore(ChatColor.GRAY + "Causes a thrown trident to return to the player who", ChatColor.GRAY + "threw it")
                .build();
        contents.set(3, 2, ClickableItem.of(loyalty, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.LOYALTY);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Luck of the Sea
        final ItemStack luckOfTheSea = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Luck of the Sea")
                .addEnchantment(Enchantment.LUCK, 0)
                .lore(ChatColor.GRAY + "Decreases odds of catching worthless junk")
                .build();
        contents.set(3, 3, ClickableItem.of(luckOfTheSea, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.LUCK);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Lure
        final ItemStack lure = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Lure")
                .addEnchantment(Enchantment.LURE, 0)
                .lore(ChatColor.GRAY + "Increases rate of fish biting your hook")
                .build();
        contents.set(3, 4, ClickableItem.of(lure, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.LURE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Mending
        final ItemStack mending = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Mending")
                .addEnchantment(Enchantment.MENDING, 0)
                .lore(ChatColor.GRAY + "Allows mending the item using experience orbs")
                .build();
        contents.set(3, 5, ClickableItem.of(mending, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.MENDING);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Multishot
        final ItemStack multiShot = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Multishot")
                .addEnchantment(Enchantment.MULTISHOT, 0)
                .lore(ChatColor.GRAY + "Shoot multiple arrows from crossbows")
                .build();
        contents.set(3, 6, ClickableItem.of(multiShot, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.MULTISHOT);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Piercing
        final ItemStack piercing = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Piercing")
                .addEnchantment(Enchantment.PIERCING, 0)
                .lore(ChatColor.GRAY + "Crossbow projectiles pierce entities")
                .build();
        contents.set(3, 7, ClickableItem.of(piercing, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.PIERCING);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Power
        final ItemStack power = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Power")
                .addEnchantment(Enchantment.ARROW_DAMAGE, 0)
                .lore(ChatColor.GRAY + "Provides extra damage when shooting arrows from", ChatColor.GRAY + "bows")
                .build();
        contents.set(4, 1, ClickableItem.of(power, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.ARROW_DAMAGE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Projectile Protection
        final ItemStack projectileProtection = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Projectile Protection")
                .addEnchantment(Enchantment.PROTECTION_PROJECTILE, 0)
                .lore(ChatColor.GRAY + "Provides protection against projectile damage")
                .build();
        contents.set(4, 2, ClickableItem.of(projectileProtection, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.PROTECTION_PROJECTILE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Protection
        final ItemStack protection = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Protection")
                .addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 0)
                .lore(ChatColor.GRAY + "Provides protection against environmental damage")
                .build();
        contents.set(4, 3, ClickableItem.of(protection, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.PROTECTION_ENVIRONMENTAL);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Punch
        final ItemStack punch = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Punch")
                .addEnchantment(Enchantment.ARROW_KNOCKBACK, 0)
                .lore(ChatColor.GRAY + "Provides a knockback when an entity is hit by an", ChatColor.GRAY + "arrow from a bow")
                .build();
        contents.set(4, 4, ClickableItem.of(punch, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.ARROW_KNOCKBACK);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Quick Charge
        final ItemStack quickCharge = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Quick Charge")
                .addEnchantment(Enchantment.QUICK_CHARGE, 0)
                .lore(ChatColor.GRAY + "Charges crossbows quickly")
                .build();
        contents.set(4, 5, ClickableItem.of(quickCharge, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.QUICK_CHARGE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Respiration
        final ItemStack respiration = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Respiration")
                .addEnchantment(Enchantment.OXYGEN, 0)
                .lore(ChatColor.GRAY + "Decreases the rate of air loss whilst underwater")
                .build();
        contents.set(4, 6, ClickableItem.of(respiration, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.OXYGEN);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Riptide
        final ItemStack riptide = new ItemBuilder(Material.ENCHANTED_BOOK)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
                .displayName(ChatColor.AQUA + "Riptide")
                .addEnchantment(Enchantment.RIPTIDE, 0)
                .lore(ChatColor.GRAY + "When it is rainy, launches the player in the direction", ChatColor.GRAY + "their trident is thrown")
                .build();
        contents.set(4, 7, ClickableItem.of(riptide, e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EditingStorage.setEnchantment(player.getUniqueId(), Enchantment.RIPTIDE);
                EnchantsPickMenu.openMenu(player, plugin);
            }
        }));
        //Borders
        contents.fillBorders(ClickableItem.empty(GeneralItems.filler()));
        //NextPage
        contents.set(5, 8, ClickableItem.of(GeneralItems.nextPage(), e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchantsTwo.openMenu(player, plugin);
            }
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
