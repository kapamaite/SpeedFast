public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        // 20 min + 1.5 min por km, ajustado a entero
        return (int) Math.round(20 + (1.5 * distanciaKm));
    }
}