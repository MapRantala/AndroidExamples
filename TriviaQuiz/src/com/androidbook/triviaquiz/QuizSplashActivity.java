package com.androidbook.triviaquiz;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class QuizSplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
		Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		logo1.startAnimation(fade1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz_splash, menu);
		return true;
	}
	
	@Override
	protected void onPause(){
		super.onPause();
		TextView logo1 = (TextView) findViewById(R.id.TextViewTopTitle);
		logo1.clearAnimation();
		
		TextView logo2 = (TextView) findViewById(R.id.TextViewBottomVersion);
		logo2.clearAnimation();
	}

}
