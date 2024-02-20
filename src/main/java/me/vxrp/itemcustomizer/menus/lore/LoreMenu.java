package me.vxrp.itemcustomizer.menus.lore;

import fr.minuskube.inv.ClickableItem;
import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryContents;
import fr.minuskube.inv.content.InventoryProvider;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.util.SkullBuilder;

import java.util.*;

public class LoreMenu implements InventoryProvider {
    Map<UUID, List<Component>> loreMap = new HashMap<>();
    Map<UUID, Integer> loreSize = new HashMap<>();
    private final Itemcustomizer plugin;
    public LoreMenu(me.vxrp.itemcustomizer.Itemcustomizer itemcustomizer) {
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
        loreSize.putIfAbsent(player.getUniqueId(), 0);
        int size = loreSize.get(player.getUniqueId());
        List<Component> lore = new ArrayList<>();

        contents.set(1, 2, ClickableItem.of(SkullBuilder.createCustomSkull("badc048a7ce78f7dad72a07da27d85c0916881e5522eeed1e3daf217a38c1a",
                "&bAdd Lore Line"), e -> {
            if (!e.isLeftClick()) return;

        }));
    }

    @Override
    public void update(Player player, InventoryContents contents) {

    }
}
