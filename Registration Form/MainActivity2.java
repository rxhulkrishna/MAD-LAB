package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {

    TextView nameTV,ageTV,phoneTV,emailTV,yearTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTV = findViewById(R.id.nameTV);
        ageTV = findViewById(R.id.ageTV);
        phoneTV = findViewById(R.id.phoneTV);
        emailTV = findViewById(R.id.emailTV);
        yearTV = findViewById(R.id.yearTV);


        Intent i = getIntent();
        Bundle extras = i.getExtras();

        String Name = extras.getString("name");
        String Age = extras.getString("age");
        String Phone = extras.getString("phone");
        String Email = extras.getString("email");
        String Year = extras.getString("year");

        nameTV.setText(Name);
        ageTV.setText(Age);
        phoneTV.setText(Phone);
        emailTV.setText(Email);
        yearTV.setText(Year);


    }
}