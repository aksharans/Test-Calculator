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
        Button mul_btn = findViewById(R.id.mul_btn);
        Button div_btn = findViewById(R.id.div_btn);




        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = findViewById(R.id.txtview);
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 + number2;
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

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 - number2;
                String ansStr = ans + "";
                textview.setText(ansStr);

                num1.getText().clear();
                num2.getText().clear();

            }


        });


        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = findViewById(R.id.txtview);
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 * number2;
                String ansStr = ans + "";
                textview.setText(ansStr);

                num1.getText().clear();
                num2.getText().clear();

            }


        });


        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textview = findViewById(R.id.txtview);
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 / number2;
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

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        return num1 / num2;
    }



}
