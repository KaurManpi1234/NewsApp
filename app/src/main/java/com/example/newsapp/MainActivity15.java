package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity15 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        webView1 = findViewById(R.id.web10);
        webView1.loadUrl("https://www.youtube.com/watch?v=koASuHGtVq4");
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