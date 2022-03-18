package com.company;

public class Escola {

    public int alunos;
    public String nome;
    public String cnpj;
    public int professores;
    public double media;

    public Escola (int alunos, String nome, String cnpj, int professores, double media){
        this.alunos = alunos;
        this.nome = nome;
        this.cnpj = cnpj;
        this.professores = professores;
        this.media = media;

    }

    public void QuantAlunos(){
        System.out.println("A quantidade de alunos na "+ this.nome + " é de " + this.alunos);
    }
    public void Media(){
        System.out.println("O aluno precisa ter mais de 70 pontos para poder passar de ano");
    }

}
