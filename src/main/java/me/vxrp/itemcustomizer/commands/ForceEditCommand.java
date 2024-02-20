package me.vxrp.itemcustomizer.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.Storage.EditingStorage;
import me.vxrp.itemcustomizer.Storage.ResetStorage;
import me.vxrp.itemcustomizer.menus.EditMenu;

import java.util.Objects;

public class ForceEditCommand implements CommandExecutor {
    private final Itemcustomizer plugin;
    public ForceEditCommand(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            EditingStorage.setStorage(player.getUniqueId());
            if (args.length != 0) return false;
            if (!Objects.requireNonNull(plugin.getConfig().getString("blocked_items")).contains(player.getInventory().getItemInMainHand().getType().toString())) {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.RED + "You can only forceedit items that are blocked");
                return false;
            }

            if (player.getInventory().getItemInMainHand().getType() != Material.AIR) {
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
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                player.sendMessage(ChatColor.RED + "You need to hold an item in your hand while using this command");
            }
        }
        return false;
    }
}
