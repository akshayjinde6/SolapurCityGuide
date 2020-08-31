package com.pravingaikwad.solapurcityguide;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Train extends AppCompatActivity {

    View v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, v30, v31;
    AdView adView;

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
        v11 = findViewById(R.id.view11);
        v12 = findViewById(R.id.view12);
        v13 = findViewById(R.id.view13);
        v14 = findViewById(R.id.view14);
        v15 = findViewById(R.id.view15);
        v16 = findViewById(R.id.view16);
        v17 = findViewById(R.id.view17);
        v18 = findViewById(R.id.view18);
        v19 = findViewById(R.id.view19);
        v20 = findViewById(R.id.view20);
        v21 = findViewById(R.id.view21);
        v22 = findViewById(R.id.view22);
        v23 = findViewById(R.id.view23);
        v24 = findViewById(R.id.view24);
        v25 = findViewById(R.id.view25);
        v26 = findViewById(R.id.view26);
        v27 = findViewById(R.id.view27);
        v28 = findViewById(R.id.view28);
        v29 = findViewById(R.id.view29);
        v30 = findViewById(R.id.view30);
        v31 = findViewById(R.id.view31);

        adView = findViewById(R.id.tourism_ad);
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);

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
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info11);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info12);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info13);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info14);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info15);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info16);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info17);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info18);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info19);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info20);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info21);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info22);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info23);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info24);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info25);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info26);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info27);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info28);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info29);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info30);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
        v31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.info31);
                if (t.getVisibility() == View.GONE) {
                    t.setVisibility(View.VISIBLE);
                } else {
                    t.setVisibility(View.GONE);
                }
            }
        });
    }
}