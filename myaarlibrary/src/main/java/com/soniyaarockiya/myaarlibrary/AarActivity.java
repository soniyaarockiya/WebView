package com.soniyaarockiya.myaarlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aar);

        Bundle bundle = getIntent().getExtras();

        String URL = bundle.getString("url");
        System.out.println(URL);
        WebView webView = findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);

        webView.loadUrl(URL);
    }
}
