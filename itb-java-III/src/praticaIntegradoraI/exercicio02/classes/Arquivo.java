package praticaIntegradoraI.exercicio02.classes;

public class Arquivo {
    private final String tipo;

    public Arquivo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Arquivo{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
