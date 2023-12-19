package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tableTV;
    EditText numET;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numET = findViewById(R.id.numET);
        tableTV = findViewById(R.id.tableTV);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(numET.getText().toString());
                Toast.makeText(MainActivity.this,"Number is : " + num, Toast.LENGTH_SHORT).show();

                String tableConcat = "";
                for(int i = 1; i < 11; i++) {
                    int result = i * num;
                    tableConcat += num + " x " + i + " = " + result + "\n";
                }

                tableTV.setText(tableConcat);
            }
        });

    }
}