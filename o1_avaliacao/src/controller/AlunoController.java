package controller;

import model.Aluno;

import java.sql.SQLOutput;
import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, 12345, "Vinicius", "Peres", "viniciusgperes@hotmail.com");
        Aluno a2 = new Aluno(2, 23456, "Mario", "Josnei", "mario@hotmail.com");
        Aluno a3 = new Aluno(3, 34567, "Joao", "Silva", "joao@hotmail.com");
        Aluno a4 = new Aluno(4, 45678, "Luidi", "Bross", "luidi@hotmail.com");
        Aluno a5 = new Aluno();

        System.out.println(a5);

        a3.setId(6);
        a3.setCpf(3333);
        a3.setNome("Joana");
        a3.setSobrenome("Silva");
        a3.setEmail("joana@hotmail.com\n");

        System.out.println(a3.getId());
        System.out.println(a3.getCpf());
        System.out.println(a3.getNome());
        System.out.println(a3.getSobrenome());
        System.out.println(a3.getEmail());

        a4.setId(7);
        a4.setCpf(4444);
        a4.setNome("Luiginho");
        a4.setSobrenome("Brossner");
        a4.setEmail("luiginho@hotmail.com\n");

        System.out.println(a4.getId());
        System.out.println(a4.getCpf());
        System.out.println(a4.getNome());
        System.out.println(a4.getSobrenome());
        System.out.println(a4.getEmail());

        a5.setId(5);
        a5.setCpf(5555);
        a5.setNome("Maria");
        a5.setSobrenome("Santos");
        a5.setEmail("maria@hotmail.com\n");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        System.out.println("\n--- Lista ---");
        System.out.println(alunos);

        alunos.sort(Comparator.comparing(Aluno::getId));
        System.out.println("\n--- Lista Ordenada ---");
        System.out.println(alunos);

        Aluno alunoFind = alunos.stream().filter( aluno -> aluno.getId().equals(5)).findAny().orElse(null);
        System.out.println("\nAluno Localizado");
        System.out.println(alunoFind);

        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(a1.getId(), a1);
        alunoMap.put(a2.getId(), a2);
        alunoMap.put(a3.getId(), a3);
        alunoMap.put(a4.getId(), a4);
        alunoMap.put(a5.getId(), a5);

        System.out.println("\nColeçao tipo MAP");
        System.out.println(alunoMap);

        System.out.println("\nFiltro tipo MAP");
        System.out.println(alunoMap.get(a5.getId()));

        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\n--- Lista Ordenada Decrescente ---");
        System.out.println(alunos);

    }
}
