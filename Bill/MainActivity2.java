package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView pdtTV,qtyTV,priceTV,totalTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdtTV = findViewById(R.id.pdtTV);
        qtyTV = findViewById(R.id.qtyTV);
        priceTV = findViewById(R.id.priceTV);
        totalTV = findViewById(R.id.totalTV);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        String product = extras.getString("pdt");
        int qty = extras.getInt("qty");
        float price = extras.getFloat("price");

        float total = qty * price;

        pdtTV.setText("Product : " + product);
        qtyTV.setText("Quantity : " + String.valueOf(qty));
        priceTV.setText("Price : " + String.valueOf(price));
        totalTV.setText("Total Amount : " + String.valueOf(total));


    }
}