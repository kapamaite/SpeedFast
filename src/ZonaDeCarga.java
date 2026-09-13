import java.util.LinkedList;
import java.util.Queue;

public class ZonaDeCarga {
    private Queue<PedidoSimple> pedidos = new LinkedList<>();

    public synchronized void agregarPedido(PedidoSimple p) {
        pedidos.add(p);
        System.out.println("Pedido agregado a la zona de carga: " + p);
    }

    public synchronized PedidoSimple retirarPedido() {
        return pedidos.poll(); // devuelve null si no hay más pedidos
    }
}