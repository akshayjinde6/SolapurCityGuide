package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SocialMedia extends AppCompatActivity {

    LinearLayout fb, insta, whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        fb = findViewById(R.id.facebook_page);
        insta = findViewById(R.id.insta_page);
        whatsapp = findViewById(R.id.whatapp);

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