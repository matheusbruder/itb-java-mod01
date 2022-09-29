package exemploFiguras;

public class Circulo extends Figura {

    // Construtor
    public Circulo(int x, int y) {
        super(x, y);
    }

    // Método obrigatório
    @Override
    public void exibir() {
        System.out.println("Circulo");
    }

    @Override
    public String getName() {
        return "Circulo";
    }

    @Override
    public void show(Imprimir imprimir) {
        imprimir.exibir(getName());
    }
}
