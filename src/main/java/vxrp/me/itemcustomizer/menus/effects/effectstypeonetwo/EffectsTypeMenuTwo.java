package vxrp.me.itemcustomizer.menus.effects.effectstypeonetwo;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.menus.effects.EffectsPickMenu;
import vxrp.me.itemcustomizer.menus.items.GeneralItems;
import vxrp.me.itemcustomizer.util.ItemBuilder;

public class EffectsTypeMenuTwo implements InventoryProvider {
    private final Itemcustomizer plugin;
    public EffectsTypeMenuTwo(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("effectType2")
                .provider(new EffectsTypeMenuTwo(itemcustomizer))
                .size(6, 9)
                .title(ChatColor.AQUA + "EffectType " + ChatColor.GRAY + "Page 2")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }

    @Override
    public void init(Player player, InventoryContents contents) {
        ItemMeta tempMeta = new ItemStack(Material.POTION).getItemMeta();
        PotionMeta tempPotionMeta = (PotionMeta) tempMeta;

        //Fill
        contents.fill(ClickableItem.empty(GeneralItems.filler()));
        //Speed
        final ItemStack speed = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.SPEED, 0, 0, false)
                .potionColor(Color.fromRGB(244, 238, 208))
                .displayName(ChatColor.AQUA + "Speed")
                .lore(ChatColor.GRAY + "Increases movement speed")
                .build();
        contents.set(1,1, ClickableItem.of(speed, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Unluck
        final ItemStack unLuck = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.UNLUCK, 0, 0, false)
                .potionColor(Color.fromRGB(19, 104, 11))
                .displayName(ChatColor.AQUA + "Unluck")
                .lore(ChatColor.GRAY + "Loot table unluck")
                .build();
        contents.set(1,2, ClickableItem.of(unLuck, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.UNLUCK, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Water Breathing
        final ItemStack waterBreathing = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.WATER_BREATHING, 0, 0, false)
                .potionColor(Color.fromRGB(27, 106, 196))
                .displayName(ChatColor.AQUA + "Water Breathing")
                .lore(ChatColor.GRAY + "Allows breathing underwater")
                .build();
        contents.set(1,3, ClickableItem.of(waterBreathing, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Weakness
        final ItemStack weakness = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.WEAKNESS, 0, 0, false)
                .potionColor(Color.fromRGB(129, 140, 139))
                .displayName(ChatColor.AQUA + "Weakness")
                .lore(ChatColor.GRAY + "Decreases damage dealt by an entity")
                .build();
        contents.set(1,4, ClickableItem.of(weakness, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.WEAKNESS, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Wither
        final ItemStack wither = new ItemBuilder(Material.POTION)
                .hideFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_POTION_EFFECTS)
                .customEffect(PotionEffectType.WITHER, 0, 0, false)
                .potionColor(Color.fromRGB(30, 33, 32))
                .displayName(ChatColor.AQUA + "Wither")
                .lore(ChatColor.GRAY + "Deals damage to an entity over time and gives the", ChatColor.GRAY + "health to the shooter")
                .build();
        contents.set(1,5, ClickableItem.of(wither, e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            tempPotionMeta.addCustomEffect(new PotionEffect(PotionEffectType.WITHER, 0, 0), false);
            EditingStorage.setPotionMeta(player.getUniqueId(), tempMeta);
            EffectsPickMenu.openMenu(player, plugin);
        }));
        //Back
        contents.set(5, 0, ClickableItem.of(GeneralItems.lastPage(), e -> {
            if (!e.isLeftClick()) return;
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            EffectsTypeMenuOne.openMenu(player, plugin);
        }));
    }

    @Override
    public void update(Player player, InventoryContents inventoryContents) {

    }
}
