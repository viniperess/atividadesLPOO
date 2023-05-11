package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class CompraController {
    public static void main(String[] args) {

        Vendedor v1 = new Vendedor(1, "Vinicius", "Rua teles", "Porto", "000", "Pelotas", "RS", "Americanas");

        Fornecedor for1 = new Fornecedor(123, "999", "Ambev");

        Item item1 = new Item(1, 2.5, 10);
        Produto produto1 = new Produto(1, "Coca cola", 100, 10.50, for1);
        Pedido ped1 = new Pedido(777, new GregorianCalendar(2023,05,10), 99, v1);

        Item item2 = new Item(2, 1.5, 10);
        Produto produto2 = new Produto(2, "Agua mineral", 10, 2.50, for1);
        Pedido ped2 = new Pedido(222, new GregorianCalendar(2023,05,10), 12, v1);



        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(ped1);
        pedidos.add(ped2);

        System.out.println("\nPEDIDOS REALIZADOS" +pedidos);

        ped1.getItens().add(item1);
        System.out.println("\nPEDIDO 1 ATUALIZADO "+ped1);
        ped2.getItens().add(item2);
        System.out.println("\nPEDIDO 2 ATUALIZADO "+ped2);

        v1.getPedidos().add(ped1);
        System.out.println("\nPEDIDO COMISSIONADO"+v1);


        double total = item1.getQuantidade() * produto1.getPreco();
        Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2023, 5, 10), total, for1, produto1);

        double totalPro2 = item2.getQuantidade() * produto2.getPreco();
        Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2023, 5, 10), totalPro2, for1, produto2);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        System.out.println("\nFORNECIMENTOS DOS PRODUTOS "+fornecimentos);


        System.out.println("TOTAL DE VALORES = " +
                NumberFormat.getCurrencyInstance().format(
                        fornecimentos.stream()
                                .mapToDouble(f -> f.getValorTotal())
                                .sum()));



    }
}
