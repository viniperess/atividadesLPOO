package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class CompraController {
    public static void main(String[] args) {

        Fornecedor for1 = new Fornecedor(123, "999", "Ambev");

        Vendedor v1 = new Vendedor(1, "Vinicius", "Rua teles", "Porto", "000", "Pelotas", "RS", "Americanas");
        Produto produto1 = new Produto(1, "Coca cola", 100, 10.50, for1);
        Item item1 = new Item(1, 2.5, 10, produto1);
        Produto produto2 = new Produto(1, "Coca cola", 100, 10.50, for1);
        Item item2 = new Item(1, 2.5, 10, produto2);

        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        Pedido ped1 = new Pedido(777, new GregorianCalendar(2023, 05, 10), 99, v1, itens);


        Produto produto3 = new Produto(2, "Agua mineral", 200, 2.50, for1);
        Item item3 = new Item(2, 1.5, 10);
        Produto produto4 = new Produto(2, "Agua mineral", 200, 2.50, for1);
        Item item4 = new Item(2, 1.5, 10);

        itens.clear();

        itens.add(item3);
        itens.add(item4);

        Pedido ped2 = new Pedido(222, new GregorianCalendar(2023, 05, 10), 12, v1, itens);

        if (produto1.getQuantidade() > item1.getQuantidade() && produto2.getQuantidade() > item2.getQuantidade()) {

            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(ped1);
            pedidos.add(ped2);

            v1.getPedidos().add(ped1);
            System.out.println("\nPEDIDO COMISSIONADO" + v1);


            double total = item1.getQuantidade() * produto1.getPreco();
            Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2023, 5, 10), total, for1, produto1);

            double totalPro2 = item2.getQuantidade() * produto2.getPreco();
            Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2023, 5, 10), totalPro2, for1, produto2);


            double totalPro3 = item3.getQuantidade() * produto3.getPreco();
            Fornecimento fr3 = new Fornecimento(new GregorianCalendar(2023, 5, 10), totalPro3, for1, produto4);

            double totalPro4 = item4.getQuantidade() * produto4.getPreco();
            Fornecimento fr4 = new Fornecimento(new GregorianCalendar(2023, 5, 10), totalPro4, for1, produto4);

            double qntEstoque = fr1.getProduto().getQuantidade() - item1.getQuantidade();
            System.out.println("\nQUANTIDADE DE ESTOQUE DO PRODUTO 1 DISPONIVEL" + qntEstoque);

            double qntEstoque2 = fr2.getProduto().getQuantidade() - item2.getQuantidade();
            System.out.println("\nQUANTIDADE DE ESTOQUE DO PRODUTO 2 DISPONIVEL " + qntEstoque2);

            double qntEstoque3 = fr3.getProduto().getQuantidade() - item3.getQuantidade();
            System.out.println("\nQUANTIDADE DE ESTOQUE DO PRODUTO 3 DISPONIVEL " + qntEstoque3);

            double qntEstoque4 = fr4.getProduto().getQuantidade() - item4.getQuantidade();
            System.out.println("\nQUANTIDADE DE ESTOQUE DO PRODUTO 4 DISPONIVEL " + qntEstoque4);


            List<Fornecimento> fornecimentos = new ArrayList<>();
            fornecimentos.add(fr1);
            fornecimentos.add(fr2);
            fornecimentos.add(fr3);
            fornecimentos.add(fr4);
            System.out.println("\nFORNECIMENTOS DOS PRODUTOS " + fornecimentos);


            ped1.setTipo(Tipo.ATENDIDO);


            System.out.println("TOTAL DE VALORES FORNECIMENTO = " +
                    NumberFormat.getCurrencyInstance().format(
                            fornecimentos.stream()
                                    .mapToDouble(f -> f.getValorTotal())
                                    .sum()));

        } else comportamento();
    }

    private static void comportamento(){
        mythrowException();
    }

    private static void mythrowException(){

        try{
            System.out.println("\nESTOQUE INDISPONIVEL");
            throw new EstoqueIndisponivel();
        }catch (EstoqueIndisponivel e){
            e.printStackTrace();
        } finally {
            System.out.println("\nValido");
        }
    }

    static class EstoqueIndisponivel extends Exception {
        public  EstoqueIndisponivel(){
            super("\nESTOQUE INSUFICIENTE");
        }
    }


}

