package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button submitBtn;
    EditText amtET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        submitBtn = findViewById(R.id.submitBtn);
        amtET = findViewById(R.id.amt);

        SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
        float bal = mySPref.getFloat("bal",0);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float amount = Float.parseFloat(amtET.getText().toString());

                SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
                float bal = mySPref.getFloat("bal",0);

                bal+=amount;

                SharedPreferences.Editor editor = mySPref.edit();
                editor.putFloat("bal",bal);
                editor.apply();

                Toast.makeText(MainActivity3.this, "Balance = " + bal, Toast.LENGTH_SHORT).show();
            }
        });
    }
}