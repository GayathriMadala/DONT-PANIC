package com.example.haasikapuram.dontpanic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class m1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);

        VideoView videoView=(VideoView)findViewById(R.id.videoView1);

        Uri uri1=Uri.parse("android.resource://"+getPackageName()+"/raw/v1");
        videoView.setVideoURI(uri1);
        videoView.setMediaController(new MediaController(this));
        videoView.start();

    }
}
