package vxrp.me.itemcustomizer.chat.attributemodifier;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.menus.attributemodifier.AttributePickMenu;

public class AddNumber implements Listener {
    private final Itemcustomizer plugin;
    public AddNumber(Itemcustomizer core) {
        this.plugin = core;
    }
    @EventHandler
    public void onMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        EditingStorage.setStorage(player.getUniqueId());
        String message = event.getMessage();

        if (EditingStorage.getAttributeModifierRunning(player.getUniqueId())) {
            EditingStorage.setAttributeModifierRunning(player.getUniqueId(), false);
            EditingStorage.setNumber(player.getUniqueId(), Double.valueOf(message));
            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> AttributePickMenu.openMenu(player, plugin), 1);
        }
    }
}
