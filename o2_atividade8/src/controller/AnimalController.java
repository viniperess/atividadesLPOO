package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

        Peixe pe1 = new Peixe();
        Peixe pe2 = new Peixe(1,1,1);
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro(2,2);
        Passaro pa1 = new Passaro();
        Passaro pa2 = new Passaro(3,3,3);

        List<Animal> animais = new ArrayList<>();
        animais.add(pe1);
        animais.add(pe2);
        animais.add(pa1);
        animais.add(pa2);
        animais.add(c1);
        animais.add(c2);

        System.out.println("\nLISTA DE ANIMAIS"+animais);

        animais.forEach(a -> {
            a.desenhar();
            if(a instanceof Animal){
                a.mover(2,2);
            }
        });

        System.out.println("\nANIMAIS NA CORDENADA 2"+animais);

        animais.forEach((a -> {
            a.desenhar();
            if(a instanceof Cachorro){
                a.mover(8,8);
            }
        }));

        System.out.println("\nCACHORRO NA CORDENADA 8"+animais);

        animais.forEach(a -> {
            a.desenhar();
            if(a instanceof Peixe){
                ((Peixe)a).mover(5,5,5);
            }else if(a instanceof Passaro){
                ((Passaro)a).mover(5,5,5);
            }
        });

        System.out.println("\nPASSARO E PEIXE NA CORDENADA 5"+animais);


    }
}
