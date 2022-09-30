package model;

public class Carro extends Veiculo {

    private static final double PESO_CARRO = 1000.0;
    private static final int QNTD_RODAS = 4;

    public Carro(int velocidade, int aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, PESO_CARRO, QNTD_RODAS);
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString();
    }
}
