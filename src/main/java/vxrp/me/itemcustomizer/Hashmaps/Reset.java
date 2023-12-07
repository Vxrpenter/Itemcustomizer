package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsAttackMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;

public class Reset {
    public static void reset(Player player) {
        ConfirmMaps.confirmed.put(player.getUniqueId(), false);

        CreateCustomMaps.finished.put(player.getUniqueId(), false);
        CreateCustomMaps.item.put(player.getUniqueId(), null);
        CreateCustomMaps.itemmeta.put(player.getUniqueId(), null);

        SetDisplayNameMaps.displayname.put(player.getUniqueId(), null);

        EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), false);
        EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), false);
        EnchantsMovementMaps.riptide.put(player.getUniqueId(), false);
        EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), false);
        EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), false);
        EnchantsMovementMaps.depthstriderlevel.put(player.getUniqueId(), 0);
        EnchantsMovementMaps.frostwalkerlevel.put(player.getUniqueId(), 0);
        EnchantsMovementMaps.riptidelevel.put(player.getUniqueId(), 0);
        EnchantsMovementMaps.soulspeedlevel.put(player.getUniqueId(), 0);
        EnchantsMovementMaps.swiftsneaklevel.put(player.getUniqueId(), 0);

        EnchantsAttackMaps.baneofarthropods.put(player.getUniqueId(), false);
        EnchantsAttackMaps.channeling.put(player.getUniqueId(), false);
        EnchantsAttackMaps.fireaspect.put(player.getUniqueId(), false);
        EnchantsAttackMaps.flame.put(player.getUniqueId(), false);
        EnchantsAttackMaps.impaling.put(player.getUniqueId(), false);
        EnchantsAttackMaps.infinity.put(player.getUniqueId(), false);
        EnchantsAttackMaps.knockback.put(player.getUniqueId(), false);
        EnchantsAttackMaps.loyalty.put(player.getUniqueId(), false);
        EnchantsAttackMaps.multishot.put(player.getUniqueId(), false);
        EnchantsAttackMaps.piercing.put(player.getUniqueId(), false);
        EnchantsAttackMaps.piercing.put(player.getUniqueId(), false);
        EnchantsAttackMaps.power.put(player.getUniqueId(), false);
        EnchantsAttackMaps.punch.put(player.getUniqueId(), false);
        EnchantsAttackMaps.quickcharge.put(player.getUniqueId(), false);
        EnchantsAttackMaps.sharpness.put(player.getUniqueId(), false);
        EnchantsAttackMaps.sweepingedge.put(player.getUniqueId(), false);
        EnchantsAttackMaps.baneofarthropodslevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.channelinglevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.fireaspectlevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.flamelevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.impalinglevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.infinitylevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.knockbacklevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.loyaltylevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.multishotlevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.piercinglevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.piercinglevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.powerlevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.punchlevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.quickchargelevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.sharpnesslevel.put(player.getUniqueId(), 0);
        EnchantsAttackMaps.sweepingedgelevel.put(player.getUniqueId(), 0);
    }
}
