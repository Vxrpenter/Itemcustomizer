package vxrp.me.itemcustomizer.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

public class CreateCustom implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("customize.createcustom")) {
                if (args.length == 0) {
                    CreateCustomMenu.OpenMenu(player);
                } else {
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Usage: &b/createcustom &7{&cNONE&7}"));
                }
            }
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThis Command can only be executed by Players"));
        }
        return false;
    }
}
