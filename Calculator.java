package edu.ewubd.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;



public class Calculator extends Activity {

    private TextView tvInput, tvOutput;

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
            btnPoint, btnDivision, btnMultiply, btnMinus, btnPlus, btnEqual, btnDelete;

    private String expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        expression = "";

        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPoint = findViewById(R.id.btnPoint);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);
        btnDelete = findViewById(R.id.btnDelete);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zero = btnZero.getText().toString();
                expression += zero;
                tvInput.setText(expression);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = btnOne.getText().toString();
                expression += one;
                tvInput.setText(expression);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String two = btnTwo.getText().toString();
                expression += two;
                tvInput.setText(expression);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String three = btnThree.getText().toString();
                expression += three;
                tvInput.setText(expression);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String four = btnFour.getText().toString();
                expression += four;
                tvInput.setText(expression);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String five = btnFive.getText().toString();
                expression += five;
                tvInput.setText(expression);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String six = btnSix.getText().toString();
                expression += six;
                tvInput.setText(expression);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seven = btnSeven.getText().toString();
                expression += seven;
                tvInput.setText(expression);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eight = btnEight.getText().toString();
                expression += eight;
                tvInput.setText(expression);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nine = btnNine.getText().toString();
                expression += nine;
                tvInput.setText(expression);
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String point = btnPoint.getText().toString();
                expression += point;
                tvInput.setText(expression);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String plus = btnPlus.getText().toString();
                expression += plus;
                tvInput.setText(expression);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String minus = btnMinus.getText().toString();
                expression += minus;
                tvInput.setText(expression);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String multiply = btnMultiply.getText().toString();
                expression += multiply;
                tvInput.setText(expression);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String division = btnDivision.getText().toString();
                expression += division;
                tvInput.setText(expression);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expression = "";
                tvInput.setText("");
                tvOutput.setText("");
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Expression expressionObj = new Expression(expression);
                    double result = expressionObj.calculate();
                    tvOutput.setText(String.valueOf(result));
                } catch (Exception e) {
                    tvOutput.setText("Error");
                }
            }
        });


    }

}