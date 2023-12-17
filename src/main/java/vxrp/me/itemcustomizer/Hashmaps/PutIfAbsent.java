package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.Displayname.SetDisplayNameMaps;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.EnchantsPickMaps;
import vxrp.me.itemcustomizer.Hashmaps.Enchants.SetLevelMaps;

import java.util.ArrayList;
import java.util.List;

public class PutIfAbsent {

    public static void PutIfAbsent(Player player) {
        EnchantsPickMaps.level.putIfAbsent(player.getUniqueId(), 0);
        EffectsMaps.time.putIfAbsent(player.getUniqueId(), 0);
        EffectsMaps.amplifier.putIfAbsent(player.getUniqueId(), 0);
        EffectsMaps.timeIn.putIfAbsent(player.getUniqueId(), 0);

        SetLevelMaps.running.putIfAbsent(player.getUniqueId(), false);
        SetDisplayNameMaps.running.putIfAbsent(player.getUniqueId(), false);
        AttributeModifierMaps.running.putIfAbsent(player.getUniqueId(), false);
        EffectsMaps.timeRunning.putIfAbsent(player.getUniqueId(), false);
        EffectsMaps.amplifierRunning.putIfAbsent(player.getUniqueId(), false);

        AttributeModifierMaps.number.putIfAbsent(player.getUniqueId(), 0.0);
        List<Attribute> list = new ArrayList<>();
        list.add(Attribute.ZOMBIE_SPAWN_REINFORCEMENTS);
        AttributeModifierMaps.attributeList.putIfAbsent(player.getUniqueId(), list);

    }
}
