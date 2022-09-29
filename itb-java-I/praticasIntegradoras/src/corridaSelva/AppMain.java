package corridaSelva;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        // Gerando maratonistas
        Maratonista maratonista1 = new Maratonista(550000001, "Matheus", "Bruder", 22, 11999999999L, 14999999999L, "A-");
        Maratonista maratonista2 = new Maratonista(550000002, "Renato", "Augusto", 39, 11999999998L, 14899999999L, "A+");
        Maratonista maratonista3 = new Maratonista(550000003, "Marília", "Silva", 17, 11999999996L, 14599999999L, "O+");
        Maratonista maratonista4 = new Maratonista(550000004, "Claudio", "Silveira", 25, 11999999997L, 14799999999L, "B+");
        Maratonista maratonista5 = new Maratonista(550000005, "Hugo", "Gilberto", 17, 11999999994L, 14299999999L, "B-");

        // Gerando os circuitos
        Circuito circuitoPequeno = new Circuito("Pequeno", 2);
        Circuito circuitoMedio = new Circuito("Médio", 5);
        Circuito circuitoAvancado = new Circuito("Avançado", 10);

        // Fazer inscrições
        Inscricao inscricao1 = new Inscricao(maratonista1, "Pequeno");
        Inscricao inscricao3 = new Inscricao(maratonista3, "Pequeno");
        Inscricao inscricao2 = new Inscricao(maratonista2, "Pequeno");
        Inscricao inscricao4 = new Inscricao(maratonista4, "Pequeno");

        Inscricao inscricao5 = new Inscricao(maratonista1, "Médio");
        Inscricao inscricao6 = new Inscricao(maratonista2, "Médio");
        Inscricao inscricao7 = new Inscricao(maratonista3, "Médio");
        Inscricao inscricao8 = new Inscricao(maratonista4, "Médio");
        
        Inscricao inscricao9 = new Inscricao(maratonista1, "Avançado");
        Inscricao inscricao10 = new Inscricao(maratonista4, "Avançado");
        Inscricao inscricao11 = new Inscricao(maratonista2, "Avançado");
        Inscricao inscricao12 = new Inscricao(maratonista5, "Avançado");

        // Registrando inscrições
        // **********************************************
        circuitoPequeno.adicionarInscricao(inscricao1);
        circuitoPequeno.adicionarInscricao(inscricao2);
        circuitoPequeno.adicionarInscricao(inscricao3);
        circuitoPequeno.adicionarInscricao(inscricao4);
        // **********************************************
        circuitoMedio.adicionarInscricao(inscricao5);
        circuitoMedio.adicionarInscricao(inscricao6);
        circuitoMedio.adicionarInscricao(inscricao7);
        circuitoMedio.adicionarInscricao(inscricao8);
        // **********************************************
        circuitoAvancado.adicionarInscricao(inscricao9);
        circuitoAvancado.adicionarInscricao(inscricao10);
        circuitoAvancado.adicionarInscricao(inscricao11);

        System.out.println("*********************************");
        // Tentar adicionar participante com menos de 18 anos na categoria avançado
        circuitoAvancado.adicionarInscricao(inscricao12);

        System.out.println("*********************************");
        // Tentando adicionar um maratonista 2x na mesmo circuito
        circuitoPequeno.adicionarInscricao(inscricao1);

        System.out.println("*********************************");
        // Removendo um maratonista de um circuito
        circuitoAvancado.removerInscricao("Mauri");
        circuitoAvancado.removerInscricao("Renato");

        // Exibindo as listas de inscritos por categoria
        System.out.println("*********** Inscritos na Categoria PEQUENO **********************");
        System.out.println(circuitoPequeno.exibirParticipantes());

        System.out.println("*********** Inscritos na Categoria MÉDIO **********************");
        System.out.println(circuitoMedio.exibirParticipantes());

        System.out.println("*********** Inscritos na Categoria AVANÇADO **********************");
        System.out.println(circuitoAvancado.exibirParticipantes());

        //Adicionando a lista de circuitos a Corrida na Selva
        List<Circuito> listaCircuitos = new ArrayList<>();
        listaCircuitos.add(circuitoPequeno);
        listaCircuitos.add(circuitoMedio);
        listaCircuitos.add(circuitoAvancado);
        MaratonaSelva maratona = new MaratonaSelva(listaCircuitos);
        System.out.println(maratona);













    }
}
