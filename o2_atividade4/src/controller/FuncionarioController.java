package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private static double total_folha_com_bonus = 0.0;
    private static double total_folha_sem_bonus = 0.0;

    public static void main(String[] args) {
        Desenvolvedor dev1 = new DesenvolvedorSenior();
        Desenvolvedor dev2 = new DesenvolvedorSenior("Ana", 3500.00);
        Gerente ger1 = new GerenteGeral();
        Gerente ger2 = new GerenteDesenvolvimento("Rafael", 4500.00);
        System.out.println("Lista de funcionários");
        System.out.println(dev1 + "" + dev2 + "" + ger1 + "" + ger2);


        dev1.setNome("Maria");
        dev1.setSalario(3500.00);
        ger1.setNome("Sergio");
        ger1.setSalario(6500.00);

        System.out.println("Lista de funcionários atualizada");
        System.out.println(dev1 + "" + dev2 + "" + ger1 + "" + ger2);

        Desenvolvedor dev3 = new DesenvolvedorSenior("Bruno", 3500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("Carlos", 3500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Diego", 3500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("Elias", 3500.00);

        Desenvolvedor dev7 = new DesenvolvedorPleno("Fabricio", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Gabriel", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Hiago", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Italo", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Jardel", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Lucas", 2500.00);

        Desenvolvedor dev13 = new DesenvolvedorJunior("Marcos", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Nicolas", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Otavio", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Pedro", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Rafael", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Samuel", 1800.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(dev7);
        funcionarios.add(dev8);
        funcionarios.add(dev9);
        funcionarios.add(dev10);
        funcionarios.add(dev11);
        funcionarios.add(dev12);
        funcionarios.add(dev13);
        funcionarios.add(dev14);
        funcionarios.add(dev15);
        funcionarios.add(dev16);
        funcionarios.add(dev17);
        funcionarios.add(dev18);

        System.out.println(funcionarios);

        funcionarios.forEach(f -> {
            total_folha_com_bonus += f.getSalario() + f.getBonus();
        });
        System.out.println("\n\n TOTAL FOLHA COM BONUS");
        System.out.println(NumberFormat.getCurrencyInstance().format((total_folha_com_bonus)));
        System.out.println(total_folha_com_bonus);

        funcionarios.forEach(f -> {
            total_folha_sem_bonus += f.getSalario();
        });

        System.out.println("\n\n TOTAL FOLHA SEM BONUS");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_sem_bonus));

        funcionarios.forEach(f -> {
            total_folha_com_bonus += (f.getSalario() + f.getBonus()) * 0.05;
        });
        System.out.println("TOTAL FOLHA COM ACRESCIMO");
        System.out.println(total_folha_com_bonus);


        System.out.println("\n\nSALARIOS INDIVIDUAIS");
        funcionarios.forEach(f -> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nFuncionario: " + f.getNome());
            System.out.println("Salario: " + f.getSalario());
            System.out.println("Bonus: " + f.getBonus());
            System.out.println("Salario bruto: " + salarioBruto);
        });

        total_folha_com_bonus = 0.0;
        funcionarios.forEach(f -> {
            f.setSalario(f.getSalario() + (f.getSalario()) * 0.05);
            total_folha_com_bonus += f.getSalario() + f.getBonus();
        });

        System.out.println("\n\n Total folha nova com bonus");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
    }
}
