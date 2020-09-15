package com.example.domain;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.LinkedList;
import java.util.List;

public class BancoDAO {
    private SQLiteDatabase conectaBD;

    public BancoDAO(SQLiteDatabase conectaBD) {
        this.conectaBD = conectaBD;
    }

    public void InsertVeiculo(Veiculo veiculo){
        ContentValues values = new ContentValues();
        values.put("NOME", veiculo.getNome());
        values.put("PLACA", veiculo.getPlaca());
        values.put("ANO", veiculo.getAno());
        values.put("COR", veiculo.getCor());

        conectaBD.insert("VEICULO", null, values);
    }

    public void UpdateVeiculo(Veiculo veiculo){
        ContentValues values = new ContentValues();
        values.put("NOME", veiculo.getNome());
        values.put("PLACA", veiculo.getPlaca());
        values.put("ANO", veiculo.getAno());
        values.put("COR", veiculo.getCor());

        conectaBD.update("VEICULO", values, "ID=?", new String[]{veiculo.getId().toString()});
    }

    public void DeleteVeiculo(Integer id){
        conectaBD.delete("VEICULO", "ID=?", new String[]{id.toString()});
    }

    public List<Veiculo>getVeiculos(){

        List<Veiculo>veiculos = new LinkedList<>();
        Veiculo veiculo;

        Cursor cursor = conectaBD.rawQuery("SELECT * FROM VEICULOS", null);
        cursor.moveToFirst();
        for (int i = 0; i<cursor.getCount(); i++){
            veiculo=new Veiculo();
            veiculo.setId(cursor.getInt(cursor.getColumnIndex("ID")));
            veiculo.setNome(cursor.getString(cursor.getColumnIndex("NOME")));
            veiculo.setPlaca(cursor.getString(cursor.getColumnIndex("PLACA")));
            veiculo.setCor(cursor.getString(cursor.getColumnIndex("COR")));
            veiculo.setAno(cursor.getInt(cursor.getColumnIndex("ANO")));

            veiculos.add(veiculo);
            cursor.moveToNext();

        }

        return veiculos;
    }
}
