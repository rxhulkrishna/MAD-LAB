package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView displayCount;
    Button plus,reset,minus;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayCount = findViewById(R.id.displayCount);
        plus = findViewById(R.id.plusBtn);
        reset = findViewById(R.id.resetBtn);
        minus = findViewById(R.id.minusBtn);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1;
                displayCount.setText(String.valueOf(count));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                displayCount.setText(String.valueOf(count));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count - 1;
                displayCount.setText(String.valueOf(count));
            }
        });
    }
}