package com.example.senemgocer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class reshow extends AppCompatActivity {

    ImageView img;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reshow);
        img=findViewById(R.id.img);
        tw=findViewById(R.id.tw);
        String brand= getIntent().getStringExtra("brand");
        tw.setText(brand);
        int photo= getIntent().getIntExtra("photo",0);
        img.setImageResource(photo);
    }
}