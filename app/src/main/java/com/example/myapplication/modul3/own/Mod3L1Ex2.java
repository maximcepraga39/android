package com.example.myapplication.modul3.own;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Mod3L1Ex2 extends AppCompatActivity {

    EditText editUtilizator, editParola;
    TextView rezultat;
    Button butonTrimite, butonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mod3_l1_ex2_activity);
        editUtilizator = findViewById(R.id.editUtilizator);
        editParola = findViewById(R.id.editParola);
        rezultat = findViewById(R.id.tvRezultat);
        butonTrimite = findViewById(R.id.butonTrimite);
        butonReset = findViewById(R.id.butonReset);
        butonTrimite.setOnClickListener(v -> {
            String utilizator = editUtilizator.getText().toString();
            String parola = editParola.getText().toString();
            rezultat.setText("Utilizator:\t" + utilizator + "\nParola:\t" + parola);
        });
    }
}
