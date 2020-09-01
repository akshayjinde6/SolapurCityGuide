package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class FoodRes extends AppCompatActivity {

    LinearLayout zomato, swiggy;
    AdView adView;
    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_res);

        adView = findViewById(R.id.food_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstetial_food_ad));
        interstitialAd.loadAd(new AdRequest.Builder().build());

        zomato = findViewById(R.id.zomato);
        swiggy = findViewById(R.id.swiggy_page);

        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/solapur?city_id=11397"));
                startActivity(i);
            }
        });
        swiggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.swiggy.com/restaurants"));
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        try {
            if (interstitialAd.isLoaded()) {
                interstitialAd.show();
            }
        } catch (Exception ex) {
            finish();
        }
    }
}