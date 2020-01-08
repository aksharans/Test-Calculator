package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    Button add_btn;
    Button sub_btn;
    Button mul_btn;
    Button div_btn;

    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textview = findViewById(R.id.txtview);

        add_btn = findViewById(R.id.add_btn);
        sub_btn = findViewById(R.id.sub_btn);
        mul_btn = findViewById(R.id.mul_btn);
        div_btn = findViewById(R.id.div_btn);

        display = findViewById(R.id.display);

        ObjectAnimator animate = ObjectAnimator.ofInt(display, "TextColor", Color.argb(200,180,57,52),
                Color.argb(200,248,116,68), Color.argb(200,163,209,0),
                Color.argb(200,0,247,129), Color.argb(200,0,145,243),
                Color.argb(200,152,8,255),Color.argb(200,244,0,153)
        );
        animate.setEvaluator(new ArgbEvaluator());
        animate.setDuration(6000);
        animate.setRepeatMode(ValueAnimator.REVERSE);
        animate.setRepeatCount(ValueAnimator.INFINITE);
        animate.start();

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 + number2;
                String ansStr = ans + "";
                set_Text(ansStr, add_btn);

                num1.getText().clear();
                num2.getText().clear();


            }


        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 - number2;
                String ansStr = ans + "";
                set_Text(ansStr, sub_btn);

                num1.getText().clear();
                num2.getText().clear();

            }


        });


        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 * number2;
                String ansStr = ans + "";
                set_Text(ansStr, mul_btn);

                num1.getText().clear();
                num2.getText().clear();

            }


        });


        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                if (num1.getText().toString().matches("")||num2.getText().toString().matches("")){
                    return;
                }

                float number1 = Float.parseFloat(num1.getText().toString());
                float number2 = Float.parseFloat(num2.getText().toString());
                float ans = number1 / number2;
                String ansStr = ans + "";
                set_Text(ansStr, div_btn);

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

    public void set_Text (String ans, Button b){


        ObjectAnimator anim = ObjectAnimator.ofInt(textview, "TextColor", Color.argb(10,255,255,255), Color.argb(180,11,40,98), Color.argb(255,11,40,98));
        anim.setDuration(1000);
        anim.setEvaluator(new ArgbEvaluator());
        anim.start();
        textview.setText(ans);

        ObjectAnimator anim2 = ObjectAnimator.ofInt(b, "BackgroundColor", Color.LTGRAY, Color.argb(180,11,40,98),Color.LTGRAY );
        anim2.setDuration(1000);
        anim2.setEvaluator(new ArgbEvaluator());
        anim2.start();

    }



}
