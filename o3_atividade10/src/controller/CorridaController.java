package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

public class CorridaController {
    public static void main(String[] args) {


        Veiculo v1 = new Veiculo(1L, "Carro", "INU4429", 2013);
        Motorista m1 = new Motorista(2L, "Vinicius", "vinicius@gmail.com", "845522874", v1);
        Usuario u1 = new Usuario(3L, "Vagner", "vagner@gmail.com", "9991999");

        Corrida c1 = new Corrida(4L, "Dinheiro", "Avista", new GregorianCalendar(2023, 5, 10), 9.50, m1, u1);
        Corrida c2 = new Corrida(5L, "Dinheiro", "Avista", new GregorianCalendar(2023, 5, 10), 9.50, m1, u1);

        List<Corrida> corridas = new ArrayList<>();
        u1.getCorridas().add(c1);
        u1.getCorridas().add(c2);

        u1.getCorridas().sort(Comparator.comparing(Corrida::getDatainicio).reversed());
        System.out.println(u1);

        m1.getCorridas().add(c1);
        m1.getCorridas().add(c2);
        m1.getCorridas().sort(Comparator.comparing(Corrida::getDatainicio).reversed());
        System.out.println(m1);
//
//        System.out.println("TOTAL DAS CORRIDAS DO MOTORISTA " + m1.getNome() + " = ");
//        System.out.println(NumberFormat.getCurrencyInstance()
//                .format(m1.getCorridas().stream()
//                .mapToDouble(c -> c.getPreco())
//                        .sum()));
    }

}
