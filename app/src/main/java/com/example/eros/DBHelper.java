package com.example.eros;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * Created by Guilherme on 29/12/2021 and of course doesn't work....
 */

public class DBHelper extends SQLiteOpenHelper {

    private static int version = 1;
    private static String name = "BaseDados_Login_Registo.db";

    public DBHelper(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String str = "CREATE TABLE Utilizador(username TEXT PRIMARY KEY, password TEXT);"; //first_name TEXT, second_name TEXT
        db.execSQL(str);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Utilizador;");
        onCreate(db);
    }

    public long CriarUtilizador(String username, String password) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("username", username);
        cv.put("password", password);
        /*erro*/long result = db.insert("Utilizador", null, cv);
        return result;
    }

    public String ValidarLogin(String username, String password) {
        return "";
    }
}
