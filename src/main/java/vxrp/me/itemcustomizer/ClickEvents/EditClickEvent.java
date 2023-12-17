package vxrp.me.itemcustomizer.ClickEvents;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.CreateItem;
import vxrp.me.itemcustomizer.Hashmaps.EditMaps;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Menus.AttributeModifier.AttributeModifierMenu;
import vxrp.me.itemcustomizer.Menus.Color.ColorMenu;
import vxrp.me.itemcustomizer.Menus.ConfirmMenu;
import vxrp.me.itemcustomizer.Menus.EditMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsPickMenu;
import vxrp.me.itemcustomizer.Menus.Effects.EffectsTypeOneTwo.EffectsTypeMenuOne;
import vxrp.me.itemcustomizer.Menus.Enchants.EnchantsGroupMenu;
import vxrp.me.itemcustomizer.Menus.ItemFlags.ItemFlagMenu;
public class EditClickEvent implements Listener {
    private final Itemcustomizer plugin;
    public EditClickEvent(vxrp.me.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', EditMenu.menuname))) return;
        Player player = (Player) event.getWhoClicked();
        ItemMeta itemMeta = EditMaps.itemmeta.get(player.getUniqueId());
        String permissionmessage =  plugin.getConfig().getString("missing_permission");
        String featureDisabled = plugin.getConfig().getString("feature_disabled");
        event.setCancelled(true);

        if (event.getSlot() == 20) {
            if (plugin.getConfig().getBoolean("customize_edit.set_itemflags")) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                ItemFlagMenu.OpenMenu(player);
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert permissionmessage != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
            }
        }
        if (event.getSlot() == 53) {
            player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            ConfirmMenu.OpenMenu(player);
        }
        if (event.getSlot() == 49) {
            player.playSound(player, Sound.BLOCK_ANVIL_USE, 10, 1);
            player.getInventory().addItem(CreateItem.Create(player));
            player.closeInventory();
        }
        if (event.getSlot() == 22) {
            if (plugin.getConfig().getBoolean("customize_edit.set_displayname")) {
                SetDisplayNameMaps.running.put(player.getUniqueId(), true);
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c!!! &7Please enter the DisplayName in the chat &c!!!"));
                player.closeInventory();
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert permissionmessage != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
            }
        }
        if (event.getSlot() == 24) {
            if (plugin.getConfig().getBoolean("customize_edit.set_enchants")) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                EnchantsGroupMenu.OpenMenu(player);
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert permissionmessage != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
            }
        }
        if (event.getSlot() == 30) {
            if (plugin.getConfig().getBoolean("customize_edit.set_unbreakable")) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                itemMeta.setUnbreakable(!itemMeta.isUnbreakable());
                EditMenu.OpenMenu(player);
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert permissionmessage != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
            }
        }
        if (event.getSlot() == 32) {
            if (plugin.getConfig().getBoolean("customize_edit.set_attributemodifier")) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                AttributeModifierMenu.OpenMenu(player);
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert permissionmessage != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
            }
        }
        if (event.getSlot() == 28) {
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&bColor"))) {
                if (plugin.getConfig().getBoolean("customize_edit.set_color")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    ColorMenu.OpenMenu(player);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionmessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
                }
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert featureDisabled != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', featureDisabled));
            }
        }
        if (event.getSlot() == 34) {
            if (event.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', "&bEffect"))) {
                if (plugin.getConfig().getBoolean("customize_edit.set_effects")) {
                    player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                    EffectsMaps.timeIn.put(player.getUniqueId(), 0);
                    EffectsMaps.color.put(player.getUniqueId(), null);
                    EffectsMaps.time.put(player.getUniqueId(), 0);
                    EffectsMaps.amplifier.put(player.getUniqueId(), 0);
                    EffectsMaps.potionMetaData.put(player.getUniqueId(), null);
                    EffectsTypeMenuOne.OpenMenu(player);
                } else {
                    player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                    assert permissionmessage != null;
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', permissionmessage));
                }
            } else {
                player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                assert featureDisabled != null;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', featureDisabled));
            }
        }
    }
}
