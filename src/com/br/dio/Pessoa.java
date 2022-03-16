package com.br.dio;

public abstract class Pessoa {
    private String nome;
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Pessoa(String nome){
        this.nome = nome;

    }

    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String CPF() {
        return CPF;
    }

    public void CPF(String CPF) {
        this.CPF = CPF;
    }


    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
