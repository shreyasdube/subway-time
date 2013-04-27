package me.shreyas.subwaytime.service.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ScheduleFetcher {
	private static final String URL = "http://developer.mbta.com/lib/rthr/{color}.json";
		
	public static String fetchSchedule(final String color) {
		final StringBuffer json = new StringBuffer();
		try {
			java.net.URL url = new java.net.URL(prepareUrl(color));
			final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
            	json.append(line);
            }
            reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return json.toString();
	}
	
	private static String prepareUrl(final String color) {
		return URL.replace("{color}", color);
	}
}
