package com.santader_bootcamp.santader_bootcamp.desafios.BancoDigital;

public class Main {
    
    public static void main(String[] args) {

        Banco banco = new Banco("Santander");
        Cliente cliente = new Cliente("João");
        Conta conta = new ContaCorrente(cliente);
        conta.depositar(1000);
        conta.sacar(100);
        conta.transferir(100, new ContaPoupanca(cliente));
        System.out.println(conta.consultarSaldo());
        System.out.println(conta.toString());


    
    }
}
