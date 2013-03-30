package com.example.demo.test;

import com.example.demo.util.Urls;

import android.test.AndroidTestCase;

public class DemoTest extends AndroidTestCase {
	
	/**
	 * Testet gegen Demo App
	 */
	public void testCacheHelperGetCache() {
		String urlStr = Urls.ensureSsl("Hello");
		assertNotNull(urlStr);
		assertTrue(urlStr.startsWith("https://"));
	}
}
