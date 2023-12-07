package vxrp.me.itemcustomizer;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;

public class CreateItem {
    public static ItemStack Create(Player player) {
        PutIfAbsent.PutIfAbsent(player);

        ItemStack output = new ItemStack(CreateCustomMaps.item.get(player.getUniqueId()));
        ItemMeta outputmeta = CreateCustomMaps.itemmeta.get(player.getUniqueId());

        EnchantsPickMaps.level.put(player.getUniqueId(), 0);
        output.setItemMeta(outputmeta);
        return output;
    }
}
