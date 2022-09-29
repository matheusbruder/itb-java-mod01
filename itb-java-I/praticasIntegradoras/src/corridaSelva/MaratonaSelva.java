package corridaSelva;

import java.util.ArrayList;
import java.util.List;

public class MaratonaSelva {
    private List<Circuito> listaCircuitos = new ArrayList<>();
    private int totalInscritos;
    private double valorTotalArrecadado;

    public MaratonaSelva(List<Circuito> listaCircuitos) {
        this.listaCircuitos = listaCircuitos;
        this.totalInscritos = calcularTotalInscritos();
        this.valorTotalArrecadado = carcularTotalArrecadado();
    }

    public int calcularTotalInscritos () {
        int totalInscritos = 0;
        for (Circuito c : listaCircuitos) {
            totalInscritos += c.getListaInscricoes().size();
        }
        return totalInscritos;
    }

    public double carcularTotalArrecadado() {
        double totalArrecadado = 0;
        for (Circuito c : listaCircuitos) {
            for (Inscricao i : c.getListaInscricoes()) {
                totalArrecadado += i.getValorInscricao();
            }
        }
        return totalArrecadado;
    }

    @Override
    public String toString() {
        return "MaratonaSelva{" +
                "listaCircuitos=" + listaCircuitos +
                ", totalInscritos=" + totalInscritos +
                ", valorTotalArrecadado=" + valorTotalArrecadado +
                '}';
    }
}
