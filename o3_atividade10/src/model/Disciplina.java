package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private long codigo;
    private String nome;

    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(long codigo, String nome, List<Aluno> alunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = alunos;
    }

    public Disciplina(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Disciplina() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
