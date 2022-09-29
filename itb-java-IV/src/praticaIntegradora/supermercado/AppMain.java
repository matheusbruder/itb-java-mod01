package praticaIntegradora.supermercado;

import praticaIntegradora.supermercado.data.RepositoryClientes;
import praticaIntegradora.supermercado.data.RepositoryFaturas;
import praticaIntegradora.supermercado.data.RepositoryItens;
import praticaIntegradora.supermercado.exceptions.InvalidIdNumberException;
import praticaIntegradora.supermercado.modelo.Cliente;
import praticaIntegradora.supermercado.modelo.Fatura;
import praticaIntegradora.supermercado.modelo.Item;

import java.util.Scanner;

public class AppMain {

    private static final RepositoryClientes clientes = new RepositoryClientes();
    private static final RepositoryItens itens = new RepositoryItens();
    private static final RepositoryFaturas faturas = new RepositoryFaturas();

    public static void main(String[] args) {

        try {
            // Adicionando clientes
            System.out.println("--------------- Listando clientes ---------------");
            clientes.salvar(new Cliente("Matheus", "Bruder"));
            clientes.salvar(new Cliente("Mauri", "Klein"));
            clientes.salvar(new Cliente("Julia", "Silveira"));
            clientes.exibirTodosNaTela();

            // Removendo cliente
            System.out.println("\n\n--------------- Listando clientes após remoção ---------------");
            clientes.excluirPorId(2);
            clientes.exibirTodosNaTela();

            // Buscando cliente pelo teclado
            System.out.println("\n\n--------------- Buscando clientes ---------------");
            Scanner teclado = new Scanner(System.in);
            String input = teclado.nextLine();
            clientes.buscarPorId(Integer.parseInt(input));
            System.out.println(clientes.exibirDadosPorId(Integer.parseInt(input)));

            // Adicionando itens
            System.out.println("\n\n--------------- Listando itens ---------------");
            itens.salvar(new Item("PS5", 1, 4500.0));
            itens.salvar(new Item("DELL G15", 1, 7500.0));
            itens.salvar(new Item("IPHONE 8", 5, 1500.0));
            itens.salvar(new Item("MACBOOK", 10, 9000.0));
            itens.exibirTodosNaTela();

            // Removendo o item 3
            System.out.println("\n\n--------------- Listando itens após remoção ---------------");
            itens.excluirPorId(6);
            itens.exibirTodosNaTela();

            // Gerando fatura
            System.out.println("\n\n--------------- Fatura ---------------");
            Cliente cliente = clientes.buscarPorId(1).get();

            if(clientes.buscarPorId(1).isEmpty()) {
                throw new InvalidIdNumberException("Id Inválido");
            }

            faturas.salvar(new Fatura(cliente, itens.buscarTodos()));
            faturas.exibirTodosNaTela();


        } catch (InvalidIdNumberException e) {
            System.out.println(e.getMessage());
        }

    }
}
