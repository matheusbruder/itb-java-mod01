package praticaIntegradoraI.exercicio01;

import praticaIntegradoraI.exercicio01.classes.Basico;
import praticaIntegradoraI.exercicio01.classes.Cobrador;
import praticaIntegradoraI.exercicio01.classes.Executivo;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("-------------Executivo--------------");
        Executivo executivo = new Executivo("Matheus", 23);
        executivo.realizarDeposito(500.0);
        executivo.transacaoOK("Depósito");
        executivo.realizarDeposito(50.0);
        executivo.transacaoOK("Depósito");
        executivo.realizarTransferencia(600.0);
        executivo.transacaoNaoOk("Transferência");

        System.out.println("\n\n-------------Cobrador--------------");
        Cobrador cobrador = new Cobrador();
        cobrador.realizarSaque(400.0);
        cobrador.transacaoOK("Saque");
        cobrador.consultarSaldo();
        cobrador.transacaoNaoOk("Consulta de saldo");


        System.out.println("\n\n-------------Básico--------------");
        Basico basico = new Basico("Rafael", 76);
        basico.consultarSaldo();
        basico.transacaoOK("Consulta de saldo");
        basico.realizarSaque(350.0);
        basico.transacaoNaoOk("Saque");
        basico.pagarServico("Internet");
        basico.transacaoNaoOk("Pagamento serviço");
    }
}
