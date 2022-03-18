package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    public String nome;
    public String cnpj;
    public String endereco;
    public String incricaoEstadual;
    public double caixa;
    public List<Onibus> listaOnibus;

    public Empresa(String nome, String cnpj, String endereco, String incricaoEstadual) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.incricaoEstadual = incricaoEstadual;
        listaOnibus = new ArrayList<>();
    }



    public void comprarOnibus(Onibus onibus){
        if(this.caixa >= onibus.valor){
            this.caixa = this.caixa - onibus.valor;
            listaOnibus.add(onibus);
        }else {
            System.out.println("A empresa nao possui caixa");
        }
    }


    public void DepositarCaixa(double valor){

        this.caixa = this.caixa + valor;
    }
}
