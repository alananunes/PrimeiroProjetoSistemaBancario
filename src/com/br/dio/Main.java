package com.br.dio;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        static Scanner entrada = new Scanner(System.in);
        static   ArrayList<Conta> listaContas;

    public static void main(String[] args) {
        //listaContas = new ArrayList<>(Conta);


        ContaCorrente contaCorrente = null;
        ContaPoupanca contaPoupanca = null;
        Cliente cliente;
        Conta conta;


        String titular;
        String cpf;

        int op =0 ;
        int tipo;
        int tipoConta = 0;
        int valor;


        while (op != 9) {
            System.out.println("************ BEM VINDO AO BANCO *******");
            System.out.println("----------------------------------------");
            System.out.println("|---------------- MENU ----------------|");
            System.out.println(" Selecione a operação desejada: ");
            System.out.println("1 - Cadastrar Conta ");
            System.out.println("2 - Fazer Saque");
            System.out.println("3 - Fazer Transferencia");
            System.out.println("4 - Fazer Deposito");
            System.out.println("5 - Imprimir Extrato ");
            System.out.println("9 - Sair ");
            System.out.println("|------------------------------|");
            System.out.println("********************************");
            System.out.println("Escolha uma opção: ");
            op = entrada.nextInt();

            if (op == 1) {
                System.out.println("Qual o tipo de conta? \n1.Poupanca\n2.Corrente");
                tipo = entrada.nextInt();
                System.out.println("Cadastrar nome do cliente da conta ");
                titular = entrada.next();

                System.out.println("Cadastrar cpf do cliente da conta ");
                cpf = entrada.next();
                cliente = new Cliente(titular, cpf);
                if (tipo == 1) {
                    contaPoupanca = new ContaPoupanca(cliente);
                    //contaPoupanca.saldo = 100;
                    tipoConta = 1;
                } else {
                    contaCorrente = new ContaCorrente(cliente);
                    tipoConta = 2;
                }
                System.out.println("Conta Criada c sucesso");
            } else if (op == 2) {
                System.out.println("informe o valor de saque");
                valor = entrada.nextInt();
                if (tipoConta == 1) {
                    contaPoupanca.sacar(valor);
                } else if (tipoConta == 2) {
                    contaCorrente.sacar(valor);
                }
            } else if (op == 3) {
                System.out.println("informe o valor de transferencia");
                valor = entrada.nextInt();

                if (tipoConta == 1) {
                    contaPoupanca.transferir(valor, contaPoupanca);
                } else if (tipoConta == 2) {
                    contaCorrente.transferir(valor, contaCorrente);
                }
            } else if (op == 4) {
                System.out.println("informe o valor de deposito");
                valor = entrada.nextInt();
                if (tipoConta == 1) {
                    contaPoupanca.depositar(valor);
                } else if (tipoConta == 2) {
                    contaCorrente.depositar(valor);
                }
            } else if (op == 5) {
                if (tipoConta == 1) {
                    contaPoupanca.imprimirExtrato();
                } else if (tipoConta == 2) {
                    contaCorrente.imprimirExtrato();
                }
            } else if (op == 9){
                System.out.println("sair");
                System.exit(0);
            }

        }
    }
}
