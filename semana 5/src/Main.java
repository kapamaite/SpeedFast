import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        zonaDeCarga.agregarPedido(new PedidoSimple(1, "Av. Siempre Viva 123"));
        zonaDeCarga.agregarPedido(new PedidoSimple(2, "Calle Los Alamos 456"));
        zonaDeCarga.agregarPedido(new PedidoSimple(3, "Pasaje Las Flores 789"));
        zonaDeCarga.agregarPedido(new PedidoSimple(4, "Av. Central 200"));
        zonaDeCarga.agregarPedido(new PedidoSimple(5, "Calle Norte 55"));

        Repartidor repartidor1 = new Repartidor("Juan", zonaDeCarga);
        Repartidor repartidor2 = new Repartidor("María", zonaDeCarga);
        Repartidor repartidor3 = new Repartidor("Carlos", zonaDeCarga);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(repartidor1);
        executor.execute(repartidor2);
        executor.execute(repartidor3);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("\nTodos los pedidos han sido entregados correctamente");
    }
}