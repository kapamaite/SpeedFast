public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * distanciaKm));
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de Comida #" + idPedido + ": se requiere repartidor con mochila térmica.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido de Comida #" + idPedido
                + " -> Validado: cuenta con mochila térmica.");
    }
}