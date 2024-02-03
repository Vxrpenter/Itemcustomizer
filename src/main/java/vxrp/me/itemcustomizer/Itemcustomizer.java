package vxrp.me.itemcustomizer;

import fr.minuskube.inv.InventoryManager;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import vxrp.me.itemcustomizer.commands.EditCommand;
import vxrp.me.itemcustomizer.commands.ForceEditCommand;
import vxrp.me.itemcustomizer.commands.ItemCustomizerCommand;
import vxrp.me.itemcustomizer.tabcompletion.ItemCustomizerTabComleter;

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





}