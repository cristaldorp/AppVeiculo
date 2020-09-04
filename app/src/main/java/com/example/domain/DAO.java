package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static List<Veiculo> dados = new ArrayList<>();
    private DAO(){

    }
    public static void SalvarDados(Veiculo veiculo){
        dados.add(veiculo);
    }
    public static void remove(Veiculo veiculo){
        dados.remove(veiculo);
    }
    public static List getListaDados(){
        return dados;
    }


}
