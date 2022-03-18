package com.company;

public class Aluno {

    public int IdMatricula;
    public String nome;
    public String endereco;
    public int idade;
    public double altura;

    public Aluno (int IdMatricula, String nome, String endereco, int idade,double altura){
        this.IdMatricula = IdMatricula;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.altura = altura;
    }

    public void Matricular(){
        System.out.println("O aluno esta matriculado");
    }

    public void Aprovacao(){
        System.out.println("O aluno foi Aprovado");
    }
}
