package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Link extends AppCompatActivity {

    TextView mnc, cop, sop, dc, zp, su, pan, akka, pomo, water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        mnc = findViewById(R.id.mnc);
        cop = findViewById(R.id.cop);
        sop = findViewById(R.id.sop);
        zp = findViewById(R.id.zp);
        dc = findViewById(R.id.dc);
        su = findViewById(R.id.su);
        pan = findViewById(R.id.pan);
        akka = findViewById(R.id.akka);
        pomo = findViewById(R.id.pomo);
        water = findViewById(R.id.water);

        mnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.solapurcorporation.gov.in/"));
                startActivity(i);
            }
        });
        cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://solapurcitypolice.gov.in/"));
                startActivity(i);
            }
        });
        sop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://solapurpolice.gov.in/"));
                startActivity(i);
            }
        });
        zp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://zpsolapur.gov.in/"));
                startActivity(i);
            }
        });
        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://ecourts.gov.in/solapur"));
                startActivity(i);
            }
        });
        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.vitthalrukminimandir.org/English/home.html"));
                startActivity(i);
            }
        });
        pomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://nrcpomegranate.icar.gov.in/"));
                startActivity(i);
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://sayajirajepark.com/sayajirajepark/"));
                startActivity(i);
            }
        });
        akka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.swamiannacchatra.org/"));
                startActivity(i);
            }
        });
    }
}