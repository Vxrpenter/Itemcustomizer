package vxrp.me.itemcustomizer.commands;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.ResetStorage;
import vxrp.me.itemcustomizer.menus.EditMenu;

public class EditCommand implements CommandExecutor {
    private final Itemcustomizer plugin;
    public EditCommand(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
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
            if (EditingStorage.getItem(player.getUniqueId()) != null) {
                if (EditingStorage.getItem(player.getUniqueId()).getType() != player.getInventory().getItemInMainHand().getType()) {
                    ResetStorage.reset(player);
                    EditingStorage.setItem(player.getUniqueId(), itemstack);
                    EditingStorage.setItemMeta(player.getUniqueId(), itemmeta);
                    EditingStorage.getItemMeta(player.getUniqueId());
                }
            } else {
                EditingStorage.setItem(player.getUniqueId(), itemstack);
                EditingStorage.setItemMeta(player.getUniqueId(), itemmeta);
            }
            EditMenu.openMenu(player, plugin);
            }
        return false;
    }
}
