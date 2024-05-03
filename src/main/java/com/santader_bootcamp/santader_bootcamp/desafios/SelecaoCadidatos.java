package com.santader_bootcamp.santader_bootcamp.desafios;

import java.util.ArrayList;


public class SelecaoCadidatos {
    
    public static void main(String[] args) {
        selecaoCadidatos();
    }

    static void selecaoCadidatos(){
        String[] candidatos = {"João", "Maria", "José", "Pedro", "Paulo", "Ana", "Carlos", "Mariana", "Felipe", "Cristina"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        int index = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {

            ArrayList<String> candidato = new ArrayList<String>();
            candidato.add(candidatos[candidatosAtual]);
            double salarioPretendito = valorPretendito();

            System.out.println("O candidato " + candidatos[candidatosAtual] + " pretende ganhar " + salarioPretendito);

            if (salarioBase >= salarioPretendito) {
                System.out.println("O candidato " + candidato.get(index) + " foi selecionado");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato.get(index) + " não foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendito(){
        double salarioPretendito = Math.random() * 10000;
        return salarioPretendito;
    }

    static void analizarCandidato(double salarioPretendito){

        double salariobase = 2000.0;

        if (salariobase > salarioPretendito) {
            System.out.println("Ligar para o candidato");
        }
        else if(salariobase == salarioPretendito){
            System.out.println("Ligar para o candidato e negociar");
        }
        else{
            System.out.println("Não ligar para o candidato");
        }

        
    }





   
    
}
