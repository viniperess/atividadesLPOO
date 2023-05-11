package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {

    private int numero;
    private Calendar data;
    private double valor;

    private Tipo tipo;

    private Vendedor vendedor;

    private List<Item> itens = new ArrayList<>();


    public Pedido(int numero, Calendar data, double valor, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itens = itens;
        this.tipo = Tipo.PENDENTE;
    }

    public Pedido(int numero, Calendar data, double valor, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.tipo = Tipo.PENDENTE;
    }

    public Pedido() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                '}';
    }
}
