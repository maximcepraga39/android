package com.example.myapplication;

import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public abstract class CustomActivity extends AppCompatActivity {

    protected void addActivity(Button buttonActivityTwo, Class<? extends AppCompatActivity> activityClass) {
        buttonActivityTwo.setOnClickListener(v -> {
            Intent intent = new Intent(CustomActivity.this, activityClass);
            startActivity(intent);
        });
    }
}
