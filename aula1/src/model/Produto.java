package model;

public class Produto {
    String nome;
    double valor;
    int estoque;

    public Produto() {
    }
    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", estoque=" + estoque +
                '}';
    }
}
