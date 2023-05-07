package model;

public interface Associado {

    int getQdeCotas();
    void setQdeCotas(int qdeCotas);
    double lucros(int qdeCotas, double valorCota);

}
