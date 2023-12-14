package vxrp.me.itemcustomizer.Chat.AttributeModifier;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Menus.AttributeModifier.AttributePickMenu;

public class AddNumber implements Listener {
    private final Itemcustomizer plugin;
    public AddNumber(Itemcustomizer core) {
        this.plugin = core;
    }
    @EventHandler
    public void OnMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        PutIfAbsent.PutIfAbsent(player);
        String message = event.getMessage();

        if (AttributeModifierMaps.running.get(player.getUniqueId())) {
            AttributeModifierMaps.running.put(player.getUniqueId(), false);
            AttributeModifierMaps.number.put(player.getUniqueId(), Double.valueOf(message));
            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> {
                AttributePickMenu.OpenMenu(player);
            }, 1);
        }
    }
}
