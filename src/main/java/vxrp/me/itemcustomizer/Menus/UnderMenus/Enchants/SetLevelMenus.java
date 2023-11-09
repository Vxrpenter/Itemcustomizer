package vxrp.me.itemcustomizer.Menus.UnderMenus.Enchants;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsMovementMaps;
import vxrp.me.itemcustomizer.Util.SkullBuilder;

public class SetLevelMenus implements Listener {
    public static String menuname = "&bEnchants &7SetLevel";

    public static void OpenMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 3*9, ChatColor.translateAlternateColorCodes('&', menuname));

        gui.setItem(11, SkullBuilder.createCustomSkull("ca516fbae16058f251aef9a68d3078549f48f6d5b683f19cf5a1745217d72cc", "&7Level &b1"));
        gui.setItem(12, SkullBuilder.createCustomSkull("4698add39cf9e4ea92d42fadefdec3be8a7dafa11fb359de752e9f54aecedc9a", "&7Level &b2"));
        gui.setItem(13, SkullBuilder.createCustomSkull("fd9e4cd5e1b9f3c8d6ca5a1bf45d86edd1d51e535dbf855fe9d2f5d4cffcd2", "&7Level &b3"));
        gui.setItem(14, SkullBuilder.createCustomSkull("f2a3d53898141c58d5acbcfc87469a87d48c5c1fc82fb4e72f7015a3648058", "&7Level &b4"));
        gui.setItem(15, SkullBuilder.createCustomSkull("d1fe36c4104247c87ebfd358ae6ca7809b61affd6245fa984069275d1cba763", "&7Level &b5"));

        player.openInventory(gui);
    }
}
