package exercicioContasBancarias.modelo;

import exercicioContasBancarias.exception.InvalidNumberException;

public abstract class Conta {

    private int numero;
    private double saldo; // Refatorar para BigDecimal
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) throws InvalidNumberException {
        if (valor <= 0) {
            throw new InvalidNumberException("Valor inválido");
        }
        this.saldo += valor;
    }

    public boolean sacar(double valor) throws InvalidNumberException {
        if (valor <= 0) {
            throw new InvalidNumberException("Valor inválido");
        }
        this.saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente;
    }
}
