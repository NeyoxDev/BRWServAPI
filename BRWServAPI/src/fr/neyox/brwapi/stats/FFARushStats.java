package fr.neyox.brwapi.stats;

import java.lang.reflect.Field;

public class FFARushStats {
	
	private int kills, death;
	
	private String playTime;

	public FFARushStats(int kills, int death, String playTime) {
		this.kills = kills;
		this.death = death;
		this.playTime = playTime;
	}

	public int getKills() {
		return kills;
	}

	public int getDeath() {
		return death;
	}

	public String getPlayTime() {
		return playTime;
	}

	
	public void printInfos() {
		StringBuilder sb = new StringBuilder();
		sb.append("FFARushStats: ");
		for (Field f : getClass().getDeclaredFields()) {
			try {
				sb.append(f.getName() +": " + f.get(this) +", ");
			} catch (IllegalArgumentException | IllegalAccessException e) {}
		}
		System.out.println(sb.toString());
	}
	
}
