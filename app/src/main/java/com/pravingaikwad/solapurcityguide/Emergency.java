package com.pravingaikwad.solapurcityguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Emergency extends AppCompatActivity {

    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        adView = findViewById(R.id.emergency_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);
    }
}