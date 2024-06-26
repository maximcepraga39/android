package com.example.myapplication.modul3.examples;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.myapplication.CustomActivity;
import com.example.myapplication.R;

public class ExamplesActivity extends CustomActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul3_examples_activity);

        Button buttonActivityOne = findViewById(R.id.button_activity_one);
        Button buttonActivityTwo = findViewById(R.id.button_activity_two);
        Button buttonActivityThree = findViewById(R.id.button_activity_three);
        Button buttonActivityFour = findViewById(R.id.button_activity_four);
        Button buttonActivityFive = findViewById(R.id.button_activity_five);
        Button buttonActivitySix = findViewById(R.id.button_activity_six);
        Button buttonActivitySeven = findViewById(R.id.button_activity_seven);
        Button buttonActivityEight = findViewById(R.id.button_activity_eight);
        Button buttonActivityNine = findViewById(R.id.button_activity_nine);
        Button buttonActivityTen = findViewById(R.id.button_activity_ten);
        Button buttonActivityEleven = findViewById(R.id.button_activity_eleven);

        addActivity(buttonActivityOne, Sarcina1Activity.class);
        addActivity(buttonActivityTwo, Sarcina2Activity.class);
        addActivity(buttonActivityThree, Sarcina3Activity.class);
        addActivity(buttonActivityFour, Sarcina4Activity.class);
        addActivity(buttonActivityFive, Sarcina5Activity.class);
        addActivity(buttonActivitySix, Sarcina6Activity.class);
        addActivity(buttonActivitySeven, Sarcina7Activity.class);
        addActivity(buttonActivityEight, Sarcina8Activity.class);
        addActivity(buttonActivityNine, Sarcina9Activity.class);
        addActivity(buttonActivityTen, Sarcina10Activity.class);
        addActivity(buttonActivityEleven, Sarcina11Activity.class);

    }
}
