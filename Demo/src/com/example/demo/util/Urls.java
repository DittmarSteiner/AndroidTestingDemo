package com.example.demo.util;

public class Urls {

	/**
	 * Sichert die Verwendung von SSL zu.
	 * 
	 * @param str HTTP URL
	 * @return URL Schema ist <code>https</code>
	 */
	public static String ensureSsl(String str) {
		return str.replaceFirst("^http://", "https://");
	}
}
