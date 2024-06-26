package com.example.myapplication.modul3.examples;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class Sarcina11Activity extends AppCompatActivity {

    private Calendar calendar;
    private TextView data;
    private int year, month, day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sarcina_11_activity);
        data = findViewById(R.id.textView3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);
    }
    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                        Toast.LENGTH_SHORT)
                .show();
    }
    @SuppressWarnings("deprecation")
    @Override
    protected Dialog onCreateDialog(int id) {
// Metodă generată automat
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker argument0,
                                      int argument1, int argument2,
                                      int argument3) {
// Metoda generată automat
// argument1 = year
// argument2 = month
// argument3 = day
                    showDate(argument1, argument2+1, argument3);
                }
            };
    private void showDate(int year, int month, int day) {
        data.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }
}
