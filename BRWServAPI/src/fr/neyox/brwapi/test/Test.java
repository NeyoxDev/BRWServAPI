package fr.neyox.brwapi.test;

import fr.neyox.brwapi.ProfileDecoder;

public class Test {
	
	public static void main(String[] args) {
		ProfileDecoder p = ProfileDecoder.decode("NeyoxDev");
		if (p != null)
		p.printInfos();
		System.out.println(p == null);
	}

}
