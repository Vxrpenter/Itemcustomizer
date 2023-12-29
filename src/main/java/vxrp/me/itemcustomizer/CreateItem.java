package vxrp.me.itemcustomizer;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Storage.EditingStorage;

public class CreateItem {
    public static ItemStack create(Player player) {
        EditingStorage.setStorage(player.getUniqueId());

        ItemStack output = new ItemStack(EditingStorage.getItem(player.getUniqueId()));
        ItemMeta outputMeta = EditingStorage.getItemMeta(player.getUniqueId());

        EditingStorage.setEnchantingLevel(player.getUniqueId(), 0);
        output.setItemMeta(outputMeta);
        return output;
    }
}
