package com.example.androidui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;

public class TranslateAnimationMenu extends Activity {
	Animation showAction, hideAction;
	LinearLayout menu;
	Button button;
	boolean menuShowed;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_translate_animation_menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.translate_animation_menu, menu);
		return true;
	}

}
