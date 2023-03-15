public class Producto {

    public String nombre;
    public Double precio;

    //CONTRUCTOR
    public Producto (String nombre , Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

}
