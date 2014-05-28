/*
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
	public getPlayer getplayer;
	public World world;
	
	public playASound() {
		testarmor = new TestArmor();
		getplayer = new getPlayer();
	}

	/**
	 * This will play a sound to the player if their armor is breaking, Further
	 * implementation may be added for a sound if the armor actually breaks.
	 */
	public void aSound() {
		Player player = getplayer.returnPlayer();  //Get a player from the array
			if (testarmor.atRisk() == true) {      //call method from TestArmor class
				world = player.getWorld();		   //get the world near thge current player
				testarmor = new TestArmor();	   
				getplayer = new getPlayer();
				Location playerLoc = player.getLocation();	//get the player's location
				world.playSound(playerLoc, Sound.ANVIL_LAND, 20, 1);
				player.sendMessage("§bHey, looks like your armor is breaking!");
				player.sendMessage("§bHey, looks like your armor is breaking!"); //Send the player an alert in case their volume is off
			}

		}
	}