package com.example.a22501a05f0_toast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

    @Override
    protected  void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "onResume() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "onPause() is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "onStop() called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "onDestroy() called", Toast.LENGTH_SHORT).show();
    }

    public void showToast(View v){
        Toast.makeText(this, "Hello, World!", Toast.LENGTH_SHORT).show();
    }

    public void showCustomToast(View v){
        LayoutInflater lf = getLayoutInflater();
        ViewGroup vg = findViewById(R.id.ll_custom_toast);
        View cv = lf.inflate(R.layout.custom_toast_layout, vg);
        ImageView imgv = (ImageView)cv.findViewById(R.id.img_ctoast);
        imgv.setImageResource(R.drawable.dog);
        Toast t=new Toast(this);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(cv);
        t.show();
    }
}