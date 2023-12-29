package vxrp.me.itemcustomizer.chat.enchants;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.menus.enchants.EnchantsPickMenu;


public class SetLevel implements Listener {
    private final Itemcustomizer plugin;
    public SetLevel(Itemcustomizer plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        EditingStorage.setStorage(player.getUniqueId());
        String message = event.getMessage();

        if (EditingStorage.getSetLevelRunning(player.getUniqueId())) {
            EditingStorage.setSetLevelRunning(player.getUniqueId(), false);

            EditingStorage.setEnchantingLevel(player.getUniqueId(), Integer.valueOf(message));

            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> EnchantsPickMenu.openMenu(player, plugin), 1);
        }
    }
}
