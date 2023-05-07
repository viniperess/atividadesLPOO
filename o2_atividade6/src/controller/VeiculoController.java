package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoController {

    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(21, "1EEA1");
        Carro c1 = new Carro(20);
        Caminhao k1 = new Caminhao(5000);

        Bicicleta b2 = new Bicicleta();

        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();
        Carro c5 = new Carro();

        Caminhao k2 = new Caminhao();
        Caminhao k3 = new Caminhao();


        b1.setAnoFabricacao(2020);
        b1.setMarca("Caloi");
        b1.setModelo("BMX");
        b1.setPropulsao("200");
        b1.setNumeroDeEixos(2);

        System.out.println(b1);

        c1.setChassi("2EADA1");
        c1.setPlaca("INU4439");
        c1.setRenavam("99922999");
        c1.setMarca("Nissan");
        c1.setModelo("Versa");
        c1.setAnoFabricacao(2012);
        c1.setNumeroDeEixos(2);
        c1.setPropulsao("399");
        System.out.println(c1);

        k1.setChassi("3EFFFDA1");
        k1.setPlaca("IAC439");
        k1.setRenavam("33422999");
        k1.setMarca("MERCEDEZ");
        k1.setModelo("BENSM");
        k1.setAnoFabricacao(1999);
        k1.setNumeroDeEixos(8);
        k1.setPropulsao("1999");
        System.out.println(k1);

        c2.setCapacidadePortaMalas(20);
        c2.setChassi("342EADA1");
        c2.setPlaca("NNU4439");
        c2.setRenavam("23422999");
        c2.setMarca("Nissan");
        c2.setModelo("SENTRA");
        c2.setAnoFabricacao(2019);
        c2.setNumeroDeEixos(2);
        c2.setPropulsao("399");
        System.out.println(c2);

        c3.setCapacidadePortaMalas(20);
        c3.setChassi("FDDDEADA1");
        c3.setPlaca("NCX3439");
        c3.setRenavam("3432922999");
        c3.setMarca("FORD");
        c3.setModelo("FOCUS");
        c3.setAnoFabricacao(2014);
        c3.setNumeroDeEixos(2);
        c3.setPropulsao("399");
        System.out.println(c3);

        c4.setCapacidadePortaMalas(20);
        c4.setChassi("DAJSDA1");
        c4.setPlaca("IDL3239");
        c4.setRenavam("553452999");
        c4.setMarca("FORD");
        c4.setModelo("FUSION");
        c4.setAnoFabricacao(2007);
        c4.setNumeroDeEixos(2);
        c4.setPropulsao("399");
        System.out.println(c4);

        c5.setCapacidadePortaMalas(20);
        c5.setChassi("8193023");
        c5.setPlaca("ICC4535");
        c5.setRenavam("123890123");
        c5.setMarca("FORD");
        c5.setModelo("PRISMA");
        c5.setAnoFabricacao(2017);
        c5.setNumeroDeEixos(2);
        c5.setPropulsao("399");
        System.out.println(c5);

        k2.setCapacidadeDeCarga(5000);
        k2.setChassi("3EFFFDA1");
        k2.setPlaca("ISD3439");
        k2.setRenavam("33422999");
        k2.setMarca("MERCEDEZ");
        k2.setModelo("BENSM");
        k2.setAnoFabricacao(2002);
        k2.setNumeroDeEixos(8);
        k2.setPropulsao("1997");
        System.out.println(k2);

        k3.setCapacidadeDeCarga(5000);
        k3.setChassi("3EFFFDA1");
        k3.setPlaca("LKD3439");
        k3.setRenavam("33422999");
        k3.setMarca("MERCEDEZ");
        k3.setModelo("BENSM");
        k3.setAnoFabricacao(1989);
        k3.setNumeroDeEixos(8);
        k3.setPropulsao("1999");
        System.out.println(k3);

        b2.setTamanhoRoda(19);
        b2.setChassi("KJLDAS");
        b2.setAnoFabricacao(2022);
        b2.setMarca("Caloi");
        b2.setModelo("Predactor");
        b2.setPropulsao("200");
        b2.setNumeroDeEixos(2);

        System.out.println(b2);


        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(c3);
        veiculos.add(c4);
        veiculos.add(c5);
        veiculos.add(b1);
        veiculos.add(k1);
        veiculos.add(k2);
        veiculos.add(k3);
        veiculos.add(b2);

        System.out.println("LISTA DE VEICULOS");
        System.out.println(veiculos);

        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao).reversed());
        System.out.println("\n\nLISTA DE VEICULOS ORDENADAS POR ANO DE FABRICAÇÃO");
        System.out.println(veiculos);

        System.out.println("LISTA DE AUTOMOVEIS CADASTRADOS (POR ANO DE FABRICAÇAO)");
        veiculos.forEach(v -> {
            if (v instanceof Automovel){
                System.out.println(v);
            }
        });

        System.out.println("\n\nLista de Bicicletas cadastrados (por ano de fabricação)");
        veiculos.forEach(v -> {
            if(v instanceof Bicicleta) {
                System.out.println(v);
            }
        });

        System.out.println("\n\nLISTA DE VEICULOS QUE A PLACA COMEÇA POR I");
        veiculos.forEach((v -> {
            if(v instanceof Automovel) {
                if (((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i")) {
                    System.out.println(v);
                }
            }
        }));

    }

}
