package model;

public class Peixe extends Animal {

    private double z=0;

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Peixe(double z) {
        this.z = z;
    }

    public void mover(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Peixe() {
    }

    public Peixe(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Peixe desenhou");
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}
