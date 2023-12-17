package vxrp.me.itemcustomizer.Chat.Effects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitScheduler;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;

public class SetAmplifier implements Listener {
    private final Itemcustomizer plugin;
    public SetAmplifier(Itemcustomizer plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (EffectsMaps.amplifierRunning.get(player.getUniqueId())) {
            PutIfAbsent.PutIfAbsent(player);
            String message = event.getMessage();
            EffectsMaps.amplifierRunning.put(player.getUniqueId(), false);

            EffectsMaps.amplifier.put(player.getUniqueId(), Integer.valueOf(message));

            event.setCancelled(true);

            BukkitScheduler scheduler = Bukkit.getScheduler();
            scheduler.runTaskLater(plugin, () -> {
                EffectsPickMenu.OpenMenu(player);
            }, 1);
        }
    }
}
