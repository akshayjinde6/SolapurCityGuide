package com.pravingaikwad.solapurcityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class FoodRes extends AppCompatActivity {

    LinearLayout zomato, swiggy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_res);

        zomato = findViewById(R.id.zomato);
        swiggy = findViewById(R.id.swiggy_page);

        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/"));
                startActivity(i);
            }
        });
        swiggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.swiggy.com/restaurants"));
                startActivity(i);
            }
        });
    }
}