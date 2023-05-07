package model;

public class Cliente implements Associado {

    private String nome;
    private int qdeCotas;
    private double valorCota;

    public Cliente(String nome, int qdeCotas, double valorCota) {
        this.nome = nome;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }




    @Override
    public String toString() {
        return "\nCliente{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}
