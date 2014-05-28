/*
 * @author James Pinckney
 * @Version 1.5
 */

package pinckneyjames.ArmorWarning;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestArmor extends JavaPlugin implements Listener {

	/* JRP */
	// Define our variables
	short leatherBoot = 66;
	short leatherLeg = 76;
	short leatherChest = 81;
	short leatherHat = 56;
	short chainBoot = 196;
	short chainLeg = 226;
	short chainChest = 241;
	short chainHat = 166;
	short ironBoot = 196;
	short ironLeg = 226;
	short ironChest = 241;
	short ironHat = 166;
	short goldBoot = 92;
	short goldLeg = 106;
	short goldChest = 113;
	short goldHat = 78;
	short diamondBoot = 430;
	short diamondLeg = 496;
	short diamondChest = 529;
	short diamondHat = 364;
	public short bootDurability;
	public short leggingDurability;
	public short chestDurability;
	public short helmetDurability;
	public Material boots;
	public Material legs;
	public Material chest;
	public Material helm;
	boolean isBroken;
	public getPlayer getplayer;
	public Player player;

	/**
	 * Default Constructer.
	 */
	public TestArmor() {
		isBroken = true;
		getplayer = new getPlayer();
	}

	/**
	 * Determine if the Players armor is 95% broken and if they are wearing any
	 * armor at all; If the Player is, return true and go to playASound, to
	 * alert the Player.
	 * 
	 * @return true if the player is wearing armor, false if they aren't
	 */
	public boolean atRisk() {

		int n = 0;
		if (Bukkit.getOnlinePlayers().length <= n) {
			return false;
		} else {
			player = getplayer.returnPlayer();
		}
		for (int i = 0; i < Bukkit.getOnlinePlayers().length; i++) {

			if (player.getInventory().getBoots() != null) {
				bootDurability = player.getInventory().getBoots()
						.getDurability();
				boots = player.getInventory().getBoots().getType();
			}
			if (player.getInventory().getLeggings() != null) {
				leggingDurability = player.getInventory().getLeggings()
						.getDurability();
				legs = player.getInventory().getLeggings().getType();
			}
			if (player.getInventory().getChestplate() != null) {
				chestDurability = player.getInventory().getChestplate()
						.getDurability();
				chest = player.getInventory().getChestplate().getType();
			}
			if (player.getInventory().getHelmet() != null) {
				helmetDurability = player.getInventory().getHelmet()
						.getDurability();
				helm = player.getInventory().getHelmet().getType();
			}
			if (player.getInventory().getBoots() != null) {
				if (boots == Material.LEATHER_BOOTS) {
					if (bootDurability >= leatherBoot - (leatherBoot / 15)) {
						return isBroken;
					}
				} else if (boots == Material.CHAINMAIL_BOOTS) {
					if (bootDurability >= chainBoot - (chainBoot / 15)) {
						return isBroken;
					}
				} else if (boots == Material.GOLD_BOOTS) {
					if (bootDurability >= goldBoot - (goldBoot / 15)) {
						return isBroken;
					}
				} else if (boots == Material.IRON_BOOTS) {
					if (bootDurability >= ironBoot - (ironBoot / 15)) {
						return isBroken;
					}
				} else if (boots == Material.DIAMOND_BOOTS) {
					if (bootDurability >= diamondBoot - (diamondBoot / 15)) {
						return isBroken;
					}
				}
			}
			if (player.getInventory().getLeggings() != null) {
				if (legs == Material.LEATHER_LEGGINGS) {
					if (leggingDurability >= leatherLeg - (leatherLeg / 15)) {
						return isBroken;
					}
				} else if (legs == Material.CHAINMAIL_LEGGINGS) {
					if (leggingDurability >= chainLeg - (chainLeg / 15)) {
						return isBroken;
					}
				} else if (legs == Material.GOLD_LEGGINGS) {
					if (leggingDurability >= goldLeg - (goldLeg / 15)) {
						return isBroken;
					}
				} else if (legs == Material.IRON_LEGGINGS) {
					if (leggingDurability >= ironLeg - (ironLeg / 15)) {
						return isBroken;
					}
				} else if (legs == Material.DIAMOND_LEGGINGS) {
					if (leggingDurability >= diamondLeg - (diamondLeg / 15)) {
						return isBroken;
					}
				}
			}
			if (player.getInventory().getChestplate() != null) {
				if (chest == Material.LEATHER_CHESTPLATE) {
					if (chestDurability >= leatherChest - (leatherChest / 15)) {
						return isBroken;
					}
				} else if (chest == Material.CHAINMAIL_CHESTPLATE) {
					if (chestDurability >= chainChest - (chainChest / 15)) {
						return isBroken;
					}
				} else if (chest == Material.GOLD_CHESTPLATE) {
					if (chestDurability >= goldChest - (goldChest / 15)) {
						return isBroken;
					}
				} else if (chest == Material.IRON_CHESTPLATE) {
					if (chestDurability >= ironChest - (ironChest / 15)) {
						return isBroken;
					}
				} else if (chest == Material.DIAMOND_CHESTPLATE) {
					if (chestDurability >= diamondChest - (diamondChest / 15)) {
						return isBroken;
					}
				}
			}
			if (player.getInventory().getHelmet() != null) {
				if (helm == Material.LEATHER_HELMET) {
					if (helmetDurability >= leatherHat - (leatherHat / 15)) {
						return isBroken;
					}
				} else if (helm == Material.CHAINMAIL_HELMET) {
					if (helmetDurability >= chainHat - (chainHat / 15)) {
						return isBroken;
					}
				} else if (helm == Material.GOLD_HELMET) {
					if (helmetDurability >= goldHat - (goldHat / 15)) {
						return isBroken;
					}
				} else if (helm == Material.IRON_HELMET) {
					if (helmetDurability >= ironHat - (ironHat / 15)) {
						return isBroken;
					}
				} else if (helm == Material.DIAMOND_HELMET) {
					if (helmetDurability >= diamondHat - (diamondHat / 15)) {
						return isBroken;
					}
				}
			}
			player = getplayer.returnPlayer();

		}
		return false;
		// The players armor must either not be within the limit, or the Player
		// is
		// not wearing armor. Return false then.
	}
}
