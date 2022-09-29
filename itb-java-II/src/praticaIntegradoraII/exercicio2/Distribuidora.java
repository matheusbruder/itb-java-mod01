package praticaIntegradoraII.exercicio2;

import praticaIntegradoraII.exercicio2.entidades.NaoPerecivel;
import praticaIntegradoraII.exercicio2.entidades.Perecivel;
import praticaIntegradoraII.exercicio2.entidades.Produto;
import praticaIntegradoraII.exercicio2.entidades.VendaProduto;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        Produto tomate = new Perecivel("Tomate", 2.69, 3);
        Produto ovo = new Perecivel("Ovo", 7.25, 5);
        Produto queijo = new Perecivel("Queijo", 21.80, 2);
        Produto leite = new Perecivel("Leite", 6.60, 1);
        Produto frango = new Perecivel("Frango", 21.90, 10);

        Produto arroz = new NaoPerecivel("Arroz", 15.99, "in natura");
        Produto farinha = new NaoPerecivel("Farinha", 5.45, "industrializado");
        Produto pipoca = new NaoPerecivel("Pipoca", 4.95, "industrializado");
        Produto macarrao = new NaoPerecivel("Macarrão", 3.55, "industrializado");
        Produto sal = new NaoPerecivel("Sal", 6.10, "in natura");

        List<VendaProduto> vendaProdutos = new ArrayList<>();

        vendaProdutos.add(new VendaProduto(tomate, 10));
        vendaProdutos.add(new VendaProduto(ovo, 1));
        vendaProdutos.add(new VendaProduto(queijo, 1));
        vendaProdutos.add(new VendaProduto(leite, 24));
        vendaProdutos.add(new VendaProduto(frango, 5));
        vendaProdutos.add(new VendaProduto(arroz, 5));
        vendaProdutos.add(new VendaProduto(farinha, 3));
        vendaProdutos.add(new VendaProduto(pipoca, 10));
        vendaProdutos.add(new VendaProduto(macarrao, 2));
        vendaProdutos.add(new VendaProduto(sal, 10));

        double precoTotal = 0.0;
        String formato = "R$ #,##0.00";
        DecimalFormat df = new DecimalFormat(formato);
        for (VendaProduto item : vendaProdutos) {
            double valor = item.getProduto().calcular(item.getQuantidade());
            precoTotal += valor;

            System.out.println(item.getProduto().getNome() + " x " + item.getQuantidade() + " = " + df.format(valor));
        }
        System.out.println("----------------------------");
        System.out.println("Preço Total = " + df.format(precoTotal));

    }
}
