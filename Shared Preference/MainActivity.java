package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);

        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();

                SharedPreferences mySPref = getSharedPreferences("myPrefs",MODE_PRIVATE);
                SharedPreferences.Editor editor = mySPref.edit();
                editor.putString("username",uname);
                editor.apply();

                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });


    }
}