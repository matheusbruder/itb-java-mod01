package praticaIntegradora.supermercado.util;

public class NumberGenerator {

    private static final NumberGenerator instance = new NumberGenerator();

    private int next;

    public NumberGenerator() {
    }

    public static NumberGenerator getInstance() {
        return instance;
    }

    public int getNext() {
        return ++next;
    }
}
