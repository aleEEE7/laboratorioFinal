

public class DetalleVenta {

    private int idDetalle;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int idDetalle,
                        int cantidad,
                        Producto producto) {

        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = cantidad * producto.getPrecioVenta();
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = cantidad * producto.getPrecioVenta();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String toString() {
        return "DetalleVenta [producto=" + producto +
               ", cantidad=" + cantidad +
               ", subtotal=" + subtotal + "]";
    }
}