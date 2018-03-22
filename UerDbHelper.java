package com.example.haasikapuram.dontpanic;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by haasikapuram on 19/06/17.
 */

public class UerDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="USERINFO.DB";
    private static final int DATABASE_VERSION=1;
    private static final String CREATE_QUERY=
            "CREATE TABLE "+UserContract.NewUserInfo.TABLE_NAME+"("+UserContract.NewUserInfo.USER_NAME+" TEXT,"+
                    UserContract.NewUserInfo.USER_MOB+" TEXT);";
    public UerDbHelper(Context context ){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS","Database created / opened...");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS","Table created...");
    }
    public void addInformations(String name,String mob,SQLiteDatabase db)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put(UserContract.NewUserInfo.USER_NAME,name);
        contentValues.put(UserContract.NewUserInfo.USER_MOB,mob);
        db.insert(UserContract.NewUserInfo.TABLE_NAME,null,contentValues);
        Log.e("DATABASE OPERATIONS","One row inserted...") ;

    }

    public Cursor getInformations(SQLiteDatabase db){
       Cursor cursor;
       String[] projections={UserContract.NewUserInfo.USER_NAME,UserContract.NewUserInfo.USER_MOB};
        cursor=db.query(UserContract.NewUserInfo.TABLE_NAME,projections,null,null,null,null,null);
        return cursor;

    }




    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public int getcount(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase=getReadableDatabase();
     int aa=0;
        Cursor c=sqLiteDatabase.rawQuery("select * from user_info",null);
        c.moveToFirst();
        if(c!=null){
            do{
           aa=c.getCount();

            }while (c.moveToNext());
        }
        return aa;
    }
}


