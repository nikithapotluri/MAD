package com.example.a22501a0517_customtoast;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
public void showToast(View v)
{
    Toast.makeText(this, "hgftf", Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onStart() {
        Toast.makeText(this, "starting app", Toast.LENGTH_LONG).show();
        super.onStart();
    }
    public void showCustomToast(View v)
    {
        LayoutInflater lf=getLayoutInflater();
        ViewGroup vg=findViewById(R.id.ll_ctoast);
        View cv=lf.inflate(R.layout.customtoastlayout,vg);
        Toast t=new Toast(this);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(cv);
        t.show();
    }
}