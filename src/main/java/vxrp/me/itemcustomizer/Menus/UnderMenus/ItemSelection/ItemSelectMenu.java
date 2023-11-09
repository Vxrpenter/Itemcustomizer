package vxrp.me.itemcustomizer.Menus.UnderMenus.ItemSelection;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import vxrp.me.itemcustomizer.Hashmaps.Create.CreateCustomMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsAttackMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Hashmaps.ItemFlags.ItemFlagsMap;
import vxrp.me.itemcustomizer.Menus.CreateCustomMenu;
import vxrp.me.itemcustomizer.Util.SkullBuilder;

public class ItemSelectMenu implements Listener {
    public static String menuname = "&bItemSelect";


    @EventHandler
    public void OnInventoryClick(InventoryClickEvent event){
        if (event.getView().getTitle().equals(ChatColor.translateAlternateColorCodes('&', menuname))) {
            Player player = (Player) event.getWhoClicked();

            if (event.getCurrentItem().getType() != Material.BARRIER && event.getCurrentItem().getType() != Material.PLAYER_HEAD) {
                Material item = event.getCurrentItem().getType();
                ItemMeta itemmeta = event.getCurrentItem().getItemMeta();

                ItemStack itemstack = new ItemStack(item);
                itemstack.setItemMeta(itemmeta);
                CreateCustomMaps.item.put(player.getUniqueId(), itemstack);
                CreateCustomMaps.itemmeta.put(player.getUniqueId(), itemmeta);
                //ItemFlags
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_ATTRIBUTES)) {
                    ItemFlagsMap.hideattributes.put(player.getUniqueId(), true);
                }
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_ENCHANTS)) {
                    ItemFlagsMap.hideenchants.put(player.getUniqueId(), true);
                }
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_DYE)) {
                    ItemFlagsMap.hidedye.put(player.getUniqueId(), true);
                }
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_DESTROYS)) {
                    ItemFlagsMap.hidedestroys.put(player.getUniqueId(), true);
                }
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_PLACED_ON)) {
                    ItemFlagsMap.hideplacedon.put(player.getUniqueId(), true);
                }
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_POTION_EFFECTS)) {
                    ItemFlagsMap.hidepotioneffects.put(player.getUniqueId(), true);
                }
                if (itemmeta.getItemFlags().contains(ItemFlag.HIDE_UNBREAKABLE)) {
                    ItemFlagsMap.hideunbreakable.put(player.getUniqueId(), true);
                }
                //Enchants: Movement
                if (itemmeta.getEnchants().containsKey(Enchantment.DEPTH_STRIDER)) {
                    EnchantsMovementMaps.depthstrider.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.depthstriderlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DEPTH_STRIDER));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.FROST_WALKER)) {
                    EnchantsMovementMaps.frostwalker.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.frostwalkerlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.FROST_WALKER));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.RIPTIDE)) {
                    EnchantsMovementMaps.riptide.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.riptidelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.RIPTIDE));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.SOUL_SPEED)) {
                    EnchantsMovementMaps.soulspeed.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.soulspeedlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.SOUL_SPEED));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.SWIFT_SNEAK)) {
                    EnchantsMovementMaps.swiftsneak.put(player.getUniqueId(), true);
                    EnchantsMovementMaps.swiftsneaklevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.SWIFT_SNEAK));
                }
                //Attack
                if (itemmeta.getEnchants().containsKey(Enchantment.DAMAGE_ARTHROPODS)) {
                    EnchantsAttackMaps.baneofarthropods.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.baneofarthropodslevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DAMAGE_ARTHROPODS));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.CHANNELING)) {
                    EnchantsAttackMaps.channeling.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.channelinglevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.CHANNELING));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.FIRE_ASPECT)) {
                    EnchantsAttackMaps.fireaspect.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.fireaspectlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.FIRE_ASPECT));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_FIRE)) {
                    EnchantsAttackMaps.flame.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.flamelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_FIRE));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.IMPALING)) {
                    EnchantsAttackMaps.impaling.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.impalinglevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.IMPALING));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_INFINITE)) {
                    EnchantsAttackMaps.infinity.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.infinitylevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_INFINITE));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.KNOCKBACK)) {
                    EnchantsAttackMaps.knockback.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.knockbacklevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.KNOCKBACK));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.LOYALTY)) {
                    EnchantsAttackMaps.loyalty.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.loyaltylevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.LOYALTY));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.MULTISHOT)) {
                    EnchantsAttackMaps.multishot.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.multishotlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.MULTISHOT));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.PIERCING)) {
                    EnchantsAttackMaps.piercing.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.piercinglevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.PIERCING));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_DAMAGE)) {
                    EnchantsAttackMaps.power.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.powerlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_DAMAGE));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.ARROW_KNOCKBACK)) {
                    EnchantsAttackMaps.punch.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.punchlevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.ARROW_KNOCKBACK));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.QUICK_CHARGE)) {
                    EnchantsAttackMaps.quickcharge.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.quickchargelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.QUICK_CHARGE));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.DAMAGE_ALL)) {
                    EnchantsAttackMaps.sharpness.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.sharpnesslevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DAMAGE_ALL));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.DAMAGE_UNDEAD)) {
                    EnchantsAttackMaps.smite.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.smitelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.DAMAGE_UNDEAD));
                }
                if (itemmeta.getEnchants().containsKey(Enchantment.SWEEPING_EDGE)) {
                    EnchantsAttackMaps.sweepingedge.put(player.getUniqueId(), true);
                    EnchantsAttackMaps.sweepingedgelevel.put(player.getUniqueId(), itemmeta.getEnchantLevel(Enchantment.SWEEPING_EDGE));
                }


                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 39) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            }
            if (event.getSlot() == 40) {
                CreateCustomMenu.OpenMenu(player);
            }
            if (event.getSlot() == 41) {
                player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
            }
        }
    }
    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 5 * 9, ChatColor.translateAlternateColorCodes('&', menuname));

        ItemStack back = new ItemStack(Material.BARRIER);
        ItemMeta backmeta = back.getItemMeta();
        backmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        backmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cBack"));
        back.setItemMeta(backmeta);

        gui.setItem(39, SkullBuilder.createCustomSkull("bd69e06e5dadfd84e5f3d1c21063f2553b2fa945ee1d4d7152fdc5425bc12a9", "&7Last Page"));
        gui.setItem(41, SkullBuilder.createCustomSkull("19bf3292e126a105b54eba713aa1b152d541a1d8938829c56364d178ed22bf", "&7Next Page"));
        gui.setItem(40, back);
        player.openInventory(gui);
    }
}
