package com.example.myapplication.modul3.examples;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina8Activity extends AppCompatActivity {

    String[] disciplina ={"Matematica","Informatica",
            "BioInformatica", "Biologia",
            "Chimia","Fizica","Engleza","Româna",
            "Istoria", "Geologia","Geografia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_8_activity);
//Crearea adaptorului
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,disciplina);
//Cream accesul la caseta
        AutoCompleteTextView actv =
                (AutoCompleteTextView)findViewById(R.id.Caseta1);
// va afisa lista de sugestii imediat
// ce primul caracter va fi cules
        actv.setThreshold(1);
// alegem adaptorul pentru caseta actv
        actv.setAdapter(adapter);
//setarea culorii textului cules in caseta
        actv.setTextColor(Color.RED);
    }
}
