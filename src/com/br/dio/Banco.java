package com.br.dio;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Banco(){

    }

    public void CadastrarConta(Conta Conta){
        Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
        System.out.println("Entre com o nome do cliente: ");

        contas.add(Conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
