package com.moco.magnet.encounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void joinRoom(View v) {
		Intent intent = new Intent(v.getContext(), JoinActivity.class);
		startActivity(intent);
	}
	
	
	public void createRoom(View v) {
		Intent intent = new Intent(v.getContext(), CreateActivity.class);
		startActivity(intent);
	}

}
