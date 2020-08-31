package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SocialMedia extends AppCompatActivity {

    LinearLayout fb, insta, whatsapp;
    AdView adView;
    RelativeLayout about;
    TextView textView;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        adView = findViewById(R.id.social_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);

        about = findViewById(R.id.about);
        textView = findViewById(R.id.top_heading);
        scrollView = findViewById(R.id.scroll);

        Intent i = getIntent();
        String key = i.getStringExtra("key");
        if (key.equals("about")) {
            textView.setVisibility(View.GONE);
            scrollView.setVisibility(View.GONE);
            about.setVisibility(View.VISIBLE);
        }

        fb = findViewById(R.id.facebook_page);
        insta = findViewById(R.id.insta_page);
        whatsapp = findViewById(R.id.whatsapp);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/MH13-%E0%A4%86%E0%A4%AA%E0%A4%B2%E0%A4%82-%E0%A4%B8%E0%A5%8B%E0%A4%B2%E0%A4%BE%E0%A4%AA%E0%A5%81%E0%A4%B0-103069324856950/"));
                startActivity(i);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mh13.aapla.solapur/"));
                startActivity(i);
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=919307282629"));
                startActivity(i);
            }
        });
    }
}