package com.br.dio;

import java.util.Date;

public class Cliente extends Pessoa {

    public Cliente(String nome) {
        super(nome);
    }


    public Cliente(String nome, String CPF) {
        super(nome, CPF);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + this.getNome() + '\'' +
                ", CPF='" + this.getCPF() + '\'' +
                '}';
}
}
