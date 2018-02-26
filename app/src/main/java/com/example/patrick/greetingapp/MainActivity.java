package com.example.patrick.greetingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import Model.*;


public class MainActivity extends AppCompatActivity {

    EditText value1;
    EditText value2;
    TextView tvGreeting;
    IHWLogic m_logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        tvGreeting = findViewById(R.id.tvGreeting);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnGreeting = findViewById(R.id.btnGetGreeting);
        btnGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGreeting();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onClickMinus();
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickPlus();
            }
        });
        double value1;
        double value2;
    }

    private void onClickGreeting()
    {

     //   tvGreeting.setText(m_logic.getGreeting(value1).toString());

    }
    private void onClickMinus()
    {
       Double valueName1 = Double.parseDouble(value1.getText().toString());
        Double valueName2 = Double.parseDouble(value1.getText().toString());
     Double calculate = valueName1 - valueName2;
     tvGreeting.setText(calculate.toString());

    }
    private void onClickPlus()
    {
        Double valueName1 = Double.parseDouble(value1.getText().toString());
        Double valueName2 = Double.parseDouble(value1.getText().toString());
        Double calculate = valueName1 + valueName2;
        tvGreeting.setText(calculate.toString());

    }
}
