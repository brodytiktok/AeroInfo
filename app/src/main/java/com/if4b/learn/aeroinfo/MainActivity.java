package com.if4b.learn.aeroinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAirport;
    private ArrayList<ModelAirport> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAirport = findViewById(R.id.rv_airport);
        rvAirport.setHasFixedSize(true);

        data.addAll(DataAirport.ambilDataAirport());
        tampilDataCard();
    }

    private void tampilDataCard() {
        rvAirport.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard adapterCard = new AdapterCard(data);
        rvAirport.setAdapter(adapterCard);
    }

}