public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Persona persona1 = new Persona("Gustavo");
        Carrito carrito1 = new Carrito();
        Producto producto1 = new Producto("Jabon en polvo" , 30.00);
        Producto producto2 = new Producto("Esponjas" , 10.00);
        Producto producto3 = new Producto("Chocolates" , 100.00);
        carrito1.agregarProducto(producto1);
        carrito1.agregarProducto(producto2);
        carrito1.agregarProducto(producto3);

        double precioTotal = carrito1.precio();

        System.out.println("El precio final de carrito de " + persona1.nombre + " es " + precioTotal);

    }
}