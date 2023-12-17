package vxrp.me.itemcustomizer.Chat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsPickMenu;


public class SetLevel implements Listener {
    private final Itemcustomizer plugin;
    public SetLevel(Itemcustomizer plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        PutIfAbsent.PutIfAbsent(player);
        String message = event.getMessage();

        if (SetLevelMaps.running.get(player.getUniqueId())) {
            SetLevelMaps.running.put(player.getUniqueId(), false);

            EnchantsPickMaps.level.put(player.getUniqueId(), Integer.valueOf(message));

            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> {
                EnchantsPickMenu.OpenMenu(player);
            }, 1);
        }
    }
}
