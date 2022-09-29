package praticaIntegradora.supermercado.data;

import praticaIntegradora.supermercado.exceptions.InvalidIdNumberException;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    void salvar(T obj);

    void exibirTodosNaTela();

    Optional<T> buscarPorId(int id);

    Optional<T> exibirDadosPorId(int id) throws InvalidIdNumberException;

    void excluirPorId(int id) throws InvalidIdNumberException;

    List<T> buscarTodos();
}
