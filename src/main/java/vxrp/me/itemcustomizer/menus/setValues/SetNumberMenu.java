package vxrp.me.itemcustomizer.menus.setValues;

import net.wesjd.anvilgui.AnvilGUI;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.menus.effects.EffectsPickMenu;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SetNumberMenu {
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        new AnvilGUI.Builder()
                .onClose(stateSnapshot -> {
                    EffectsPickMenu.openMenu(stateSnapshot.getPlayer(), itemcustomizer);
                })
                .onClick((slot, stateSnapshot) -> {
                    if (slot != AnvilGUI.Slot.OUTPUT) {
                        return Collections.emptyList();
                    }

                    if (stateSnapshot.getText() != null && !Objects.equals(stateSnapshot.getText(), "Input") &&
                            !Objects.equals(stateSnapshot.getText(),"INPUT LEVEL")) {
                        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                        EditingStorage.setNumber(player.getUniqueId(), Double.valueOf(stateSnapshot.getText()));
                        EffectsPickMenu.openMenu(stateSnapshot.getPlayer(), itemcustomizer);
                        return List.of(AnvilGUI.ResponseAction.close());
                    } else {
                        return List.of(AnvilGUI.ResponseAction.replaceInputText("INPUT NUMBER"));
                    }
                })
                .text("Input")
                .title("Enter Number")
                .plugin(itemcustomizer)
                .open(player);
    }
}
