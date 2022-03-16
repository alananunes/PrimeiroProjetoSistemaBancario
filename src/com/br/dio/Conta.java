package com.br.dio;


public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private static int contadorContas = 1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo = 0.0;

    private String cpf;
    private double valor;



    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;

    }

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = saldo;
        contadorContas+=1;

    }

    public void sacar(double valor){
        if(valor > 0  && getSaldo() >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!!");
        }else{
            System.out.println("Você não tem limite suficiente!!");
        }

    }

    public void transferir(double valor, Conta contaDestino){
        if(valor > 0  && getSaldo() >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Trasnferência realizada com sucesso!!");
        }else{
            System.out.println("Você não tem limite suficiente!!");
        }


    }
    public void depositar(double valor){
        if(valor>0){
            this.saldo = this.saldo + valor;
            System.out.println("Seu depósito foi realizado com sucesso");
        }else{
            System.out.println("Não possivel realizar depósito");
        }

    }

    @Override
    public String toString() {
        return "Conta{" +
                "\nagencia=" + this.getAgencia() +
                ", \nnumero=" + this.getNumero() +
                ", \ncliente=" + this.cliente.getNome() +
                ", \nsaldo=" + this.getSaldo() +
                ", \ncpf=" + this.cliente.getCPF() +
               // ", valor=" + valor +
               '}';
    }

    protected void imprimirInfoContas(){
       // System.out.println("############ Extrato da Conta ###########");
        System.out.println("Nome do Cliente: " + this.cliente.getNome());
        System.out.println("CPF do Cliente: " + this.cliente.getCPF());
        System.out.println("Número da Conta:   "  + numero );
        System.out.println("Número da Agência: "   + agencia);
        System.out.println("Saldo da Conta :   " + saldo  );

    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public abstract void imprimirExtrato();




}
