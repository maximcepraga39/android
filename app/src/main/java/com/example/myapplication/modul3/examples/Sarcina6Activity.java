package com.example.myapplication.modul3.examples;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_6_activity);

        final EditText e1 = findViewById(R.id.et1);
        final EditText e2 = findViewById(R.id.et2);
        final TextView tv4 = findViewById(R.id.tv4);
        findViewById(R.id.ib1).setOnClickListener(v -> {
            String str1 = e1.getText().toString();
            String str2 = e2.getText().toString();
            if(TextUtils.isEmpty(str1)){
                e1.setError("Introdu greutatea");
                e1.requestFocus();
                return;
            }
            if(TextUtils.isEmpty(str2)){
                e2.setError("Introdu înălțimea");
                e2.requestFocus();
                return;
            }
//Obținerea valorilor de la referințele controalelor
            float weight = Float.parseFloat(str1);
            float height = Float.parseFloat(str2)/100;
//Calcularea valorii BMI
            float bmiValue = calculateBMI(weight, height);
//Definirea valorii BMI
            String bmiInterpretation = interpretBMI(bmiValue);
            tv4.setText(bmiValue + " - " +
                    bmiInterpretation);
        });
    }
    //Calcularea BMI
    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }
    // Interpretarea valorii BMI
    private String interpretBMI(float bmiValue) {
        if (bmiValue < 16) {
            return "Greutate scăzută severă";
        } else if (bmiValue < 18.5) {
            return "Greutate scăzută";
        } else if (bmiValue < 25) {
            return "Greutate normală";
        } else if (bmiValue < 30) {
            return "Greutate ridicată";
        } else {
            return "Obezitate";
        }
    }
}
