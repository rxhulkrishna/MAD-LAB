package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner bikeList;
    String[] Bikes = {"XPulse","GS310","StreetFighter","Meteor 350","Passion Plus","Star City","Bullet 350","MT15","Ninja","Pulsar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bikeList = findViewById(R.id.bikes);

        ArrayAdapter<String> a;
        a = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,Bikes);
        bikeList.setAdapter(a);

        bikeList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String Selected = Bikes[i];
                Toast.makeText(MainActivity.this, Selected, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}