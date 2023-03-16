package controller;

import model.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Acer", "Notebook", 500.00, 5);
        Produto produto2 = new Produto(2, "Lenovo", "Notebook", 700.00, 2);
        Produto produto3 = new Produto(3, "Apple", "Notebook", 500.00, 1);

        List<Produto> produtosList = new ArrayList<>();
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);

        System.out.println(produtosList);

        Map<Integer , Produto> produtosMap = new HashMap<>();
        produtosMap.put(1, produto1);
        produtosMap.put(2, produto2);
        produtosMap.put(3, produto3);

        System.out.println(produtosMap);

    }

}
