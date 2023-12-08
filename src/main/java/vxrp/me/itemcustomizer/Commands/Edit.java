package vxrp.me.itemcustomizer.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Reset;
import vxrp.me.itemcustomizer.Menus.EditMenu;

public class Edit implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.hasPermission("customize.edit")) return false;
            if (args.length != 0) return false;
            if (player.getItemInHand().getType() == Material.AIR) return false;
            ItemStack itemstack = new ItemStack(player.getItemInHand().getType());
            ItemMeta itemmeta = itemstack.getItemMeta();
            //get item
            itemstack.setItemMeta(itemmeta);
            if (EditMaps.item.get(player.getUniqueId()) != null) {
                if (EditMaps.item.get(player.getUniqueId()).getType() != player.getItemInHand().getType()) {
                    Reset.reset(player);
                    EditMaps.item.put(player.getUniqueId(), itemstack);
                    EditMaps.itemmeta.put(player.getUniqueId(), itemmeta);
                }
            } else {
                EditMaps.item.put(player.getUniqueId(), itemstack);
                EditMaps.itemmeta.put(player.getUniqueId(), itemmeta);
            }
            EditMenu.OpenMenu(player);
            }
        return false;
    }
}
