package controller;

import model.Conta;

public class ContaController {
    public static void main(String[] args) {

        Conta conta1 = new Conta(100.00);

        System.out.println(conta1);

        System.out.println(conta1.atualiza(2.00));
    }

}
