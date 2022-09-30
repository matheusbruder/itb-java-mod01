package model;

public class Socorrista<T> {

    public Socorrista() {
    }

    public void socorrer(T veiculo, String placa) {
        System.out.println("Socorrendo: " + veiculo.getClass().getName().split("\\.")[1] + ", placa=" + placa);
    }
}
