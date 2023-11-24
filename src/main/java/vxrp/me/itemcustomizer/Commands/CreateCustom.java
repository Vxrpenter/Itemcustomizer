package vxrp.me.itemcustomizer.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsAttackMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;

public class CreateCustom implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("customize.createcustom")) {
                if (args.length == 0) {
                    if (player.getItemInHand().getType() != Material.AIR) {
                        Material item = player.getItemInHand().getType();
                        ItemMeta itemmeta = player.getItemInHand().getItemMeta();

                        ItemStack itemstack = new ItemStack(item);
                        itemstack.setItemMeta(itemmeta);
                        CreateCustomMaps.item.put(player.getUniqueId(), itemstack);
                        CreateCustomMaps.itemmeta.put(player.getUniqueId(), itemmeta);
                        //ItemFlags
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
                            ItemFlagsMap.hideattributes.put(player.getUniqueId(), true);
                        }
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS)) {
                            ItemFlagsMap.hideenchants.put(player.getUniqueId(), true);
                        }
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_DYE)) {
                            ItemFlagsMap.hidedye.put(player.getUniqueId(), true);
                        }
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS)) {
                            ItemFlagsMap.hidedestroys.put(player.getUniqueId(), true);
                        }
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON)) {
                            ItemFlagsMap.hideplacedon.put(player.getUniqueId(), true);
                        }
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS)) {
                            ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), true);
                        }
                        if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
                            ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), true);
                        }
                        //Enchants: Movement
                        if (itemmeta.getEnchants().containsKey(Enchantment.DEPTH_STRIDER)) {
                            EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), true);
                            EnchantsMovementMaps.depthstriderlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DEPTH_STRIDER));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.FROST_WALKER)) {
                            EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), true);
                            EnchantsMovementMaps.frostwalkerlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.FROST_WALKER));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.RIPTIDE)) {
                            EnchantsMovementMaps.riptide.put(player.getUniqueId(), true);
                            EnchantsMovementMaps.riptidelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.RIPTIDE));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.SOUL_SPEED)) {
                            EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), true);
                            EnchantsMovementMaps.soulspeedlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.SOUL_SPEED));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.SWIFT_SNEAK)) {
                            EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), true);
                            EnchantsMovementMaps.swiftsneaklevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.SWIFT_SNEAK));
                        }
                        //Attack
                        if (itemmeta.getEnchants().containsKey(Enchantment.DAMAGE_ARTHROPODS)) {
                            EnchantsAttackMaps.baneofarthropods.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.baneofarthropodslevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DAMAGE_ARTHROPODS));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.CHANNELING)) {
                            EnchantsAttackMaps.channeling.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.channelinglevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.CHANNELING));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.FIRE_ASPECT)) {
                            EnchantsAttackMaps.fireaspect.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.fireaspectlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.FIRE_ASPECT));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_FIRE)) {
                            EnchantsAttackMaps.flame.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.flamelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_FIRE));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.IMPALING)) {
                            EnchantsAttackMaps.impaling.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.impalinglevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.IMPALING));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_INFINITE)) {
                            EnchantsAttackMaps.infinity.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.infinitylevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_INFINITE));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.KNOCKBACK)) {
                            EnchantsAttackMaps.knockback.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.knockbacklevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.KNOCKBACK));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.LOYALTY)) {
                            EnchantsAttackMaps.loyalty.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.loyaltylevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.LOYALTY));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.MULTISHOT)) {
                            EnchantsAttackMaps.multishot.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.multishotlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.MULTISHOT));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.PIERCING)) {
                            EnchantsAttackMaps.piercing.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.piercinglevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.PIERCING));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_DAMAGE)) {
                            EnchantsAttackMaps.power.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.powerlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_DAMAGE));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_KNOCKBACK)) {
                            EnchantsAttackMaps.punch.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.punchlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_KNOCKBACK));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.QUICK_CHARGE)) {
                            EnchantsAttackMaps.quickcharge.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.quickchargelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.QUICK_CHARGE));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.DAMAGE_ALL)) {
                            EnchantsAttackMaps.sharpness.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.sharpnesslevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DAMAGE_ALL));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.DAMAGE_UNDEAD)) {
                            EnchantsAttackMaps.smite.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.smitelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DAMAGE_UNDEAD));
                        }
                        if (itemmeta.getEnchants().containsKey(Enchantment.SWEEPING_EDGE)) {
                            EnchantsAttackMaps.sweepingedge.put(player.getUniqueId(), true);
                            EnchantsAttackMaps.sweepingedgelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.SWEEPING_EDGE));
                        }

                        CreateCustomMenu.OpenMenu(player);
                    }
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
