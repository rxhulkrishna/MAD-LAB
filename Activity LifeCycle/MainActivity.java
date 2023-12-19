package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActivityLifeCycle","onCreate called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle","onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycle","onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle","onStop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle","onPause called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle","onResume called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle","onRestart called");
    }
}