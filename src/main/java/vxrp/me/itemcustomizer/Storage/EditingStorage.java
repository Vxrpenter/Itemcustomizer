package vxrp.me.itemcustomizer.Storage;

import org.bukkit.Color;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class EditingStorage {
    //
    //General
    //
        //Item
        private static final Map<UUID, ItemStack> item = new HashMap<>();
        public static ItemStack getItem(UUID uuid) {
            return item.get(uuid);
        }
        public static void setItem(UUID uuid, ItemStack itemStack) {
            item.put(uuid, itemStack);
        }
        //ItemMeta
        private static final Map<UUID, ItemMeta> itemMeta = new HashMap<>();
        public static ItemMeta getItemMeta(UUID uuid) {
            return itemMeta.get(uuid);
        }
        public static void setItemMeta(UUID uuid, ItemMeta meta) {
            itemMeta.put(uuid, meta);
        }
        //Confirmation
        private static final Map<UUID, Boolean> confirmed = new HashMap<>();
        public static Boolean getConfirmed(UUID uuid) {
            return confirmed.get(uuid);
        }
        public static void setConfirmed(UUID uuid, Boolean bool) {
            confirmed.put(uuid, bool);
        }
    //
    //Enchants
    //
        //EnchantingLevel
        private static final Map<UUID, Integer> enchantingLevel = new HashMap<>();
        public static Integer getEnchantingLevel(UUID uuid) {
            return enchantingLevel.get(uuid);
        }
        public static void setEnchantingLevel(UUID uuid, Integer integer) {
            enchantingLevel.put(uuid, integer);
        }
        //Enchantment
        private static final Map<UUID, Enchantment> enchantment = new HashMap<>();
        public static Enchantment getEnchantment(UUID uuid) {
            return enchantment.get(uuid);
        }
        public static void setEnchantment(UUID uuid, Enchantment enchant) {
            enchantment.put(uuid, enchant);
        }
    //
    //Effects
    //
        //PotionMeta
        private static final Map<UUID, ItemMeta> potionMeta = new HashMap<>();
        public static ItemMeta getPotionMeta(UUID uuid) {
            return potionMeta.get(uuid);
        }
        public static void setPotionMeta(UUID uuid, ItemMeta meta) {
            potionMeta.put(uuid, meta);
        }
        //EffectsTime
        private static final Map<UUID, Integer> time = new HashMap<>();
        public static Integer getTime(UUID uuid) {
            return time.get(uuid);
        }
        public static void setTime(UUID uuid, Integer integer) {
            time.put(uuid, integer);
        }
        //Amplifier
        private static final Map<UUID, Integer> amplifier = new HashMap<>();
        public static Integer getAmplifier(UUID uuid) {
            return amplifier.get(uuid);
        }
        public static void setAmplifier(UUID uuid, Integer integer) {
            amplifier.put(uuid, integer);
        }
        //Color
        private static final Map<UUID, Color> color = new HashMap<>();
        public static Color getColor(UUID uuid) {
            return color.get(uuid);
        }
        public static void setColor(UUID uuid, Color colo) {
            color.put(uuid, colo);
        }
        //TimeIn
        private static final Map<UUID, Integer> timeIn = new HashMap<>();
        public static Integer getTimeIn(UUID uuid) {
            return timeIn.get(uuid);
        }
        public static void setTimeIn(UUID uuid, Integer integer) {
            timeIn.put(uuid, integer);
        }
    //
    //AttributeModifiers
    //
        //Attribute
        private static final Map<UUID, Attribute> attribute = new HashMap<>();
        public static Attribute getAttribute(UUID uuid) {
            return attribute.get(uuid);
        }
        public static void setAttribute(UUID uuid, Attribute attribute) {
            EditingStorage.attribute.put(uuid, attribute);
        }
        //Number
        private static final Map<UUID, Double> number = new HashMap<>();
        public static Double getNumber(UUID uuid) {
            return number.get(uuid);
        }
        public static void setNumber(UUID uuid, Double aDouble) {
            number.put(uuid, aDouble);
        }
        //EquipmentSlot
        private static final Map<UUID, EquipmentSlot> equipmentSlot = new HashMap<>();
        public static EquipmentSlot getEquipmentSlot(UUID uuid) {
            return equipmentSlot.get(uuid);
        }
        public static void setEquipmentSlot(UUID uuid, EquipmentSlot equipSlot) {
            equipmentSlot.put(uuid, equipSlot);
        }
    //
    //setStorage set's values for Maps that are null to avoid
    //NullPointerExceptions
        public static void setStorage(UUID uuid) {
            confirmed.putIfAbsent(uuid, false);
            enchantingLevel.putIfAbsent(uuid, 0);
            time.putIfAbsent(uuid, 0);
            amplifier.putIfAbsent(uuid, 0);
            timeIn.putIfAbsent(uuid, 0);
            number.putIfAbsent(uuid, 0.0);
        }
}
