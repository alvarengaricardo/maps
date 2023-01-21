package com.example.maps;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;

public class MainActivity extends AppCompatActivity {
    TextView tvLat, tvLon, tvAltitude, tvAccuracy, tvSpeed, tvSensor, tvUpdates, tvAddress;
    Switch swLocationsUpdates, swGps;
    boolean updateOn = false;
    private static final int DEFAULT_UPDATE = 30;
    private static final int MIN_UPDATE = 5;


    // Location Request
    LocationRequest locationRequest;

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

        locationRequest = new LocationRequest();
        locationRequest.setInterval(1000 * DEFAULT_UPDATE);
        locationRequest.setFastestInterval(1000 * MIN_UPDATE);
        locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);

        /*
        swGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swGps.isChecked()) {
                    locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
                    tvSensor.setText("GPS ON");
                }else{
                    locationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
                    tvSensor.setText("Using Tower and WIFI");
                }
            }
        });*/
    }
}