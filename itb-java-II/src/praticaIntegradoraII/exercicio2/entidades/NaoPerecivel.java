package praticaIntegradoraII.exercicio2.entidades;

public class NaoPerecivel extends Produto{
    private String tipo;

    // Construtor
    public NaoPerecivel(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }


    // Métodos
    @Override
    public double calcular(int quantidadeDeProdutos) {
        return super.calcular(quantidadeDeProdutos);
    }

    @Override
    public String toString() {
        return super.toString() + " | NaoPerecível{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    // Getters & setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
