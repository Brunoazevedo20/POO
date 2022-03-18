package com.company;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    public String cnpj;
    public String endereco;
    public double caixa;
    public List<Conta> listaConta;

    public Banco(String nome, String cnpj, String endereco, double caixa){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.caixa = caixa;
        listaConta = new ArrayList<>();
    }

}
