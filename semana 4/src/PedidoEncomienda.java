public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * distanciaKm));
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de Encomienda #" + idPedido + ": se requiere validar peso y embalaje.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido de Encomienda #" + idPedido
                + " -> Validado: peso y embalaje correctos.");
    }
}