package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Devo_info extends AppCompatActivity {

    TextView name, location, contact, mail;
    LinearLayout sid, tul, pan, gan, akka, bar;
    ViewFlipper viewFlipper;
    private String dev = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devo_info);

        viewFlipper = findViewById(R.id.image);
        name = findViewById(R.id.name);
        location = findViewById(R.id.location);
        contact = findViewById(R.id.contact);
        mail = findViewById(R.id.mail);
        sid = findViewById(R.id.sid);
        tul = findViewById(R.id.tul);
        pan = findViewById(R.id.pan);
        gan = findViewById(R.id.gan);
        akka = findViewById(R.id.akka);
        bar = findViewById(R.id.bar);
        Intent i = getIntent();

        int[] sidImages = {R.drawable.sid, R.drawable.sid2, R.drawable.sid3};
        int[] tulImages = {R.drawable.tul1, R.drawable.tul2, R.drawable.tul3};
        int[] panImages = {R.drawable.pan1, R.drawable.pan2, R.drawable.pan3};
        int[] akkaImages = {R.drawable.akka1, R.drawable.akka2, R.drawable.akka3};
        int[] ganImages = {R.drawable.gan1, R.drawable.gan2, R.drawable.gan3};
        int[] barImages = {R.drawable.bar1, R.drawable.bar2, R.drawable.bar3};

        dev = i.getStringExtra("dev");
        if (dev.equals("sid")) {
            for (int image : sidImages) {
                imageSlider(image);
            }
            sid.setVisibility(View.VISIBLE);
        }
        if (dev.equals("tul")) {
            for (int image : tulImages) {
                imageSlider(image);
            }
            name.setText(R.string.tuljapur_name);
            location.setText(R.string.tuljapur_location);
            contact.setText(R.string.tal_contact);
            mail.setText(R.string.tul_mail);
            tul.setVisibility(View.VISIBLE);
        }
        if (dev.equals("pan")) {
            for (int image : panImages) {
                imageSlider(image);
            }
            name.setText(R.string.pandharpur_temple_name);
            location.setText(R.string.pan_location);
            contact.setText(R.string.pan_contact);
            mail.setText(R.string.pan_mail);
            pan.setVisibility(View.VISIBLE);
        }
        if (dev.equals("gan")) {
            for (int image : ganImages) {
                imageSlider(image);
            }
            name.setText(R.string.gangapur_temple_name);
            location.setText(R.string.gan_location);
            contact.setText(R.string.gan_contact);
            mail.setText(R.string.gan_mail);
            gan.setVisibility(View.VISIBLE);
        }
        if (dev.equals("akka")) {
            for (int image : akkaImages) {
                imageSlider(image);
            }
            name.setText(R.string.akkalkot_temple_name);
            location.setText(R.string.akka_location);
            contact.setText(R.string.akka_contact);
            mail.setText(R.string.akka_mail);
            akka.setVisibility(View.VISIBLE);
        }
        if (dev.equals("bar")) {
            for (int image : barImages) {
                imageSlider(image);
            }
            name.setText(R.string.barshi_temple_name);
            location.setText(R.string.bar_location);
            contact.setText(R.string.bar_contact);
            mail.setText(R.string.bar_mail);
            bar.setVisibility(View.VISIBLE);
        }

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if(dev.equals("sid")){
                    Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("google.navigation:q=an+siddheshwar mandir+solapur"));
                    startActivity(i);
                }*/
                Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + name.getText() + " " + location.getText()));
                startActivity(i);
            }
        });

    }

    private void imageSlider(int i) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(i);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setDisplayedChild(0);

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}