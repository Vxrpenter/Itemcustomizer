package vxrp.me.itemcustomizer;

import org.bukkit.plugin.java.JavaPlugin;
import vxrp.me.itemcustomizer.Chat.SetDisplayName;
import vxrp.me.itemcustomizer.Chat.SetLevel;
import vxrp.me.itemcustomizer.Commands.CreateCustom;
import vxrp.me.itemcustomizer.Menus.*;
import vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants.EnchantsAttackMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants.EnchantsPickMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants.EnchatsMovementMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.ItemFlags.ItemFlagMenu;
import vxrp.me.itemcustomizer.Menus.UnderMenus.ItemSelection.ItemSelectMenu;

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
        getServer().getPluginManager().registerEvents(new CreateCustomMenu(), this);
        getServer().getPluginManager().registerEvents(new ItemcustomizerMenu(), this);
        getServer().getPluginManager().registerEvents(new ItemSelectMenu(), this);
        getServer().getPluginManager().registerEvents(new ConfirmMenu(), this);
        getServer().getPluginManager().registerEvents(new ItemFlagMenu(), this);
        getServer().getPluginManager().registerEvents(new SetDisplayName(this), this);
        getServer().getPluginManager().registerEvents(new EnchantsGroupMenu(), this);
        getServer().getPluginManager().registerEvents(new EnchatsMovementMenu(), this);
        getServer().getPluginManager().registerEvents(new EnchantsAttackMenu(), this);
        getServer().getPluginManager().registerEvents(new EnchantsPickMenu(), this);
        getServer().getPluginManager().registerEvents(new SetLevel(this), this);
    }
}
