package fr.neyox.brwapi.stats;

import java.lang.reflect.Field;

public class BrainFFAStats {
	
	private int kills, deaths;
	
	private String playTime;

	public BrainFFAStats(int kills, int deaths, String playTime) {
		this.kills = kills;
		this.deaths = deaths;
		this.playTime = playTime;
	}

	public int getKills() {
		return kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public String getPlayTime() {
		return playTime;
	}
		
	public void printInfos() {
		StringBuilder sb = new StringBuilder();
		sb.append("BrainFFAStats: ");
		for (Field f : getClass().getDeclaredFields()) {
			try {
				sb.append(f.getName() +": " + f.get(this) +", ");
			} catch (IllegalArgumentException | IllegalAccessException e) {}
		}
		System.out.println(sb.toString());
	}

}
