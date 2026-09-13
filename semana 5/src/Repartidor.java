import java.util.Random;

public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    @Override
    public void run() {
        PedidoSimple pedido;

        while ((pedido = zonaDeCarga.retirarPedido()) != null) {
            pedido.setEstado(EstadoPedido.EN_REPARTO);
            System.out.println(nombre + " retiró el " + pedido);

            try {
                int tiempoSimulado = new Random().nextInt(2000) + 1000; // entre 1 y 3 segundos
                Thread.sleep(tiempoSimulado);
            } catch (InterruptedException e) {
                System.out.println("Entrega interrumpida para " + nombre);
            }

            pedido.setEstado(EstadoPedido.ENTREGADO);
            System.out.println(nombre + " finalizó la entrega -> " + pedido);
        }

        System.out.println(nombre + " no tiene más pedidos por retirar.");
    }
}