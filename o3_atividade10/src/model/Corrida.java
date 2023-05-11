package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Corrida {

    private Long id;
    private String tipoPagamento;
    private String detalhesPagamento;
    private Calendar datainicio;
    private double preco;

    private Motorista motoristas;
    private Usuario usuarios;

    public Corrida(Long id, String tipoPagamento, String detalhesPagamento, Calendar datainicio, double preco, Motorista motoristas, Usuario usuarios) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.datainicio = datainicio;
        this.preco = preco;
        this.motoristas = motoristas;
        this.usuarios = usuarios;
    }

    public Corrida(Long id, String tipoPagamento, String detalhesPagamento, Calendar datainicio, double preco, Motorista motoristas) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.datainicio = datainicio;
        this.preco = preco;
        this.motoristas = motoristas;
    }

    public Corrida(Long id, String tipoPagamento, String detalhesPagamento, Calendar datainicio, double preco, Usuario usuarios) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.detalhesPagamento = detalhesPagamento;
        this.datainicio = datainicio;
        this.preco = preco;
        this.usuarios = usuarios;
    }

    public Corrida() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDetalhesPagamento() {
        return detalhesPagamento;
    }

    public void setDetalhesPagamento(String detalhesPagamento) {
        this.detalhesPagamento = detalhesPagamento;
    }

    public Calendar getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Calendar datainicio) {
        this.datainicio = datainicio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Motorista getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(Motorista motoristas) {
        this.motoristas = motoristas;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "\nCorrida{" +
                "id=" + id +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", detalhesPagamento='" + detalhesPagamento + '\'' +
                ", datainicio=" + datainicio +
                ", preco=" + preco +
                ", motoristas=" + motoristas +
                ", usuarios=" + usuarios +
                '}';
    }
}
