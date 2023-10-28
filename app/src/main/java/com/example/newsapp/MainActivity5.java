package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        img1=findViewById(R.id.pict9);
        img2=findViewById(R.id.pict10);
        img3=findViewById(R.id.pict11);
        img4=findViewById(R.id.pict12);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity5.this, "news 18", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity5.this, MainActivity14.class);
                startActivity(intent4);
            }


        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity5.this, "ptc news", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity5.this, MainActivity15.class);
                startActivity(intent4);
            }


        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity5.this, "abp news", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity5.this, MainActivity16.class);
                startActivity(intent4);
            }


        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity5.this, "khalas TV", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity5.this, MainActivity17.class);
                startActivity(intent4);
            }


        });







    }
}