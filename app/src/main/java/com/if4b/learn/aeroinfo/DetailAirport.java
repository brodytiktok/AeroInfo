package com.if4b.learn.aeroinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailAirport extends AppCompatActivity {
    private ImageView ivAirport;
    private TextView tvAirport, tvICAO, tvIATA, tvCountry, tvRegion, tvAddress, tvTelephone;
    private String photo, airport, icao, iata, country, region, address, telephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
//
        initView();

        Intent approve = getIntent();
        photo = approve.getStringExtra("xPhoto");
        airport = approve.getStringExtra("xAirport");
        icao= approve.getStringExtra("xICAO");
        iata= approve.getStringExtra("xIATA");
        country= approve.getStringExtra("xCountry");
        region = approve.getStringExtra("xRegion");
        address= approve.getStringExtra("xAddress");
        telephone= approve.getStringExtra("xTelephone");
        // Menampilkan Text

        tvAirport.setText(airport);
        tvICAO.setText(icao);
        tvIATA.setText(iata);
        tvCountry.setText(country);
        tvRegion.setText(region);
        tvAddress.setText(address);
        tvTelephone.setText(telephone);
        Glide.with(DetailAirport.this)
              .load(photo)
                .into(ivAirport);
    }

    private void initView(){
        ivAirport = findViewById(R.id.iv_airport);
        tvAirport = findViewById(R.id.tv_airport);
        tvICAO = findViewById(R.id.tv_icao);
        tvIATA = findViewById(R.id.tv_iata);
        tvCountry = findViewById(R.id.tv_country);
        tvRegion = findViewById(R.id.tv_region);
        tvAddress = findViewById(R.id.tv_address);
        tvTelephone = findViewById(R.id.tv_telephone);

    }
}