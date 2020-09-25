package fr.neyox.brwapi;

import fr.neyox.brwapi.stats.BattleRoyalStats;
import fr.neyox.brwapi.stats.BrainFFAStats;
import fr.neyox.brwapi.stats.FFARushStats;
import fr.neyox.brwapi.stats.PlagiatStats;
import fr.neyox.brwapi.stats.PracticeStats;
import fr.neyox.brwapi.stats.RushFightStats;
import fr.neyox.brwapi.utils.Utils;
import fr.neyox.brwapi.utils.WebDecoder;

public class ProfileDecoder {

	private String name, rank;
	
	private int playTime;
	
	private boolean load, exists=true;
	
	private PracticeStats practiceStats;
	
	private RushFightStats rushFightStats;
	
	private FFARushStats ffarushStats;
	
	private BrainFFAStats brainFFAStats;
	
	private PlagiatStats plagiatStats;
	
	private BattleRoyalStats battleRoyalStats;
	
	private ProfileDecoder(String name) {
		this.name = name;
	}
	
	private void load() {
		if (load) return;
		load = true;
		try {
			String content = Utils.getContent("https://brwserv.net/profil/"+name);
			String title = WebDecoder.getTitle(content);
			if (!title.equals(WebDecoder.TITLE_NO_FOUND)) {
				this.rank = WebDecoder.getRank(content, name);
				this.playTime = WebDecoder.getPlayTime(content);
				this.practiceStats = WebDecoder.getPracticeStats(content.trim());
				this.rushFightStats = WebDecoder.getRushFight(content);
				this.ffarushStats = WebDecoder.getFFARush(content);
				this.brainFFAStats = WebDecoder.getBrainFFA(content);
				this.plagiatStats = WebDecoder.getPlagiat(content);
				this.battleRoyalStats = WebDecoder.getBattleRoyal(content);
			}
		} catch (Exception e) {
			this.exists = false;
		}
	}
	
	public static ProfileDecoder decode(String name) {
		ProfileDecoder decoder = new ProfileDecoder(name);
		decoder.load();
		if (!decoder.exists) {
			return null;
		}
		return decoder;
	}

	public void printInfos() {
		System.out.println("Rank: " + rank);
		System.out.println("Name: " + name);
		System.out.println("PlayTime: " + playTime);
		this.practiceStats.printInfos();
		this.rushFightStats.printInfos();
		this.ffarushStats.printInfos();
		this.brainFFAStats.printInfos();
		this.plagiatStats.printInfos();
		this.battleRoyalStats.printInfos();
	}
	
	public FFARushStats getFFARushStats() {
		return ffarushStats;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	
	public PracticeStats getPracticeStats() {
		return practiceStats;
	}
	
	public RushFightStats getRushFightStats() {
		return rushFightStats;
	}
	
}
