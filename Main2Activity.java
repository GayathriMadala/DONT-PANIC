package com.example.haasikapuram.dontpanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


public class Main2Activity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=(ImageView)findViewById(R.id.img);
        Thread myThread=new Thread(){
            @Override
            public void run() {
                try{


                    sleep(800);
                    Intent i=new Intent(getApplicationContext(),Home.class);
                    startActivity(i);
                    finish();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
        };
        myThread.start();
    }




}
