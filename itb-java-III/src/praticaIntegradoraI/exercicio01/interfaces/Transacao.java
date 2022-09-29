package praticaIntegradoraI.exercicio01.interfaces;

public interface Transacao {

    abstract void transacaoOK(String tipoTransacao);
    abstract void transacaoNaoOk(String tipoTransacao);

}
