package com.company;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    public int numero;
    public String cpf;
    public String dataCriacao;
    public double saldo;
    public String tipo;
    public List<Cliente> listaCliente;

    public Conta(int numero, String cpf, String dataCriacao, double saldo, String tipo){
        this.numero = numero;
        this.cpf = cpf;
        this.dataCriacao = dataCriacao;
        this.saldo = saldo;
        this.tipo = tipo;
        listaCliente = new ArrayList<>();
    }


    public void Sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public void Depositar (double valor){
        this.saldo = this.saldo + valor;
    }

    public void Saldoatual(){
        System.out.println("Seu saldo é de " + this.saldo);
    }

    public void Contacli(){

    }
}
