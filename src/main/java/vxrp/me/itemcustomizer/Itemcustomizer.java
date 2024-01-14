package vxrp.me.itemcustomizer;

import fr.minuskube.inv.InventoryManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import vxrp.me.itemcustomizer.commands.EditCommand;
import vxrp.me.itemcustomizer.commands.ItemCustomizerCommand;
import vxrp.me.itemcustomizer.tabcompletion.ItemCustomizerTabComleter;
import vxrp.me.itemcustomizer.util.version.UpdateChecker;

public final class Itemcustomizer extends JavaPlugin implements Listener {
    private static InventoryManager invManager;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
        checkForUpdates();
        Itemcustomizer.invManager = new InventoryManager(this);
        invManager.init();
        config();
        commands();
        tabCompletion();
    }
    public static InventoryManager getInvManager() {
        return invManager;
    }
    public void commands() {
        getCommand("itemcustomizer").setExecutor(new ItemCustomizerCommand(this));
        getCommand("edit").setExecutor(new EditCommand(this));
    }
    public void tabCompletion() {
        getCommand("itemcustomizer").setTabCompleter(new ItemCustomizerTabComleter());
    }
    public void config() {
        saveDefaultConfig();
    }

    public void checkForUpdates() {
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        new UpdateChecker(this, 113885).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                console.sendMessage("[ItemCustomizer] " + ChatColor.GREEN + "You are running the latest version of ItemCustomizer");
            } else {
                console.sendMessage("[ItemCustomizer] " + ChatColor.RED + "There's an update for ItemCustomizer, get the latest version on Modrinth:");
                console.sendMessage("[ItemCustomizer] " + ChatColor.BLUE + "--> https://modrinth.com/plugin/itemcustomizer/version/" + version);
            }
        });
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (!this.getConfig().getBoolean("notify_when_outdated")) return;
        new UpdateChecker(this, 113885).getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) return;
            Player player = e.getPlayer();
            if (!player.hasPermission("customize.update")) return;
            player.sendMessage(ChatColor.RED + "There's an update for ItemCustomizer, get the latest version on Modrinth:");
            player.sendMessage(ChatColor.BLUE + "--> https://modrinth.com/plugin/itemcustomizer/version/" + version);
        });

    }
}