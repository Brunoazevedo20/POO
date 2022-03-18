package com.company;

public class Main {

    public static void main(String[] args) {
	// TRABALHO DE POO EXERCICIO 1

        //  ------ EXERCICIO 1 ----------

      //  Faculdade faculdade01 = new Faculdade(1,"UFMG",0.00, "Matutino",4.5);
       // Faculdade faculdade02 = new Faculdade(2,"PUC",1000.00, "Vespertino",4.0);
       // Faculdade faculdade03 = new Faculdade(3,"COTEMIG",1500.00, "Noturno",4.6);

       // faculdade01.Classificacao();
        //faculdade02.Valor();


       // Aluno aluno01 = new Aluno(1212, "Matheus","rua brasileia, 34",23,1.67);
       // Aluno aluno02 = new Aluno(2034, "Fernando","rua Santa cruz, 120",18,1.65);
       // Aluno aluno03 = new Aluno(0012, "Pamela","rua ere, 281",25,1.80);

       // aluno01.Matricular();
      //  aluno02.Aprovacao();

       // Escola escola01 = new Escola(1000,"COTEMIG", "12.365.907/0001-12", 20,70.0);
       // Escola escola02 = new Escola(150,"CHROMOS", "34.544.089/0001-01", 15,70.0);
       // Escola escola03 = new Escola(1500,"TIRADENTES", "02.476.581/0001-34", 40,70.0);

        //escola01.QuantAlunos();
        //escola02.Media();


        // EXERCICIO 2 -----------------------------------

        Empresa empresa = new Empresa("MERCER", "03902392093", "RUA 3", "81932131");

        empresa.DepositarCaixa(1000000);

        Onibus o1 = new Onibus("3302A","Mercedes benz", 2019,"RCT8945",100000);
        Onibus o2 = new Onibus("3302B","Mercedes benz", 2020,"BCE2064",150000);
        Onibus o3 = new Onibus("3302D","Mercedes benz", 2021,"HLA7108",200000);
        empresa.comprarOnibus(o1);
        o1.checaQuilometragem();
        o2.addPessoas(20);
        o2.addPessoas(50);
        o2.removePessoa();
        o2.trocarMotorista("Juliana");



        // EXERCICIO 3 --------------------------------------

        Banco banco = new Banco("ITAU","09330930394","RUA 34",12000000);

        Conta c1 = new Conta(1234,"1233941232","20/09/1987",4000,"corrente");
        Conta c2 = new Conta(4657,"093123123","02/03/2000",5000,"corrente");
        Conta c3 = new Conta(6789,"658874349","20/09/2005",1000,"poupança");


        c1.Saldoatual();
        c1.Sacar(500);
        c2.Depositar(1000);


        Cliente cli1 = new Cliente("jose",342,"12334466","rua 45");
        Cliente cli2 = new Cliente("maria",456,"09856734","rua 24");
        Cliente cli3 = new Cliente("alfredo",901,"16500758","rua 89");
    }
}
