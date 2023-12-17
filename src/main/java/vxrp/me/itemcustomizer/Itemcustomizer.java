package vxrp.me.itemcustomizer;

import org.bukkit.plugin.java.JavaPlugin;
import vxrp.me.itemcustomizer.Chat.AttributeModifier.AddNumber;
import vxrp.me.itemcustomizer.Chat.Effects.SetAmplifier;
import vxrp.me.itemcustomizer.Chat.Effects.SetTime;
import vxrp.me.itemcustomizer.Chat.SetDisplayName;
import vxrp.me.itemcustomizer.Chat.SetLevel;
import vxrp.me.itemcustomizer.ClickEvents.AttributeModifier.AttributeModifierClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.AttributeModifier.AttributePickClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.AttributeModifier.EquipmentSlotClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Color.ColorClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.ConfirmClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.EditClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Effects.EffectsColorClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Effects.EffectsPickClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Effects.EffectsTypeOneTwo.EffectsTypeOneClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Effects.EffectsTypeOneTwo.EffectsTypeTwoClickEvent;
import vxrp.me.itemcustomizer.ClickEvents.Enchats.*;
import vxrp.me.itemcustomizer.ClickEvents.Enchats.Groups.*;
import vxrp.me.itemcustomizer.ClickEvents.ItemFlags.ItemFlagClickEvent;
import vxrp.me.itemcustomizer.Commands.Edit;
import vxrp.me.itemcustomizer.Commands.ItemCustomizer;
import vxrp.me.itemcustomizer.Menus.*;

public final class Itemcustomizer extends JavaPlugin {
    public static String pluginNameVersion = "Itemcustomizer-0.2.4";

    @Override
    public void onEnable() {
        Config();
        Commands();
        Listeners();
    }
    public void Commands() {
        getCommand("itemcustomizer").setExecutor(new ItemCustomizer());
        getCommand("edit").setExecutor(new Edit());
    }
    public void Config() {
        saveDefaultConfig();
    }
    public void Listeners() {
        getServer().getPluginManager().registerEvents(new EditClickEvent(this), this);
        getServer().getPluginManager().registerEvents(new ItemcustomizerMenu(), this);
        getServer().getPluginManager().registerEvents(new ConfirmClickEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemFlagClickEvent(), this);
        getServer().getPluginManager().registerEvents(new SetDisplayName(this), this);
        getServer().getPluginManager().registerEvents(new EnchatsGroupClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchantsMovementClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchatsAttackClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchatsPickClickEvent(), this);
        getServer().getPluginManager().registerEvents(new SetLevelClickEvent(), this);
        getServer().getPluginManager().registerEvents(new SetLevel(this), this);
        getServer().getPluginManager().registerEvents(new EnchantsProtectionClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchantsCurseClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchantsMiningClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchantsFarmingClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EnchantsGeneralClickEvent(), this);
        getServer().getPluginManager().registerEvents(new AttributeModifierClickEvent(), this);
        getServer().getPluginManager().registerEvents(new AttributePickClickEvent(), this);
        getServer().getPluginManager().registerEvents(new AddNumber(this), this);
        getServer().getPluginManager().registerEvents(new EquipmentSlotClickEvent(), this);
        getServer().getPluginManager().registerEvents(new ColorClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EffectsPickClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EffectsTypeOneClickEvent(), this);
        getServer().getPluginManager().registerEvents(new EffectsTypeTwoClickEvent(), this);
        getServer().getPluginManager().registerEvents(new SetTime(this), this);
        getServer().getPluginManager().registerEvents(new SetAmplifier(this), this);
        getServer().getPluginManager().registerEvents(new EffectsColorClickEvent(), this);
    }
}
