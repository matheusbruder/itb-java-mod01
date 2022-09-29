package exemploFiguras;

public class ExibirTela implements Imprimir {

    // Método obrigatório devido implementação da ‘interface’
    @Override
    public void exibir(String nome) {
        System.out.println("Exibindo na tela " + nome);
    }


}
