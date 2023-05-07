package model;

public abstract class Personagem {

    protected double x=0,y=0;

    public Personagem() {
    }

    public Personagem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    };

    public abstract void desenhar();

    @Override
    public String toString() {
        return "\nPersonagem{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
