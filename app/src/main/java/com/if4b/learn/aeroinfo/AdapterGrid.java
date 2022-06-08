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

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.GridViewHolder> {
    private ArrayList<ModelAirport> dataAirport;

    public AdapterGrid(ArrayList<ModelAirport> dataAirport){
        this.dataAirport = dataAirport;
    }

    interface OnItemCLickCallBack{
        void onItemClicked(ModelAirport data);
    }
    private OnItemCLickCallBack callBack;

    public void setOnItemClickCallBack(OnItemCLickCallBack callBack)
    {
        this.callBack = callBack;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_airport, parent, false);

        return new GridViewHolder(view);
    }
//
    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        ModelAirport airport = dataAirport.get(position);
        holder.tvgridairport.setText(airport.getAirport());
        Glide
                .with(holder.itemView.getContext())
                .load(airport.getPhoto())
                .into(holder.ivgridairport);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.onItemClicked(dataAirport.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataAirport.size();
    }


    public class GridViewHolder extends RecyclerView.ViewHolder{

       ImageView ivgridairport;
       TextView tvgridairport;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            ivgridairport= itemView.findViewById(R.id.iv_grid_airport);
            tvgridairport= itemView.findViewById(R.id.tv_grid_airport);
        }
    }

}
