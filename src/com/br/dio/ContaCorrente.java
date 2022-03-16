package com.br.dio;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    //private double taxaDeOperacao = 0.5;

    @Override
    public void imprimirExtrato(){
        System.out.println("############ Extrato da Conta Corrente ###########");
        super.imprimirInfoContas();

    }
}
