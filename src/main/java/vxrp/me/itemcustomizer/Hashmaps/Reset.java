package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;

public class Reset {
    public static void reset(Player player) {
        ConfirmMaps.confirmed.put(player.getUniqueId(), false);

        CreateCustomMaps.finished.put(player.getUniqueId(), false);
        CreateCustomMaps.item.put(player.getUniqueId(), null);
        CreateCustomMaps.itemmeta.put(player.getUniqueId(), null);
    }
}
