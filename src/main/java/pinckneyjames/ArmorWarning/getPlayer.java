/**
 * @author James Pinckney
 * @Version 1.5
 */
package pinckneyjames.ArmorWarning;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class getPlayer {

	public Player player;
	playASound playsound = new playASound();
	TestArmor test = new TestArmor();

	/*JRP*/
	/**
	 * Get all the players on the server and test their armor and durability
	 */
	public void returnPlayer() {
		// Get all the players currently online
		Player[] playerray = Bukkit.getOnlinePlayers();
			for (Player element : playerray)
				if(test.atRisk(element) == true)
				{
					playsound.aSound(element);
				}
		}
	}
	
