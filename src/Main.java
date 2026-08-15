public class Main {
    public static void main(String[] args) {
        PedidoComida pedido1 = new PedidoComida(1, "Av. Siempre Viva 123");
        PedidoEncomienda pedido2 = new PedidoEncomienda(2, "Calle Los Alamos 456");
        PedidoExpress pedido3 = new PedidoExpress(3, "Pasaje Las Flores 789");

        System.out.println("=== Versión sobrescrita (sin repartidor) ===");
        pedido1.asignarRepartidor();
        pedido2.asignarRepartidor();
        pedido3.asignarRepartidor();

        System.out.println("\n=== Versión sobrecargada (con repartidor) ===");
        pedido1.asignarRepartidor("Juan Pérez");
        pedido2.asignarRepartidor("María López");
        pedido3.asignarRepartidor("Carlos Soto");
    }
}