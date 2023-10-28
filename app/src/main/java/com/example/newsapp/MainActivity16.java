package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity16 extends AppCompatActivity {
    WebView we1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        we1=findViewById(R.id.web11);
        we1.loadUrl("https://www.youtube.com/live/G1NshXlCDAU?feature=share");
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