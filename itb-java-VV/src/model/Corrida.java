package model;

import exceptions.NumberVehiclesExceededException;
import exceptions.VehicleDoesNotExistException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Corrida {

    private double distancia;
    private double premio;
    private String nome;
    private int numeroVeiculos;
    private List<Veiculo> listaVeiculos;

    private final Socorrista<Veiculo> socorrista = new Socorrista<Veiculo>();

    public Corrida(double distancia, double premio, String nome, int numeroVeiculos) {
        this.distancia = distancia;
        this.premio = premio;
        this.nome = nome;
        this.numeroVeiculos = numeroVeiculos;
        this.listaVeiculos = new ArrayList<>();
    }

    public void addCarro(int velocidade, int aceleracao, double anguloGiro, String placa) throws NumberVehiclesExceededException {
        if (listaVeiculos.size() + 1 > getNumeroVeiculos()) {
            throw new NumberVehiclesExceededException("Número máximo de veículos excedido");
        }
        listaVeiculos.add(new Carro(velocidade, aceleracao, anguloGiro, placa));
    }

    public void addMoto(int velocidade, int aceleracao, double anguloGiro, String placa) throws NumberVehiclesExceededException {
        if (listaVeiculos.size() + 1 > getNumeroVeiculos()) {
            throw new NumberVehiclesExceededException("Número máximo de veículos excedido");
        }
        listaVeiculos.add(new Motocicleta(velocidade, aceleracao, anguloGiro, placa));
    }

    public void deleteVeiculo(Veiculo veiculo) throws VehicleDoesNotExistException {
        if (!listaVeiculos.contains(veiculo)) {
            throw new VehicleDoesNotExistException("Veículo não existe");
        }
        listaVeiculos.remove(veiculo);
    }

    public void deleteVeiculoPorPlaca(String placa) throws VehicleDoesNotExistException {
        Optional<Veiculo> veiculo = listaVeiculos.stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst();

        if (veiculo.isEmpty()) {
            throw new VehicleDoesNotExistException("Veículo não existe");
        } else {
            this.deleteVeiculo(veiculo.get());
        }

    }

    public void exibirVeiculos() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getPlaca))
                .forEach(System.out::println);
    }

    public Veiculo vencedor() {
        Veiculo vencedor = null;
        if (!listaVeiculos.isEmpty()) {
            double melhorDesempenho = 0.0;
            for (Veiculo veiculo : listaVeiculos) {
                if (melhorDesempenho < desempenhoCorrida(veiculo)) {
                    melhorDesempenho = desempenhoCorrida(veiculo);
                    vencedor = veiculo;
                }
            }
        }
        return vencedor;
    }

    public double desempenhoCorrida(Veiculo veiculo) {
        double n = veiculo.getVelocidade() * (veiculo.getAceleracao() * 0.5);
        double d = veiculo.getAnguloGiro() * (veiculo.getPeso() - veiculo.getQntdRodas() * 100);
        return n / d;
    }

    public void socorrer(String placa) throws VehicleDoesNotExistException {
        Optional<Veiculo> veiculo = listaVeiculos.stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst();

        if (veiculo.isEmpty()) {
            throw new VehicleDoesNotExistException("Veículo não existe");
        }

        socorrista.socorrer(veiculo.get(), placa);


    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVeiculos() {
        return numeroVeiculos;
    }

    public void setNumeroVeiculos(int numeroVeiculos) {
        this.numeroVeiculos = numeroVeiculos;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
