package com.nashid.omanid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGImageView;
import com.nashid.R;

public class ReadyToScanActivity extends AppCompatActivity {
    SVGImageView logo,nfclogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready_to_scan);
        logo = findViewById(R.id.logo);
        nfclogo = findViewById(R.id.nfclogo);
        try {
            SVG svg = SVG.getFromResource(getResources(), R.raw.logo);
            logo.setSVG(svg);
            SVG nfc = SVG.getFromResource(getResources(), R.raw.nfc_logo);
            nfclogo.setSVG(nfc);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}