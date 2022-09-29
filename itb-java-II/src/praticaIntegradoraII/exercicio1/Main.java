package praticaIntegradoraII.exercicio1;

public class Main {
    public static void main(String[] args) {
        PraticaExecoes pe = new PraticaExecoes();
        try {
            System.out.println(pe.calculaRazao());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
