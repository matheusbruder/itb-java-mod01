package praticaIntegradoraI.exercicio02;

import praticaIntegradoraI.exercicio02.classes.Arquivo;

public interface Imprimivel {

    static void imprimirArquivo(Arquivo arquivo) {
        System.out.println(arquivo.toString());
    }

}
