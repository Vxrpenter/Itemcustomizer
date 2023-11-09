package vxrp.me.itemcustomizer.Hashmaps.Create;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CreateCustomMaps {
    public static Map<UUID, ItemStack> item = new HashMap<>();
    public static Map<UUID, ItemMeta> itemmeta = new HashMap<>();
    public static Map<UUID, Boolean> finished = new HashMap<>();
}
