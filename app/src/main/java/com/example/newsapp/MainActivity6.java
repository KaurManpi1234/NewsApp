package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity6 extends AppCompatActivity {
    WebView we1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        we1=findViewById(R.id.web1);
        we1.loadUrl("https://www.youtube.com/live/7i1h_sEOQvg?feature=share");
        WebViewClient webViewClient=new WebViewClient();
        we1.setWebViewClient(webViewClient);
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













