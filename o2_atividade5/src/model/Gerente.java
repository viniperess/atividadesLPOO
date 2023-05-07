package model;

public class Gerente extends Funcionario implements Investidor {

    private String ticker;
    private Integer quantidade;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente() {

    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.1;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "ticker='" + ticker + '\'' +
                ", quantidade=" + quantidade +
                ", getBonus()=" + getBonus() +
                ", getNomme()=" + getNome() +
                ", getSalario()=" + getSalario() +
                '}';
    }
}
