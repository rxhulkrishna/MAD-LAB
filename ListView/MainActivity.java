package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] Bikes = {"XPulse","GS310","StreetFighter","Meteor 350","Passion Plus","Star City","Bullet 350","MT15","Ninja","Pulsar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);

        ArrayAdapter<String> a;
        a = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,Bikes);
        listView.setAdapter(a);

    }
}