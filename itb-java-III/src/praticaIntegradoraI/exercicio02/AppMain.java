package praticaIntegradoraI.exercicio02;

import praticaIntegradoraI.exercicio02.classes.Curriculo;
import praticaIntegradoraI.exercicio02.classes.Livro;
import praticaIntegradoraI.exercicio02.classes.Pessoa;
import praticaIntegradoraI.exercicio02.classes.Relatorio;

import java.util.Arrays;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Matheus", 23, "Software Developer");
        Pessoa p2 = new Pessoa("Marcos", 45, "Escritor");
        Pessoa p3 = new Pessoa("Edson", 51, "Professor Universitário");

        List<String> habilidades = Arrays.asList("Java", "Python", "C/C++", "JavaScript", "Golang");

        Curriculo curriculo = new Curriculo("CV", p1, habilidades);
        Imprimivel.imprimirArquivo(curriculo);

        Livro livro = new Livro("LIV", "Era uma vez", "Terror", "Agnelo Bastian", 98);
        Imprimivel.imprimirArquivo(livro);

        Relatorio relatorio = new Relatorio("REL", p2, p3, 55, 1000);
        Imprimivel.imprimirArquivo(relatorio);
    }
}
