package praticaIntegradoraII.exercicio1;

public class PraticaExecoes {

    // Atributos
    private final int a = 0;
    private final int b = 300;

    int calculaRazao() throws IllegalArgumentException {
        if (getA() == 0) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        }
        return getB() / getA();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
