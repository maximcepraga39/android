package com.example.myapplication.modul3.examples;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina10Activity extends AppCompatActivity {

    Button closeButton;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_10_activity);
        closeButton = findViewById(R.id.button);
        builder = new AlertDialog.Builder(this);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage(R.string.dialog_message)
                        .setTitle(R.string.dialog_title);
// Setarea manuală a mesajului și setarea acțiunii la clic pe buton
                builder.setMessage("Doriți să închideți aplicația ?")
                        .setCancelable(false)
                        .setPositiveButton("Da", (dialog, id) -> {
//                            finish();
                            System.exit(0);
                            Toast.makeText(getApplicationContext(),"Ai ales Da pentru caseta de alertă",
                                    Toast.LENGTH_SHORT).show();
                        })
                        .setNegativeButton("Nu", (dialog, id) -> {
// Acțiunea pentru butonul „Nu”
                            dialog.cancel();
                            Toast.makeText(getApplicationContext(),"Ai ales Nu pentru caseta de alertă",
                                    Toast.LENGTH_SHORT).show();
                        });
//Crearea casetei de dialog
                AlertDialog alert = builder.create();
//Setarea manuală a titlului
                alert.setTitle("ExempluAlertDialog");
                alert.show();
            }
        });
    }
}
