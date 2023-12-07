package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;

public class PutIfAbsent {

    public static void PutIfAbsent(Player player) {
        EnchantsPickMaps.level.putIfAbsent(player.getUniqueId(), 0);
        SetLevelMaps.running.putIfAbsent(player.getUniqueId(), false);
        SetDisplayNameMaps.running.putIfAbsent(player.getUniqueId(), false);
    }
}
