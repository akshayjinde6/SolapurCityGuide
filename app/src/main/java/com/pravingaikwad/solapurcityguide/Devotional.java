package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Devotional extends AppCompatActivity {

    CardView sid, tuljapur, pan, akka, gan, bar;

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
    }
}