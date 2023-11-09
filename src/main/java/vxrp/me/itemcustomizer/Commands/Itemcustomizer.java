package vxrp.me.itemcustomizer.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Menus.ItemcustomizerMenu;


public class Itemcustomizer implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("customize.use")) {
                if (args.length == 0) {
                    ItemcustomizerMenu.OpenMenu(player);
                } else if (args.length == 1) {
                    if (args[0].equals("help".toLowerCase())) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7=============== &b&lItemCustomizer &7| &c&lHelp&7 ==============="));
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&nCommand Explanations"));
                        player.sendMessage(" ");
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7- &b/Customize | &7With this Command you can Customize the Item"));
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7   currently in your hand."));
                        player.sendMessage(" ");
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7- &b/CreateCustom | &7With this Command you can create a"));
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7   completely CustomItem"));
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7===================================================="));
                    }

                    if (args[0].equals("menu".toLowerCase())) {
                        ItemcustomizerMenu.OpenMenu(player);
                    }

                    else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Usage: &b/itemcustomizer &7| &bcustomizer &7{&bhelp&7|&bmenu&7}"));
                    }
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou are not permitted to use this Command"));
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThis Command can only be executed by Players"));
        }
        return false;
    }
}
