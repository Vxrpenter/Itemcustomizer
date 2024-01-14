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
    private  int Id;

    public UpdateChecker (Itemcustomizer plugin, int Id) {
        this.plugin = plugin;
        this.Id = Id;
    }
    public void getLatestVersion(Consumer<String> consumer) {
        Bukkit.getScheduler().runTaskAsynchronously(this.plugin, () -> {
            try (InputStream inputStream = new URL("https://api.spigotmc.org/legacy/update.php?resource=" + this.Id).openStream(); Scanner scanner = new Scanner(inputStream)) {
                if (scanner.hasNext()) {
                    consumer.accept(scanner.next());
                }
            } catch (IOException exception) {
                this.plugin.getLogger().info("Cannot look for updates: " + exception.getMessage());
            }
        });
    }
}
