

public class Venta {

    private int idVenta;
    private String fecha;
    private double total;
    private Cliente cliente;
    private Empleado empleado;

    public Venta(int idVenta, String fecha,
                 double total,
                 Cliente cliente,
                 Empleado empleado) {

        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Venta [idVenta=" + idVenta +
               ", fecha=" + fecha +
               ", total=" + total +
               ", cliente=" + cliente +
               ", empleado=" + empleado + "]";
    }
}