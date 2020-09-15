package com.example.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BancoDados extends SQLiteOpenHelper {


    public BancoDados(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public BancoDados(@Nullable Context context) {
        super(context, "BDVeiculo", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE VEICULO(" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                "NOME VARCHAR(50) NOT NULL," +
                "PLACA VARCHAR(10)," +
                "ANO INTEGER," +
                "COR VARCHAR(20)" +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
