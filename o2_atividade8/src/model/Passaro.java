package model;

public class Passaro extends Animal {

    private double z=0;

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Passaro(double z) {
        this.z = z;
    }

    public Passaro() {
    }

    public Passaro(double x, double y) {
        super(x, y);
    }

    public void mover(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("Passaro desenhou");
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} ";
    }
}
