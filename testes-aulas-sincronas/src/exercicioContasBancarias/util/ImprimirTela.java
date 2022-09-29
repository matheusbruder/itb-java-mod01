package exercicioContasBancarias.util;

import java.util.List;

public class ImprimirTela implements Imprimir {
    @Override
    public void imprimir(String dados) {
        System.out.println("Exibindo na tela:\n" + dados);
    }
}
