/**
 * @author James Pinckney
 * @Version 1.5
 */
package pinckneyjames.ArmorWarning;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
/*
 * JRP
 */
public final class Runner extends JavaPlugin implements Listener {
	
	/**
	 * Enable the plugin and call any startup methods here
	 * (non-Javadoc) 
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 */
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("ArmorWarninghas been Activated!");
		Bukkit.broadcastMessage("§1[§bArmorWarning§1]§9 Is Enabled Successfully!");
		@SuppressWarnings("unused")
		BukkitTask TaskName = new Runnable(this).runTaskTimer(this, 20, 120); //Run the method "run" in Runnable this repeats a method, like a loop
																			 //but has no end condition, and does not crash.
	}
	/**
	 * When the plugin is disabled, it will call this method
	 * (non-Javadoc)
	 * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
	 */
	@Override
	public void onDisable() {
		Bukkit.broadcastMessage("§1[§bArmorWarning§1]§9 Got disabled! is the server shutting down or did the plugin crash?");
	}
	/**
	 * When the player sends a command, trigger this action to be performed
	 * (non-Javadoc)
	 * @see org.bukkit.plugin.java.JavaPlugin#onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[])
	 * @param sender this is the sender of the command
	 * @param cmd the command to execute, input as a string
	 * @param label a label for the command
	 * @return we dont really need to return anything for this specific command, however we are overwriting the onCommand method,
	 * 	so we need to return something
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String args[]) {
		Player player = (Player) sender;
		if (cmd.equals("reload")) {					//This block safely reloads the plugin in case something goes awry.
			Plugin plugin = player.getServer().getPluginManager().getPlugin("ArmorWarning");
			player.getServer().getPluginManager().disablePlugin(plugin);
			player.getServer().getPluginManager().enablePlugin(plugin);
		}
		return false;
	}
}
