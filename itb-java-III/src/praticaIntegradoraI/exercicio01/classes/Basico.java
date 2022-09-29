package praticaIntegradoraI.exercicio01.classes;

import praticaIntegradoraI.exercicio01.interfaces.ConsultarSaldo;
import praticaIntegradoraI.exercicio01.interfaces.PagarServico;
import praticaIntegradoraI.exercicio01.interfaces.Saque;

import java.text.NumberFormat;

public class Basico extends Cliente implements ConsultarSaldo, PagarServico, Saque {

    public Basico(String nome, int idade) {
        super(nome, idade);
    }

    public Basico() {
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Realizando consulta de saldo...");
    }

    @Override
    public void pagarServico(String tipoServico) {
        System.out.println("Realizando pagamento: " + tipoServico);
    }

    @Override
    public void realizarSaque(Double valor) {
        System.out.println("Realizando saque de " + NumberFormat.getCurrencyInstance().format(valor));
    }

    @Override
    public void transacaoOK(String tipoTransacao) {
        System.out.println(tipoTransacao + " ✅");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacao) {
        System.out.println(tipoTransacao + " ❌");
    }
}
