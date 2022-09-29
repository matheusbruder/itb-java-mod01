package exercicioContasBancarias.modelo;

import exercicioContasBancarias.exception.InvalidNumberException;

public class ContaPoupanca extends Conta {

    private static double taxa = 10.0;

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    public static double getTaxa() {
        return taxa;
    }

    public static void setTaxa(double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    @Override
    public boolean sacar(double valor) throws InvalidNumberException {
        if (saldoInsuficiente(valor)) {
            return false;
        }
        return super.sacar(valor + getTaxa());
    }

    private boolean saldoInsuficiente(double valor) {
        return getSaldo() < valor + getTaxa();
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
