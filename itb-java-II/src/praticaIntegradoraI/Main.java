package praticaIntegradoraI;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Matheus", 22, "1");
        Pessoa pessoa3 = new Pessoa("Jeronimo", 20, "2", 97.5, 1.78);

        // ERROR = Construir pessoa passando apenas nome e idade no construtor. É possível? # NÃO!
        //Pessoa novaPessoa = new Pessoa("Gabriel", 78);

        // Calcular IMC
//        double imcPessoa3 = pessoa3.calcularIMC();
//        if (imcPessoa3 < 0) {
//            System.out.println(pessoa3.getNome() + ": Abaixo do peso");
//        } else {
//            if (imcPessoa3 > 0) {
//                System.out.println(pessoa3.getNome() + ": Sobrepeso");
//            } else {
//                System.out.println(pessoa3.getNome() + ": Peso saudável");
//            }
//        }

        // Calcular IMC v2
        switch ((int) pessoa3.calcularIMC()) {
            case -1 -> System.out.println(pessoa3.getNome() + ": Abaixo do peso");
            case 0 -> System.out.println(pessoa3.getNome() + ": Sobrepeso");
            case 1 -> System.out.println(pessoa3.getNome() + ": Peso saudável");
        }

        // Definir maioridade
        boolean maioridadePessoa3 = pessoa3.ehMaiorIdade();
        if (maioridadePessoa3) {
            System.out.println(pessoa3.getNome() + " tem mais de 18 anos");
        } else {
            System.out.println(pessoa3.getNome() + " ainda não tem 18 anos");
        }

        System.out.println(pessoa3);
    }
}
