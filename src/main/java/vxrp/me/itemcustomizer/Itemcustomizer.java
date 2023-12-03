package vxrp.me.itemcustomizer;

import org.bukkit.plugin.java.JavaPlugin;
import vxrp.me.itemcustomizer.Chat.SetDisplayName;
import vxrp.me.itemcustomizer.ClickEvents.ConfirmClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.CreateCustomClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Enchats.*;
import vxrp.me.itemcustomizer.ClickEvents.ItemFlags.ItemFlagClickEvent;
import vxrp.me.itemcustomizer.Commands.CreateCustom;
import vxrp.me.itemcustomizer.Menus.*;

public final class Itemcustomizer extends JavaPlugin {

    @Override
    public void onEnable() {
        Commands();
        Listeners();
    }

    public void Commands() {
        getCommand("itemcustomizer").setExecutor(new vxrp.me.itemcustomizer.Commands.Itemcustomizer());
        getCommand("createcustom").setExecutor(new CreateCustom());
    }

    public void Listeners() {
        getServer().getPluginManager().registerEvents(new CreateCustomClickEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemcustomizerMenu(), this);
        getServer().getPluginManager().registerEvents(new ConfirmClickEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemFlagClickEvent(), this);
        getServer().getPluginManager().registerEvents(new SetDisplayName(this), this);
        getServer().getPluginManager().registerEvents(new EnchatsGroupClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchantsMovementClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchatsAttackClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchatsPickClickEvent(), this);
        getServer().getPluginManager().registerEvents(new SetLevelClickEvent(), this);
    }
}
