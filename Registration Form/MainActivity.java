package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView listView;
    String[] Year = {"First","Second"};
    String[] Courses = {"MCA","MBA","M.TECH"};
    EditText nameET,ageET,phoneET,emailET;
    Button submitBtn;
    String selectedYear, selectedCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        nameET = findViewById(R.id.nameET);
        ageET = findViewById(R.id.ageET);
        phoneET = findViewById(R.id.phoneET);
        emailET = findViewById(R.id.emailET);
        listView = findViewById(R.id.listview);

        ArrayAdapter<String> a,arr;
        a = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,Year);
        spinner.setAdapter(a);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedYear = Year[i];
                Toast.makeText(MainActivity.this, "Selected : " + selectedYear, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        arr = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,Courses);
        listView.setAdapter(arr);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedCourse = Courses[i];
                Toast.makeText(MainActivity.this, "Selected : "+selectedCourse, Toast.LENGTH_SHORT).show();
            }
        });

        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = nameET.getText().toString();
                String Age = ageET.getText().toString();
                String Phone = phoneET.getText().toString();
                String Email = emailET.getText().toString();

                Toast.makeText(MainActivity.this, selectedYear, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                Bundle extras = new Bundle();

                extras.putString("name",Name);
                extras.putString("age",Age);
                extras.putString("phone",Phone);
                extras.putString("email",Email);
                extras.putString("year",selectedYear);

                i.putExtras(extras);
                startActivity(i);
            }
        });
    }
}