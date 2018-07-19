package com.example.kittn.P2Projekt;

import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_video_player);



    final MediaController mediaC= new MediaController(this);
    getWindow().setFormat(PixelFormat.UNKNOWN);


    //displays a video file
    final VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView2);

        String uriPath2 = "android.resource://com.example.kittn.P2Projekt/" + MainActivity.aktuellesVideo;
    Uri uri2 = Uri.parse(uriPath2);
mVideoView2.setVideoURI(uri2);
mVideoView2.requestFocus();

        //MediaController
        mVideoView2.setMediaController(mediaC);
        mediaC.setAnchorView(mVideoView2);

mVideoView2.start();


}
}
