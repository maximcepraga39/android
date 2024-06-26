//package com.example.myapplication.modul3.own;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.myapplication.R;
//
//public class Mod3L2Ex2 extends AppCompatActivity {
//
//    private TextView display;
//    private String currentInput = "";
//    private String operator = "";
//    private double firstNumber = 0.0;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.mod3_l2_ex2_activity);
//
//        display = findViewById(R.id.l2e2_display);
//
//        setNumberButtonListeners();
//        setOperatorButtonListeners();
//        setEqualsButtonListener();
//        setClearButtonListener();
//    }
//
//    private void setNumberButtonListeners() {
//        int[] numberButtonIds = {
//                R.id.l2e2_button1, R.id.l2e2_button2, R.id.l2e2_button3,
//                R.id.l2e2_button4, R.id.l2e2_button5, R.id.l2e2_button6,
//                R.id.l2e2_button7, R.id.l2e2_button8, R.id.l2e2_button9, R.id.l2e2_button0
//        };
//
//        View.OnClickListener listener = v -> {
//            Button button = (Button) v;
//            currentInput += button.getText().toString();
//            display.setText(currentInput);
//        };
//
//        for (int id : numberButtonIds) {
//            findViewById(id).setOnClickListener(listener);
//        }
//    }
//
//    private void setOperatorButtonListeners() {
//        int[] operatorButtonIds = {
//                R.id.l2e2_buttonPlus, R.id.l2e2_buttonMinus,
//                R.id.l2e2_buttonMultiply, R.id.l2e2_buttonDivide
//        };
//
//        View.OnClickListener listener = v -> {
//            Button button = (Button) v;
//            operator = button.getText().toString();
//            firstNumber = Double.parseDouble(currentInput);
//            currentInput = "";
//        };
//
//        for (int id : operatorButtonIds) {
//            findViewById(id).setOnClickListener(listener);
//        }
//    }
//
//    private void setEqualsButtonListener() {
//        findViewById(R.id.l2e2_buttonEquals).setOnClickListener(v -> {
//            double secondNumber = Double.parseDouble(currentInput);
//            double result = 0.0;
//
//            switch (operator) {
//                case "+":
//                    result = firstNumber + secondNumber;
//                    break;
//                case "-":
//                    result = firstNumber - secondNumber;
//                    break;
//                case "*":
//                    result = firstNumber * secondNumber;
//                    break;
//                case "/":
//                    result = firstNumber / secondNumber;
//                    break;
//            }
//
//            display.setText(String.valueOf(result));
//            currentInput = "";
//            operator = "";
//        });
//    }
//
//    private void setClearButtonListener() {
//        findViewById(R.id.l2e2_buttonClear).setOnClickListener(v -> {
//            currentInput = "";
//            operator = "";
//            firstNumber = 0.0;
//            display.setText("0");
//        });
//    }
//}