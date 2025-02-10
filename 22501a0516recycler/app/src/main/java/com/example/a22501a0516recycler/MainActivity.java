package com.example.a22501a0516recycler;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       List<crickter> players=new ArrayList<>();
       players.add(new crickter(R.drawable.sachinfan,"sachin","batman"));
        RecyclerView rcv=(RecyclerView) this.findViewById(R.id.rcv);
        rcv.setAdapter(new crickteradapter(getApplicationContext(),players));
        rcv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }
}