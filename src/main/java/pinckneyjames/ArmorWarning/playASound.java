/**
 * @author James Pinckney
 * @Version 1.5
 */
package pinckneyjames.ArmorWarning;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class playASound extends JavaPlugin implements Listener {

	/*JRP*/
	public TestArmor testarmor;
	public World world;
	
	public playASound() {
		testarmor = new TestArmor();
	}

	/**
	 * This will play a sound to the player if their armor is breaking. It also displays
	 * a nice looking message that alerts the player.
	 */
	public void aSound(Player player) {
				world = player.getWorld();		   //get the world near thge current player
				Location playerLoc = player.getLocation();	//get the player's location
				world.playSound(playerLoc, Sound.ANVIL_LAND, 1, 1);
				player.sendMessage("§6---*----*----*----*----*----*----*----*----*----*--");
				player.sendMessage("§6---              §b§l§oHey " + player.getName() + ",                     §6---");
				player.sendMessage("§6---       §b§l§olooks like your armor is breaking!      §6---");
				player.sendMessage("§6---*----*----*----*----*----*----*----*----*----*--");
				//Send the player an alert in case their volume is off
			}
		}