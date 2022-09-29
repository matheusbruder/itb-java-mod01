package praticaIntegradoraI.exercicio01.classes;

import praticaIntegradoraI.exercicio01.interfaces.Deposito;
import praticaIntegradoraI.exercicio01.interfaces.Transferencia;

import java.text.NumberFormat;

public class Executivo extends Cliente implements Deposito, Transferencia {

    public Executivo(String nome, int idade) {
        super(nome, idade);
    }

    public Executivo() {
    }

    @Override
    public void realizarDeposito(Double valor) {
        System.out.println("Realizando deposito de " + NumberFormat.getCurrencyInstance().format(valor));
    }

    @Override
    public void transacaoOK(String tipoTransacao) {
        System.out.println(tipoTransacao + " ✅");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacao) {
        System.out.println(tipoTransacao + " ❌");
    }

    @Override
    public void realizarTransferencia(Double valor) {
        System.out.println("Realizando transferência de " + NumberFormat.getCurrencyInstance().format(valor));
    }
}
