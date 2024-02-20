package me.vxrp.itemcustomizer.menus.effects;

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
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.menus.EditMenu;
import me.vxrp.itemcustomizer.menus.setValues.SetAmplifierMenu;
import me.vxrp.itemcustomizer.menus.setValues.SetTimeMenu;
import me.vxrp.itemcustomizer.menus.effects.effectstypeonetwo.EffectsTypeMenuOne;
import me.vxrp.itemcustomizer.menus.items.GeneralItems;
import me.vxrp.itemcustomizer.util.ItemBuilder;

public class EffectsPickMenu implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EffectsPickMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("effectPick")
                .provider(new EffectsPickMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.AQUA + "Effects " + ChatColor.GRAY + "Pick")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());
        PotionMeta itemPotionMeta = (PotionMeta) itemMeta;
        PotionMeta effectsTypeMeta = (PotionMeta) EditingStorage.getPotionMeta(player.getUniqueId());
        final int[] time = {EditingStorage.getTime(player.getUniqueId())};
        int timeIn = EditingStorage.getTimeIn(player.getUniqueId());
        int amplifier = EditingStorage.getAmplifier(player.getUniqueId())-1;
        Color color = EditingStorage.getColor(player.getUniqueId());

        //Effect
        final ItemStack effect = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .displayName(ChatColor.AQUA + "Effect")
                .lore(ChatColor.GRAY + "Set's the effect")
                .build();
        contents.set(2,4, ClickableItem.of(effect, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsTypeMenuOne.openMenu(player, plugin);
        }));
        //Potion
        final ItemStack potion = new ItemBuilder(Material.BREWING_STAND)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .displayName(ChatColor.AQUA + "Potion")
                .build();
        contents.set(1,4, ClickableItem.of(potion, e -> {
            if (!e.isLeftClick()) return;
            if (effectsTypeMeta == null) {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.RED + "&cYou still have to set the EffectType/Color/Duration and or Level");
            } else {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                itemPotionMeta.removeCustomEffect(effectsTypeMeta.getCustomEffects().get(0).getType());
                if (timeIn == 0) {
                    time[0] = time[0] *20;
                    itemPotionMeta.addCustomEffect(new PotionEffect(effectsTypeMeta.getCustomEffects().get(0).getType(), time[0], amplifier), false);
                }
                if (timeIn == 1) {
                    time[0] = time[0] *1200;
                    itemPotionMeta.addCustomEffect(new PotionEffect(effectsTypeMeta.getCustomEffects().get(0).getType(), time[0], amplifier), false);
                }
                if (timeIn == 2) {
                    itemPotionMeta.addCustomEffect(new PotionEffect(effectsTypeMeta.getCustomEffects().get(0).getType(), time[0], amplifier), false);
                }
                if (color != null) {
                    itemPotionMeta.setColor(color);
                }
                EditMenu.openMenu(player, plugin);
            }
        }));
        //Time
        if (timeIn == 0) {
            final ItemStack timeInSeconds = new ItemBuilder(Material.CLOCK)
                    .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                    .displayName(ChatColor.AQUA + "Time in Seconds")
                    .lore(ChatColor.GRAY + "Set's how long the effect lasts in seconds", ChatColor.GRAY + "Right click to change -> minutes")
                    .build();
            contents.set(1,6, ClickableItem.of(timeInSeconds, e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    SetTimeMenu.openMenu(player, plugin);
                } else if (e.isRightClick()) {
                    player.playSound(player, Sound.BLOCK_BARREL_OPEN, 10, 1);
                    EditingStorage.setTimeIn(player.getUniqueId(), 1);
                    EffectsPickMenu.openMenu(player, plugin);
                }
            }));
        }
        if (timeIn == 1) {
            final ItemStack timeInMinutes = new ItemBuilder(Material.CLOCK)
                    .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                    .displayName(ChatColor.AQUA + "Time in Minutes")
                    .lore(ChatColor.GRAY + "Set's how long the effect lasts in minutes", ChatColor.GRAY + "Right click to change -> ticks")
                    .build();
            contents.set(1,6, ClickableItem.of(timeInMinutes, e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    SetTimeMenu.openMenu(player, plugin);
                } else if (e.isRightClick()) {
                    player.playSound(player, Sound.BLOCK_BARREL_OPEN, 10, 1);
                    EditingStorage.setTimeIn(player.getUniqueId(), 2);
                    EffectsPickMenu.openMenu(player, plugin);
                }
            }));
        }
        if (timeIn == 2) {
            final ItemStack timeInTicks = new ItemBuilder(Material.CLOCK)
                    .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                    .displayName(ChatColor.AQUA + "Time in Ticks")
                    .lore(ChatColor.GRAY + "Set's how long the effect lasts in ticks", ChatColor.GRAY + "Right click to change -> seconds")
                    .build();
            contents.set(1,6, ClickableItem.of(timeInTicks, e -> {
                if (e.isLeftClick()) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    SetTimeMenu.openMenu(player, plugin);
                } else if (e.isRightClick()) {
                    player.playSound(player, Sound.BLOCK_BARREL_OPEN, 10, 1);
                    EditingStorage.setTimeIn(player.getUniqueId(), 0);
                    EffectsPickMenu.openMenu(player, plugin);
                }
            }));
        }
        //Amplifier
        final ItemStack itemAmplifier = new ItemBuilder(Material.CAMPFIRE)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .displayName(ChatColor.AQUA + "Amplifier")
                .lore(ChatColor.GRAY + "Set's the level of the effect")
                .build();
        contents.set(0,5, ClickableItem.of(itemAmplifier, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            SetAmplifierMenu.openMenu(player, plugin);
        }));
        //Color
        final ItemStack itemColor = new ItemBuilder(Material.CAULDRON)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .displayName(ChatColor.AQUA + "Color")
                .lore(ChatColor.GRAY + "Set's the level of the effect", " ",
                        ChatColor.GRAY + "" + ChatColor.ITALIC + "'color is going to be reset if you already",
                        ChatColor.GRAY + "" + ChatColor.ITALIC + "set a color for your potion'")
                .build();
        contents.set(0,3, ClickableItem.of(itemColor, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsColorMenu.openMenu(player, plugin);
        }));
        //Remove
        contents.set(1, 2, ClickableItem.of(GeneralItems.remove(), e -> {
            if (e.isLeftClick()) {
                player.playSound(player, Sound.ITEM_SPYGLASS_USE, 10, 1);
                itemPotionMeta.removeCustomEffect(effectsTypeMeta.getCustomEffects().get(0).getType());
                EditMenu.openMenu(player, plugin);
            }
        }));
        //Back
        contents.set(2, 8, ClickableItem.of(GeneralItems.back(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
