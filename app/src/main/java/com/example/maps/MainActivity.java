package com.example.maps;

import static com.google.android.gms.location.LocationRequest.Builder.IMPLICIT_MIN_UPDATE_INTERVAL;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.Priority;

public class MainActivity extends AppCompatActivity{
    public static final int defaultUpdateInterval = 30;
    public static final int shortUpdateInterval = 5;
    TextView tvLat, tvLon, tvAltitude, tvAccuracy, tvSpeed, tvSensor, tvUpdates, tvAddress;
    Switch swLocationsUpdates, swGps;

    // Locatin Request
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

        // locationrequest



        new LocationRequest.Builder(Priority.PRIORITY_HIGH_ACCURACY, 10000)
                .setWaitForAccurateLocation(false)
                .setMinUpdateIntervalMillis(IMPLICIT_MIN_UPDATE_INTERVAL)
                .setMaxUpdateDelayMillis(100000)
                .build();

    }
}

