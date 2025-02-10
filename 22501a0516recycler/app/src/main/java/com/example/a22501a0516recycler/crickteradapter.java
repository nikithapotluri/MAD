package com.example.a22501a0516recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class crickteradapter extends RecyclerView.Adapter<crickterviewholder>{ Context ct;
    List<crickter>players;
    public crickteradapter(Context ct,List<crickter> players){
        this.ct = ct; this.players=players;
}


    @NonNull
    @Override
    public crickterviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new crickterviewholder(LayoutInflater.from(ct).inflate(R.layout.itemlayout_rcv,parent,false));
    }



    @Override
    public void onBindViewHolder(@NonNull crickterviewholder holder, int position) {
       holder.imgv_mypic.setImageResource(players.get(position).getCpic());
       holder.txtv_cname.setText(players.get(position).getCrole());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
