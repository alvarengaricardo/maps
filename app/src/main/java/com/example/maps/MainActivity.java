package com.example.maps;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;

public class MainActivity extends AppCompatActivity{
    TextView tvLat, tvLon, tvAltitude, tvAccuracy, tvSpeed, tvSensor, tvUpdates, tvAddress;
    Switch swLocationsUpdates, swGps;

    // Google API
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLat = findViewById(R.id.tvLat);
        tvLon = findViewById(R.id.tvLon);
        tvAltitude = findViewById(R.id.tvAltitude);
        tvAccuracy = findViewById(R.id.tvAccuracy);
        tvSpeed = findViewById(R.id.tvSpeed);
        tvSensor = findViewById(R.id.tvSensor);
        tvUpdates = findViewById(R.id.tvUpdates);
        tvAddress = findViewById(R.id.tvAddress);
        swLocationsUpdates = findViewById(R.id.swLocationsUpdates);
        swGps = findViewById(R.id.swGps);

    }
}

