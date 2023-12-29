package vxrp.me.itemcustomizer.chat;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.menus.EditMenu;

public class SetDisplayName implements Listener {
    private final Itemcustomizer plugin;
    public SetDisplayName(Itemcustomizer core) {
        this.plugin = core;
    }
    @EventHandler
    public void onMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        ItemMeta itemMeta = EditingStorage.getItemMeta(player.getUniqueId());
        EditingStorage.setStorage(player.getUniqueId());
        String message = event.getMessage();

        if (EditingStorage.getDisplayNameRunning(player.getUniqueId())) {
            EditingStorage.setDisplayNameRunning(player.getUniqueId(), false);
            itemMeta.displayName(Component.text(ChatColor.translateAlternateColorCodes('&', message)));
            EditingStorage.setItemMeta(player.getUniqueId(), itemMeta);
            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> EditMenu.openMenu(player, plugin), 1);
        }
    }
}
