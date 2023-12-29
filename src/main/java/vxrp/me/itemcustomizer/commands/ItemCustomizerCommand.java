package vxrp.me.itemcustomizer.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.menus.itemcustomizer.ItemCustomizerMenu;
public class ItemCustomizerCommand implements CommandExecutor {
    private final Itemcustomizer plugin;
    public ItemCustomizerCommand(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("customize.use")) {
                if (args.length == 0) {
                    ItemCustomizerMenu.openMenu(player, plugin);
                } else if (args.length == 1) {
                    if (args[0].equals("help".toLowerCase())) {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7=============== &b&lItemCustomizer &7| &c&lHelp&7 ==============="));
                        player.sendMessage(" ");
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&nCommand Explanations"));
                        player.sendMessage(" ");
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7- &b/Edit | &7With this Command you can edit an item"));
                        player.sendMessage(" ");
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7===================================================="));
                    }
                    if (args[0].equals("menu".toLowerCase())) {
                        ItemCustomizerMenu.openMenu(player, plugin);
                    }
                    if (args[0].equals("reloadconfig".toLowerCase())) {
                        plugin.reloadConfig();
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Config.yml reloaded successfully"));
                    }

                    else if (!args[0].equals("help".toLowerCase())){
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Usage: &b/itemcustomizer &7| &b/customizer &7[&bhelp&7|&bmenu&7|&breloadconfig&7]"));
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
