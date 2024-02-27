package dev.vxrp.itemcustomizer.menus.lore;

import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import dev.vxrp.itemcustomizer.Itemcustomizer;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class LoreMenu implements InventoryProvider {
    public static Map<UUID, List<Component>> loreMap = new HashMap<>();
    private final Itemcustomizer plugin;
    public LoreMenu(dev.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
        this.plugin = itemcustomizer;
    }
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        SmartInventory.builder()
                .id("loreMenu")
                .provider(new LoreMenu(itemcustomizer))
                .size(3, 9)
                .title(ChatColor.AQUA + "Lore")
                .manager(Itemcustomizer.getInvManager())
                .build().open(player);
    }
    @Override
    public void init(Player player, InventoryContents contents) {
        //Lore
    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }
}
