package exemploCollections;

import java.util.ArrayList;
import java.util.List;

public class AppPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Matheus"));
        pessoas.add(new Pessoa("Julia"));
        pessoas.add(new Pessoa("Gustavo"));

        System.out.println(pessoas);

        System.out.println(pessoas.get(0));
        System.out.println(pessoas.get(1));
        System.out.println(pessoas.get(2));
    }
}
