package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Talent extends AppCompatActivity {

    LinearLayout whatsapp, mail;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talent);

        whatsapp = findViewById(R.id.whatapp);
        mail = findViewById(R.id.mail);

        adView = findViewById(R.id.talent_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=919307282629"));
                startActivity(i);
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:mh13aaplasolapur@gmail.com"));
                startActivity(i);
            }
        });
    }
}