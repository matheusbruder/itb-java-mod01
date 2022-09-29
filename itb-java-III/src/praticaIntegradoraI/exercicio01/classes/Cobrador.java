package praticaIntegradoraI.exercicio01.classes;

import praticaIntegradoraI.exercicio01.interfaces.ConsultarSaldo;
import praticaIntegradoraI.exercicio01.interfaces.Saque;

import java.text.NumberFormat;

public class Cobrador extends Cliente implements Saque, ConsultarSaldo {

    public Cobrador(String nome, int idade) {
        super(nome, idade);
    }

    public Cobrador() {
    }


    @Override
    public void consultarSaldo() {
        System.out.println("Realizando consulta de saldo...");
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
