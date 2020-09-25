package fr.neyox.brwapi.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOUtils {
	
	public static String toString(InputStream is) {
		BufferedReader r = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String s;
		try {
			while ((s = r.readLine()) != null) {
				sb.append(s);
			}
		} catch (IOException e) {}
		return sb.toString();
	}

	public static String toString(File versionFile) {
		try {
			return toString(new FileInputStream(versionFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
