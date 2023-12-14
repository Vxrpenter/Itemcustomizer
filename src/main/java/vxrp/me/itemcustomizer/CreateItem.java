package vxrp.me.itemcustomizer;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.tags.ItemTagType;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.PutIfAbsent;

import java.util.UUID;

public class CreateItem {
    public static ItemStack Create(Player player) {
        PutIfAbsent.PutIfAbsent(player);

        ItemStack output = new ItemStack(EditMaps.item.get(player.getUniqueId()));
        ItemMeta outputMeta = EditMaps.itemmeta.get(player.getUniqueId());

        EnchantsPickMaps.level.put(player.getUniqueId(), 0);
        output.setItemMeta(outputMeta);
        return output;
    }
}
