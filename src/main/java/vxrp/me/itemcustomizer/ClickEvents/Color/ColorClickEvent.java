package vxrp.me.itemcustomizer.ClickEvents.Color;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Menus.Color.ColorMenu;
import vxrp.me.itemcustomizer.Menus.EditMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;

public class ColorClickEvent implements Listener {
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', ColorMenu.menuname))) return;
        if (event.getCurrentItem() == null) return;
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) event.getCurrentItem().getItemMeta();
        LeatherArmorMeta itemLMeta = (LeatherArmorMeta) itemMeta;
        if (event.getCurrentItem().getType() != Material.LEATHER_CHESTPLATE) return;
        event.setCancelled(true);

        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
        itemLMeta.setColor(leatherArmorMeta.getColor());
        EditMaps.itemmeta.put(player.getUniqueId(), itemMeta);
        EditMenu.OpenMenu(player);
    }
}
