package praticaIntegradora.supermercado.data;

import praticaIntegradora.supermercado.exceptions.InvalidIdNumberException;
import praticaIntegradora.supermercado.modelo.Cliente;
import praticaIntegradora.supermercado.util.NumberGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RepositoryClientes implements Repository<Cliente> {

    private final List<Cliente> listaClientes;
    private final NumberGenerator numberGenerator;

    public RepositoryClientes() {
        listaClientes = new ArrayList<>();
        numberGenerator = NumberGenerator.getInstance();
    }


    @Override
    public void salvar(Cliente cliente) {
        int Id = numberGenerator.getNext();
        cliente.setId(Id);
        listaClientes.add(cliente);
    }

    @Override
    public void exibirTodosNaTela() {
        listaClientes.stream()
                .sorted(Comparator.comparing(Cliente::getId))
                .forEach(System.out::println);
    }

    @Override
    public Optional<Cliente> buscarPorId(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                return Optional.of(cliente);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Cliente> exibirDadosPorId(int id) throws InvalidIdNumberException {
        Optional<Cliente> cliente = this.buscarPorId(id);
        if (cliente.isEmpty()) {
            throw new InvalidIdNumberException("Id inválido");
        }
        return cliente;

    }

    @Override
    public void excluirPorId(int id) throws InvalidIdNumberException {
        Optional<Cliente> cliente = this.buscarPorId(id);
        if (cliente.isEmpty()) {
            throw new InvalidIdNumberException("Id inválido");
        }
        listaClientes.remove(cliente.get());
    }

    @Override
    public List<Cliente> buscarTodos() {
        return listaClientes;
    }
}
