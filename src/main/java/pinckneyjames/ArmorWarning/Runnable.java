/**
 * @author James Pinckney
 * @Version 1.5
 */
package pinckneyjames.ArmorWarning;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Runnable extends BukkitRunnable {
	
		getPlayer getplayer = new getPlayer();
		 
		@SuppressWarnings("unused")
		private final JavaPlugin plugin;
		 /*JRP*/
		/**
		 * @param plugin bring in a plugin to run
		 * this method will run our plugin and execute the
		 * line of code in ArmorWarning:pinckneyjames:ArmorWarning:Runner:onEnable: 26.
		 */
		public Runnable(JavaPlugin plugin) {
		this.plugin = plugin; //define our plugin
		}
		/**
		 * Run this program.
		 */
		public void run() {
			getplayer.returnPlayer();
		}
	}
