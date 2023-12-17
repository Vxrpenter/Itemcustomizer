package vxrp.me.itemcustomizer.Menus.AttributeModifier;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Menus.Items.GeneralUse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AttributeModifierMenu {
    public static String menuname = "&bAttributeModifiers";
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 4*9, ChatColor.translateAlternateColorCodes('&', menuname));
        List<Attribute> attributeList = AttributeModifierMaps.attributeList.get(player.getUniqueId());

        ItemStack armor = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta armorMeta = armor.getItemMeta();
        armorMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_ARMOR)) {
            armorMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        armorMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bArmor"));
        List<String> armorLore = new ArrayList<>();
        armorLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the armor bonus of an Entity"));
        armorMeta.setLore(armorLore);
        armor.setItemMeta(armorMeta);

        ItemStack armorToughness = new ItemStack(Material.NETHERITE_INGOT);
        ItemMeta armorToughnessMeta = armorToughness.getItemMeta();
        armorToughnessMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_ARMOR_TOUGHNESS)) {
            armorToughnessMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        armorToughnessMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bArmor Toughness"));
        List<String> armorToughnessLore = new ArrayList<>();
        armorToughnessLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the armor durability bonus of an Entity"));
        armorToughnessMeta.setLore(armorToughnessLore);
        armorToughness.setItemMeta(armorToughnessMeta);

        ItemStack attackDamage = new ItemStack(Material.IRON_SWORD);
        ItemMeta attackDamageMeta = attackDamage.getItemMeta();
        attackDamageMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_ATTACK_DAMAGE)) {
            attackDamageMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        attackDamageMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAttack Damage"));
        List<String> attackDamageLore = new ArrayList<>();
        attackDamageLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the attack damage of an Entity"));
        attackDamageMeta.setLore(attackDamageLore);
        attackDamage.setItemMeta(attackDamageMeta);

        ItemStack attackKnockback = new ItemStack(Material.STICK);
        ItemMeta attackKnockbackMeta = attackKnockback.getItemMeta();
        attackKnockbackMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_ATTACK_KNOCKBACK)) {
            attackKnockbackMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        attackKnockbackMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bKnockback"));
        List<String> attackKnockbackLore = new ArrayList<>();
        attackKnockbackLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the knockback of an Entity"));
        attackKnockbackMeta.setLore(attackKnockbackLore);
        attackKnockback.setItemMeta(attackKnockbackMeta);

        ItemStack attackSpeed = new ItemStack(Material.SUGAR);
        ItemMeta attackSpeedMeta = attackSpeed.getItemMeta();
        attackSpeedMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_ATTACK_SPEED)) {
            attackSpeedMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        attackSpeedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAttack Speed"));
        List<String> attackSpeedLore = new ArrayList<>();
        attackSpeedLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the attack speed of an Entity"));
        attackSpeedMeta.setLore(attackSpeedLore);
        attackSpeed.setItemMeta(attackSpeedMeta);

        ItemStack flyingSpeed = new ItemStack(Material.FEATHER);
        ItemMeta flyingSpeedMeta = flyingSpeed.getItemMeta();
        flyingSpeedMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_FLYING_SPEED)) {
            flyingSpeedMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        flyingSpeedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFlying Speed"));
        List<String> flyingSpeedLore = new ArrayList<>();
        flyingSpeedLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the flying speed of an Entity"));
        flyingSpeedMeta.setLore(flyingSpeedLore);
        flyingSpeed.setItemMeta(flyingSpeedMeta);

        ItemStack knockbackResistance = new ItemStack(Material.SHIELD);
        ItemMeta knockbackResistanceMeta = knockbackResistance.getItemMeta();
        knockbackResistanceMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_KNOCKBACK_RESISTANCE)) {
            knockbackResistanceMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        knockbackResistanceMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bKnockback Resistance"));
        List<String> knockbackResistanceLore = new ArrayList<>();
        knockbackResistanceLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the resistance of an Entity to knockback"));
        knockbackResistanceMeta.setLore(knockbackResistanceLore);
        knockbackResistance.setItemMeta(knockbackResistanceMeta);

        ItemStack luck = new ItemStack(Material.EMERALD);
        ItemMeta luckMeta = luck.getItemMeta();
        luckMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_LUCK)) {
            luckMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        luckMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLuck"));
        List<String> luckLore = new ArrayList<>();
        luckLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the luck bonus of an Entity"));
        luckMeta.setLore(luckLore);
        luck.setItemMeta(luckMeta);

        ItemStack maxHealth = new ItemStack(Material.COOKED_BEEF);
        ItemMeta maxHealthMeta = maxHealth.getItemMeta();
        maxHealthMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_MAX_HEALTH)) {
            maxHealthMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        maxHealthMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMax Health"));
        List<String> maxHealthLore = new ArrayList<>();
        maxHealthLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the maximum health of an Entity"));
        maxHealthMeta.setLore(maxHealthLore);
        maxHealth.setItemMeta(maxHealthMeta);

        ItemStack movementSpeed = new ItemStack(Material.IRON_BOOTS);
        ItemMeta movementSpeedMeta = movementSpeed.getItemMeta();
        movementSpeedMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        if (attributeList.contains(Attribute.GENERIC_MOVEMENT_SPEED)) {
            movementSpeedMeta.addEnchant(Enchantment.LUCK, 1, false);
        }
        movementSpeedMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMovement Speed"));
        List<String> movementSpeedLore = new ArrayList<>();
        movementSpeedLore.add(ChatColor.translateAlternateColorCodes('&', "&7Set's the movement speed of an Entity"));
        movementSpeedMeta.setLore(movementSpeedLore);
        movementSpeed.setItemMeta(movementSpeedMeta);

        gui.setItem(35, GeneralUse.Back());
        gui.setItem(10, armor);
        gui.setItem(11, armorToughness);
        gui.setItem(12, attackDamage);
        gui.setItem(13, attackKnockback);
        gui.setItem(14, attackSpeed);
        gui.setItem(15, flyingSpeed);
        gui.setItem(16, knockbackResistance);
        gui.setItem(22, luck);
        gui.setItem(21, maxHealth);
        gui.setItem(23, movementSpeed);
        player.openInventory(gui);
    }
}