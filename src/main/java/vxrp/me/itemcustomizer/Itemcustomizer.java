package vxrp.me.itemcustomizer;

import fr.minuskube.inv.InventoryManager;
import org.bukkit.plugin.java.JavaPlugin;
import vxrp.me.itemcustomizer.chat.SetDisplayName;
import vxrp.me.itemcustomizer.chat.attributemodifier.AddNumber;
import vxrp.me.itemcustomizer.chat.effects.SetAmplifier;
import vxrp.me.itemcustomizer.chat.effects.SetTime;
import vxrp.me.itemcustomizer.chat.enchants.SetLevel;
import vxrp.me.itemcustomizer.commands.EditCommand;
import vxrp.me.itemcustomizer.commands.ItemCustomizerCommand;
import vxrp.me.itemcustomizer.tabcompletion.ItemCustomizerTabComleter;

public final class Itemcustomizer extends JavaPlugin {
    private static InventoryManager invManager;
    @Override
    public void onEnable() {
        Itemcustomizer.invManager = new InventoryManager(this);
        invManager.init();

        Config();
        Commands();
        TabCompletion();
        Listeners();
    }
    public static InventoryManager getInvManager() {
        return invManager;
    }

    public void Commands() {
        getCommand("itemcustomizer").setExecutor(new ItemCustomizerCommand(this));
        getCommand("edit").setExecutor(new EditCommand(this));
    }
    public void TabCompletion() {
        getCommand("itemcustomizer").setTabCompleter(new ItemCustomizerTabComleter());
    }
    public void Config() {
        saveDefaultConfig();
    }
    public void Listeners() {
        getServer().getPluginManager().registerEvents(new SetDisplayName(this), this);
        getServer().getPluginManager().registerEvents(new SetLevel(this), this);
        getServer().getPluginManager().registerEvents(new AddNumber(this), this);
        getServer().getPluginManager().registerEvents(new SetTime(this), this);
        getServer().getPluginManager().registerEvents(new SetAmplifier(this), this);
    }
}
