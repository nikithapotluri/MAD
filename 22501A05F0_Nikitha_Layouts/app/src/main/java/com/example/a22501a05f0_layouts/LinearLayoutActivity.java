package com.example.a22501a05f0_layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_linear_layout);
        ImageView imgv1, imgv2;
        imgv1=(ImageView)this.findViewById(R.id.img1);
        imgv1.setImageResource(R.drawable.dog);
        imgv2=(ImageView)this.findViewById(R.id.img2);
        imgv2.setImageResource(R.drawable.panda);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ll), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void changeOrientation(View v){
        LinearLayout ll= findViewById(R.id.ll);
        if(ll.getOrientation()==LinearLayout.HORIZONTAL)
        {
            ll.setOrientation(LinearLayout.VERTICAL);
        }
        else {
            ll.setOrientation(LinearLayout.HORIZONTAL);
        }
    }
}