package vxrp.me.itemcustomizer.Chat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

public class SetDisplayName implements Listener {
    private final Itemcustomizer plugin;
    public SetDisplayName(Itemcustomizer core) {
        this.plugin = core;
    }
    @EventHandler
    public void OnMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        PutIfAbsent.PutIfAbsent(player);
        String message = event.getMessage();

        if (SetDisplayNameMaps.running.get(player.getUniqueId())) {
            SetDisplayNameMaps.running.put(player.getUniqueId(), false);
            SetDisplayNameMaps.displayname.put(player.getUniqueId(), message);
            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> {
                        CreateCustomMenu.OpenMenu(player);
                    }, 1);
        }
    }
}
