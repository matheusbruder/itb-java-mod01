package praticaIntegradoraI.exercicio02.classes;

import praticaIntegradoraI.exercicio02.Imprimivel;

public class Relatorio extends Arquivo implements Imprimivel {
    private Pessoa autor;
    private Pessoa revisor;
    private int numeroPaginas;
    private int comprimentoTexto;

    public Relatorio(String tipo, Pessoa autor, Pessoa revisor, int numeroPaginas, int comprimentoTexto) {
        super(tipo);
        this.autor = autor;
        this.revisor = revisor;
        this.numeroPaginas = numeroPaginas;
        this.comprimentoTexto = comprimentoTexto;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public Pessoa getRevisor() {
        return revisor;
    }

    public void setRevisor(Pessoa revisor) {
        this.revisor = revisor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getComprimentoTexto() {
        return comprimentoTexto;
    }

    public void setComprimentoTexto(int comprimentoTexto) {
        this.comprimentoTexto = comprimentoTexto;
    }
}
