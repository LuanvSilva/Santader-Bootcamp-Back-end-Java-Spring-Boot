package com.santader_bootcamp.santader_bootcamp.desafios.BancoDigital;

public interface IConta {
    
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, Conta contaDestino);
    public double consultarSaldo();
    public String toString();
}
