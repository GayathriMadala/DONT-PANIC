 package com.example.haasikapuram.dontpanic;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

 public class DataListActivity extends Activity {

ListView listView;
     SQLiteDatabase sqLiteDatabase;
     UerDbHelper userDbHelper;
     Cursor cursor;
     ListDataAdapter listDataAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list_layout);
        listView=(ListView)findViewById(R.id.list_view);
        listDataAdapter=new ListDataAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(listDataAdapter);

        userDbHelper=new UerDbHelper(getApplicationContext());
        sqLiteDatabase=userDbHelper.getReadableDatabase();
        cursor=userDbHelper.getInformations(sqLiteDatabase);
        if(cursor.moveToFirst()){
            do{
            String name,mob;
                name=cursor.getString(0);
                mob=cursor.getString(1);
                DataProvider dataProvider=new DataProvider(name,mob);
                listDataAdapter.add(dataProvider);

            }while(cursor.moveToNext());
        }
        registerForContextMenu(listView);
    }

     @Override
     public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
         super.onCreateContextMenu(menu, v, menuInfo);
         MenuInflater inflater=getMenuInflater();
         inflater.inflate(R.menu.main_context_menu,menu);

     }

     @Override
     public boolean onContextItemSelected(MenuItem item) {
         AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
         switch(item.getItemId())
         {
             case R.id.delete_id:

                 listDataAdapter.notifyDataSetChanged();
                 return true;

             default:
                 return super.onContextItemSelected(item);
         }

     }
 }
