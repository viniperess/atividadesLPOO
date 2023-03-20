package model;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class Locacao {
    private Calendar dataLocacao;
    private Calendar horaLocacao;
    private Calendar DataDevolucao;
    private Calendar horaDevolucao;
    private Integer quilometragem;
    private Double ValorCalcao;
    private Double valor_locacao;
    private Boolean devolvido;

    public Locacao() {
    }

    public Locacao(Calendar dataLocacao, Calendar horaLocacao, Calendar dataDevolucao, Calendar horaDevolucao, Integer quilometragem, Double valorCalcao, Double valor_locacao, Boolean devolvido) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        DataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        ValorCalcao = valorCalcao;
        this.valor_locacao = valor_locacao;
        this.devolvido = devolvido;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Calendar getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Calendar horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public Calendar getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public Calendar getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Calendar horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Integer quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getValorCalcao() {
        return ValorCalcao;
    }

    public void setValorCalcao(Double valorCalcao) {
        ValorCalcao = valorCalcao;
    }

    public Double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(Double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", DataDevolucao=" + DataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", ValorCalcao=" + ValorCalcao +
                ", valor_locacao=" + valor_locacao +
                ", devolvido=" + devolvido +
                '}';
    }
}
