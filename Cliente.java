package com.company;

import java.util.List;

public class Cliente {

    public String nome;
    public int codigo;
    public String cpf;
    public String endereco;

    public Cliente(String nome, int codigo, String cpf, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

    }
}
