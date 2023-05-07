package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente(100);
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca(1000);
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();
        Cliente c5 = new Cliente();
        Cliente c6 = new Cliente();

        List<Conta> contas = new ArrayList<>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cp1);
        contas.add(cp2);

        System.out.println("\nLISTA DE CONTAS"+contas);

        List<Associado> associados = new ArrayList<>();
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);
        associados.add(c4);
        associados.add(c5);
        associados.add(c6);
        associados.add(cc1);
        associados.add(cc2);


        System.out.println("\nLISTA DE ASSOCIADOS"+associados);


        cp1.deposita(1000);
        System.out.println(cp1);
        cp1.atualiza(5);
        System.out.println(cp1);
        cp1.saca(50);
        System.out.println(cp1);

        cc1.deposita(500);
        System.out.println(cc1);
        cc1.saca(400);
        System.out.println(cc1);



        c1.setQdeCotas(100);
        c2.setQdeCotas(400);
        c3.setQdeCotas(600);
        c4.setQdeCotas(300);
        c5.setQdeCotas(600);
        c6.setQdeCotas(600);

        System.out.println(associados);

        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println("\nLISTA DE ASSOCIADOS PELA QUANTIDADE DE COTAS"+associados);


        Associado maior = Collections.max(associados, Comparator.comparing(Associado::getQdeCotas));
        associados.forEach(a -> {
            if(a.getQdeCotas() == maior.getQdeCotas()){
                System.out.println(a);
            }


        });


        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\nLISTA DE CONTAS POR SALDO"+contas);

        associados.forEach(a -> {
            if(a instanceof ContaCorrente){
                System.out.println("Conta com Associados "+a);
            }
        });

        Conta maiorSaldo = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        contas.forEach(c -> {
            if(c.getSaldo() == maiorSaldo.getSaldo()){
                System.out.println(c);
            }
        });



    }


}
