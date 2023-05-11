package controller;

import model.Atleta;
import model.Time;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class TimeController {
    public static void main(String[] args) {

        Atleta a1 = new Atleta(1L, "000", "Cristiano RONALDO", "AVEIRO", new GregorianCalendar(1985, 2,7));
        Atleta a2 = new Atleta(2L,"1111","Messi","Lionel", new GregorianCalendar(1987, 7, 10));
        Atleta a3 = new Atleta(3L,"222", "Neymar", "Junior", new GregorianCalendar(1991, 2,7));

        List<Atleta> atletas = new ArrayList<>();
        atletas.add(a1);
        atletas.add(a2);
        atletas.add(a3);
        System.out.println("ATLETAS DISPONIVEIS"+atletas);


        Time timasso = new Time(1L,"GREMIO", "RS", atletas);
        System.out.println("\nATLETAS CONTRATADOS"+timasso);

        atletas.remove(a3);
        System.out.println("TIME COM DESFALQUE"+atletas);



    }
}
