package com.example.haasikapuram.dontpanic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewContactActivity extends AppCompatActivity {
    EditText ContactName, ContactMobile;
    Context context = this;
    UerDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        ContactName = (EditText) findViewById(R.id.contact_name);
        ContactMobile = (EditText) findViewById(R.id.contact_mobile);
    }

    public void addContact(View view) {

        String name = ContactName.getText().toString();
        String mob = ContactMobile.getText().toString();
        userDbHelper = new UerDbHelper(context);

        sqLiteDatabase = userDbHelper.getWritableDatabase();
       int aa= userDbHelper.getcount(sqLiteDatabase);
        if(aa==5){
            Toast.makeText(getApplicationContext(),"You have already added 5 Contacts",Toast.LENGTH_LONG).show();;
        }else{
        userDbHelper.addInformations(name, mob, sqLiteDatabase);

        Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();


        userDbHelper.close();
        finish();
    }}



}




