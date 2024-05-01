package com.santader_bootcamp.santader_bootcamp.desafios.BancoDigital;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    protected String nomeCliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;
        this.nomeCliente = cliente.getNome();
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta numero: " + this.numero + " Cliente " + this.nomeCliente + ", agencia: " + this.agencia + ", saldo:" + this.saldo + " ";
    }
}
