package com.example.bbitcampus;



import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DAtabaseHelper extends SQLiteOpenHelper{
	
	public static String DATABASE_NAME = "BBC.db";
	public static int DATABASE_VERSION = 1;
	public static String TABLE_NAME = "register_master";
	
	
	public static String un = "USERNAME";
	public static String pwd = "password";
	public static String cpwd = "confirmpassword";
	

	public DAtabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
	String query = "create table "+TABLE_NAME+" ("+un+" Text, "+pwd+" Text, "+cpwd+" Text )";
	db.execSQL(query);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	public void insert(String name, String paswd,String cpaswd){
		
		SQLiteDatabase db = this.getWritableDatabase();
			ContentValues cv = new ContentValues();	
			cv.put(un, name);
			cv.put(pwd, paswd);
			
			cv.put(cpwd, cpaswd);
			
			db.insert(TABLE_NAME, null, cv);
		
	}

}
