package com.soniyaarockiya.myaarlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AarActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aar);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String URL = bundle.getString("url");
        System.out.println(URL);

        //Display web page
        if (URL != null) {
            try {
                WebView webView = findViewById(R.id.web_view);
                WebSettings webSettings = webView.getSettings();

                //note : warning was suppressed
                webSettings.setJavaScriptEnabled(true);


                WebViewClient webViewClient = new WebViewClient();
                webView.setWebViewClient(webViewClient);

                webView.loadUrl(URL);
            } catch (Exception e) {
                System.out.println("Error in web view" + e.getMessage());

            }


        }

    }
}
