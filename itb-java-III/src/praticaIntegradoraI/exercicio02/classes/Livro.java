package praticaIntegradoraI.exercicio02.classes;

import praticaIntegradoraI.exercicio02.Imprimivel;

public class Livro extends Arquivo implements Imprimivel {
    private String titulo;
    private String genero;
    private String autor;
    private int numeroPaginas;

    public Livro(String tipo, String titulo, String genero, String autor, int numeroPaginas) {
        super(tipo);
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
