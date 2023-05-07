package model;

public class ContaCorrente extends Conta {

    public void saca(double valor){
        double saldoAtual = saldo - valor;

        if(saldoAtual >= -200){
            saldo -= valor;
        }else{
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + getSaldo() +
                '}';
    }
}
