package com.example.myapplication.modul3.examples;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_9_activity);
//Se afișează Toast cu mesajul Toast
        Toast.makeText(getApplicationContext(),"Toast", Toast.LENGTH_LONG).show();
    }
}
