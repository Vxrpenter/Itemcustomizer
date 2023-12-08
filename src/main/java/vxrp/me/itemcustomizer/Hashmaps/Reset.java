package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.entity.Player;

public class Reset {
    public static void reset(Player player) {
        ConfirmMaps.confirmed.put(player.getUniqueId(), false);

        EditMaps.item.put(player.getUniqueId(), null);
        EditMaps.itemmeta.put(player.getUniqueId(), null);
    }
}
