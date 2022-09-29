package exercicioContasBancarias.util;

public class ImprimirImpressora implements Imprimir {


    @Override
    public void imprimir(String dados) {
        System.out.println("Exibindo na impressora:\n" + dados);
    }
}
