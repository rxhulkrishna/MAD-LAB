package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    TextView unameTV,balTV;
    Button deposit,withdraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        unameTV = findViewById(R.id.unameTV);
        balTV = findViewById(R.id.balTV);

        deposit = findViewById(R.id.depositBtn);
        withdraw = findViewById(R.id.withdrawBtn);

        SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = mySPref.edit();

        editor.putFloat("bal",500);
        editor.apply();

        Intent i = getIntent();
        String uname = i.getStringExtra("uname");
        unameTV.setText(uname);

        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);
            }
        });

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(i);
            }
        });

    }

    public void onResume() {
        super.onResume();
        SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
        float bal = mySPref.getFloat("bal",0);

        balTV.setText("Rs. " + String.valueOf(bal));

    }

}