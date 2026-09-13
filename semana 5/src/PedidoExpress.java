public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (distanciaKm > 5) {
            tiempo += 5;
        }
        return tiempo;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido Express #" + idPedido + ": se asignará al repartidor más cercano con disponibilidad inmediata.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido Express #" + idPedido
                + " -> Validado: era el más cercano y disponible.");
    }
}