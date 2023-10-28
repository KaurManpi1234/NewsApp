package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        img1=findViewById(R.id.pict1);
        img2=findViewById(R.id.pict2);
        img3=findViewById(R.id.pict3);
        img4=findViewById(R.id.pict4);

img1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Toast.makeText(MainActivity3.this, "abp news", Toast.LENGTH_SHORT).show();
        Intent intent4 = new Intent(MainActivity3.this, MainActivity6.class);
        startActivity(intent4);
    }


});
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity3.this, "Ajj tak", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity3.this, MainActivity7.class);
                startActivity(intent4);
            }


        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity3.this, "News 18", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity3.this, MainActivity8.class);
                startActivity(intent4);
            }


        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity3.this, "India Tv", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity3.this, MainActivity9.class);
                startActivity(intent4);
            }


        });











    }
}