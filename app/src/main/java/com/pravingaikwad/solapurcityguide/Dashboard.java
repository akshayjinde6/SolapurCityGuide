package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.ViewFlipper;

public class Dashboard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    ViewFlipper viewFlipper;
    private static String APP_URL = "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
    ImageButton menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewFlipper = findViewById(R.id.slideshow);
        menuButton = findViewById(R.id.menu);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });

        //Image Sliding
        int[] images = {R.drawable.siddheshwartemple, R.drawable.siddheshwartemple};
        for (int image : images) {
            imageSlider(image);
        }
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

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}