package model;

public class Cachorro extends Animal {


    @Override
    public void desenhar() {
        System.out.println("Cachorro desenhou");
    }

    public Cachorro(double x, double y) {
        super(x, y);
    }

    public Cachorro() {
    }

    @Override
    public String toString() {
        return "\nCachorro{" +
                "x=" + x +
                ", y=" + y +
                "} ";
    }
}
