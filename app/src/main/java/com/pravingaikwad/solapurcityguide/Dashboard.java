package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Dashboard extends AppCompatActivity {

    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewFlipper = findViewById(R.id.slideshow);
        int[] images = {R.drawable.background,R.drawable.ic_launcher_background,R.drawable.background};

        for (int image : images) {
            imageSlider(image);
        }
    }

    private void imageSlider(int i){
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