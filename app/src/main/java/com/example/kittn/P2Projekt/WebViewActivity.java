package com.example.kittn.P2Projekt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.youtube.com/user/ProgrammingKnowledge/playlists");
        //myWebView.loadUrl("https://www.youtube.com/watch?v=BIqRwtikUnU");
    }
}
