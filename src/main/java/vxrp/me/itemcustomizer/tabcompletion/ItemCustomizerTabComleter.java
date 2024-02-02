package vxrp.me.itemcustomizer.tabcompletion;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemCustomizerTabComleter implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) return null;
        List<String> list = new ArrayList<>();
        list.add("help");
        if (sender.hasPermission("customize.admin")) {
            list.add("reloadconfig");
        }
        list.add("menu");
        return list;
    }
}
