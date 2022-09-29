package exercicioContasBancarias.util;


// Singleton > garante apenas um objeto daquele tipo rodando!
public class NumberGenerator {

    private final static NumberGenerator instancia = new NumberGenerator();
    private int next;

    private NumberGenerator() {
    }

    public static NumberGenerator getInstance() {
        return instancia;
    }

    public int getNext() {
        return ++next;
    }
}
