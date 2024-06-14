package com.example.myapplication;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreateSupportNavigateUpTaskStack(@NonNull TaskStackBuilder builder) {
        super.onCreateSupportNavigateUpTaskStack(builder);
        setContentView(R.layout.activity_main);

        View helloButton = findViewById(R.id.helloButton);

        helloButton.setOnClickListener((view) -> {
            Snackbar snackbar = Snackbar.make(view, "Hello world!", 5);
            snackbar.show();
        });

    }
}
