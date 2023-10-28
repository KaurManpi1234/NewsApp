package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity17 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        webView1 = findViewById(R.id.web12);
        webView1.loadUrl("https://youtu.be/fByU98Zsmkg");
        WebViewClient webViewClient1 = new WebViewClient();

        webView1.setWebViewClient(webViewClient1);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setLoadsImagesAutomatically(true);
    }

    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()) {
            webView1.goBack();
        } else {
            super.onBackPressed();
        }


    }
}