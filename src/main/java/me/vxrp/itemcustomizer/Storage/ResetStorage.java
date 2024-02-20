package me.vxrp.itemcustomizer.Storage;

import org.bukkit.entity.Player;

public class ResetStorage {
    public static void reset(Player player) {
        EditingStorage.setConfirmed(player.getUniqueId(), false);

        EditingStorage.setItem(player.getUniqueId(), player.getInventory().getItemInMainHand());
        EditingStorage.setItemMeta(player.getUniqueId(), player.getInventory().getItemInMainHand().getItemMeta());

        EditingStorage.setColor(player.getUniqueId(), null);
        EditingStorage.setTime(player.getUniqueId(), 0);
        EditingStorage.setAmplifier(player.getUniqueId(), 0);
        EditingStorage.setPotionMeta(player.getUniqueId(), null);
    }
}
