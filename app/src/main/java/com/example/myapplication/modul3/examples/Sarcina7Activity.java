package com.example.myapplication.modul3.examples;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina7Activity extends AppCompatActivity {

    Button btnSubmit;
    EditText nume, prenume, datanasterii, email, telefon;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_7_activity);

        nume= findViewById(R.id.txtNume);
        prenume = findViewById(R.id.txtPren);
        datanasterii = findViewById(R.id.txtDate);
        email = findViewById(R.id.txtEmail);
        telefon= findViewById(R.id.txtTel);
        btnSubmit = findViewById(R.id.btnSend);
        result = findViewById(R.id.resultView);
// Prelucram evenimentul de apasare a butonului
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
// Verificam ca fiecare caseta sa fie completata
                if (nume.getText().toString().isEmpty() ||
                        prenume.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        datanasterii.getText().toString().isEmpty()||
                        telefon.getText().toString().isEmpty())
                {
                    result.setText("Completați toate câmpurile!");
                } else
                {
                    result.setText("Nume - " +
                            nume.getText().toString() + " \n" + "Prenume - " +
                        prenume.getText().toString()+ " \n" + "E-Mail - " +
                        email.getText().toString() + " \n" + "Data nașterii -" +
                        datanasterii.getText().toString() + " \n" + "Telefon -" +
                        telefon.getText().toString());
                }
            }
        });
    }
}
