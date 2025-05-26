package com.example.transfiya;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    @SuppressLint("SetJavaScriptEnabled")

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        myWebView = findViewById(R.id.Web1);
        WebSettings myWebSetting = myWebView.getSettings();
        myWebSetting.setJavaScriptEnabled(true);
        myWebSetting.setDomStorageEnabled(true);

        //myWebSetting.setUseWideViewPort(true);
        //myWebSetting.setLoadWithOverviewMode(true);

        //myWebSetting.setSupportZoom(true);
        //myWebSetting.setBuiltInZoomControls(true);
        //myWebSetting.setDisplayZoomControls(false);

        myWebView.loadUrl("https://transfiya.app/login");
        //myWebView.loadUrl("https://ui.pse.com.co/ui/");
        myWebView.setWebViewClient(new WebViewClient());

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                if (myWebView.canGoBack()) {
                    myWebView.goBack();
                } else {

                    finish();
                }
            }
        });

    }
}