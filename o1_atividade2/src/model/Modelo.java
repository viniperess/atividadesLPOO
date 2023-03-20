package model;

public class Modelo {
    private String descricao;

    public Modelo(String descricao) {
        this.descricao = descricao;
    }

    public Modelo() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
