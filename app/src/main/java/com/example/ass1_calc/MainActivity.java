package com.example.ass1_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText display;
    private String res;
    private double num1, num2;
    private boolean add,sub,mul,div;
    private boolean dot_inserted, operator_inserted;
    myCalculation calc = new myCalculation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
        dot_inserted = false;
        operator_inserted = false;

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void zeroButton(View view) {
        if (display.getText().toString().startsWith("0") && (display.length() == 1)) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else
            display.setText(display.getText() + "0");
    }

    public void oneButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "1");
    }

    public void twoButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "2");
    }

    public void threeButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "3");
    }

    public void fourButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "4");
    }

    public void fiveButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "5");
    }

    public void sixButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "6");

    }

    public void sevenButton(View view) {

        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "7");
    }

    public void eightButton(View view) {

        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "8");
    }

    public void nineButton(View view) {
        if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        display.setText(display.getText() + "9");
    }

    public void clearButton(View view) {
        display.setText("");
        dot_inserted = false;
        operator_inserted = false;
    }

    public void posnegButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (display.length() != 0) {
            double num = Double.parseDouble(display.getText()+"");
            double newnum = 0;
            if (("NaN").equals(display.getText().toString())) {
                display.setText("");
            }
            else if ( num >= 0) {
                newnum = num * -1;
                display.setText(newnum + "");
            }
            else if ( num < 0) {
                newnum = num * -1;
                display.setText(newnum + "");
            }
        }
    }

    public void reminderButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else {
            num1 = Double.parseDouble(display.getText()+"");
            Double peRe = num1 / 100;
            display.setText(peRe+"");
        }
    }

    public void obelusButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else {
            num1 = Double.parseDouble(display.getText()+"");
            div = true;
            display.setText(null);
            operator_inserted = true;
        }
    }

    public void multiplyButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else {
            num1 = Double.parseDouble(display.getText()+"");
            mul = true;
            display.setText(null);
            operator_inserted = true;
        }
    }

    public void minusButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else {
            num1 = Double.parseDouble(display.getText()+"");
            sub = true;
            display.setText(null);
            operator_inserted = true;
        }
    }

    public void plusButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else {
            num1 = Double.parseDouble(display.getText()+"");
            add = true;
            display.setText(null);
            operator_inserted = true;
        }

    }

    public void decimalButton(View view) {
        //check if display is empty -> append 0 and insert 0
        if ((display.getText().toString()).isEmpty()) {
            display.setText(display.getText() + "0.");
            dot_inserted = true;
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        //if already a dot
        else if (display.getText().toString().contains(".")) {
            display.setText(display.getText()+"");
        }
        //check if dot is false -> append .
        else if ((!(display.getText().toString()).isEmpty())) {
            display.setText(display.getText() + ".");
            dot_inserted = true;
        }

    }

    public void deleteButton(View view) {
        if (display.length() == 0) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else {
            int len = display.getText().length();
            String ss = display.getText().toString();
            if (ss.charAt(len - 1) == '.') {
                dot_inserted = false;
                display.setText(display.getText().subSequence(0, display.getText().length()-1));
            }
            else {
                display.setText(display.getText().subSequence(0, display.getText().length()-1));
            }
        }
    }

    public void equalButton(View view) {

        if (operator_inserted = false) {
            display.setText("");
        }
        else if (("NaN").equals(display.getText().toString())) {
            display.setText("");
        }
        else if (display.length() == 0) {
            display.setText("");
        }
        else {
            num2 = Double.parseDouble(display.getText() + "");

            if (add == true) {

                display.setText(calc.Addition(num1,num2)+"");
                add = false;
            }
            if (sub == true) {
                display.setText(calc.Subtraction(num1,num2)+"");
                sub = false;
            }
            if (mul == true) {
                display.setText(calc.Multiplication(num1,num2)+"");
                mul = false;
            }
            if (div == true) {
                if (num2 == 0) {
                    display.setText("NaN");
                    div = false;
                }
                else
                    display.setText(calc.Division(num1,num2)+"");
                    div = false;
            }
        }
    }

}