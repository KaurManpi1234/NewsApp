package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity14 extends AppCompatActivity {
    WebView we1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        we1=findViewById(R.id.web9);
        we1.loadUrl("https://youtu.be/xP7y2z4H9s8");
        WebViewClient webViewClient2=new WebViewClient();
        we1.setWebViewClient(webViewClient2);
        we1.getSettings().setJavaScriptEnabled(true);
        we1.getSettings().setLoadsImagesAutomatically(true);

    }
    @Override
    public void onBackPressed(){
        if(we1.canGoBack()){
            we1.goBack();
        }else{
            super.onBackPressed();
        }

    }
}