package praticaIntegradoraII;

import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> veiculos;

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int numeroCarros() {
        return veiculos.size();
    }

    public double valorGaragem() {
        double total = 0.0;
        for (Veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "Garagem{" +
                "id=" + id +
                ", veículos=" + veiculos +
                '}';
    }
}
