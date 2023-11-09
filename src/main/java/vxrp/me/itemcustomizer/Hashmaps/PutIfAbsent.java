package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsAttackMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;

public class PutIfAbsent {

    public static void PutIfAbsent(Player player) {
        ItemFlagsMap.hideattributes.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hideenchants.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hidedye.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hidedestroys.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hideplacedon.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hidepotioneffects.putIfAbsent(player.getUniqueId(), false);
        ItemFlagsMap.hideunbreakable.putIfAbsent(player.getUniqueId(), false);

        EnchantsAttackMaps.baneofarthropods.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.channeling.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.fireaspect.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.flame.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.impaling.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.infinity.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.knockback.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.loyalty.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.multishot.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.piercing.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.power.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.punch.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.quickcharge.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.sharpness.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.smite.putIfAbsent(player.getUniqueId(), false);
        EnchantsAttackMaps.sweepingedge.putIfAbsent(player.getUniqueId(), false);
        EnchantsMovementMaps.depthstrider.putIfAbsent(player.getUniqueId(), false);
        EnchantsMovementMaps.frostwalker.putIfAbsent(player.getUniqueId(), false);
        EnchantsMovementMaps.riptide.putIfAbsent(player.getUniqueId(), false);
        EnchantsMovementMaps.soulspeed.putIfAbsent(player.getUniqueId(), false);
        EnchantsMovementMaps.swiftsneak.putIfAbsent(player.getUniqueId(), false);

        EnchantsPickMaps.baneofarthropods.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.channeling.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.fireaspect.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.flame.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.impaling.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.infinity.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.knockback.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.loyalty.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.multishot.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.piercing.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.power.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.punch.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.quickcharge.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.sharpness.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.smite.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.sweepingedge.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.depthstrider.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.frostwalker.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.riptide.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.soulspeed.putIfAbsent(player.getUniqueId(), false);
        EnchantsPickMaps.swiftsneak.putIfAbsent(player.getUniqueId(), false);


        EnchantsMovementMaps.depthstriderlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsMovementMaps.frostwalkerlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsMovementMaps.riptidelevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsMovementMaps.soulspeedlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsMovementMaps.swiftsneaklevel.putIfAbsent(player.getUniqueId(), 0);

        EnchantsAttackMaps.baneofarthropodslevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.channelinglevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.fireaspectlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.flamelevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.impalinglevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.infinitylevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.knockbacklevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.loyaltylevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.multishotlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.piercinglevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.powerlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.punchlevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.quickchargelevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.sharpnesslevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.smitelevel.putIfAbsent(player.getUniqueId(), 0);
        EnchantsAttackMaps.sweepingedgelevel.putIfAbsent(player.getUniqueId(), 0);

        EnchantsPickMaps.level.putIfAbsent(player.getUniqueId(), 0);
        SetLevelMaps.running.putIfAbsent(player.getUniqueId(), false);
        SetDisplayNameMaps.running.putIfAbsent(player.getUniqueId(), false);
    }
}
