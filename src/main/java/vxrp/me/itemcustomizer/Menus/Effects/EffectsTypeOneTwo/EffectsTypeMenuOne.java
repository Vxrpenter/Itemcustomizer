package vxrp.me.itemcustomizer.Menus.Effects.EffectsTypeOneTwo;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Menus.Items.GeneralUse;

import java.util.ArrayList;
import java.util.List;


public class EffectsTypeMenuOne {
    public static String menuname = "&bEffects &71";
    public static void OpenMenu(Player player) {
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        Inventory gui = Bukkit.createInventory(null, 6*9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack absorption = new ItemStack(Material.POTION);
        ItemMeta absorptionMeta = absorption.getItemMeta();
        PotionMeta absorptionPotionMeta = (PotionMeta) absorptionMeta;
        absorptionPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.ABSORPTION, 0, 0), false);
        absorptionPotionMeta.setColor(Color.fromRGB(235, 199, 22));
        absorptionMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        absorptionMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bAbsorption"));
        List<String> absorptionLore = new ArrayList<>();
        absorptionLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases the maximum health of an entity with"));
        absorptionLore.add(ChatColor.translateAlternateColorCodes('&', "&7health that cannot be regenerated, but is refilled"));
        absorptionLore.add(ChatColor.translateAlternateColorCodes('&', "&7every 30 seconds"));
        absorptionMeta.setLore(absorptionLore);
        absorption.setItemMeta(absorptionMeta);

        ItemStack badOmen = new ItemStack(Material.POTION);
        ItemMeta badOmenMeta = badOmen.getItemMeta();
        PotionMeta badOmenPotionMeta = (PotionMeta) badOmenMeta;
        badOmenPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.BAD_OMEN, 0, 0), false);
        badOmenPotionMeta.setColor(Color.fromRGB(118, 118, 118));
        badOmenMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        badOmenMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBad Omen"));
        List<String> badOmenLore = new ArrayList<>();
        badOmenLore.add(ChatColor.translateAlternateColorCodes('&', "&7Triggers a raid when the player enters a village"));
        badOmenMeta.setLore(badOmenLore);
        badOmen.setItemMeta(badOmenMeta);

        ItemStack blindness = new ItemStack(Material.POTION);
        ItemMeta blindnessMeta = blindness.getItemMeta();
        PotionMeta blindnessPotionMeta = (PotionMeta) blindnessMeta;
        blindnessPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS, 0, 0), false);
        blindnessPotionMeta.setColor(Color.fromRGB(0, 0, 0));
        blindnessMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        blindnessMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBlindness"));
        List<String> blindnessLore = new ArrayList<>();
        blindnessLore.add(ChatColor.translateAlternateColorCodes('&', "&7Blinds an entity"));
        blindnessMeta.setLore(blindnessLore);
        blindness.setItemMeta(blindnessMeta);

        ItemStack conduitPower = new ItemStack(Material.POTION);
        ItemMeta conduitPowerMeta = conduitPower.getItemMeta();
        PotionMeta conduitPowerPotionMeta = (PotionMeta) conduitPowerMeta;
        conduitPowerPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, 0, 0), false);
        conduitPowerPotionMeta.setColor(Color.fromRGB(64, 194, 249));
        conduitPowerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        conduitPowerMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bConduit Power"));
        List<String> conduitPowerLore = new ArrayList<>();
        conduitPowerLore.add(ChatColor.translateAlternateColorCodes('&', "&7Effects granted by a nearby conduit. Includes"));
        conduitPowerLore.add(ChatColor.translateAlternateColorCodes('&', "&7enhanced underwater abilities"));
        conduitPowerMeta.setLore(conduitPowerLore);
        conduitPower.setItemMeta(conduitPowerMeta);

        ItemStack confusion = new ItemStack(Material.POTION);
        ItemMeta confusionMeta = confusion.getItemMeta();
        PotionMeta confusionPotionMeta = (PotionMeta) confusionMeta;
        confusionPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION, 0, 0), false);
        confusionPotionMeta.setColor(Color.fromRGB(127, 214, 66));
        confusionMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        confusionMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bConfusion"));
        List<String> confusionLore = new ArrayList<>();
        confusionLore.add(ChatColor.translateAlternateColorCodes('&', "&7Warps vision on the client"));
        confusionMeta.setLore(confusionLore);
        confusion.setItemMeta(confusionMeta);

        ItemStack damageResistance = new ItemStack(Material.POTION);
        ItemMeta damageResistanceMeta = damageResistance.getItemMeta();
        PotionMeta damageResistancePotionMeta = (PotionMeta) damageResistanceMeta;
        damageResistancePotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 0, 0), false);
        damageResistancePotionMeta.setColor(Color.fromRGB(226, 56, 56));
        damageResistanceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        damageResistanceMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bResistance"));
        List<String> damageResistanceLore = new ArrayList<>();
        damageResistanceLore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases damage dealt to an entity"));
        damageResistanceMeta.setLore(damageResistanceLore);
        damageResistance.setItemMeta(damageResistanceMeta);

        ItemStack darkness = new ItemStack(Material.POTION);
        ItemMeta darknessMeta = darkness.getItemMeta();
        PotionMeta darknessPotionMeta = (PotionMeta) darknessMeta;
        darknessPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.DARKNESS, 0, 0), false);
        darknessPotionMeta.setColor(Color.fromRGB(38, 38, 38));
        darknessMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        darknessMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDarkness"));
        List<String> darknessLore = new ArrayList<>();
        darknessLore.add(ChatColor.translateAlternateColorCodes('&', "&7Causes the player's vision to dim occasionally"));
        darknessMeta.setLore(darknessLore);
        darkness.setItemMeta(darknessMeta);

        ItemStack dolphinsGrace = new ItemStack(Material.POTION);
        ItemMeta dolphinsGraceMeta = dolphinsGrace.getItemMeta();
        PotionMeta dolphinsGracePotionMeta = (PotionMeta) dolphinsGraceMeta;
        dolphinsGracePotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 0, 0), false);
        dolphinsGracePotionMeta.setColor(Color.fromRGB(36, 210, 244));
        dolphinsGraceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        dolphinsGraceMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bDolphins Grace"));
        List<String> dolphinsGraceLore = new ArrayList<>();
        dolphinsGraceLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases underwater movement speed"));
        dolphinsGraceMeta.setLore(dolphinsGraceLore);
        dolphinsGrace.setItemMeta(dolphinsGraceMeta);

        ItemStack fastDigging = new ItemStack(Material.POTION);
        ItemMeta fastDiggingMeta = fastDigging.getItemMeta();
        PotionMeta fastDiggingPotionMeta = (PotionMeta) fastDiggingMeta;
        fastDiggingPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 0, 0), false);
        fastDiggingPotionMeta.setColor(Color.fromRGB(219, 216, 46));
        fastDiggingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        fastDiggingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHaste"));
        List<String> fastDiggingLore = new ArrayList<>();
        fastDiggingLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases dig speed"));
        fastDiggingMeta.setLore(fastDiggingLore);
        fastDigging.setItemMeta(fastDiggingMeta);

        ItemStack fireResistance = new ItemStack(Material.POTION);
        ItemMeta fireResistanceMeta = fireResistance.getItemMeta();
        PotionMeta fireResistancePotionMeta = (PotionMeta) fireResistanceMeta;
        fireResistancePotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 0, 0), false);
        fireResistancePotionMeta.setColor(Color.ORANGE);
        fireResistanceMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        fireResistanceMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bFire Resistance"));
        List<String> fireResistanceLore = new ArrayList<>();
        fireResistanceLore.add(ChatColor.translateAlternateColorCodes('&', "&7Stops fire damage"));
        fireResistanceMeta.setLore(fireResistanceLore);
        fireResistance.setItemMeta(fireResistanceMeta);

        ItemStack glowing = new ItemStack(Material.POTION);
        ItemMeta glowingMeta = glowing.getItemMeta();
        PotionMeta glowingPotionMeta = (PotionMeta) glowingMeta;
        glowingPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.GLOWING, 0, 0), false);
        glowingPotionMeta.setColor(Color.fromRGB(244, 244, 244));
        glowingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        glowingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bGlowing"));
        List<String> glowingLore = new ArrayList<>();
        glowingLore.add(ChatColor.translateAlternateColorCodes('&', "&7Outlines the entity so that it can be seen from afar"));
        glowingMeta.setLore(glowingLore);
        glowing.setItemMeta(glowingMeta);

        ItemStack harm = new ItemStack(Material.POTION);
        ItemMeta harmMeta = harm.getItemMeta();
        PotionMeta harmPotionMeta = (PotionMeta) harmMeta;
        harmPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HARM, 0, 0), false);
        harmPotionMeta.setColor(Color.fromRGB(88, 3, 158));
        harmMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        harmMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bInstant Damage"));
        List<String> harmLore = new ArrayList<>();
        harmLore.add(ChatColor.translateAlternateColorCodes('&', "&7Hurts an entity"));
        harmMeta.setLore(harmLore);
        harm.setItemMeta(harmMeta);

        ItemStack heal = new ItemStack(Material.POTION);
        ItemMeta healMeta = heal.getItemMeta();
        PotionMeta healPotionMeta = (PotionMeta) healMeta;
        healPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 0, 0), false);
        healPotionMeta.setColor(Color.RED);
        healMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        healMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bInstant Heal"));
        List<String> healLore = new ArrayList<>();
        healLore.add(ChatColor.translateAlternateColorCodes('&', "&7Heals an entity"));
        healMeta.setLore(healLore);
        heal.setItemMeta(healMeta);

        ItemStack healthBoost = new ItemStack(Material.POTION);
        ItemMeta healthBoostMeta = healthBoost.getItemMeta();
        PotionMeta healthBoostPotionMeta = (PotionMeta) healthBoostMeta;
        healthBoostPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 0, 0), false);
        healthBoostPotionMeta.setColor(Color.fromRGB(163, 17, 17));
        healthBoostMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        healthBoostMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHealth Boost"));
        List<String> healthBoostLore = new ArrayList<>();
        healthBoostLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases the maximum health of an entity"));
        healthBoostMeta.setLore(healthBoostLore);
        healthBoost.setItemMeta(healthBoostMeta);

        ItemStack heroOfTheVillage = new ItemStack(Material.POTION);
        ItemMeta heroOfTheVillageMeta = heroOfTheVillage.getItemMeta();
        PotionMeta heroOfTheVillagePotionMeta = (PotionMeta) heroOfTheVillageMeta;
        heroOfTheVillagePotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 0, 0), false);
        heroOfTheVillagePotionMeta.setColor(Color.fromRGB(24, 201, 30));
        heroOfTheVillageMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        heroOfTheVillageMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHero of the Village"));
        List<String> heroOfTheVillageLore = new ArrayList<>();
        heroOfTheVillageLore.add(ChatColor.translateAlternateColorCodes('&', "&7Reduces the cost of villager trades"));
        heroOfTheVillageMeta.setLore(heroOfTheVillageLore);
        heroOfTheVillage.setItemMeta(heroOfTheVillageMeta);

        ItemStack hunger = new ItemStack(Material.POTION);
        ItemMeta hungerMeta = hunger.getItemMeta();
        PotionMeta hungerPotionMeta = (PotionMeta) hungerMeta;
        hungerPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.HUNGER, 0, 0), false);
        hungerPotionMeta.setColor(Color.fromRGB(188, 86, 18));
        hungerMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        hungerMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bHunger"));
        List<String> hungerLore = new ArrayList<>();
        hungerLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases hunger"));
        hungerMeta.setLore(hungerLore);
        hunger.setItemMeta(hungerMeta);

        ItemStack increaseDamage = new ItemStack(Material.POTION);
        ItemMeta increaseDamageMeta = increaseDamage.getItemMeta();
        PotionMeta increaseDamagePotionMeta = (PotionMeta) increaseDamageMeta;
        increaseDamagePotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 0, 0), false);
        increaseDamagePotionMeta.setColor(Color.PURPLE);
        increaseDamageMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        increaseDamageMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bStrenght"));
        List<String> increaseDamageLore = new ArrayList<>();
        increaseDamageLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases damage dealt"));
        increaseDamageMeta.setLore(increaseDamageLore);
        increaseDamage.setItemMeta(increaseDamageMeta);

        ItemStack invisibility = new ItemStack(Material.POTION);
        ItemMeta invisibilityMeta = invisibility.getItemMeta();
        PotionMeta invisibilityPotionMeta = (PotionMeta) invisibilityMeta;
        invisibilityPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 0, 0), false);
        invisibilityPotionMeta.setColor(Color.GRAY);
        invisibilityMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        invisibilityMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bInvisibility"));
        List<String> invisibilityLore = new ArrayList<>();
        invisibilityLore.add(ChatColor.translateAlternateColorCodes('&', "&7Grants invisibility"));
        invisibilityMeta.setLore(invisibilityLore);
        invisibility.setItemMeta(invisibilityMeta);

        ItemStack jump = new ItemStack(Material.POTION);
        ItemMeta jumpMeta = jump.getItemMeta();
        PotionMeta jumpPotionMeta = (PotionMeta) jumpMeta;
        jumpPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP, 0, 0), false);
        jumpPotionMeta.setColor(Color.GREEN);
        jumpMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        jumpMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bJump Boost"));
        List<String> jumpLore = new ArrayList<>();
        jumpLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases jump height"));
        jumpMeta.setLore(jumpLore);
        jump.setItemMeta(jumpMeta);

        ItemStack levitation = new ItemStack(Material.POTION);
        ItemMeta levitationMeta = levitation.getItemMeta();
        PotionMeta levitationPotionMeta = (PotionMeta) levitationMeta;
        levitationPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.LEVITATION, 0, 0), false);
        levitationPotionMeta.setColor(Color.fromRGB(211, 182, 234));
        levitationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        levitationMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLevitation"));
        List<String> levitationLore = new ArrayList<>();
        levitationLore.add(ChatColor.translateAlternateColorCodes('&', "&7Causes the entity to float into the air"));
        levitationMeta.setLore(levitationLore);
        levitation.setItemMeta(levitationMeta);

        ItemStack luck = new ItemStack(Material.POTION);
        ItemMeta luckMeta = luck.getItemMeta();
        PotionMeta luckPotionMeta = (PotionMeta) luckMeta;
        luckPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.LUCK, 0, 0), false);
        luckPotionMeta.setColor(Color.fromRGB(64, 234, 49));
        luckMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        luckMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bLuck"));
        List<String> luckLore = new ArrayList<>();
        luckLore.add(ChatColor.translateAlternateColorCodes('&', "&7Loot table luck"));
        luckMeta.setLore(luckLore);
        luck.setItemMeta(luckMeta);

        ItemStack nightVision = new ItemStack(Material.POTION);
        ItemMeta nightVisionMeta = nightVision.getItemMeta();
        PotionMeta nightVisionPotionMeta = (PotionMeta) nightVisionMeta;
        nightVisionPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 0, 0), false);
        nightVisionPotionMeta.setColor(Color.BLUE);
        nightVisionMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        nightVisionMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bNight Vision"));
        List<String> nightVisionLore = new ArrayList<>();
        nightVisionLore.add(ChatColor.translateAlternateColorCodes('&', "&7Allows an entity to see in the dark"));
        nightVisionMeta.setLore(nightVisionLore);
        nightVision.setItemMeta(nightVisionMeta);

        ItemStack poison = new ItemStack(Material.POTION);
        ItemMeta poisonMeta = poison.getItemMeta();
        PotionMeta poisonPotionMeta = (PotionMeta) poisonMeta;
        poisonPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 0, 0), false);
        poisonPotionMeta.setColor(Color.fromRGB(95, 175, 33));
        poisonMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        poisonMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bPoison"));
        List<String> poisonLore = new ArrayList<>();
        poisonLore.add(ChatColor.translateAlternateColorCodes('&', "&7Deals damage to an entity over time"));
        poisonMeta.setLore(poisonLore);
        poison.setItemMeta(poisonMeta);

        ItemStack regeneration = new ItemStack(Material.POTION);
        ItemMeta regenerationMeta = regeneration.getItemMeta();
        PotionMeta regenerationPotionMeta = (PotionMeta) regenerationMeta;
        regenerationPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.REGENERATION, 0, 0), false);
        regenerationPotionMeta.setColor(Color.fromRGB(239, 57, 57));
        regenerationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        regenerationMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bRegeneration"));
        List<String> regenerationLore = new ArrayList<>();
        regenerationLore.add(ChatColor.translateAlternateColorCodes('&', "&7Regenerates health"));
        regenerationMeta.setLore(regenerationLore);
        regeneration.setItemMeta(regenerationMeta);

        ItemStack saturation = new ItemStack(Material.POTION);
        ItemMeta saturationMeta = saturation.getItemMeta();
        PotionMeta saturationPotionMeta = (PotionMeta) saturationMeta;
        saturationPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SATURATION, 0, 0), false);
        saturationPotionMeta.setColor(Color.fromRGB(239, 164, 23));
        saturationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        saturationMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSaturation"));
        List<String> saturationLore = new ArrayList<>();
        saturationLore.add(ChatColor.translateAlternateColorCodes('&', "&7Increases the food level of an entity each tick"));
        saturationMeta.setLore(saturationLore);
        saturation.setItemMeta(saturationMeta);

        ItemStack slow = new ItemStack(Material.POTION);
        ItemMeta slowMeta = slow.getItemMeta();
        PotionMeta slowPotionMeta = (PotionMeta) slowMeta;
        slowPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW, 0, 0), false);
        slowPotionMeta.setColor(Color.fromRGB(173, 173, 173));
        slowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        slowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSlowness"));
        List<String> slowLore = new ArrayList<>();
        slowLore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases movement speed"));
        slowMeta.setLore(slowLore);
        slow.setItemMeta(slowMeta);

        ItemStack slowDigging = new ItemStack(Material.POTION);
        ItemMeta slowDiggingMeta = slowDigging.getItemMeta();
        PotionMeta slowDiggingPotionMeta = (PotionMeta) slowDiggingMeta;
        slowDiggingPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 0, 0), false);
        slowDiggingPotionMeta.setColor(Color.fromRGB(71, 65, 65));
        slowDiggingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        slowDiggingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bMining Fatique"));
        List<String> slowDiggingLore = new ArrayList<>();
        slowDiggingLore.add(ChatColor.translateAlternateColorCodes('&', "&7Decreases movement speed"));
        slowDiggingMeta.setLore(slowDiggingLore);
        slowDigging.setItemMeta(slowDiggingMeta);

        ItemStack slowFalling = new ItemStack(Material.POTION);
        ItemMeta slowFallingMeta = slowFalling.getItemMeta();
        PotionMeta slowFallingPotionMeta = (PotionMeta) slowFallingMeta;
        slowFallingPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 0, 0), false);
        slowPotionMeta.setColor(Color.fromRGB(224, 224, 224));
        slowFallingMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_POTION_EFFECTS);
        slowFallingMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bSlow Falling"));
        List<String> slowFallingLore = new ArrayList<>();
        slowFallingLore.add(ChatColor.translateAlternateColorCodes('&', "&7Slows entity fall rate"));
        slowFallingMeta.setLore(slowFallingLore);
        slowFalling.setItemMeta(slowFallingMeta);

        for (int i = 0; i < 54; i++) {
            gui.setItem(i, GeneralUse.Filler());
        }
        gui.setItem(10, absorption);
        gui.setItem(11, badOmen);
        gui.setItem(12, blindness);
        gui.setItem(13, conduitPower);
        gui.setItem(14, confusion);
        gui.setItem(15, damageResistance);
        gui.setItem(16, darkness);

        gui.setItem(19, dolphinsGrace);
        gui.setItem(20, fastDigging);
        gui.setItem(21, fireResistance);
        gui.setItem(22, glowing);
        gui.setItem(23, harm);
        gui.setItem(24, heal);
        gui.setItem(25, healthBoost);

        gui.setItem(28, heroOfTheVillage);
        gui.setItem(29, hunger);
        gui.setItem(30, increaseDamage);
        gui.setItem(31, invisibility);
        gui.setItem(32, jump);
        gui.setItem(33, levitation);
        gui.setItem(34, luck);

        gui.setItem(37, nightVision);
        gui.setItem(38, poison);
        gui.setItem(39, regeneration);
        gui.setItem(40, saturation);
        gui.setItem(41, slow);
        gui.setItem(42, slowDigging);
        gui.setItem(43, slowFalling);

        gui.setItem(53, GeneralUse.NextPage());
        player.openInventory(gui);
    }
}
