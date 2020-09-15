package com.example.domain;

public class Veiculo {
    private Integer id;
    private String nome;
    private String placa;
    private String cor;
    private int ano;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
