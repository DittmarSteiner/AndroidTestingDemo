package com.example.demolibtest.test;


import java.io.File;

import com.example.demolib.utils.StorageUtils;

import android.test.AndroidTestCase;
import android.util.Log;

public class DemoLibTest extends AndroidTestCase {

	private static final String TAG = DemoLibTest.class.getName();
	
	/**
	 * Testet gegen Demo Lib
	 */
	public void testCache() {
		File cache = StorageUtils.getCache(getContext());
		assertNotNull(cache);
		assertTrue(cache.exists());
		assertTrue(cache.isDirectory());
		
		// nur so, um's mal zu zeigen
		Log.d(TAG, cache.getAbsolutePath());
	}
}
