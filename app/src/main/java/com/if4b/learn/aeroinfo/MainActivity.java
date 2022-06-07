package com.if4b.learn.aeroinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top_right, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_card:
                tampilDataCard();
                break;
            case R.id.menu_grid:
                tampilDataGrid();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void tampilDataGrid(){
                                                                // span count = colums
        rvAirport.setLayoutManager(new GridLayoutManager(this, 1));
        AdapterGrid adapterGrid = new AdapterGrid(data);

        rvAirport.setAdapter(adapterGrid);

        adapterGrid.setOnItemClickCallBack(new AdapterGrid.OnItemCLickCallBack() {
            @Override
            public void onItemClicked(ModelAirport data) {
                Toast.makeText(MainActivity.this, "Nama Airport" + data.getAirport(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void tampilDataCard() {
        rvAirport.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard adapterCard = new AdapterCard(data);
        rvAirport.setAdapter(adapterCard);

        adapterCard.setOnItemClickCallBack(new AdapterGrid.OnItemCLickCallBack() {
            @Override
            public void onItemClicked(ModelAirport data) {
                Intent move = new Intent(MainActivity.this, DetailAirport.class);
                move.putExtra("xPhoto", data.getPhoto());
                move.putExtra("xAirport", data.getAirport());
                move.putExtra("xICAO", data.getICAO());
                move.putExtra("xIATA", data.getIATA());
                move.putExtra("xCountry", data.getCountry());
                move.putExtra("xRegion", data.getRegion());
                move.putExtra("xAddress", data.getAddress());
                move.putExtra("xTelephone", data.getTelephone());

                startActivity(move);
            }
        });

    }

}