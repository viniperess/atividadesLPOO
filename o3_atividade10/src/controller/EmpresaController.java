package controller;

import model.Empresa;
import model.Funcionario;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class EmpresaController {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(1L, "0000","Vinicius", "Peres", new GregorianCalendar(1997,5,14));
        Funcionario f2 = new Funcionario(2L, "0000","Rinaldo", "Peres", new GregorianCalendar(1967,8,25));
        Funcionario f3 = new Funcionario(3L, "0000","Enilda", "Peres", new GregorianCalendar(1964,7,2));
        Funcionario f4 = new Funcionario(4L, "0000","Nathalia", "Peres", new GregorianCalendar(1995,8,30));
        Funcionario f5 = new Funcionario(5L, "0000","Fabricio", "Peres", new GregorianCalendar(1987,2,10));
        Funcionario f6 = new Funcionario(6L, "0000","Fernanda", "Peres", new GregorianCalendar(1989,2,9));

        Empresa e1 = new Empresa("1111", "veiculos", "Peres Veiculos");
        Empresa e2 = new Empresa("1111", "alimentos", "Peres Supermercado");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);

        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2);

        System.out.println("LISTAGEM DA EMPRESA " + e1.getNomeFantasia()+ "POR IDADE");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1);

        System.out.println("LISTAGEM DA EMPRESA " + e2.getNomeFantasia()+ "POR IDADE");
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2);
    }
}
