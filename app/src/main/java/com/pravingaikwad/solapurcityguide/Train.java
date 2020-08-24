package com.pravingaikwad.solapurcityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Train extends AppCompatActivity {

    View v1, v2, v3, v4, v5, v6, v7, v8, v9, v10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        v1 = findViewById(R.id.view);
        v2 = findViewById(R.id.view2);
        v3 = findViewById(R.id.view3);
        v4 = findViewById(R.id.view4);
        v5 = findViewById(R.id.view5);
        v6 = findViewById(R.id.view6);
        v7 = findViewById(R.id.view7);
        v8 = findViewById(R.id.view8);
        v9 = findViewById(R.id.view9);
        v10 = findViewById(R.id.view10);

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info1);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info2);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info3);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info4);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info5);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info6);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info7);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info8);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info9);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info10);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
    }
}