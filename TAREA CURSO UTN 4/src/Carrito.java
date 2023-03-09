public class Carrito {
    private Producto[] productos;
    private int cantidad;

    public Carrito() {
        productos = new Producto[3];
        cantidad = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidad < 3) {
            productos[cantidad] = producto;
            cantidad++;
        } else {
            System.out.println("El carrito está lleno.");
        }
    }

    public double precio() {
        double precioTotal = 0;
        for (int i = 0; i < cantidad; i++) {
            precioTotal += productos[i].getPrecio();
        }
        return precioTotal;
    }

}
