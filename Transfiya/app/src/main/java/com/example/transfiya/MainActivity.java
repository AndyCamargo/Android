package com.example.transfiya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebSettings myWebSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = findViewById(R.id.Web1);
        myWebSetting = myWebView.getSettings();
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
    }
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}