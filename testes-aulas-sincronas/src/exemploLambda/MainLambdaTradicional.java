package exemploLambda;

import java.util.Arrays;
import java.util.List;

public class MainLambdaTradicional {
    public static void main(String[] args) {
        // Declaração da lista
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // forEach normal
        for (int i :
                numeros) {
            System.out.println(i);
        }

        // forEach usando método do objeto
        numeros.forEach(n -> System.out.println(n + " - "));
        numeros.forEach(n -> {
            System.out.print(n);
            System.out.println(" - ");
        });

    }
}
