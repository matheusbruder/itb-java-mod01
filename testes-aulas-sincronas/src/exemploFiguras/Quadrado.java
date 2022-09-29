package exemploFiguras;

public class Quadrado extends Figura {

    // Construtor
    public Quadrado(int x, int y) {
        super(x, y);
    }

    // Método é obrigatório, deve implementar 'exibir'
    @Override
    public void exibir() {
        System.out.println("Quadrado");
    }

    @Override
    public String getName() {
        return "Quadrado";
    }

    @Override
    public void show(Imprimir imprimir) {
        imprimir.exibir(getName());
    }
}
