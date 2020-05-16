package com.example.control_de_asistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class BaseHelper extends SQLiteOpenHelper {
    String tabla="CREATE TABLE PERSONA (ID INTEGER PRIMARY KEY, USER TEXT, EMAIL TEXT, PASS TEXT)";
    String t_cursos="CREATE TABLE SESION (COD INTEGER PRIMARY KEY, ESTADO TEXT, FECHA TEXTO, HINICIO REAL, HFIN REAL, IDCURSO INTEGER, IDUSER INTEGER)";



    public BaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
