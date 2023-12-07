package vxrp.me.itemcustomizer.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Reset;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

public class CreateCustom implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.hasPermission("customize.createcustom")) return false;
            if (args.length != 0) return false;
            if (player.getItemInHand().getType() == Material.AIR) return false;
            ItemStack itemstack = new ItemStack(player.getItemInHand().getType());
            ItemMeta itemmeta = itemstack.getItemMeta();
            //get item
            itemstack.setItemMeta(itemmeta);
            if (CreateCustomMaps.item.get(player.getUniqueId()) != null) {
                if (CreateCustomMaps.item.get(player.getUniqueId()).getType() != player.getItemInHand().getType()) {
                    Reset.reset(player);
                    CreateCustomMaps.item.put(player.getUniqueId(), itemstack);
                    CreateCustomMaps.itemmeta.put(player.getUniqueId(), itemmeta);
                }
            } else {
                CreateCustomMaps.item.put(player.getUniqueId(), itemstack);
                CreateCustomMaps.itemmeta.put(player.getUniqueId(), itemmeta);
            }
            CreateCustomMenu.OpenMenu(player);
            }
        return false;
    }
}
