public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new PedidoComida(1, "Av. Siempre Viva 123", 4.0);
        Pedido pedido2 = new PedidoEncomienda(2, "Calle Los Alamos 456", 8.0);
        Pedido pedido3 = new PedidoExpress(3, "Pasaje Las Flores 789", 6.5);

        ControladorDeEnvios controlador = new ControladorDeEnvios();

        System.out.println("=== Resumen de Pedidos ===");
        pedido1.mostrarResumen();
        pedido2.mostrarResumen();
        pedido3.mostrarResumen();

        System.out.println("\n=== Asignación automática de repartidor ===");
        pedido1.asignarRepartidor();
        pedido2.asignarRepartidor();
        pedido3.asignarRepartidor();

        System.out.println("\n=== Asignación manual de repartidor ===");
        pedido1.asignarRepartidor("Juan Pérez");
        pedido2.asignarRepartidor("María López");
        pedido3.asignarRepartidor("Carlos Soto");

        System.out.println("\n=== Tiempos estimados de entrega ===");
        System.out.println("Pedido Comida #1: " + pedido1.calcularTiempoEntrega() + " minutos");
        System.out.println("Pedido Encomienda #2: " + pedido2.calcularTiempoEntrega() + " minutos");
        System.out.println("Pedido Express #3: " + pedido3.calcularTiempoEntrega() + " minutos");

        System.out.println("\n=== Despacho de pedidos ===");
        controlador.despachar(pedido1);
        controlador.despachar(pedido3);

        System.out.println("\n=== Cancelación de pedido ===");
        controlador.cancelar(pedido2);

        System.out.println();
        controlador.verHistorial();
    }
}