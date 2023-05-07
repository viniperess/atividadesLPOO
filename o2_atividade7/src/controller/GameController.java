package controller;

import model.Aviao;
import model.Navio;
import model.Personagem;
import model.Tanque;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static void main(String[] args) {

    Aviao a1 = new Aviao();
    Aviao a2 = new Aviao(1,1,1);
    Navio n1 = new Navio();
    Navio n2 = new Navio(2,2);
    Tanque t1 = new Tanque();
    Tanque t2 = new Tanque(3,3);

    ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(a1);
        personagens.add(a2);
        personagens.add(n1);
        personagens.add(n2);
        personagens.add(t1);
        personagens.add(t2);
        System.out.println("Posiçao inicial dos personagens: " + personagens);


        personagens.forEach(p -> {
            p.desenhar();
            if(p instanceof Aviao){
                ((Aviao)p).mover(10,10,10);
            } else if (p instanceof Navio){
                p.mover(20,20);
            }else if (p instanceof Tanque){
                p.mover(30,30);
            }
        });

        System.out.println("Posiçao atual dos personagens: " + personagens);




    }
}
