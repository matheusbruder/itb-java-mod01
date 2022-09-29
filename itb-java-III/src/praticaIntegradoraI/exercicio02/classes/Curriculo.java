package praticaIntegradoraI.exercicio02.classes;

import praticaIntegradoraI.exercicio02.Imprimivel;

import java.util.List;

public class Curriculo extends Arquivo implements Imprimivel {

    private Pessoa pessoa;
    private List<String> habilidades;

    public Curriculo(String tipo, Pessoa pessoa, List<String> habilidades) {
        super(tipo);
        this.pessoa = pessoa;
        this.habilidades = habilidades;
    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }
}
