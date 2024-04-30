package com.santader_bootcamp.santader_bootcamp.desafios;

public class ContaBancaria {
    
    private double saldo;
    private String nome;
    private Integer numeroConta;

    public ContaBancaria(double saldo, String nome, Integer numeroConta, String agencia) {
        this.saldo = saldo;
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    private String agencia;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        
        System.out.println("Digite seu Nome:");
        String nome = System.console().readLine();
        System.out.println("Digite o numero da conta:");
        Integer numeroConta = Integer.parseInt(System.console().readLine());
        System.out.println("Digite a agencia:");
        String agencia = System.console().readLine();
        System.out.println("Digite o saldo:");
        double saldo = Double.parseDouble(System.console().readLine());
        ContaBancaria conta = new ContaBancaria(saldo, nome, numeroConta, agencia);
        System.out.println("Olá " + conta.getNome() + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + 
        " conta " + conta.getNumeroConta() + " e seu saldo "+ conta.getSaldo() + " já está disponível para saque");
       

    }

   
}
