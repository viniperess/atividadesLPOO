package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {
        Automovel a1 = new Automovel(1, "123456", "INU4439", "Cinza", 4, "Gasolina", 255000, "E12A34C56", 259.99);
        Automovel a2 = new Automovel(2, "243555", "INU4439", "Branco", 4, "Gasolina", 255000, "E12A34C56", 209.99);
        Automovel a3 = new Automovel(3, "725312", "INU4439", "Preto", 4, "Gasolina", 255000, "E12A34C56", 459.99);
        Automovel a4 = new Automovel(4, "023454", "INU4439", "Azul", 4, "Gasolina", 255000, "E12A34C56", 359.99);
        Automovel a5 = new Automovel(5, "523345", "INU4439", "Amarelo", 4, "Gasolina", 255000, "E12A34C56", 159.99);

        List<Automovel> automovels = new ArrayList<>();
        automovels.add(a1);
        automovels.add(a2);
        automovels.add(a3);
        automovels.add(a4);
        automovels.add(a5);
        System.out.println(automovels);

        a2.setPlaca("QXP3G53");

        automovels.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println("\n----Veiculos Ordenados-----\n");
        System.out.println(automovels);

        Automovel aFind = automovels.stream().filter(a -> a.getCor().equals("Amarelo")).findAny().orElse(null);
        System.out.println("---Automovel Localizado---");
        System.out.println(aFind);

        Map<String, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(a1.getRenavam(), a1);
        automovelMap.put(a2.getRenavam(), a2);
        automovelMap.put(a3.getRenavam(), a3);
        automovelMap.put(a4.getRenavam(), a4);
        automovelMap.put(a5.getRenavam(), a5);
        System.out.println("\nColeçao tipo MAP \n");
        System.out.println(automovelMap);

        System.out.println("\nPesquisa tipo MAP\n");
        System.out.println(automovelMap.get(a3.getRenavam()));
    }
}
