import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable, Cancelable, Rastreable {

    private ArrayList<String> historial = new ArrayList<>();

    @Override
    public void despachar() {
        System.out.println("El pedido ha sido despachado con éxito.");
    }

    public void despachar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getIdPedido() + " despachado con éxito.");
        historial.add("Pedido #" + pedido.getIdPedido() + " - Despachado");
    }

    @Override
    public void cancelar() {
        System.out.println("El pedido ha sido cancelado.");
    }

    public void cancelar(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getIdPedido() + " ha sido cancelado.");
        historial.add("Pedido #" + pedido.getIdPedido() + " - Cancelado");
    }

    @Override
    public void verHistorial() {
        System.out.println("=== Historial de entregas ===");
        if (historial.isEmpty()) {
            System.out.println("No hay movimientos registrados.");
        } else {
            for (String movimiento : historial) {
                System.out.println(movimiento);
            }
        }
    }
}