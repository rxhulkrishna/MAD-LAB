package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3;
    Button sumBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        sumBtn = findViewById(R.id.SumB);

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;

                if(c1.isChecked()) {
                    sum += 10;

                }
                if(c2.isChecked()) {
                    sum += 20;
                }

                if(c3.isChecked()) {
                    sum += 30;
                }

                Toast.makeText(MainActivity.this, "Sum : " + sum, Toast.LENGTH_LONG).show();
            }
        });
    }
}