package vxrp.me.itemcustomizer.Hashmaps.Effects;

import org.bukkit.Color;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EffectsMaps {
    public static Map<UUID, ItemMeta> potionMetaData = new HashMap<>();
    public static Map<UUID, Integer> time = new HashMap<>();
    public static Map<UUID, Boolean> timeRunning = new HashMap<>();
    public static Map<UUID, Integer> amplifier = new HashMap<>();
    public static Map<UUID, Boolean> amplifierRunning = new HashMap<>();
    public static Map<UUID, Color> color = new HashMap<>();
    public static Map<UUID, Integer> timeIn = new HashMap<>();
}
