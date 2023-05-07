package controller;

import model.*;

public class ContaController {
    public static void main(String[] args) {
        //Conta conta1 = new Conta();

        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaConjunta cj1 = new ContaConjunta();
        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();


        cc1.deposita(1000);
        System.out.println(cc1);
        cc1.saca(1200);
        System.out.println(cc1);
        //cc1.atualiza(10);
        //System.out.println(cc1);

        cp1.deposita(2000);
        cp1.saca(500);
        System.out.println(cp1);

        System.out.println();

        cj1.deposita(5000);
        System.out.println(cj1);

        cps1.deposita(7000);
        System.out.println(cps1);
    }
}
