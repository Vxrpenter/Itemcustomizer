package vxrp.me.itemcustomizer.ClickEvents.Effects;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.PotionMeta;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsColorMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;

public class EffectsColorClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EffectsColorMenu.menuname))) return;
        if (event.getCurrentItem() == null) return;
        Player player = (Player) event.getWhoClicked();
        PotionMeta potionMeta = (PotionMeta) event.getCurrentItem().getItemMeta();
        if (event.getCurrentItem().getType() != Material.POTION) return;
        event.setCancelled(true);

        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
        EffectsMaps.color.put(player.getUniqueId(), potionMeta.getColor());
        EffectsPickMenu.OpenMenu(player);
    }
}
