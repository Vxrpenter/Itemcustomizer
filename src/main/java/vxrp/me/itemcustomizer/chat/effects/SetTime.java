package vxrp.me.itemcustomizer.chat.effects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.menus.effects.EffectsPickMenu;

public class SetTime implements Listener {
    private final Itemcustomizer plugin;
    public SetTime(Itemcustomizer plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (EditingStorage.getTimeRunning(player.getUniqueId())) {
            EditingStorage.setStorage(player.getUniqueId());
            String message = event.getMessage();
            EditingStorage.setTimeRunning(player.getUniqueId(), false);

            EditingStorage.setTime(player.getUniqueId(), Integer.valueOf(message));

            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> EffectsPickMenu.openMenu(player, plugin), 1);
        }
    }
}
