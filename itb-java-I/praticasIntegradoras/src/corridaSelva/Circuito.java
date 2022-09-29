package corridaSelva;

import java.util.ArrayList;
import java.util.List;

public class Circuito {
    // Atributos
    private String categoria;
    private int distancia;
    private List<Inscricao> listaInscricoes = new ArrayList<>();

    // Construtor
    public Circuito(String categoria, int distancia) {
        this.categoria = categoria;
        this.distancia = distancia;
    }

    // Métodos
    public void adicionarInscricao(Inscricao inscricao) {
        if (listaInscricoes.contains(inscricao)) {
            System.out.println("Maratonista já inscrito na categoria");
        } else {
            if(inscricao.getValorInscricao() == 0) {
                System.out.println("Idade não permitida para categoria avançado");
            } else {
                // Incrementar número do participante
                inscricao.getMaratonista().setCodigo();
                listaInscricoes.add(inscricao);
            }
        }
    }

    public void removerInscricao(String nome) {
        if (listaInscricoes.removeIf(n -> n.getMaratonista().getNome().equalsIgnoreCase(nome))) {
            System.out.println("Inscrição de '" + nome + " foi removida com sucesso");
        } else {
            System.out.println("Maratonista '" + nome + "' não encontrado no circuito");
        }

    }

    public StringBuilder exibirParticipantes() {
        StringBuilder result = new StringBuilder();
        for (Inscricao inscricao : listaInscricoes) {
            result.append(inscricao.getMaratonista().toString())
                    .append(" | Valor inscrição: ")
                    .append(inscricao.getValorInscricao())
                    .append("\n");
        }
        return result;
    }

    // Getters and setters
    public List<Inscricao> getListaInscricoes() {
        return listaInscricoes;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return this.getCategoria();
    }
}
