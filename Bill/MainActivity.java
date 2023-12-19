package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Button submitBtn;
    EditText qtyET,priceET;
    String[] products = {"Apple","Mango","Pineapple","Watermelon"};
    String selectedPdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qtyET = findViewById(R.id.qty);
        priceET = findViewById(R.id.price);
        submitBtn = findViewById(R.id.submitBtn);
        spinner = findViewById(R.id.spinner_items);

        ArrayAdapter<String> a = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,products);
        spinner.setAdapter(a);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedPdt = products[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);

                int qty = Integer.parseInt(qtyET.getText().toString());
                float price = Float.parseFloat(priceET.getText().toString());

                Bundle extras = new Bundle();
                extras.putString("pdt",selectedPdt);
                extras.putInt("qty",qty);
                extras.putFloat("price",price);

                i.putExtras(extras);

                startActivity(i);

            }
        });

    }
}