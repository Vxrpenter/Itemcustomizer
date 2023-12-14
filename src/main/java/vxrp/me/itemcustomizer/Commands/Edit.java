package vxrp.me.itemcustomizer.Commands;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
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
            if (player.getInventory().getItemInMainHand().getType() == Material.AIR) return false;
            ItemStack itemstack = new ItemStack(player.getInventory().getItemInMainHand().getType());
            ItemMeta itemmeta = itemstack.getItemMeta();
            itemmeta.removeAttributeModifier(Attribute.GENERIC_ARMOR);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_KNOCKBACK);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_FLYING_SPEED);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_FOLLOW_RANGE);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_LUCK);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_MAX_HEALTH);
            itemmeta.removeAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED);
            //get item
            itemstack.setItemMeta(itemmeta);
            if (EditMaps.item.get(player.getUniqueId()) != null) {
                if (EditMaps.item.get(player.getUniqueId()).getType() != player.getInventory().getItemInMainHand().getType()) {
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
