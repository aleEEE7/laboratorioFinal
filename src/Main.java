

public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente(1, "Juan Perez",
                        "Sonsonate", "7777-7777");

        Empleado empleado =
                new Empleado(1, "Maria Lopez",
                        "Vendedor", 500);

        Categoria categoria =
                new Categoria(1, "Lacteos");

        Producto producto =
                new Producto(1, "Queso",
                        3.00, 4.50,
                        100, 10,
                        categoria);

        DetalleVenta detalle =
                new DetalleVenta(1, 5, producto);

        Venta venta =
                new Venta(1,
                        "15/06/2026",
                        detalle.getSubtotal(),
                        cliente,
                        empleado);

        System.out.println(cliente);
        System.out.println(empleado);
        System.out.println(categoria);
        System.out.println(producto);
        System.out.println(detalle);
        System.out.println(venta);
    }
}