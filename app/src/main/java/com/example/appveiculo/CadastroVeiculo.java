package com.example.appveiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.domain.Veiculo;
import com.example.domain.DAO;

public class CadastroVeiculo extends AppCompatActivity {

    private EditText nome;
    private EditText placa;
    private EditText ano;
    private EditText cor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_veiculo);

        nome = findViewById(R.id.nome_veiculo);
        placa = findViewById(R.id.textPlaca);
        ano = findViewById(R.id.textAnoV);
        cor = findViewById(R.id.textCor);
    }

    public void SalvarVeiculo(View view){

        Veiculo veiculo = new Veiculo();

        veiculo.setNome(nome.getText().toString());
        veiculo.setPlaca(placa.getText().toString());
        veiculo.setCor(cor.getText().toString());
        veiculo.setAno(Integer.parseInt(ano.getText().toString()));

        DAO.SalvarDados(veiculo);
        System.out.println(DAO.getListaDados());
        finish();

    }

}