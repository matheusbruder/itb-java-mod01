package praticaIntegradora.supermercado.data;

import praticaIntegradora.supermercado.exceptions.InvalidIdNumberException;
import praticaIntegradora.supermercado.modelo.Item;
import praticaIntegradora.supermercado.util.NumberGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RepositoryItens implements Repository<Item> {

    private final List<Item> listaItens;
    private final NumberGenerator numberGenerator;

    public RepositoryItens() {
        listaItens = new ArrayList<>();
        numberGenerator = NumberGenerator.getInstance();
    }


    @Override
    public void salvar(Item item) {
        int codigo = numberGenerator.getNext();
        item.setCodigo(codigo);
        listaItens.add(item);
    }

    @Override
    public void exibirTodosNaTela() {
        listaItens.stream().sorted(Comparator.comparing(Item::getCodigo)).forEach(System.out::println);
    }

    @Override
    public Optional<Item> buscarPorId(int id) {
        for (Item item : listaItens) {
            if (item.getCodigo() == id) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Item> exibirDadosPorId(int id) throws InvalidIdNumberException {
        Optional<Item> item = this.buscarPorId(id);
        if (item.isEmpty()) {
            throw new InvalidIdNumberException("Código inválido");
        }
        return item;
    }

    @Override
    public void excluirPorId(int id) throws InvalidIdNumberException {
        Optional<Item> item = this.buscarPorId(id);
        if (item.isEmpty()) {
            throw new InvalidIdNumberException("Id inválido");
        }
        listaItens.remove(item.get());
    }

    @Override
    public List<Item> buscarTodos() {
        return listaItens;
    }
}
