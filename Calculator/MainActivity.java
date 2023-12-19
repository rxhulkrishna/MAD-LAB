package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button Plus,Min,Mul,Div,Eq,AC;
    EditText Number;

    double num1,num2,res;
    String Op;
    String Default;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);

        Plus = findViewById(R.id.btnPlus);
        Min = findViewById(R.id.btnMinus);
        Mul = findViewById(R.id.btnMultiply);
        Div = findViewById(R.id.btnDivide);
        Eq = findViewById(R.id.btnEqual);
        AC = findViewById(R.id.btnAC);

        Number = findViewById(R.id.Number);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                Number.setText(Default + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Default = Number.getText().toString();
                if(Default.equals("0")){
                    Number.setText("0");
                }
                else{
                    Number.setText(Default + "0");
                }
            }
        });

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Op = "+";
                Default = Number.getText().toString();
                num1 = Double.parseDouble(Default);
                Default = null;
                Number.setText(null);
            }
        });

        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Op = "-";
                Default = Number.getText().toString();
                num1 = Double.parseDouble(Default);
                Default = null;
                Number.setText(null);
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Op = "*";
                Default = Number.getText().toString();
                num1 = Double.parseDouble(Default);
                Default = null;
                Number.setText(null);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Op = "/";
                Default = Number.getText().toString();
                num1 = Double.parseDouble(Default);
                Default = null;
                Number.setText(null);
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Default = null;
                Number.setText(null);
            }
        });

        Eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Default = Number.getText().toString();
                num2 = Double.parseDouble(Default);

                Default = null;

                switch(Op) {
                    case "+" :
                        res = num1 + num2;
                        Number.setText(Double.toString(res));
                        break;

                    case "-" :
                        res = num1 - num2;
                        Number.setText(Double.toString(res));
                        break;

                    case "*" :
                        res = num1 * num2;
                        Number.setText(Double.toString(res));
                        break;

                    case "/" :
                        res = num1 / num2;
                        Number.setText(Double.toString(res));
                        break;
                }
            }
        });

    }
}