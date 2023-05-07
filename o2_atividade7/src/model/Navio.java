package model;

public class Navio extends Personagem {

    public Navio() {
    }

    public Navio(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou navio");
    }

    @Override
    public String toString() {
        return "\nNavio{" +
                "x=" + x +
                ", y=" + y +
                "} " ;
    }
}
