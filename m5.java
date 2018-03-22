package com.example.haasikapuram.dontpanic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class m5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m5);
        VideoView videoView=(VideoView)findViewById(R.id.videoView5);

        Uri uri5=Uri.parse("android.resource://"+getPackageName()+"/raw/v5");
        videoView.setVideoURI(uri5);
        videoView.setMediaController(new MediaController(this));
        videoView.start();
    }
}
