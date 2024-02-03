package vxrp.me.itemcustomizer.util.version;

import org.bukkit.Bukkit;
import vxrp.me.itemcustomizer.Itemcustomizer;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.util.function.Consumer;

public class UpdateChecker {

    private Itemcustomizer plugin;
    private String Id;
    private String channel;

    public UpdateChecker (Itemcustomizer plugin, String Id, String channel) {
        this.plugin = plugin;
        this.Id = Id;
        this.channel = channel;
    }
    public void getLatestVersion(Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try (InputStream inputStream = new URL("https://hangar.papermc.io/api/v1/projects/" + this.Id + "/latest?channel=" + this.channel).openStream(); Scanner scanner = new Scanner(inputStream)) {
                if (scanner.hasNext()) {
                    consumer.accept(scanner.next());
                }
            } catch (IOException exception) {
                this.plugin.getLogger().info("Cannot look for updates: " + exception.getMessage());
            }
        });
    }
}
