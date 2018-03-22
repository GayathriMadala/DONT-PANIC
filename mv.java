package com.example.haasikapuram.dontpanic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mv extends AppCompatActivity {
ListView listView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mv);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("SELF DEFENCE VIDEOS");
        listView=(ListView)findViewById(R.id.listView1);
        String[] values=new String[]{"Basic FIrst Aid","Heart Attack","Fire Emergency","Burns","Severe Cuts"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_activated_1,android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent myintent = new Intent(view.getContext(), m1.class);
                    startActivityForResult(myintent, 0);

                }
                if (position == 1) {
                    Intent myintent = new Intent(view.getContext(), m2.class);
                    startActivityForResult(myintent, 1);

                }
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), m3.class);
                    startActivityForResult(myintent, 2);

                }
                if (position == 3) {
                    Intent myintent = new Intent(view.getContext(), m4.class);
                    startActivityForResult(myintent, 3);

                }
                if (position == 4) {
                    Intent myintent = new Intent(view.getContext(), m5.class);
                    startActivityForResult(myintent, 4);

                }



            }
        });
    }
}
