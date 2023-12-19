package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt = findViewById(R.id.textView);

        SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
        String uname = mySPref.getString("username","");

        SharedPreferences.Editor editor = mySPref.edit();
        editor.putString("username","Welcome " + uname);
        editor.apply();


        uname = mySPref.getString("username","");

        txt.setText(uname);

    }
}