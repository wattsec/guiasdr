package com.cesine.ipn.guiasdr;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapDemoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_demo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map_demo, menu);
		return true;
	}

}
