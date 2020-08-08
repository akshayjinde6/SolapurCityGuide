package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Devo_info extends AppCompatActivity {

    TextView name, location;
    LinearLayout sid, tul, pan, gan, akka, bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devo_info);

        name = findViewById(R.id.name);
        location = findViewById(R.id.location);
        sid = findViewById(R.id.sid);
        tul = findViewById(R.id.tul);
        pan = findViewById(R.id.pan);
        gan = findViewById(R.id.gan);
        akka = findViewById(R.id.akka);
        bar = findViewById(R.id.bar);
        Intent i = getIntent();

        String dev = i.getStringExtra("dev");
        if (dev.equals("sid")) {
            sid.setVisibility(View.VISIBLE);
        }
        if (dev.equals("tul")) {
            name.setText(R.string.tuljapur_name);
            location.setText(R.string.tuljapur_location);
            tul.setVisibility(View.VISIBLE);
        }
        if (dev.equals("pan")) {
            name.setText(R.string.pandharpur_temple_name);
            location.setText(R.string.pan_location);
            pan.setVisibility(View.VISIBLE);
        }
        if (dev.equals("gan")) {
            name.setText(R.string.gangapur_temple_name);
            location.setText(R.string.gan_location);
            gan.setVisibility(View.VISIBLE);
        }
        if (dev.equals("akka")) {
            name.setText(R.string.akkalkot_temple_name);
            location.setText(R.string.akka_location);
            akka.setVisibility(View.VISIBLE);
        }
        if (dev.equals("bar")) {
            name.setText(R.string.barshi_temple_name);
            location.setText(R.string.bar_location);
            bar.setVisibility(View.VISIBLE);
        }
    }
}