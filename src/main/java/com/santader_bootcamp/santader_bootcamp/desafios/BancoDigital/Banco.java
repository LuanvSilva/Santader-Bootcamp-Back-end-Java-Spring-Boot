package com.santader_bootcamp.santader_bootcamp.desafios.BancoDigital;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }

    
}
