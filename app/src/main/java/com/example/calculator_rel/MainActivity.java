package com.example.calculator_rel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textArea1;
    EditText textArea2;
    Button buttonPlus;
    Button buttonMin;
    Button buttonMulti;
    Button buttonDivide;
    TextView textResult;

    int num1;
    int num2;
    String str1;
    String str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textArea1 = findViewById(R.id.text_area1);
        textArea2 = findViewById(R.id.text_area2);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMin = findViewById(R.id.button_minus);
        buttonMulti = findViewById(R.id.button_multi);
        buttonDivide = findViewById(R.id.button_divide);
        textResult = findViewById(R.id.text_result);


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = textArea1.getText().toString();
                str2 = textArea2.getText().toString();
                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                clickSum();
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = textArea1.getText().toString();
                str2 = textArea2.getText().toString();
                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                clickSub();
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = textArea1.getText().toString();
                str2 = textArea2.getText().toString();
                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                clickMul();
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1 = textArea1.getText().toString();
                str2 = textArea2.getText().toString();
                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                clickDiv();
            }
        });
    }

    void clickSum(){
        int sum = num1 + num2;
        textResult.setText(Integer.toString(sum));
    }

    void clickSub(){
        int sub = num1 - num2;
        textResult.setText(Integer.toString(sub));
    }

    void clickMul(){
        int mul = num1 * num2;
        textResult.setText(Integer.toString(mul));
    }

    void clickDiv(){
        int div = num1 / num2;
        textResult.setText(Integer.toString(div));
    }
}
