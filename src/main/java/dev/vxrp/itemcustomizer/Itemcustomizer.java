package dev.vxrp.itemcustomizer;

import fr.minuskube.inv.InventoryManager;
import dev.vxrp.itemcustomizer.commands.EditCommand;
import dev.vxrp.itemcustomizer.commands.ForceEditCommand;
import dev.vxrp.itemcustomizer.commands.ItemCustomizerCommand;
import dev.vxrp.itemcustomizer.tabcompletion.ItemCustomizerTabComleter;
import dev.vxrp.itemcustomizer.util.version.UpdateChecker;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

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
}