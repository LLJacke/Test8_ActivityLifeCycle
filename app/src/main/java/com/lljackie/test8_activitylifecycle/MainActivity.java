package com.lljackie.test8_activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ActivityLifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG,"onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(TAG,"onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"onDeatroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG,"onResume()");
    }
}
