package com.example.haasikapuram.dontpanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class symp extends AppCompatActivity {
Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symp);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("SYMPTOMS");
        listView=(ListView)findViewById(R.id.listView);
        final String[] values=new String[]{"Amoebiasis","Asthma","Dengue","Diarrhoea","Eye-infection","HIV AIDS","Jaundice","Malaria","Tuberculosis","Typhoid"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myintent=new Intent(view.getContext(),s1.class);
                    startActivityForResult(myintent,0);

                }
                if(position==1){
                    Intent myintent=new Intent(view.getContext(),s2.class);
                    startActivityForResult(myintent,1);

                }
                if(position==2){
                    Intent myintent=new Intent(view.getContext(),s3.class);
                    startActivityForResult(myintent,2);

                }
                if(position==3){
                    Intent myintent=new Intent(view.getContext(),s4.class);
                    startActivityForResult(myintent,3);

                }
                if(position==4){
                    Intent myintent=new Intent(view.getContext(),s5.class);
                    startActivityForResult(myintent,4);

                }
                if(position==5){
                    Intent myintent=new Intent(view.getContext(),s6.class);
                    startActivityForResult(myintent,5);

                }
                if(position==6){
                    Intent myintent=new Intent(view.getContext(),s7.class);
                    startActivityForResult(myintent,6);

                }
                if(position==7){
                    Intent myintent=new Intent(view.getContext(),s8.class);
                    startActivityForResult(myintent,7);

                }
                if(position==8){
                    Intent myintent=new Intent(view.getContext(),s9.class);
                    startActivityForResult(myintent,8);

                }
                if(position==9){
                    Intent myintent=new Intent(view.getContext(),s10.class);
                    startActivityForResult(myintent,9);

                }


            }
        });

    }
}
