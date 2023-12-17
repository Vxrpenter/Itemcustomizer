package vxrp.me.itemcustomizer.Hashmaps;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import vxrp.me.itemcustomizer.Hashmaps.AttributeModifier.AttributeModifierMaps;
import vxrp.me.itemcustomizer.Hashmaps.Effects.EffectsMaps;

import java.util.ArrayList;
import java.util.List;

public class Reset {
    public static void reset(Player player) {
        ConfirmMaps.confirmed.put(player.getUniqueId(), false);

        EditMaps.item.put(player.getUniqueId(), null);
        EditMaps.itemmeta.put(player.getUniqueId(), null);
        List<Attribute> list = new ArrayList<>();
        list.add(Attribute.ZOMBIE_SPAWN_REINFORCEMENTS);
        AttributeModifierMaps.attributeList.put(player.getUniqueId(), list);

        EffectsMaps.color.put(player.getUniqueId(), null);
        EffectsMaps.time.put(player.getUniqueId(), 0);
        EffectsMaps.amplifier.put(player.getUniqueId(), 0);
        EffectsMaps.potionMetaData.put(player.getUniqueId(), null);
    }
}
