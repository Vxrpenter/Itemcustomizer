package me.vxrp.itemcustomizer;

import fr.minuskube.inv.InventoryManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.commands.EditCommand;
import me.vxrp.itemcustomizer.commands.ForceEditCommand;
import me.vxrp.itemcustomizer.commands.ItemCustomizerCommand;
import me.vxrp.itemcustomizer.tabcompletion.ItemCustomizerTabComleter;
import me.vxrp.itemcustomizer.util.version.UpdateChecker;

public final class Itemcustomizer extends JavaPlugin implements Listener {
    private static InventoryManager invManager;
    @Override
    public void onEnable() {
        listeners();
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
        getCommand("forceedit").setExecutor(new ForceEditCommand(this));
    }
    public void tabCompletion() {
        getCommand("itemcustomizer").setTabCompleter(new ItemCustomizerTabComleter());
    }
    public void config() {
        saveDefaultConfig();
    }
    public void listeners() {
        getServer().getPluginManager().registerEvents(this,this);
    }

    public void checkForUpdates() {
        ConsoleCommandSender console = Bukkit.getConsoleSender();

        new UpdateChecker(this, "Itemcustomizer", "Beta").getLatestVersion(version -> {
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
        EditingStorage.setStorage(e.getPlayer().getUniqueId());

        if (!this.getConfig().getBoolean("notify_when_outdated")) return;
        new UpdateChecker(this, "Itemcustomizer", "Beta").getLatestVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) return;
            Player player = e.getPlayer();
            if (!player.hasPermission("customize.update")) return;
            player.sendMessage(ChatColor.RED + "There's an update for ItemCustomizer, get the latest version on Modrinth:");
            player.sendMessage(ChatColor.BLUE + "--> https://modrinth.com/plugin/itemcustomizer/version/" + version);
        });

    }
}