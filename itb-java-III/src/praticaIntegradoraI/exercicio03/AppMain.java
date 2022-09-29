package praticaIntegradoraI.exercicio03;

import praticaIntegradoraI.exercicio03.classes.Animal;
import praticaIntegradoraI.exercicio03.classes.Cachorro;
import praticaIntegradoraI.exercicio03.classes.Gato;
import praticaIntegradoraI.exercicio03.classes.Vaca;

import java.util.Arrays;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        List<Animal> animais = Arrays.asList(cachorro, gato, vaca);
        for (Animal animal : animais) {
            System.out.print(animal + " -> ");
            System.out.println(animal.emitirSom());
        }

        System.out.println(cachorro.comerCarne());
        System.out.println(gato.comerCarne());
        System.out.println(vaca.comerPasto());
    }
}
