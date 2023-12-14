package vxrp.me.itemcustomizer.Hashmaps.AttributeModifier;

import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.EquipmentSlot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class AttributeModifierMaps {
    public static Map<UUID, Attribute> attribute = new HashMap<>();
    public static Map<UUID, Double> number = new HashMap<>();
    public static Map<UUID, EquipmentSlot> equipmentSlot = new HashMap<>();
    public static Map<UUID, Boolean> running = new HashMap<>();
    public static Map<UUID, List<Attribute>> attributeList = new HashMap<>();
}
