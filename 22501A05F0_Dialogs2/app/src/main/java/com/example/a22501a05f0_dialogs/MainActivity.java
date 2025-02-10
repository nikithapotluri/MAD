package com.example.a22501a05f0_dialogs;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void show_dialog(View v)
    {
        Log.d("MICDIALOG", "btn_show_dialog: one");
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        Log.d("MICDIALOG", "btn_show_dialog: two");
        Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
        adb.setTitle("My Dialog");
        adb.setMessage("This is the dialog created by Nikitha");
        adb.setCancelable(true);
        adb.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, "Clicked on Done", Toast.LENGTH_SHORT).show();
            }
        });


        adb.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Clicked on Exit", Toast.LENGTH_SHORT).show();
            }
        });

    AlertDialog ad = adb.create();
    Log.d("MICDIALOG", "btn_show_dialog: three"+ad.toString());
    ad.show();
    }

    public void show_td_dialog(View v)
    {

        Calendar c = Calendar.getInstance();
                int dh = c.get(Calendar.HOUR);
                int dm = c.get(Calendar.MINUTE);
                TimePickerDialog tpd = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener(){
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1)
                    {
                        Toast.makeText(MainActivity.this, i+"H:,"+i1+"m", Toast.LENGTH_SHORT).show();
                    }
                }, dh, dm,false);
                tpd.show();
    }

    public void show_dd_dialog(View v)
    {
        int yr, mn, day;
        Calendar c = Calendar.getInstance();
        yr = c.get(Calendar.YEAR);
        mn = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2)
            {
                Toast.makeText(MainActivity.this, i+"Y:,"+i1+"m"+i2+"d", Toast.LENGTH_LONG).show();
            }
        }, yr, mn, day);
        dpd.setTitle("Pick a date please");
        dpd.setMessage("Hello I'm Nikitha");
        dpd.show();
    }
}