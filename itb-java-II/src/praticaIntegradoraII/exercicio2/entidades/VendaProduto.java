package praticaIntegradoraII.exercicio2.entidades;

public class VendaProduto {
    // Atributos
    private Produto produto;
    private int quantidade;

    // Construtor
    public VendaProduto(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters & setters
    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
