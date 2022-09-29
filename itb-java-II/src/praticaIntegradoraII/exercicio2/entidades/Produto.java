package praticaIntegradoraII.exercicio2.entidades;

public class Produto {
    // Atributos
    private String nome;
    private double preco;


    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos
    public double calcular (int quantidadeDeProdutos) {
        return getPreco() * quantidadeDeProdutos;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preco +
                '}';
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
