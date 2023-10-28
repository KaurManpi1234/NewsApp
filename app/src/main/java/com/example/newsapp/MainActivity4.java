package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        img1=findViewById(R.id.pict5);
        img2=findViewById(R.id.pict6);
        img3=findViewById(R.id.pict7);
        img4=findViewById(R.id.pict8);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity4.this, "aljazeera", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity4.this, MainActivity10.class);
                startActivity(intent4);
            }


        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity4.this, "bbc news", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity4.this, MainActivity11.class);
                startActivity(intent4);
            }


        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity4.this, "times now", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity4.this, MainActivity12.class);
                startActivity(intent4);
            }


        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity4.this, "cnbc tv", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity4.this, MainActivity13.class);
                startActivity(intent4);
            }


        });






    }
}