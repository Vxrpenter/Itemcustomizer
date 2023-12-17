package vxrp.me.itemcustomizer.ClickEvents.Effects.EffectsTypeOneTwo;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsTypeOneTwo.EffectsTypeMenuOne;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsTypeOneTwo.EffectsTypeMenuTwo;

public class EffectsTypeOneClickEvent implements Listener {

    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EffectsTypeMenuOne.menuname))) return;
        event.setCancelled(true);
        Player player = (Player) event.getWhoClicked();
        if (event.getSlot() == 53) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsTypeMenuTwo.OpenMenu(player);
        }
        if (event.getCurrentItem() == null) return;
        if (event.getCurrentItem().getType() != Material.POTION) return;
        ItemMeta tempMeta = new ItemStack(Material.POTION).getItemMeta();
        PotionMeta tempPotionMeta = (PotionMeta) tempMeta;
        PotionMeta potionMeta = (PotionMeta) event.getCurrentItem().getItemMeta();
        PotionEffectType potionEffectType = potionMeta.getCustomEffects().get(0).getType();
        PotionEffect potionEffect = new PotionEffect(potionEffectType, 0, 0);

        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
        tempPotionMeta.addCustomEffect(potionEffect, false);
        tempPotionMeta.setColor(potionMeta.getColor());
        EffectsMaps.potionMetaData.put(player.getUniqueId(), tempMeta);
        EffectsPickMenu.OpenMenu(player);
    }
}
