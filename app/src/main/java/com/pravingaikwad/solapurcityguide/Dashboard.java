package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Dashboard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    ViewFlipper viewFlipper;
    static String APP_URL = "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
    ImageButton menuButton;
    CardView history, devotional, tourism, train, bus, emergency, links, talent, social;
    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewFlipper = findViewById(R.id.slideshow);
        menuButton = findViewById(R.id.menu);
        history = findViewById(R.id.history);
        devotional = findViewById(R.id.devotional);
        tourism = findViewById(R.id.local);
        train = findViewById(R.id.train);
        bus = findViewById(R.id.bus);
        emergency = findViewById(R.id.emergency);
        links = findViewById(R.id.links);
        talent = findViewById(R.id.talent);
        social = findViewById(R.id.social_media);

        prepareAd();
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (interstitialAd.isLoaded()) {
                            interstitialAd.show();
                        } else {
                            Log.d("TAG", "Ad not loaded");
                        }
                        prepareAd();
                    }
                });
            }
        }, 60, 180, TimeUnit.SECONDS);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });

        //Image Sliding
        int[] images = {R.drawable.sid, R.drawable.mnc, R.drawable.rani, R.drawable.rang, R.drawable.train};
        for (int image : images) {
            imageSlider(image);
        }

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), History.class));
            }
        });
        devotional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Devotional.class));
            }
        });
        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Tourism.class));
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Train.class));
            }
        });
        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Bus.class));
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Emergency.class));
            }
        });
        links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Link.class));
            }
        });
        talent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Talent.class));
            }
        });
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SocialMedia.class));
            }
        });
    }

    private void showMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.main_menu);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.rate:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(APP_URL)));
                return true;
            case R.id.feedback:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(APP_URL)));
                return true;
            default:
                return false;
        }
    }

    private void imageSlider(int i) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(i);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setDisplayedChild(0);

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void prepareAd() {
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstetial_main_ad));
        interstitialAd.loadAd(new AdRequest.Builder().build());
    }
}