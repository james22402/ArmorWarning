/**
 * @author James Pinckney
 * @Version 1.5
 */
package pinckneyjames.ArmorWarning;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class getPlayer {

	public Player player;

	/**
	 * @return a player in the array JRP
	 */
	public Player returnPlayer() {
		// Get all the players currently online
		Player[] playerray = Bukkit.getOnlinePlayers();
			for (int i = 0; i < playerray.length; i++) {
				player = playerray[i];
			}
			return player;
		}
	}
