package com.example.haasikapuram.dontpanic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    ImageButton iv1;
    ImageButton iv2;
    ImageButton iv3;
    ImageButton iv4;
    ImageButton iv5;
    ImageButton iv6;
    ImageButton iv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));


        iv1=(ImageButton)findViewById(R.id.ib1);
        Bitmap bitmap1= BitmapFactory.decodeResource(getResources(),R.drawable.c);
        RoundedBitmapDrawable roundedBitmapDrawable1= RoundedBitmapDrawableFactory.create(getResources(),bitmap1);
        roundedBitmapDrawable1.setCircular(true);
        iv1.setImageDrawable(roundedBitmapDrawable1);

     /*   iv2=(ImageView)findViewById(R.id.ib2);
        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(),R.drawable.hp);
        RoundedBitmapDrawable roundedBitmapDrawable2= RoundedBitmapDrawableFactory.create(getResources(),bitmap2);
        roundedBitmapDrawable2.setCircular(true);
        iv2.setImageDrawable(roundedBitmapDrawable2);
*/
        iv3=(ImageButton)findViewById(R.id.ib3);
        Bitmap bitmap3= BitmapFactory.decodeResource(getResources(),R.drawable.sym);
        RoundedBitmapDrawable roundedBitmapDrawable3= RoundedBitmapDrawableFactory.create(getResources(),bitmap3);
        roundedBitmapDrawable3.setCircular(true);
        iv3.setImageDrawable(roundedBitmapDrawable3);

       iv4=(ImageButton)findViewById(R.id.ib4);
        Bitmap bitmap4= BitmapFactory.decodeResource(getResources(),R.drawable.presc);
        RoundedBitmapDrawable roundedBitmapDrawable4= RoundedBitmapDrawableFactory.create(getResources(),bitmap4);
        roundedBitmapDrawable4.setCircular(true);
        iv4.setImageDrawable(roundedBitmapDrawable4);

        iv5=(ImageButton)findViewById(R.id.ib5);
        Bitmap bitmap5= BitmapFactory.decodeResource(getResources(),R.drawable.bbim2);
        RoundedBitmapDrawable roundedBitmapDrawable5= RoundedBitmapDrawableFactory.create(getResources(),bitmap5);
        roundedBitmapDrawable5.setCircular(true);
        iv5.setImageDrawable(roundedBitmapDrawable5);

        iv6=(ImageButton)findViewById(R.id.ib6);
        Bitmap bitmap6= BitmapFactory.decodeResource(getResources(),R.drawable.mv);
        RoundedBitmapDrawable roundedBitmapDrawable6= RoundedBitmapDrawableFactory.create(getResources(),bitmap6);
        roundedBitmapDrawable6.setCircular(true);
        iv6.setImageDrawable(roundedBitmapDrawable6);

        iv7=(ImageButton)findViewById(R.id.ib7);
        Bitmap bitmap7= BitmapFactory.decodeResource(getResources(),R.drawable.au);
        RoundedBitmapDrawable roundedBitmapDrawable7= RoundedBitmapDrawableFactory.create(getResources(),bitmap7);
        roundedBitmapDrawable7.setCircular(true);
        iv7.setImageDrawable(roundedBitmapDrawable7);


        iv1=(ImageButton) findViewById(R.id.ib1);
        iv1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i1=new Intent(MainActivity.this,contacts.class);
                startActivity(i1);

            }
        });
      /*  iv2=(ImageView) findViewById(R.id.ib2);
        iv2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i2=new Intent(MainActivity.this,hospitals.class);
                startActivity(i2);

            }
        });
        */
        iv3=(ImageButton) findViewById(R.id.ib3);
        iv3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i3=new Intent(MainActivity.this,symp.class);
                startActivity(i3);

            }
        });

       iv4=(ImageButton) findViewById(R.id.ib4);
        iv4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i4=new Intent(MainActivity.this,presc.class);
                startActivity(i4);

            }
        });
        iv5=(ImageButton) findViewById(R.id.ib5);
        iv5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i5=new Intent(MainActivity.this,bb.class);
                startActivity(i5);

            }
        });
        iv6=(ImageButton) findViewById(R.id.ib6);
        iv6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i6=new Intent(MainActivity.this,mv.class);
                startActivity(i6);

            }
        });
        iv7=(ImageButton) findViewById(R.id.ib7);
        iv7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i7=new Intent(MainActivity.this,abtus.class);
                startActivity(i7);

            }
        });


    }


}
