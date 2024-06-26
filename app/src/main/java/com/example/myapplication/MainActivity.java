package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.modul3.examples.ExamplesActivity;
import com.example.myapplication.modul3.examples.Sarcina1Activity;
import com.example.myapplication.modul3.examples.Sarcina2Activity;
import com.example.myapplication.modul3.examples.Sarcina3Activity;
import com.example.myapplication.modul3.own.Mod3L1Ex2;
import com.example.myapplication.modul3.own.OwnActivity;

public class MainActivity extends CustomActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonActivityEx = findViewById(R.id.button_mod3_ex);
        Button buttonActivityOwn = findViewById(R.id.button_mod3_own);

        addActivity(buttonActivityEx, ExamplesActivity.class);
        addActivity(buttonActivityOwn, OwnActivity.class);
    }
}
