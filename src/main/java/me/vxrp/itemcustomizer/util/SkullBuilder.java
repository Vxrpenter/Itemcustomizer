
package me.vxrp.itemcustomizer.util;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Base64;
import java.util.UUID;

public class SkullBuilder {
    private static final UUID EMPTY_UUID = UUID.fromString("00000000-0000-0000-0000-000000000000");
    public static ItemStack createCustomSkull(String SkullID, String displayname) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullmeta = (SkullMeta) skull.getItemMeta();
        PlayerProfile skullprofile = Bukkit.createProfile(EMPTY_UUID, null);
        byte[] skullencodeddata = Base64.getEncoder().encode(String.format("{\"textures\":{\"SKIN\":{\"url\":\"http://textures.minecraft.net/texture/" + SkullID + "\"}}}").getBytes());
        skullprofile.getProperties().add(new ProfileProperty("textures", new String(skullencodeddata)));
        skullmeta.setPlayerProfile(skullprofile);
        skullmeta.displayName(Component.text(ChatColor.translateAlternateColorCodes('&', displayname)));
        skull.setItemMeta(skullmeta);
        return skull;
    }

    public static ItemStack createPlayerSkull(Player player, String displayname) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta skullmeta = (SkullMeta) skull.getItemMeta();
        skullmeta.setOwningPlayer(player);
        skullmeta.displayName(Component.text(ChatColor.translateAlternateColorCodes('&', displayname)));
        skull.setItemMeta(skullmeta);
        return skull;
    }

}