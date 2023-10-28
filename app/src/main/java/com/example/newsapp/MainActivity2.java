package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgButton1, imgButton2, imgButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgButton1 = findViewById(R.id.pic1);
        imgButton2 = findViewById(R.id.pic2);
        imgButton3 = findViewById(R.id.pic3);
        imgButton1.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Toast.makeText(MainActivity2.this, "hindi channel", Toast.LENGTH_SHORT).show();
                                              Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        imgButton2.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {

                                              Toast.makeText(MainActivity2.this, "english channel", Toast.LENGTH_SHORT).show();
                                              Intent intent= new Intent(MainActivity2.this, MainActivity4.class);
                                              startActivity(intent);
                                          }

                                      }
        );
        imgButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "punjabi channel", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);

            }

        });
    }}


