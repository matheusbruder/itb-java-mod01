package exercicioContasBancarias.data;

import exercicioContasBancarias.exception.InvalidNumberAccountException;
import exercicioContasBancarias.exception.InvalidNumberException;
import exercicioContasBancarias.modelo.*;
import exercicioContasBancarias.util.NumberGenerator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GerenciaContas {

    NumberGenerator numberGenerator;
    private final Map<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
        numberGenerator = NumberGenerator.getInstance();
    }

    // Criando objetos de tipos diferentes
    public void novaContaCorrente(Cliente cliente) {
        int numeroConta = numberGenerator.getNext();
        contas.put(numeroConta, new ContaCorrente(numeroConta, cliente));
    }

    public void novaContaEspecial(Cliente cliente, double limite) {
        int numeroConta = numberGenerator.getNext();
        contas.put(numeroConta, new ContaEspecial(numeroConta, cliente, limite));
    }

    public void novaContaPoupanca(Cliente cliente) {
        int numeroConta = numberGenerator.getNext();
        contas.put(numeroConta, new ContaPoupanca(numeroConta, cliente));
    }

    public void removerConta(int numeroConta) throws InvalidNumberAccountException {
        if (contaInexistente(numeroConta)) {
            throw new InvalidNumberAccountException("Conta inexistente");
        }
        contas.remove(numeroConta);
    }


    // Criando operações
    public void depositar(int numeroConta, double valor) throws InvalidNumberAccountException, InvalidNumberException {
        if (contaInexistente(numeroConta)) {
            throw new InvalidNumberAccountException("Conta inexistente");
        }
        Conta conta = contas.get(numeroConta);
        conta.depositar(valor);
    }

    public boolean sacar(int numeroConta, double valor) throws InvalidNumberAccountException, InvalidNumberException {
        if (contaInexistente(numeroConta)) {
            throw new InvalidNumberAccountException("Conta inexistente");
        }
        Conta conta = contas.get(numeroConta);
        return conta.sacar(valor);
    }

    public String obterDadosConta(int numeroConta) throws InvalidNumberAccountException {
        if (contaInexistente(numeroConta)) {
            throw new InvalidNumberAccountException("Conta inexistente");
        }
        Conta conta = contas.get(numeroConta);
        return conta.toString();
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) throws InvalidNumberAccountException, InvalidNumberException {
        if (contaInexistente(numeroContaOrigem) || contaInexistente(numeroContaDestino)) {
            throw new InvalidNumberAccountException("Conta origem ou destino inexistente");
        }

        Conta contaOrigem = contas.get(numeroContaOrigem);
        Conta contaDestino = contas.get(numeroContaDestino);

        boolean saqueOrigemRealizado = contaOrigem.sacar(valor);
        if (saqueOrigemRealizado) {
            contaDestino.depositar(valor);
        }
    }


    public List<String> listarTodasContas() {
        return contas.values().stream()
                .map(Conta::toString)
                .collect(Collectors.toList());
    }

    public List<String> listarContasCorrentesPorNumero() {
        return contas.values().stream()
                .filter(c -> c instanceof ContaCorrente)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .map(Conta::toString)
                .collect(Collectors.toList());
    }

    public List<String> listarContasCorrentesPorSaldo() {
        return contas.values().stream()
                .filter(c -> c instanceof ContaCorrente)
                .sorted(Comparator.comparingDouble(Conta::getSaldo).reversed())
                .map(Conta::toString)
                .collect(Collectors.toList());
    }

    public List<String> listarContasEspeciaisNegativas() {
        return contas.values().stream()
                .filter(c -> c instanceof ContaEspecial)
                .sorted(Comparator.comparingDouble(Conta::getSaldo))
                .map(Conta::toString)
                .collect(Collectors.toList());
    }


    public boolean contaInexistente(int numeroConta) {
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            return true;
        }
        return false;
    }

}
