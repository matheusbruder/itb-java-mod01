package exemploFiguras;


public abstract class Figura {
    // Atributos
    private final int x;
    private final int y;

    // Construtor
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método [abstrato] obrigatório
    public abstract void exibir();
    public abstract String getName();
    public abstract void show(Imprimir imprimir);

    // Getters & setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
