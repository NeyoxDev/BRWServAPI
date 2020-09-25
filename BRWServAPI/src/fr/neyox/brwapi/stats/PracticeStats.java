package fr.neyox.brwapi.stats;

import java.lang.reflect.Field;

public class PracticeStats {
	
	private int eloGapple, eloNodebuff, eloArcher, eloSumo, eloIron, eloDiamond, eloCombo, eloMCSG, eloAxe, eloSoup, eloHUC, eloDebuff, eloBuildUHC;

	public PracticeStats(int eloGapple, int eloNodebuff, int eloArcher, int eloSumo, int eloIron, int eloDiamond,
			int eloCombo, int eloMCSG, int eloAxe, int eloSoup, int eloHUC, int eloDebuff, int eloBuildUHC) {
		this.eloGapple = eloGapple;
		this.eloNodebuff = eloNodebuff;
		this.eloArcher = eloArcher;
		this.eloSumo = eloSumo;
		this.eloIron = eloIron;
		this.eloDiamond = eloDiamond;
		this.eloCombo = eloCombo;
		this.eloMCSG = eloMCSG;
		this.eloAxe = eloAxe;
		this.eloSoup = eloSoup;
		this.eloHUC = eloHUC;
		this.eloDebuff = eloDebuff;
		this.eloBuildUHC = eloBuildUHC;
	}
	
	public PracticeStats() {}

	public int getEloGapple() {
		return eloGapple;
	}

	public int getEloNodebuff() {
		return eloNodebuff;
	}

	public int getEloArcher() {
		return eloArcher;
	}

	public int getEloSumo() {
		return eloSumo;
	}

	public int getEloIron() {
		return eloIron;
	}

	public int getEloDiamond() {
		return eloDiamond;
	}

	public int getEloCombo() {
		return eloCombo;
	}

	public int getEloMCSG() {
		return eloMCSG;
	}

	public int getEloAxe() {
		return eloAxe;
	}

	public int getEloSoup() {
		return eloSoup;
	}

	public int getEloHUC() {
		return eloHUC;
	}

	public int getEloDebuff() {
		return eloDebuff;
	}

	public int getEloBuildUHC() {
		return eloBuildUHC;
	}

	public void printInfos() {
		StringBuilder sb = new StringBuilder();
		sb.append("PracticeStats: ");
		for (Field f : getClass().getDeclaredFields()) {
			try {
				sb.append(f.getName() +": " + f.get(this) +", ");
			} catch (IllegalArgumentException | IllegalAccessException e) {}
		}
		System.out.println(sb.toString());
	}
	
}
