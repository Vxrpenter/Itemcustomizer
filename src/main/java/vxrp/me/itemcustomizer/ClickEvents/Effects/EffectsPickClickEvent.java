package vxrp.me.itemcustomizer.ClickEvents.Effects;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Menus.EditMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsColorMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsTypeOneTwo.EffectsTypeMenuOne;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;

public class EffectsPickClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EffectsPickMenu.menuname))) return;
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        PotionMeta itemPotionMeta = (PotionMeta) itemMeta;
        PotionMeta effectsTypeMeta = (PotionMeta) EffectsMaps.potionMetaData.get(player.getUniqueId());
        int time = EffectsMaps.time.get(player.getUniqueId());
        int timeIn = EffectsMaps.timeIn.get(player.getUniqueId());
        int amplifier = EffectsMaps.amplifier.get(player.getUniqueId())-1;
        Color color = EffectsMaps.color.get(player.getUniqueId());
        event.setCancelled(true);

        if (event.getSlot() == 22) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsTypeMenuOne.OpenMenu(player);
        }
        if (event.getSlot() == 13) {
            if (effectsTypeMeta == null) {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou still have to set the EffectType/Color/Duration and or Level"));
            } else {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                itemPotionMeta.removeCustomEffect(effectsTypeMeta.getCustomEffects().get(0).getType());
                if (timeIn == 0) {
                    time = time*20;
                    itemPotionMeta.addCustomEffect(new PotionEffect(effectsTypeMeta.getCustomEffects().get(0).getType(), time, amplifier), false);
                }
                if (timeIn == 1) {
                    time = time*1200;
                    itemPotionMeta.addCustomEffect(new PotionEffect(effectsTypeMeta.getCustomEffects().get(0).getType(), time, amplifier), false);
                }
                if (timeIn == 2) {
                    itemPotionMeta.addCustomEffect(new PotionEffect(effectsTypeMeta.getCustomEffects().get(0).getType(), time, amplifier), false);
                }
                if (color != null) {
                    itemPotionMeta.setColor(color);
                }
                EditMenu.OpenMenu(player);
            }
        }
        if (event.getSlot() == 11) {
            itemPotionMeta.removeCustomEffect(effectsTypeMeta.getCustomEffects().get(0).getType());
            EditMenu.OpenMenu(player);
        }
        if (event.getSlot() == 15) {
            if (event.getClick().equals(ClickType.RIGHT)) {
                player.playSound(player, Sound.BLOCK_BARREL_OPEN, 10, 1);
                if (timeIn == 0) {
                    EffectsMaps.timeIn.put(player.getUniqueId(), 1);
                }
                if (timeIn == 1) {
                    EffectsMaps.timeIn.put(player.getUniqueId(), 2);
                }
                if (timeIn == 2) {
                    EffectsMaps.timeIn.put(player.getUniqueId(), 0);
                }
                EffectsPickMenu.OpenMenu(player);
            } else if (event.getClick().equals(ClickType.LEFT)) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EffectsMaps.timeRunning.put(player.getUniqueId(), true);
                player.closeInventory();
                if (timeIn == 0) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Please type a value (time in seconds)"));
                }
                if (timeIn == 1) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Please type a value (time in minutes)"));
                }
                if (timeIn == 1) {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Please type a value (time in ticks)"));

                }
            }
        }
        if (event.getSlot() == 5) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsMaps.amplifierRunning.put(player.getUniqueId(), true);
            player.closeInventory();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Type a value (amplifier)"));
        }
        if (event.getSlot() == 3) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsColorMenu.OpenMenu(player);
        }
        if (event.getSlot() == 26) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EditMenu.OpenMenu(player);
        }
    }
}
