package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Devotional extends AppCompatActivity {

    CardView sid, tuljapur, pan, akka, gan, bar;
    AdView adView;
    GridLayout gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devotional);

        sid = findViewById(R.id.siddheshwar);
        tuljapur = findViewById(R.id.tuljapur);
        pan = findViewById(R.id.pandharpur);
        akka = findViewById(R.id.akkalkot);
        gan = findViewById(R.id.ganangapur);
        bar = findViewById(R.id.barshi);
        gridView = findViewById(R.id.grid);

        adView = findViewById(R.id.dharmik_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);

        sid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Devo_info.class);
                i.putExtra("dev", "sid");
                startActivity(i);
            }
        });

        tuljapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Devo_info.class);
                i.putExtra("dev", "tul");
                startActivity(i);
            }
        });
        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Devo_info.class);
                i.putExtra("dev", "pan");
                startActivity(i);
            }
        });
        akka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Devo_info.class);
                i.putExtra("dev", "akka");
                startActivity(i);
            }
        });
        gan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Devo_info.class);
                i.putExtra("dev", "gan");
                startActivity(i);
            }
        });
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Devo_info.class);
                i.putExtra("dev", "bar");
                startActivity(i);
            }
        });
    }
}