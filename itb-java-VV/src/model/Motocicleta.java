package model;

public class Motocicleta extends Veiculo {

    private static final double PESO_MOTO = 300.0;
    private static final int QNTD_RODAS = 2;

    public Motocicleta(int velocidade, int aceleracao, double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, PESO_MOTO, QNTD_RODAS);
    }

    @Override
    public String toString() {
        return "Moto: " + super.toString();
    }
}
