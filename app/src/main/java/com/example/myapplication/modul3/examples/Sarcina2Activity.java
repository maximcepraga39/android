package com.example.myapplication.modul3.examples;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina2Activity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_2_activity);
        RelativeLayout bgElement = findViewById(R.id.sarcina_2_activity_layout);
        bgElement.setBackgroundColor(Color.WHITE);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            RelativeLayout bgElement = findViewById(R.id.sarcina_2_activity_layout);
            int color = ((ColorDrawable)
                    bgElement.getBackground()).getColor();
            if (color == Color.YELLOW) {
                bgElement.setBackgroundColor(Color.GREEN);
            } else {
                bgElement.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}
