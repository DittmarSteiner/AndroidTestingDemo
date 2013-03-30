package com.example.demolib.utils;

import java.io.File;

import android.content.Context;

public class StorageUtils {
	
	/**
	 * Verwendet das Android Device eine externe SD Card, so wird der Cache dort
	 * verwendet. Ansonsten intern.
	 * 
	 * @param context
	 * @return externer Cache oder interner
	 */
	public static File getCache(Context context) {
		File cache = context.getExternalCacheDir();
		
		if (cache == null) {
			cache = context.getCacheDir();
		}
		
		return cache;
	}
}
