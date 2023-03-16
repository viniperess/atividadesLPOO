package model;

public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public double deposita(double valor){
        return this.saldo += valor;
    }

    public double saca(double valor){
        return this.saldo -= valor;
    }

    public double atualiza(double taxa){
        return this.saldo -= taxa;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
