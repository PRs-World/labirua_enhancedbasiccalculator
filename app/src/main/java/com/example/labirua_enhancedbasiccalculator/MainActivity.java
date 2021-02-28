package com.example.labirua_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    //Methods
    //Functions
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.buttonAddition);
        Button btnSub = findViewById(R.id.buttonSubtraction);
        Button btnDiv = findViewById(R.id.buttonDivision);
        Button btnMul = findViewById(R.id.buttonMultiplication);
        Button btnMod = findViewById(R.id.buttonModulo);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        double operand1=0;
        double operand2=0;

        EditText op1 = findViewById(R.id.txtOperand1Input);
        EditText op2 = findViewById(R.id.txtOperand2Input);
        TextView ans = findViewById(R.id.txtAnswer);

        operand1 = Double.parseDouble(op1.getText().toString());
        operand2 = Double.parseDouble(op2.getText().toString());

        switch(view.getId()) {
            case R.id.buttonAddition:
                ans.setText(Double.toString(doAdddition(operand1,operand2)));
                break;
            case R.id.buttonDivision:
                ans.setText(Double.toString(doDivision(operand1,operand2)));
                break;
            case R.id.buttonMultiplication:
                ans.setText(Double.toString(doMultiplication(operand1,operand2)));
                break;
            case R.id.buttonSubtraction:
                ans.setText(Double.toString(doSubtraction(operand1,operand2)));
                break;
            case R.id.buttonModulo:
                ans.setText(Double.toString(doModulo(operand1,operand2)));
                break;
        }
    }

    public static double doAdddition(double x, double y){
        return x + y;
    }

    public static double doDivision(double operand1, double operand2){
        return operand1 / operand2;
    }
    public static double doMultiplication(double operand1, double operand2){
        return operand1 * operand2;
    }

    public static double doSubtraction(double operand1, double operand2){
        return operand1 - operand2;
    }

    public static double doModulo(double operand1, double operand2){
        return operand1 % operand2;
    }




}