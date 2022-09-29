package praticaIntegradoraII;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class AppMain {
    public static void main(String[] args) {

        // Gerando veículos
        Veiculo veiculo1 = new Veiculo("Toro", "Fiat", 180000.00);
        Veiculo veiculo2 = new Veiculo("Onix", "Chevrolet", 89000.00);
        Veiculo veiculo3 = new Veiculo("C4 Pallas", "Citroen", 93000.00);
        Veiculo veiculo4 = new Veiculo("X6", "BMW", 250000.00);
        Veiculo veiculo5 = new Veiculo("A5", "Audi", 230000.00);

        // Gerando veículos
        Veiculo fiesta = new Veiculo("Ford", "Fiesta", 1000.00);
        Veiculo focus = new Veiculo("Ford", "Focus", 1200.00);
        Veiculo explorer = new Veiculo("Ford", "Explorer", 2500.00);
        Veiculo uno = new Veiculo("Fiat", "Uno", 500.00);
        Veiculo cronos = new Veiculo("Fiat", "Cronos", 1000.00);
        Veiculo torino = new Veiculo("Fiat", "Torino", 1250.00);
        Veiculo aveo = new Veiculo("Chevrolet", "Aveo", 1250.00);
        Veiculo spin = new Veiculo("Chevrolet", "Spin", 2500.00);
        Veiculo corolla = new Veiculo("Toyota", "Corolla", 1200.00);
        Veiculo fortuner = new Veiculo("Toyota", "Fortuner", 3000.00);
        Veiculo logan = new Veiculo("Renault", "Logan", 950.00);

        // Gerando garagens
        Garagem garagem1 = new Garagem(1, Arrays.asList(veiculo1, veiculo2, veiculo3, veiculo4, veiculo5));
        Garagem garagem2 = new Garagem(2, Arrays.asList(fiesta, focus, explorer, uno, cronos, torino, aveo, spin, corolla, fortuner, logan));

        System.out.println("------------------------- Teste Garagem 1 -------------------------");
        System.out.println("Quantidade de carros garagem1: " + garagem1.numeroCarros());
        System.out.println("Valor garagem1: " + NumberFormat.getCurrencyInstance().format(garagem1.valorGaragem()));
        System.out.println("Valor médio garagem1: " + NumberFormat.getCurrencyInstance().format(garagem1.valorGaragem() / garagem1.getVeiculos().size()));
        System.out.println("Veículos da garagem1: ");

        // Mostrar cada carro da garagem
        for (Veiculo v : garagem1.getVeiculos()) {
            String texto = "Modelo: " + v.getModelo()
                    + ", Marca: " + v.getMarca() + " - "
                    + NumberFormat.getCurrencyInstance().format(v.getPreco());
            System.out.println(texto);
        }
        System.out.println("------------------------- Final Teste Garagem 1 -------------------------");



        // Exibir veículos ordenados por preço - Exercício 03
        System.out.println("\n\n------------------------- Ordenação: Preço -------------------------");
        garagem2.getVeiculos().stream()
                .sorted(Comparator.comparingDouble(Veiculo::getPreco))
                .forEach(System.out::println);

        // Exibir veículos ordenados por marca - Exercício 04
        System.out.println("\n\n------------------------- Ordenação: Marca -------------------------");
        garagem2.getVeiculos().stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .sorted(Comparator.comparingDouble(Veiculo::getPreco))
                .forEach(System.out::println);

        // Exibir veículos preço < 1000 - Exercício 05a
        System.out.println("\n\n------------------------- Filtro: preço < 1000 -------------------------");
        garagem2.getVeiculos().stream()
                .filter(v -> v.getPreco() < 1000)
                .sorted(Comparator.comparingDouble(Veiculo::getPreco))
                .forEach(System.out::println);

        // Exibir veículos preço >= 1000 - Exercício 05a
        System.out.println("\n\n------------------------- Filtro: preço >= 1000 -------------------------");
        garagem2.getVeiculos().stream()
                .filter(v -> v.getPreco() >= 1000)
                .sorted(Comparator.comparingDouble(Veiculo::getPreco))
                .forEach(System.out::println);

        // Exibir preço médio total da lista de veículos
        System.out.println("\n\n------------------------- Filtro:  -------------------------");
        OptionalDouble valorMedio = garagem2.getVeiculos().stream()
                .mapToDouble(Veiculo::getPreco)
                .average();
        System.out.println("Valor médio de todos veículos: " + NumberFormat.getCurrencyInstance().format(valorMedio));

    }
}
