public class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Método sobrescribible (versión genérica)
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor genérico para el pedido #" + idPedido);
    }

    // Método sobrecargado (misma funcionalidad, distinta firma)
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido #" + idPedido);
    }
}