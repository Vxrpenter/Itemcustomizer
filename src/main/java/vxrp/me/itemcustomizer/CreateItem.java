package vxrp.me.itemcustomizer;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsAttackMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;

public class CreateItem {
    public static ItemStack Create(Player player) {
        PutIfAbsent.PutIfAbsent(player);

        ItemStack output = new ItemStack(CreateCustomMaps.item.get(player.getUniqueId()));
        ItemMeta outputmeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());
        if (ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        } else if (!ItemFlagsMap.hideattributes.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        }

        if (ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }else if (!ItemFlagsMap.hideenchants.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        if (ItemFlagsMap.hidedye.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_DYE);
        }else if (!ItemFlagsMap.hidedye.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_DYE);
        }
        if (ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        }else if (!ItemFlagsMap.hidedestroys.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_DESTROYS);
        }
        if (ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
        }else if (!ItemFlagsMap.hideplacedon.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_PLACED_ON);
        }
        if (ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        }else if (!ItemFlagsMap.hidepotioneffects.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        }
        if (ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
            outputmeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        }else if (!ItemFlagsMap.hideunbreakable.get(player.getUniqueId())) {
            outputmeta.removeItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        }
        //Enchants: Movement
        if (EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DEPTH_STRIDER, EnchantsMovementMaps.depthstriderlevel.get(player.getUniqueId()), EnchantsMovementMaps.depthstriderlevel.get(player.getUniqueId()) > 3);
        } else if (!EnchantsMovementMaps.depthstrider.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.DEPTH_STRIDER);
        }
        if (EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.FROST_WALKER, EnchantsMovementMaps.frostwalkerlevel.get(player.getUniqueId()), EnchantsMovementMaps.frostwalkerlevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.frostwalker.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.FROST_WALKER);
        }
        if (EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.RIPTIDE, EnchantsMovementMaps.riptidelevel.get(player.getUniqueId()), EnchantsMovementMaps.riptidelevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.riptide.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.RIPTIDE);
        }
        if (EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.SOUL_SPEED, EnchantsMovementMaps.soulspeedlevel.get(player.getUniqueId()), EnchantsMovementMaps.soulspeedlevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.soulspeed.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.SOUL_SPEED);
        }
        if (EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.SWIFT_SNEAK, EnchantsMovementMaps.swiftsneaklevel.get(player.getUniqueId()), EnchantsMovementMaps.swiftsneaklevel.get(player.getUniqueId()) > 3);
        }else if (!EnchantsMovementMaps.swiftsneak.get(player.getUniqueId())) {
            outputmeta.removeEnchant(Enchantment.SWIFT_SNEAK);
        }
        //Attack
        if (EnchantsAttackMaps.baneofarthropods.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, EnchantsAttackMaps.baneofarthropodslevel.get(player.getUniqueId()), EnchantsAttackMaps.baneofarthropodslevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.channeling.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.CHANNELING, EnchantsAttackMaps.channelinglevel.get(player.getUniqueId()), EnchantsAttackMaps.channelinglevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.fireaspect.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.FIRE_ASPECT, EnchantsAttackMaps.fireaspectlevel.get(player.getUniqueId()), EnchantsAttackMaps.fireaspectlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.flame.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_INFINITE, EnchantsAttackMaps.flamelevel.get(player.getUniqueId()), EnchantsAttackMaps.flamelevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.impaling.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.IMPALING, EnchantsAttackMaps.impalinglevel.get(player.getUniqueId()), EnchantsAttackMaps.impalinglevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.infinity.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_INFINITE, EnchantsAttackMaps.infinitylevel.get(player.getUniqueId()), EnchantsAttackMaps.infinitylevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.knockback.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.KNOCKBACK, EnchantsAttackMaps.knockbacklevel.get(player.getUniqueId()), EnchantsAttackMaps.knockbacklevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.loyalty.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.LOYALTY, EnchantsAttackMaps.loyaltylevel.get(player.getUniqueId()), EnchantsAttackMaps.loyaltylevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.multishot.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.MULTISHOT,EnchantsAttackMaps.multishotlevel.get(player.getUniqueId()), EnchantsAttackMaps.multishotlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.piercing.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.PIERCING, EnchantsAttackMaps.piercinglevel.get(player.getUniqueId()), EnchantsAttackMaps.piercinglevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.power.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_DAMAGE, EnchantsAttackMaps.powerlevel.get(player.getUniqueId()), EnchantsAttackMaps.powerlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.punch.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.ARROW_KNOCKBACK, EnchantsAttackMaps.punchlevel.get(player.getUniqueId()), EnchantsAttackMaps.punchlevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.quickcharge.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.QUICK_CHARGE, EnchantsAttackMaps.quickchargelevel.get(player.getUniqueId()), EnchantsAttackMaps.quickchargelevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.sharpness.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DAMAGE_ALL, EnchantsAttackMaps.sharpnesslevel.get(player.getUniqueId()), EnchantsAttackMaps.sharpnesslevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.smite.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.DAMAGE_UNDEAD, EnchantsAttackMaps.smitelevel.get(player.getUniqueId()), EnchantsAttackMaps.smitelevel.get(player.getUniqueId()) > 3);
        }
        if (EnchantsAttackMaps.sweepingedge.get(player.getUniqueId())) {
            outputmeta.addEnchant(Enchantment.SWEEPING_EDGE, EnchantsAttackMaps.sweepingedgelevel.get(player.getUniqueId()), EnchantsAttackMaps.sweepingedgelevel.get(player.getUniqueId()) > 3);
        }


        EnchantsPickMaps.level.put(player.getUniqueId(), 0);

        if (SetDisplayNameMaps.displayname.get(player.getUniqueId()) != null) {
            outputmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', SetDisplayNameMaps.displayname.get(player.getUniqueId())));
        }
        output.setItemMeta(outputmeta);
        return output;
    }
}
