package model;

public class ContaCorrente extends Conta implements Associado{

    private int qdeCotas;
    private double valorCota;


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

    public ContaCorrente(double saldo, int qdeCotas, double valorCota) {
        super(saldo);
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public ContaCorrente(int qdeCotas, double valorCota) {
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                "} ";
    }
}
