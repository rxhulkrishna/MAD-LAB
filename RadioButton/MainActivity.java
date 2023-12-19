package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton selRB;
    RadioGroup rg;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rbID = rg.getCheckedRadioButtonId();
                
                if(rbID == -1) {
                    Toast.makeText(MainActivity.this, "Select Something!", Toast.LENGTH_SHORT).show();
                }
                else {
                    selRB = findViewById(rbID);
                    String gender = selRB.getText().toString();

                    Toast.makeText(MainActivity.this, "Selected " + gender, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}