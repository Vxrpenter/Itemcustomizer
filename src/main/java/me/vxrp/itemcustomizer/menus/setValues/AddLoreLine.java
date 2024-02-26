package me.vxrp.itemcustomizer.menus.setValues;

import me.vxrp.itemcustomizer.Itemcustomizer;
import me.vxrp.itemcustomizer.menus.lore.LoreMenu;
import net.kyori.adventure.text.Component;
import net.wesjd.anvilgui.AnvilGUI;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AddLoreLine {
    public static void openMenu(Player player, Itemcustomizer plugin) {
        new AnvilGUI.Builder()
                .onClose(stateSnapshot -> {
                    LoreMenu.openMenu(player, plugin);
                })
                .onClick((slot, stateSnapshot) -> {
                    if (slot != AnvilGUI.Slot.OUTPUT) {
                        return Collections.emptyList();
                    }

                    if (stateSnapshot.getText() != null && !Objects.equals(stateSnapshot.getText(), "Input") &&
                            !Objects.equals(stateSnapshot.getText(),"INPUT LINE")) {
                        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                        LoreMenu.loreMap.get(player.getUniqueId()).add(Component.text(stateSnapshot.getText()));
                        LoreMenu.openMenu(player, plugin);
                        return List.of(AnvilGUI.ResponseAction.close());
                    } else {
                        return List.of(AnvilGUI.ResponseAction.replaceInputText("INPUT LINE"));
                    }
                })
                .text("Input")
                .title("Enter Line")
                .plugin(plugin)
                .open(player);
    }
}
