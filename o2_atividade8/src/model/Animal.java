package model;

public abstract class Animal {

    protected double x=0,y=0;

    public void mover(double x, double y){
        this.x = x;
        this.y = y;
    };

    public abstract void desenhar();

    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Animal() {
    }



}
