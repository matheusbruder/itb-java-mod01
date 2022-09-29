package exemploStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        // Lista comum
        List<Integer> numeros = Arrays.asList(0, 13, 42, 73, 42, 85, 76, 17, 28, 19);
        List<String> palavras = Arrays.asList("Matheus", "Ana", "Lucas", "Saulo", "Paulo");

        // Criar uma stream a partir da lista
        Stream<Integer> stream = numeros.stream();


        System.out.println("Exibindo elementos na tela:");
        stream.forEach(System.out::println);

        // Utilizando streams
        System.out.println("Números pares:");
        List<Integer> listaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(listaPares);

        // Outro exemplo
        System.out.println("Números ordenados:");
        List<Integer> listaOrdenada = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listaOrdenada);

        // Exemplo final
        palavras.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
