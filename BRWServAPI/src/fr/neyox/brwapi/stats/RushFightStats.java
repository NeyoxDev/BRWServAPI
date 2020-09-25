package fr.neyox.brwapi.stats;

import java.lang.reflect.Field;

public class RushFightStats {
	
	private int kills, deaths, winGames, loseGames;
	private String playTime;


	public RushFightStats(int kills, int deaths, String playTime, int winGames, int loseGames) {
		this.kills = kills;
		this.deaths = deaths;
		this.playTime = playTime;
		this.winGames = winGames;
		this.loseGames = loseGames;
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

	public int getWinGames() {
		return winGames;
	}

	public int getLoseGames() {
		return loseGames;
	}

	public void printInfos() {
		StringBuilder sb = new StringBuilder();
		sb.append("RushFight: ");
		for (Field f : getClass().getDeclaredFields()) {
			try {
				sb.append(f.getName() +": " + f.get(this) +", ");
			} catch (IllegalArgumentException | IllegalAccessException e) {}
		}
		System.out.println(sb.toString());
	}
	
}
