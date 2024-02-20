package me.vxrp.itemcustomizer.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.menus.itemcustomizer.ItemCustomizerMenu;

public class ItemCustomizerCommand implements CommandExecutor {
    private final Itemcustomizer plugin;
    public ItemCustomizerCommand(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        String onlyPlayers = "This Command can only be executed by Players";

        if (args.length == 0) {
            if (sender instanceof Player) {
                ItemCustomizerMenu.openMenu((Player) sender, plugin);
            } else {
                sender.sendMessage(ChatColor.RED+ onlyPlayers);
            }
        } else if (args.length == 1) {
            if (args[0].equals("help".toLowerCase())) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7=============== &b&lItemCustomizer &7| &b&lHelp&7 ==============="));
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&nCommands"));
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7- &b/Edit | &7Use while holding an item in your hand"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7- &b/Itemcustomizer | &7Usage: /itemcustomizer|customizer [help|menu|reloadconfig|tempblock]"));
                sender.sendMessage(" ");
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7===================================================="));
            }
            if (args[0].equals("menu".toLowerCase())) {
                if (sender instanceof Player) {
                    ItemCustomizerMenu.openMenu((Player) sender, plugin);
                } else {
                    sender.sendMessage(ChatColor.RED+ onlyPlayers);
                }
            }
            if (sender.hasPermission("customize.admin")) {
                if (args[0].equals("reloadconfig".toLowerCase())) {
                    plugin.reloadConfig();
                    sender.sendMessage(ChatColor.GRAY + "Config.yml reloaded successfully");

                }
            }
            else if (!args[0].equals("help".toLowerCase())){
                sender.sendMessage(ChatColor.GRAY + "Usage: /itemcustomizer|customizer [help|menu|reloadconfig|tempblock]");
            }
        }
        return false;
    }
}
