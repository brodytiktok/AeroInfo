package com.if4b.learn.aeroinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailAirport extends AppCompatActivity {
    private ImageView ivAirport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivAirport = findViewById(R.id.iv_airport);

        ///.with(DetailAirport.this)
        ///        .load(photo)
        ///        .into(ivAirport);
    }
}