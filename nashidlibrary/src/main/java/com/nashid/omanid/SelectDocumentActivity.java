package com.nashid.omanid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGImageView;
import com.nashid.R;

public class SelectDocumentActivity extends AppCompatActivity {
    SVGImageView SplachScreen,dropdown1,dropdown2,dropdown3;
    Button verification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_document);
        SplachScreen=findViewById(R.id.icon);
        dropdown1=findViewById(R.id.dropbox);
        dropdown2=findViewById(R.id.dropbox2);
        dropdown3=findViewById(R.id.dropbox3);
        verification=findViewById(R.id.verification);
        try {
            SVG svg= SVG.getFromResource(getResources(), R.raw.name_icon);
            SplachScreen.setSVG(svg);
            SVG one= SVG.getFromResource(getResources(), R.raw.dropbox);
            dropdown1.setSVG(one);
            SVG two= SVG.getFromResource(getResources(), R.raw.dropbox);
            dropdown2.setSVG(two);
            SVG three= SVG.getFromResource(getResources(), R.raw.dropbox);
            dropdown3.setSVG(three);
        } catch (Exception e) {
            e.printStackTrace();
        }
        verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SelectDocumentActivity.this,ComparisionSuccessful.class);
                startActivity(i);

            }
        });
    }
}