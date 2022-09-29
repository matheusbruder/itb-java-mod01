package exemploLambda;

public class MainLambda {

    interface InterfaceString {
        String executar(String str);
    }

    public static void main(String[] args) {
        InterfaceString novaString = s -> s + " terminação";
        imprimir("String original", novaString);

    }

    public static void imprimir (String texto, InterfaceString interfaceString) {
        System.out.println(interfaceString.executar(texto));

    }

}
