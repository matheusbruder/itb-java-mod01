package exemploWrapper;

public class MainWrapper {
    public static void main(String[] args) {
        // Tipo primitivo
        int n = 10;
        System.out.println(n);

        // Exemplo Wrapper
        Integer integer = 15; // autoboxing: boxing (conversão)
        System.out.println(integer);

        n = integer; // Autoboxing: unboxing
        System.out.println(n);


        // Exemplos métodos e comportamentos
        int valor = Integer.parseInt("12345");
        String texto = Integer.toString(12345);
        String t1 = 123 + " Espaço"; // Conversão implícita
        System.out.println(t1);

        Integer n1 = 200;
        Integer n2 = 200;

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));


    }
}
