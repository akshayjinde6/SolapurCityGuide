package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class History extends AppCompatActivity {

    TextView itihas, nav, bajar, awa, bhugol, jai, prashashan, itihas_text, nav_text, bajar_text, bhugol_text, jai_text, pra_text, awa_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        itihas = findViewById(R.id.itihas);
        itihas_text = findViewById(R.id.itihas_text);
        nav = findViewById(R.id.nav);
        nav_text = findViewById(R.id.nav_text);
        bhugol = findViewById(R.id.bhugol);
        bhugol_text = findViewById(R.id.bhugol_text);
        bajar = findViewById(R.id.bajar);
        bajar_text = findViewById(R.id.bajar_text);
        prashashan = findViewById(R.id.prashashan);
        pra_text = findViewById(R.id.prashashan_text);
        awa = findViewById(R.id.awa);
        awa_text = findViewById(R.id.awa_text);
        jai = findViewById(R.id.jai);
        jai_text = findViewById(R.id.jai_text);

        itihas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itihas_text.getVisibility() == View.VISIBLE) {
                    itihas_text.setVisibility(View.GONE);
                } else {
                    itihas_text.setVisibility(View.VISIBLE);
                }
            }
        });
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nav_text.getVisibility() == View.VISIBLE) {
                    nav_text.setVisibility(View.GONE);
                } else {
                    nav_text.setVisibility(View.VISIBLE);
                }
            }
        });
        bhugol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bhugol_text.getVisibility() == View.VISIBLE) {
                    bhugol_text.setVisibility(View.GONE);
                } else {
                    bhugol_text.setVisibility(View.VISIBLE);
                }
            }
        });
        bajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bajar_text.getVisibility() == View.VISIBLE) {
                    bajar_text.setVisibility(View.GONE);
                } else {
                    bajar_text.setVisibility(View.VISIBLE);
                }
            }
        });
        prashashan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pra_text.getVisibility() == View.VISIBLE) {
                    pra_text.setVisibility(View.GONE);
                } else {
                    pra_text.setVisibility(View.VISIBLE);
                }
            }
        });
        awa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (awa_text.getVisibility() == View.VISIBLE) {
                    awa_text.setVisibility(View.GONE);
                } else {
                    awa_text.setVisibility(View.VISIBLE);
                }
            }
        });
        jai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jai_text.getVisibility() == View.VISIBLE) {
                    jai_text.setVisibility(View.GONE);
                } else {
                    jai_text.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}