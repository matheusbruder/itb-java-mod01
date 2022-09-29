package praticaIntegradora.supermercado.data;

import praticaIntegradora.supermercado.exceptions.InvalidIdNumberException;
import praticaIntegradora.supermercado.modelo.Fatura;
import praticaIntegradora.supermercado.util.NumberGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RepositoryFaturas implements Repository<Fatura> {

    private final List<Fatura> listaFaturas;
    private final NumberGenerator numberGenerator;

    public RepositoryFaturas() {
        listaFaturas = new ArrayList<>();
        numberGenerator = NumberGenerator.getInstance();
    }

    @Override
    public void salvar(Fatura fatura) {
        int codigo = numberGenerator.getNext();
        fatura.setCodigo(codigo);
        listaFaturas.add(fatura);
    }

    @Override
    public void exibirTodosNaTela() {
        listaFaturas.stream()
                .sorted(Comparator.comparing(Fatura::getCodigo))
                .forEach(System.out::println);
    }

    @Override
    public Optional buscarPorId(int id) {
        for (Fatura fatura : listaFaturas) {
            if (fatura.getCodigo() == id) {
                return Optional.of(fatura);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Fatura> exibirDadosPorId(int id) throws InvalidIdNumberException {
        Optional<Fatura> fatura = this.buscarPorId(id);
        if (fatura.isEmpty()) {
            throw new InvalidIdNumberException("Código inválido");
        }
        return fatura;
    }

    @Override
    public void excluirPorId(int id) throws InvalidIdNumberException {
        Optional<Fatura> fatura = this.buscarPorId(id);
        if (fatura.isEmpty()) {
            throw new InvalidIdNumberException("Id inválido");
        }
        listaFaturas.remove(fatura.get());
    }

    @Override
    public List buscarTodos() {
        return listaFaturas;
    }
}
