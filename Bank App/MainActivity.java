package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText unameET,passET;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unameET = findViewById(R.id.unameET);
        passET = findViewById(R.id.passET);

        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = unameET.getText().toString();
                String pass = passET.getText().toString();

                if(1==1) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    i.putExtra("uname",uname);
                    startActivity(i);
                }
            }
        });

    }
}