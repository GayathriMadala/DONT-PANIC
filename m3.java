package com.example.haasikapuram.dontpanic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class m3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);
        VideoView videoView=(VideoView)findViewById(R.id.videoView3);

        Uri uri3=Uri.parse("android.resource://"+getPackageName()+"/raw/v3");
        videoView.setVideoURI(uri3);
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
