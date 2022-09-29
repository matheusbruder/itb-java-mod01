package exercicioContasBancarias.data;

import exercicioContasBancarias.exception.InvalidCpfNumberException;
import exercicioContasBancarias.modelo.Cliente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GerenciaClientes {

    private final Map<Long, Cliente> clientes;

    public GerenciaClientes() {
        clientes = new HashMap<>();
    }

    public void adicionarCliente(String cpf, String nome) throws InvalidCpfNumberException {
        if (cpfInvalido(cpf)) {
            throw new InvalidCpfNumberException("Número de CPF Inválido");
        }
        clientes.put(Long.parseLong(cpf), new Cliente(cpf, nome));
    }

    public void removerCliente(String cpf) throws InvalidCpfNumberException {
        if (cpfInvalido(cpf)) {
            throw new InvalidCpfNumberException("Número de CPF Inválido");
        }
        clientes.remove(Long.parseLong(cpf));
    }

    public String obterDadosCliente(String cpf) throws InvalidCpfNumberException {
        if (cpfInvalido(cpf)) {
            throw new InvalidCpfNumberException("Número de CPF Inválido");
        }
        Cliente cliente = clientes.get(Long.parseLong(cpf));
        return cliente.toString();
    }

    public Cliente obterCliente(String cpf) throws InvalidCpfNumberException {
        if (cpfInvalido(cpf)) {
            throw new InvalidCpfNumberException("Número de CPF Inválido");
        }
        return clientes.get(Long.parseLong(cpf));
    }

    public List<String> listarTodosClientes() {
        return clientes.values().stream()
                .map(Cliente::toString)
                .collect(Collectors.toList());
    }

    public boolean cpfInvalido(String cpf) {
        return !cpf.matches("^[0-9]*$");
    }
}
