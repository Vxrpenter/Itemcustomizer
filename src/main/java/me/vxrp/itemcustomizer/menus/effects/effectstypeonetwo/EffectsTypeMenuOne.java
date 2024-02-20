package me.vxrp.itemcustomizer.menus.effects.effectstypeonetwo;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.menus.effects.EffectsPickMenu;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class EffectsTypeMenuOne implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EffectsTypeMenuOne(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("effectType1")
                .provider(new EffectsTypeMenuOne(itemcustomizer))
                .size(6, 9)
                .title(ChatColor.AQUA + "EffectType " + ChatColor.GRAY + "Page 1")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta tempMeta = new ItemStack(Material.POTION).getItemMeta();
        PotionMeta tempPotionMeta = (PotionMeta) tempMeta;

        //Absorption
        final ItemStack absorption = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.ABSORPTION, 0, 0, false)
                .potionColor(Color.fromRGB(235, 199, 22))
                .displayName(ChatColor.AQUA + "Absorption")
                .lore(ChatColor.GRAY + "Increases the maximum health of an entity with",
                        ChatColor.GRAY + "health that cannot be regenerated, but is refilled", ChatColor.GRAY + "every 30 seconds")
                .build();
        contents.set(1,1, ClickableItem.of(absorption, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.ABSORPTION, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Bad Omen
        final ItemStack badOmen = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.BAD_OMEN, 0, 0, false)
                .potionColor(Color.fromRGB(118, 118, 118))
                .displayName(ChatColor.AQUA + "Bad Omen")
                .lore(ChatColor.GRAY + "Triggers a raid when the player enters a village")
                .build();
        contents.set(1,2, ClickableItem.of(badOmen, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.BAD_OMEN, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Blindness
        final ItemStack blindness = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.BLINDNESS, 0, 0, false)
                .potionColor(Color.fromRGB(0, 0, 0))
                .displayName(ChatColor.AQUA + "Blindness")
                .lore(ChatColor.GRAY + "Blinds an entity")
                .build();
        contents.set(1,3, ClickableItem.of(blindness, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Conduit Power
        final ItemStack conduitPower = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.CONDUIT_POWER, 0, 0, false)
                .potionColor(Color.fromRGB(64, 194, 249))
                .displayName(ChatColor.AQUA + "Conduit Power")
                .lore(ChatColor.GRAY + "Effects granted by a nearby conduit. Includes", ChatColor.GRAY + "enhanced underwater abilities")
                .build();
        contents.set(1,4, ClickableItem.of(conduitPower, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Confusion
        final ItemStack confusion = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.CONFUSION, 0, 0, false)
                .potionColor(Color.fromRGB(127, 214, 66))
                .displayName(ChatColor.AQUA + "Confusion")
                .lore(ChatColor.GRAY + "Warps vision on the client")
                .build();
        contents.set(1,5, ClickableItem.of(confusion, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Damage Resistance
        final ItemStack damageResistance = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.DAMAGE_RESISTANCE, 0, 0, false)
                .potionColor(Color.fromRGB(226, 56, 56))
                .displayName(ChatColor.AQUA + "Resistance")
                .lore(ChatColor.GRAY + "Decreases damage dealt to an entity")
                .build();
        contents.set(1,6, ClickableItem.of(damageResistance, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Darkness
        final ItemStack darkness = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.DARKNESS, 0, 0, false)
                .potionColor(Color.fromRGB(38, 38, 38))
                .displayName(ChatColor.AQUA + "Darkness")
                .lore(ChatColor.GRAY + "Causes the player's vision to dim occasionally")
                .build();
        contents.set(1,7, ClickableItem.of(darkness, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.DARKNESS, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Dolphins Grace
        final ItemStack dolphinsGrace = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.DOLPHINS_GRACE, 0, 0, false)
                .potionColor(Color.fromRGB(36, 210, 244))
                .displayName(ChatColor.AQUA + "Dolphins Grace")
                .lore(ChatColor.GRAY + "Increases underwater movement speed")
                .build();
        contents.set(2,1, ClickableItem.of(dolphinsGrace, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Fast Digging
        final ItemStack fastDigging = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.FAST_DIGGING, 0, 0, false)
                .potionColor(Color.fromRGB(219, 216, 46))
                .displayName(ChatColor.AQUA + "Haste")
                .lore(ChatColor.GRAY + "Increases dig speed")
                .build();
        contents.set(2,2, ClickableItem.of(fastDigging, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Fire Resistance
        final ItemStack fireResistance = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.FIRE_RESISTANCE, 0, 0, false)
                .potionColor(Color.ORANGE)
                .displayName(ChatColor.AQUA + "Fire Resistance")
                .lore(ChatColor.GRAY + "Stops fire damage")
                .build();
        contents.set(2,3, ClickableItem.of(fireResistance, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Glowing
        final ItemStack glowing = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.GLOWING, 0, 0, false)
                .potionColor(Color.fromRGB(244, 244, 244))
                .displayName(ChatColor.AQUA + "Glowing")
                .lore(ChatColor.GRAY + "Outlines the entity so that it can be seen from afar")
                .build();
        contents.set(2,4, ClickableItem.of(glowing, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Harm
        final ItemStack harm = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.HARM, 0, 0, false)
                .potionColor(Color.fromRGB(88, 3, 158))
                .displayName(ChatColor.AQUA + "Instant Damage")
                .lore(ChatColor.GRAY + "Hurts an entity")
                .build();
        contents.set(2,5, ClickableItem.of(harm, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Heal
        final ItemStack heal = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.HEAL, 0, 0, false)
                .potionColor(Color.RED)
                .displayName(ChatColor.AQUA + "Instant Heal")
                .lore(ChatColor.GRAY + "Heals an entity")
                .build();
        contents.set(2,6, ClickableItem.of(heal, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Health Boost
        final ItemStack healthBoost = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.HEALTH_BOOST, 0, 0, false)
                .potionColor(Color.fromRGB(163, 17, 17))
                .displayName(ChatColor.AQUA + "Health Boost")
                .lore(ChatColor.GRAY + "Increases the maximum health of an entity")
                .build();
        contents.set(2,7, ClickableItem.of(healthBoost, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Hero of the Village
        final ItemStack heroOfTheVillage = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 0, 0, false)
                .potionColor(Color.fromRGB(24, 201, 30))
                .displayName(ChatColor.AQUA + "Hero of the Village")
                .lore(ChatColor.GRAY + "Reduces the cost of villager trades")
                .build();
        contents.set(3,1, ClickableItem.of(heroOfTheVillage, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Hunger
        final ItemStack hunger = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.HUNGER, 0, 0, false)
                .potionColor(Color.fromRGB(188, 86, 18))
                .displayName(ChatColor.AQUA + "Hunger")
                .lore(ChatColor.GRAY + "Reduces the cost of villager trades")
                .build();
        contents.set(3,2, ClickableItem.of(hunger, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HUNGER, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Increase Damage
        final ItemStack increaseDamage = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0, false)
                .potionColor(Color.PURPLE)
                .displayName(ChatColor.AQUA + "Strenght")
                .lore(ChatColor.GRAY + "Increases damage dealt")
                .build();
        contents.set(3,3, ClickableItem.of(increaseDamage, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Invisibility
        final ItemStack invisibility = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.INVISIBILITY, 0, 0, false)
                .potionColor(Color.GRAY)
                .displayName(ChatColor.AQUA + "Invisibility")
                .lore(ChatColor.GRAY + "Grants invisibility")
                .build();
        contents.set(3,4, ClickableItem.of(invisibility, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Jump
        final ItemStack jump = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.JUMP, 0, 0, false)
                .potionColor(Color.GREEN)
                .displayName(ChatColor.AQUA + "Jump Boost")
                .lore(ChatColor.GRAY + "Increases jump height")
                .build();
        contents.set(3,5, ClickableItem.of(jump, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Levitation
        final ItemStack levitation = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.LEVITATION, 0, 0, false)
                .potionColor(Color.fromRGB(211, 182, 234))
                .displayName(ChatColor.AQUA + "Levitation")
                .lore(ChatColor.GRAY + "Causes the entity to float into the air")
                .build();
        contents.set(3,6, ClickableItem.of(levitation, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.LEVITATION, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Luck
        final ItemStack luck = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.LUCK, 0, 0, false)
                .potionColor(Color.fromRGB(64, 234, 49))
                .displayName(ChatColor.AQUA + "Luck")
                .lore(ChatColor.GRAY + "Loot table luck")
                .build();
        contents.set(3,7, ClickableItem.of(luck, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Night Vision
        final ItemStack nightVision = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.NIGHT_VISION, 0, 0, false)
                .potionColor(Color.BLUE)
                .displayName(ChatColor.AQUA + "Night Vision")
                .lore(ChatColor.GRAY + "Allows an entity to see in the dark")
                .build();
        contents.set(4,1, ClickableItem.of(nightVision, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Poison
        final ItemStack poison = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.POISON, 0, 0, false)
                .potionColor(Color.fromRGB(95, 175, 33))
                .displayName(ChatColor.AQUA + "Poison")
                .lore(ChatColor.GRAY + "Deals damage to an entity over time")
                .build();
        contents.set(4,2, ClickableItem.of(poison, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Regeneration
        final ItemStack regeneration = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.REGENERATION, 0, 0, false)
                .potionColor(Color.fromRGB(239, 57, 57))
                .displayName(ChatColor.AQUA + "Regeneration")
                .lore(ChatColor.GRAY + "Regenerates health")
                .build();
        contents.set(4,3, ClickableItem.of(regeneration, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Saturation
        final ItemStack saturation = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.SATURATION, 0, 0, false)
                .potionColor(Color.fromRGB(239, 57, 57))
                .displayName(ChatColor.AQUA + "Saturation")
                .lore(ChatColor.GRAY + "Increases the food level of an entity each tick")
                .build();
        contents.set(4,4, ClickableItem.of(saturation, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SATURATION, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Slow
        final ItemStack slow = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.SLOW, 0, 0, false)
                .potionColor(Color.fromRGB(173, 173, 173))
                .displayName(ChatColor.AQUA + "Slowness")
                .lore(ChatColor.GRAY + "Decreases movement speed")
                .build();
        contents.set(4,5, ClickableItem.of(slow, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Slow Digging
        final ItemStack slowDigging = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.SLOW_DIGGING, 0, 0, false)
                .potionColor(Color.fromRGB(71, 65, 65))
                .displayName(ChatColor.AQUA + "Mining Fatigue")
                .lore(ChatColor.GRAY + "Decreases dig speed")
                .build();
        contents.set(4,6, ClickableItem.of(slowDigging, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Slow Falling
        final ItemStack slowFalling = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.SLOW_FALLING, 0, 0, false)
                .potionColor(Color.fromRGB(224, 224, 224))
                .displayName(ChatColor.AQUA + "Slow Falling")
                .lore(ChatColor.GRAY + "Decreases dig speed")
                .build();
        contents.set(4,7, ClickableItem.of(slowFalling, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Borders
        contents.fillBorders(ClickableItem.empty(GeneralItems.filler()));
        //Back
        contents.set(5, 8, ClickableItem.of(GeneralItems.nextPage(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsTypeMenuTwo.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
