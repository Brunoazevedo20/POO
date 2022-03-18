package com.company;

public class Faculdade {

    public int Idfaculdade;
    public String nome;
    public double preco;
    public String turno;
    public double classificacao;

    public Faculdade (int Idfaculdade, String nome,double preco, String turno, double classificacao){
        this.Idfaculdade = Idfaculdade;
        this.nome = nome;
        this.preco = preco;
        this.turno = turno;
        this.classificacao = classificacao;
    }

    public void Classificacao(){
        System.out.println("A  classificação da faculdade " + this.nome + " é " + this.classificacao);
    }

    public void Valor(){
        System.out.println("O valor a ser pago é: " + this.preco);
    }
}
