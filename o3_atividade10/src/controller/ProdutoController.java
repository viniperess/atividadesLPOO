package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class ProdutoController {
    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor(123, "999", "AMBEV");
        Fornecedor f2 = new Fornecedor(455, "888", "COCA-COLA");

        Produto p1 = new Produto(1, "Pepsi", 10, 6.5, f1);
        Produto p2 = new Produto(2,"Coca Cola", 100 , 8, f2);
        Produto p3 = new Produto(3, "Budwayser", 300, 11, f1);


        double total = p1.getPreco() * 50;
        p1.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2023, 5, 10), total, f1, p1);

        total = p2.getPreco() * 50;
        p2.setQuantidade(p2.getQuantidade() - 50);
        Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2023, 5, 10),total, f2, p2);

        total = p3.getPreco() * 50;
        p3.setQuantidade(p3.getQuantidade() - 50);
        Fornecimento fr3 = new Fornecimento(new GregorianCalendar(2023, 5, 10), total, f1, p3);


        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        fornecimentos.add(fr3);
        System.out.println("LISTA DE FORNECIMENTOS"+fornecimentos);

        System.out.println("TOTAL DE VALORES = " +
        NumberFormat.getCurrencyInstance().format(
                fornecimentos.stream()
                        .mapToDouble(f -> f.getValorTotal())
                        .sum()));

    }
}
