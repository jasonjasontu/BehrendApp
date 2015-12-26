package com.example.adminpc.testing;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by Aiyu on 12/25/2015.
 * refer to https://www.youtube.com/watch?v=NT1qxmqH1eM&list=PLzV8uWUcseN8x0c3q2hRx9X4vbLYSlipb&index=13
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    int eventId;
    String eName,eLoc,eTime,description;
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "events.db";
    private static final String TABLE_NAME = "events";
    private static final String COLUMN_ID = "eventId";
    private static final String COLUMN_ENAME = "eName";
    private static final String COLUMN_ELOC = "eLoc";
    private static final String COLUMN_ETIME = "eTime";
    private static final String COLUMN_DESCRITION = "description";
    SQLiteDatabase db;
    private static final String TABLE_CREATE = "create table events (id integer primary key not null auto_increment,";

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db=db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXSIT" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

}
