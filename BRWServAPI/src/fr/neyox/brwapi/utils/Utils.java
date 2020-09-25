package fr.neyox.brwapi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Utils {

	public static String getContent(String url) throws Exception {
		return IOUtils.toString(getInputStream(new URL(url)));
	}

	private static InputStream getInputStream(URL url) throws IOException {
		URLConnection c = url.openConnection();
		c.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
		return c.getInputStream();
	}
	
	
	
}
