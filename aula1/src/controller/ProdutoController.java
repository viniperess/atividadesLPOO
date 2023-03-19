package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10, 100);
        Produto produto2 = new Produto("Feijao", 8, 80);
        Produto produto3 = new Produto("Batata", 3.50, 50);
        Produto produto4 = new Produto("Carne", 39.90, 10);

        List <Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        produtos.sort(Comparator.comparing(Produto::getNome));

        System.out.println(produtos);

        Produto produtoFind = produtos.stream().filter(p -> p.getNome().equals("carne")).findAny().orElse(null);

        System.out.println(produtoFind);

    }

}