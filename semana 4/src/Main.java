import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Pedidos para el repartidor 1
        List<Pedido> pedidosJuan = new ArrayList<>();
        pedidosJuan.add(new PedidoComida(1, "Av. Siempre Viva 123", 4.0));
        pedidosJuan.add(new PedidoExpress(2, "Calle Los Alamos 456", 3.0));

        // Pedidos para el repartidor 2
        List<Pedido> pedidosMaria = new ArrayList<>();
        pedidosMaria.add(new PedidoEncomienda(3, "Pasaje Las Flores 789", 8.0));
        pedidosMaria.add(new PedidoComida(4, "Av. Central 200", 2.5));

        // Pedidos para el repartidor 3
        List<Pedido> pedidosCarlos = new ArrayList<>();
        pedidosCarlos.add(new PedidoExpress(5, "Calle Norte 55", 6.0));
        pedidosCarlos.add(new PedidoEncomienda(6, "Av. Sur 300", 5.5));

        Repartidor repartidor1 = new Repartidor("Juan", pedidosJuan);
        Repartidor repartidor2 = new Repartidor("María", pedidosMaria);
        Repartidor repartidor3 = new Repartidor("Carlos", pedidosCarlos);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(repartidor1);
        executor.execute(repartidor2);
        executor.execute(repartidor3);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("\nTodos los repartidores han finalizado sus entregas. Simulación terminada.");
    }
}