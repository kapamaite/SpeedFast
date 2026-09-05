public abstract class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido + " | Dirección: " + direccionEntrega
                + " | Distancia: " + distanciaKm + " km");
    }

    public abstract int calcularTiempoEntrega();

    // Sobrescrito en cada subclase
    public void asignarRepartidor() {
        System.out.println("Asignando repartidor genérico para el pedido #" + idPedido);
    }

    // Sobrecargado
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido #" + idPedido);
    }

    public int getIdPedido() {
        return idPedido;
    }
}