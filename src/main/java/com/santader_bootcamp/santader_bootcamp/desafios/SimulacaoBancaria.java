package com.santader_bootcamp.santader_bootcamp.desafios;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
          
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("0. Sair");
            
            int opcao = scanner.nextInt(); 
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo );
                    break;
                    
                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Seu saldo: " + saldo);
                    break;
                    
                case 4:
                    System.out.println("Saindo do programa...");
                    return;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }   
                
        }
    }
}
