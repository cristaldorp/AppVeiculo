package com.example.appveiculo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.domain.DAO;

public class MainActivity extends AppCompatActivity {

    private ListView ListagemVeiculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListagemVeiculo = findViewById(R.id.lista_veiculo);
        atualizaLista();
    }


    public void novoVeiculo(View view){
        Intent it = new Intent(MainActivity.this,CadastroVeiculo.class);
        startActivityForResult(it, 121);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        atualizaLista();
    }

    public void atualizaLista(){
        ArrayAdapter listar = new ArrayAdapter
                (this, R.layout.support_simple_spinner_dropdown_item, DAO.getListaDados());

        ListagemVeiculo.setAdapter(listar);

    }
}