public abstract class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    // Método implementado: datos básicos del pedido
    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido + " | Dirección: " + direccionEntrega
                + " | Distancia: " + distanciaKm + " km");
    }

    // Método abstracto: cada subclase lo implementa distinto
    public abstract int calcularTiempoEntrega();
}