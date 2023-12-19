package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.loginButton);
        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
                if(uname.equals("username") && pass.equals("username")) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    i.putExtra("username",uname);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this,"Username or password incorrect",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}