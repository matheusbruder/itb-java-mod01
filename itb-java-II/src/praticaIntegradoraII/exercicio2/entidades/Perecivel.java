package praticaIntegradoraII.exercicio2.entidades;

public class Perecivel extends Produto {
    // Atributos
    private int diasParaVencer;

    // Construtor
    public Perecivel(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    // Métodos
    @Override
    public double calcular(int quantidadeDeProdutos) {
        double precoFinal = super.calcular(quantidadeDeProdutos);
        switch (getDiasParaVencer()) {
            case 1 -> precoFinal /= 4;
            case 2 -> precoFinal /= 3;
            case 3 -> precoFinal /= 2;
        }
        return precoFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " | Perecível{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    // Getters & setters
    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }
}
