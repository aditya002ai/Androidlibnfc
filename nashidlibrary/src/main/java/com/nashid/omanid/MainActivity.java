package com.nashid.omanid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGImageView;
import com.nashid.R;

public class MainActivity extends AppCompatActivity {
    SVGImageView SplachScreen;
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SplachScreen=findViewById(R.id.icon);
        try {
            SVG svg= SVG.getFromResource(getResources(), R.raw.name_icon);
            SplachScreen.setSVG(svg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(MainActivity.this,SelectDocumentActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
}