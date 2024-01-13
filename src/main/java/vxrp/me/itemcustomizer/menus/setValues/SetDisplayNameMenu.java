package vxrp.me.itemcustomizer.menus.setValues;

import net.kyori.adventure.text.Component;
import net.wesjd.anvilgui.AnvilGUI;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Itemcustomizer;
import vxrp.me.itemcustomizer.Storage.EditingStorage;
import vxrp.me.itemcustomizer.menus.EditMenu;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SetDisplayNameMenu {
    public static void openMenu(Player player, Itemcustomizer itemcustomizer) {
        new AnvilGUI.Builder()
                .onClose(stateSnapshot -> {
                    EditMenu.openMenu(stateSnapshot.getPlayer(), itemcustomizer);
                })
                .onClick((slot, stateSnapshot) -> {
                    if (slot != AnvilGUI.Slot.OUTPUT) {
                        return Collections.emptyList();
                    }

                    if (stateSnapshot.getText() != null && !Objects.equals(stateSnapshot.getText(), "Input") &&
                            !Objects.equals(stateSnapshot.getText(),"INPUT NAME")) {
                        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 1);
                        EditingStorage.getItemMeta(stateSnapshot.getPlayer().getUniqueId())
                                .displayName(Component.text(ChatColor.translateAlternateColorCodes('&', stateSnapshot.getText())));
                        EditMenu.openMenu(stateSnapshot.getPlayer(), itemcustomizer);
                        return List.of(AnvilGUI.ResponseAction.close());
                    } else {
                        player.playSound(player, Sound.ENTITY_VILLAGER_NO, 10, 1);
                        return List.of(AnvilGUI.ResponseAction.replaceInputText("INPUT NAME"));
                    }
                })
                .text("Input")
                .title(ChatColor.AQUA + "Enter DisplayName")
                .plugin(itemcustomizer)
                .open(player);
    }
}
