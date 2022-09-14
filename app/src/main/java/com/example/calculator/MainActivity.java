package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText e1, e2;
    TextView t2;
    int num1, num2;

    public boolean getNumbers(){
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t2 = (TextView) findViewById(R.id.result2);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if(s1.equals("Masukkan angka pertama") && s2.equals(null))
        {
            String result = "Masukkan angka kedua";
            e2.setText(result);
            return false;
        }
        if(s1.equals(null) && s2.equals("Masukkan angka kedua"))
        {
            String result = "Masukkan angka pertama";
            e1.setText(result);
            return false;
        }
        if(s1.equals("Masukkan angka pertama") || s2.equals("Masukkan angka kedua"))
        {
            return false;
        }

        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")) ){

            String result = "Masukkan angka kedua";

            e2.setText(result);
            return false;
        }
        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")) ){
            String result = "Masukkan angka pertama";
            e1.setText(result);
            return false;
        }
        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")) ){
            String result1 = "Masukkan angka pertama";
            e1.setText(result1);
            String result2 = "Masukkan angka kedua";
            e2.setText(result2);
            return false;
        }

        else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }

        return true;
    }
    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            t2.setText(Integer.toString(sum));
        }
        else
        {
            t2.setText("Coba lagi");
        }

    }
    public void clearTextNum1(View v) {
        e1.getText().clear();
    }
    public void clearTextNum2(View v) {
        e2.getText().clear();
    }
    public void doSub(View v) {
        if (getNumbers()) {
            int sum = num1 - num2;
            t2.setText(Integer.toString(sum));
        }
        else
        {
            t2.setText("Coba lagi");
        }
    }
    public void doMul(View v) {
        if (getNumbers()) {
            int sum = num1 * num2;
            t2.setText(Integer.toString(sum));
        }
        else
        {
            t2.setText("Coba lagi");
        }
    }
    public void doDiv(View v) {
        if (getNumbers()) {
            double sum = num1 / (num2 * 1.0);
            t2.setText(Double.toString(sum));
        }
        else
        {
            t2.setText("Coba lagi");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t2 = (TextView) findViewById(R.id.result2);
    }
}