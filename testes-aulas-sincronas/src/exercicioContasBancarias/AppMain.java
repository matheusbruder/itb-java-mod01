package exercicioContasBancarias;

import exercicioContasBancarias.data.GerenciaClientes;
import exercicioContasBancarias.data.GerenciaContas;
import exercicioContasBancarias.exception.InvalidCpfNumberException;
import exercicioContasBancarias.exception.InvalidNumberAccountException;
import exercicioContasBancarias.exception.InvalidNumberException;
import exercicioContasBancarias.util.Imprimir;
import exercicioContasBancarias.util.ImprimirImpressora;
import exercicioContasBancarias.util.ImprimirTela;

public class AppMain {

    private static final GerenciaContas contas = new GerenciaContas();
    private static final GerenciaClientes clientes = new GerenciaClientes();

    public static void main(String[] args) {

        try {

            // Operações com os clientes
            clientes.adicionarCliente("48326779866", "Matheus");
            clientes.adicionarCliente("19826779865", "Mauri");
            clientes.adicionarCliente("56784598736", "Juliane");
            clientes.adicionarCliente("76847245388", "Mariana");
            clientes.removerCliente("19826779865");

            // Listar todos os clientes
            System.out.println("------------------- Todos Clientes -------------------");
            clientes.listarTodosClientes().forEach(System.out::println);

            // Operações com as contas
            contas.novaContaCorrente(clientes.obterCliente("48326779866"));
            contas.novaContaPoupanca(clientes.obterCliente("56784598736"));
            contas.novaContaCorrente(clientes.obterCliente("76847245388"));
            contas.novaContaEspecial(clientes.obterCliente("19826779865"), 1000.0);
            System.out.println("Dados conta 3: " + contas.obterDadosConta(3));
            contas.removerConta(3);

            contas.depositar(1, 100.0);
            contas.transferir(1, 2, 50.0);
            contas.sacar(4, 450.0);

            // Listar todas as contas
            System.out.println("\n\n------------------- Todas Contas -------------------");
            contas.listarTodasContas().forEach(System.out::println);

            // Listar contas cadastradas tela e impressora
            System.out.println("\n\n------------------- Contas Cadastradas: Tela & Impressora -------------------");
            Imprimir saidaTela = new ImprimirTela();
            saidaTela.imprimir(contas.listarTodasContas().toString());
            Imprimir saidaImpressora = new ImprimirImpressora();
            saidaImpressora.imprimir(contas.listarTodasContas().toString());

            // Relatório das contas correntes por saldo e por número
            System.out.println("\n\n------------------- Contas Correntes: Saldo & Número -------------------");
            contas.listarContasCorrentesPorSaldo().forEach(System.out::println);
            contas.listarContasCorrentesPorNumero().forEach(System.out::println);

            // Relatório das contas especiais negativas
            System.out.println("\n\n------------------- Contas Especiais Negativas -------------------");
            contas.listarContasEspeciaisNegativas().forEach(System.out::println);


        } catch (InvalidNumberException | InvalidNumberAccountException | InvalidCpfNumberException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
