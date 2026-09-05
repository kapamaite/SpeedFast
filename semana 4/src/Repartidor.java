import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidosAsignados;

    public Repartidor(String nombre, List<Pedido> pedidosAsignados) {
        this.nombre = nombre;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        System.out.println("Repartidor " + nombre + " ha iniciado su recorrido.");

        for (Pedido pedido : pedidosAsignados) {
            pedido.mostrarResumen();
            System.out.println(nombre + " está entregando el pedido #" + pedido.getIdPedido() + "...");

            try {
                int tiempoSimulado = new Random().nextInt(3000) + 1000; // entre 1 y 4 segundos
                Thread.sleep(tiempoSimulado);
            } catch (InterruptedException e) {
                System.out.println("Entrega interrumpida para " + nombre);
            }

            System.out.println(nombre + " completó la entrega del pedido #" + pedido.getIdPedido()
                    + " (tiempo estimado: " + pedido.calcularTiempoEntrega() + " min).");
        }

        System.out.println("Repartidor " + nombre + " ha finalizado todas sus entregas.");
    }
}