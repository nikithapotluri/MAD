package com.example.a22501a0516recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class crickterviewholder extends RecyclerView.ViewHolder {
    ImageView imgv_mypic;
    TextView txtv_cname,txtv_crole;
    public crickterviewholder(@NonNull View itemView) {
        super(itemView);
        imgv_mypic=(ImageView) itemView.findViewById(R.id.imageView_pic);
        txtv_cname=(TextView) itemView.findViewById(R.id.crickter_name);
        txtv_crole=(TextView) itemView.findViewById(R.id.crole);
    }
}

