import exceptions.NumberVehiclesExceededException;
import exceptions.VehicleDoesNotExistException;
import model.Corrida;

import java.text.NumberFormat;

public class AppMain {
    public static void main(String[] args) {

        Corrida corrida = new Corrida(270.0, 10000, "Interlagos", 5);

        try {
            // Adicionar veículos a corrida
            // Novo comentario
            System.out.println("----------- Listando veículos da corrida -----------");
            corrida.addCarro(120, 10, 3.0, "ZJN9D26");
            corrida.addMoto(100, 6, 2.0, "FKQ8T28");
            corrida.addCarro(140, 12, 5.0, "HZU3G75");
            corrida.addMoto(190, 6, 2.0, "GHE7Y89");
            corrida.exibirVeiculos();

            // Remover veiculo da corrida
            System.out.println("\n\n----------- Listando veículos após remoção -----------");
            corrida.deleteVeiculoPorPlaca("GHE7Y89");
            corrida.exibirVeiculos();

            // Exibir vencedor da corrida
            System.out.println("\n\n----------- Vencedor -----------");
            System.out.println(corrida.vencedor());
            System.out.println("Prêmio = " + NumberFormat.getCurrencyInstance().format(corrida.getPremio()));

            // Socorrendo carro ou moto
            System.out.println("\n\n----------- Prestando socorro -----------");
            corrida.socorrer("HZU3G75");


        } catch (NumberVehiclesExceededException | VehicleDoesNotExistException e) {
            System.out.println(e.getMessage());
        }

    }
}
