package controller;

import model.*;

import java.util.*;

public class FuncionarioControllerv {
    public static void main(String[] args) {

        Desenvolvedor d1 = new Desenvolvedor();
        Gerente g1 = new Gerente();
        Cliente c1 = new Cliente();

        Desenvolvedor d2 = new Desenvolvedor();
        Desenvolvedor d3 = new Desenvolvedor();

        Gerente g2 = new Gerente();
        Gerente g3 = new Gerente();

        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        d1.setSalario(1000);
        d1.setNome("Rafael");
        System.out.println(d1);

        g1.setSalario(2000);
        g1.setNome("Vinicius");
        g1.setTicker("TOTS3");
        g1.setQuantidade(1000);
        System.out.println(g1);

        c1.setId(1);
        c1.setNome("Vagner");
        c1.setSobrenome("Pinto");
        c1.setTicker("ITS4");
        c1.setQuantidade(2000);
        System.out.println(c1);

        d2.setSalario(2000);
        d2.setNome("Ramiro");
        System.out.println(d2);

        d3.setSalario(4000);
        d3.setNome("Referson");
        System.out.println(d3);

        g2.setSalario(4000);
        g2.setNome("Filipe");
        g2.setTicker("TOTS3");
        g2.setQuantidade(100);
        System.out.println(g2);

        g3.setSalario(20000);
        g3.setNome("Marcos");
        g3.setTicker("TOTS3");
        g3.setQuantidade(5000);
        System.out.println(g3);

        c3.setId(3);
        c3.setNome("Paula");
        c3.setSobrenome("Tejano");
        c3.setTicker("ITS4");
        c3.setQuantidade(200);
        System.out.println(c3);

        c2.setId(2);
        c2.setNome("Ker");
        c2.setSobrenome("Pinto");
        c2.setTicker("ITS4");
        c2.setQuantidade(100);
        System.out.println(c2);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(g1);
        investidores.add(g2);
        investidores.add(g3);



        System.out.println("LISTA FUNCIONARIOS");
        System.out.println(funcionarios);

        System.out.println("\nLISTA DE INVESTIDORES" + investidores);

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("\nLISTA DE FUNCIONARIOS DA EMPRESA " + funcionarios);
        System.out.println("\nLISTA DE CLIENTES DA EMPRESA:");
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        investidores.forEach(i -> {
            if(i instanceof Cliente) {
                System.out.println(i);
            }
        });

        System.out.println("\n\nLISTA DE INVESTIDORES DA EMPRESA:" + investidores);

        System.out.println("\nFUNCIONARIO COM MAIOR SALARIO");
        Funcionario maior = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f -> {
            if(f.getSalario() >= maior.getSalario()){
                System.out.println(f);
            }
        });

        System.out.println("\n\nINVESTIDOR COM MAIOR QUANTIDADE DE AÇÃO");
        Investidor maiorAcao = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i -> {
            if(i.getQuantidade() >= maiorAcao.getQuantidade()){
                System.out.println(i);
            }
        });



    }
}
