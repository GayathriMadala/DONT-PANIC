package com.example.haasikapuram.dontpanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.haasikapuram.dontpanic.R.id.listView;

public class presc extends AppCompatActivity {
ListView listView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presc);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("PRESCRIPTIONS");
        listView=(ListView)findViewById(R.id.listview);
     final String[] values=new String[]{
                "Acidity","Burns","Cold","Cough","Eye infections","Fever","Headache","Sprains","Vomitings"
        } ;
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0)
                     {
                        Intent myintent = new Intent(view.getContext(), p1.class);
                        startActivity(myintent);

                    }
                if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), p2.class);
                    startActivityForResult(myintent, 1);

                }
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), p3.class);
                    startActivityForResult(myintent, 2);

                }
                if (position == 3) {
                    Intent myintent = new Intent(view.getContext(), p4.class);
                    startActivityForResult(myintent, 3);

                }
                if (position == 4) {
                    Intent myintent = new Intent(view.getContext(), p5.class);
                    startActivityForResult(myintent, 4);

                }
                if (position == 5) {
                    Intent myintent = new Intent(view.getContext(), p6.class);
                    startActivityForResult(myintent, 5);

                }
                if (position == 6) {
                    Intent myintent = new Intent(view.getContext(), p7.class);
                    startActivityForResult(myintent, 6);

                }
                if (position == 7) {
                    Intent myintent = new Intent(view.getContext(), p8.class);
                    startActivityForResult(myintent, 7);

                }
                if (position == 8) {
                    Intent myintent = new Intent(view.getContext(), p9.class);
                    startActivityForResult(myintent, 8);

                }

            }
        });
    }


    }

