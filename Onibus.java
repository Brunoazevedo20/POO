package com.company;

public class Onibus {

    public String modelo;
    public String marca;
    public int anoFabricacao;
    public String placa;
    public double valor;
    public double quilometragem;
    public int qtdPessoas;
    public String nomeMotorista;
    public boolean status;


    public Onibus(String modelo, String marca, int anoFabricacao, String placa, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.valor = valor;
    }

    public boolean checaQuilometragem() {
        if ( this.quilometragem >= 200) {
            this.status = false;
        }
        else {
            this.status = true;
        }

        return status;
    }

    public void addPessoas(int qtdPessoas){
        if((qtdPessoas + this.qtdPessoas) <= 60){
            this.qtdPessoas += qtdPessoas;
        }else {
            System.out.println("Onibus cheio!!");
        }
    }

    public void removePessoa(){
        this.qtdPessoas--;
    }

    public void trocarMotorista(String nomeMotorista){
        this.nomeMotorista = nomeMotorista;
    }

}
