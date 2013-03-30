package com.example.demolibtest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Diese Activity wird beim Packetieren nicht berücksichtigt.
 * 
 * @author dittmar
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
