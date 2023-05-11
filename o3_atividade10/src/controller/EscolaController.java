package controller;

import model.Aluno;
import model.Disciplina;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EscolaController {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(1L, "Vinicius", "Peres");
        Aluno a2 = new Aluno(2L, "Jose","Silva");

        Disciplina d1 = new Disciplina(3L,"LPOO");
        Disciplina d2 = new Disciplina(4L,"LOGICA");
        Disciplina d3 = new Disciplina(5L, "PERFIL EMPREENDEDOR");

//        List<Aluno> alunos = new ArrayList<>();
//        alunos.add(a1);
//        alunos.add(a2);
//
//        d1.setAlunos(alunos);
//        d2.setAlunos(alunos);
//        d3.getAlunos().add(a2);

        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);

        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.println("LISTA DE DISCIPLINAS EM ORDEM POR ALUNO");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        a2.getDisciplinas().remove(d1);
        a2.getDisciplinas().remove(d2);
        a2.getDisciplinas().remove(d3);

        System.out.println("NOVA LISTAGEM DE DISCIPLINAS POR ALUNO");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);





    }
}
