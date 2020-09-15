package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
    private static List<Veiculo> dados = new ArrayList<>();
    private VeiculoDAO(){

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
