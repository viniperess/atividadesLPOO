package model;

public class Aviao extends Personagem{

    private double z=0;

    public Aviao(){
        super();
    }

    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Aviao(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou avião.");
    }

    public void mover(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nAviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                "} " ;
    }
}
