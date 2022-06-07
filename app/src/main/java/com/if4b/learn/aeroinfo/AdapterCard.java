package com.if4b.learn.aeroinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder>{
    public AdapterCard(ArrayList<ModelAirport> dataAirport){this.dataAirport = dataAirport;}
    private ArrayList<ModelAirport> dataAirport;

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_airport, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        ModelAirport airport = dataAirport.get(position);

        holder.tvAirport.setText(airport.getAirport());
        Glide.with(holder.itemView.getContext())
                .load(airport.getPhoto())
                .into(holder.ivAirport);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataAirport.size();
    }


    public class CardViewHolder extends RecyclerView.ViewHolder{
        ImageView ivAirport;
        TextView tvAirport;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAirport = itemView.findViewById(R.id.iv_airport);
            tvAirport = itemView.findViewById(R.id.tv_airport);
        }
    }
}
