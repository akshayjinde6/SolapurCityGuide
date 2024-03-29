package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Tourism extends AppCompatActivity {

    CardView hos, hotel, food, office, tour, school;
    AdView adView;
    GridLayout gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism);

        hos = findViewById(R.id.hospital);
        hotel = findViewById(R.id.hotel);
        food = findViewById(R.id.food);
        office = findViewById(R.id.office);
        tour = findViewById(R.id.toursandtravels);
        school = findViewById(R.id.schoolCollege);
        gridView = findViewById(R.id.grid_l);

        adView = findViewById(R.id.local_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);


        hos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Hospitals.class));
            }
        });
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Hotels.class));
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FoodRes.class));
            }
        });
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), IMPOffices.class));
            }
        });
        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ToursTravels.class));
            }
        });
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SchoolCollege.class));
            }
        });
    }
}