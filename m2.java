package com.example.haasikapuram.dontpanic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class m2 extends AppCompatActivity {
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);
        VideoView videoView=(VideoView)findViewById(R.id.videoView2);

        Uri uri2=Uri.parse("android.resource://"+getPackageName()+"/raw/v2");
        videoView.setVideoURI(uri2);
        videoView.setMediaController(new MediaController(this));
        videoView.start();

    }
}
