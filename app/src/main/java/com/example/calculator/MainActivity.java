package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add_btn = findViewById(R.id.add_btn);
        Button sub_btn = findViewById(R.id.sub_btn);

        //final TextView textview = findViewById(R.id.txtview);
        //final EditText num1 = findViewById(R.id.num1);
        //final EditText num2 = findViewById(R.id.num2);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = findViewById(R.id.txtview);
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int ans = number1 + number2;
                String ansStr = ans + "";
                textview.setText(ansStr);

                num1.getText().clear();
                num2.getText().clear();


            }


        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = findViewById(R.id.txtview);
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int ans = number1 - number2;
                String ansStr = ans + "";
                textview.setText(ansStr);

                num1.getText().clear();
                num2.getText().clear();

            }


        });


    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int addition(int num1, int num2) {
        return num1 + num2;
    }


}
