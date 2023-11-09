package vxrp.me.itemcustomizer.Hashmaps.ItemFlags;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.bukkit.inventory.ItemFlag;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ItemFlagsMap {

    public static Map<UUID, Boolean> hideattributes = new HashMap<>();
    public static Map<UUID, Boolean> hideenchants = new HashMap<>();
    public static Map<UUID, Boolean> hidedye = new HashMap<>();
    public static Map<UUID, Boolean> hidedestroys = new HashMap<>();
    public static Map<UUID, Boolean> hideplacedon = new HashMap<>();
    public static Map<UUID, Boolean> hidepotioneffects = new HashMap<>();
    public static Map<UUID, Boolean> hideunbreakable = new HashMap<>();
}
