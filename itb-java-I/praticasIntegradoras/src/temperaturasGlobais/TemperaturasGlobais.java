package temperaturasGlobais;

public class TemperaturasGlobais {
    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nova Iorque", "Buenos Aires", "Assunção", "São Paulo", "Lima", "Santiago do Chile", "Lisboa", "Tóquio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        String cidadeMin = cidades[0];
        String cidadeMax = cidades[0];
        int minima = temperaturas[0][0];
        int maxima = temperaturas[0][1];

        for (int i = 1; i < cidades.length; i++) {
            if (minima > temperaturas[i][0]) {
                cidadeMin = cidades[i];
                minima = temperaturas[i][0];
            }
            if (maxima < temperaturas[i][1]) {
                cidadeMax = cidades[i];
                maxima = temperaturas[i][1];
            }
        }

        System.out.println("A temperatura mais baixa foi em " + cidadeMin + ", com " + minima + "° C.");
        System.out.println("A temperatura mais alta foi em " + cidadeMax + ", com " + maxima + "° C.");

        // Definir temperaturas
        // for (int i = 0; i < cidades.length; i++) {
        //     System.out.println(cidades[i] + " | \tMínima " + temperaturas[i][0] + "°C / Máxima " + temperaturas[i][1] + "°C");
        // }


    }
}
