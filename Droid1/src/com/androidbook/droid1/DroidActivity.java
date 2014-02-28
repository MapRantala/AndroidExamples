package com.androidbook.droid1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class DroidActivity extends Activity {
    private static final String TAG = "Droid1";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid);
        Log.v("Droid1","DroidActivity.onCreate");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.droid, menu);
        //Log.i("Droid1","DroidActivity.onCreateOptionsMenu");
        return true;
    }

    
/*    @Override
    protected void onRestart(){
    	Log.i("Droid1","DroidActivity.onRestart");
    }
    

    
    @Override
    protected void onDestroy(){
    	Log.i("Droid1","DroidActivity.onDestroy");
    }*/
    
    public void onClick_imageView1(View arg0){
    	InputStream inputStream = getResources().openRawResource(R.raw.testit);
    	Log.v(TAG,"I stream");
    	  
    	  InputStreamReader inputreader = new InputStreamReader(inputStream);
    	  BufferedReader buffreader = new BufferedReader(inputreader);
    	  StringBuilder text = new StringBuilder();

    	  String line;
    
    	  try {
    		  while (( line = buffreader.readLine()) != null) {
    			  text.append(line);
    			  text.append('\n');
    		  	}
    	  } catch (IOException e) {
    		  //
    	  }
    
    	  Log.v(TAG,text.toString());
    }
}
