package exemploFiguras;

import java.security.spec.ECField;

public class AppFiguras {
    public static void main(String[] args) {
        // Exemplos corretos
        Quadrado q = new Quadrado(1, 2);
        Figura f = new Quadrado(3, 4);

        // Exemplo incorreto > Classe abstrata não pode ser instanciada;
        // Figura figura = new Figura(5,6);
        q.exibir();

        Circulo c = new Circulo(7, 8);
        c.exibir();


        Figura[] vetorFigura = new Figura[3];
        vetorFigura[0] = new Quadrado(1, 2);
        vetorFigura[1] = new Quadrado(2, 2);
        vetorFigura[2] = new Circulo(3, 4);

        for (Figura figura : vetorFigura) {
            System.out.print("vetorFigura => ");
            figura.exibir();
        }

        // Solução 01
        GerarPDF.gerar(vetorFigura[0]);
        GerarPDF.gerar(vetorFigura[2]);


        // Solução 02
        ExibirTela tela = new ExibirTela();
        vetorFigura[0].show(tela);
        vetorFigura[2].show(tela);

        ExibirImpressora impressora = new ExibirImpressora();
        vetorFigura[0].show(impressora);
        vetorFigura[2].show(impressora);

    }
}
