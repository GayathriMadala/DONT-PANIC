package com.example.haasikapuram.dontpanic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class m4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);
        VideoView videoView=(VideoView)findViewById(R.id.videoView4);

        Uri uri4=Uri.parse("android.resource://"+getPackageName()+"/raw/v4");
        videoView.setVideoURI(uri4);
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
