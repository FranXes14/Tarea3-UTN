public class Main {
    public static void main(String[] args) {

        // ACA CREO MI CARRITO Y AGREGO LOS PRODUCTOS
        Carrito carrito1 = new Carrito();
        carrito1.agregarProducto(new Producto("Papa" , 200.00));
        carrito1.agregarProducto(new Producto("Cebolla" , 800.00));
        carrito1.agregarProducto(new Producto("Carne" , 1000.00));

        // ACA SUMO EL VALOR DE TODOS LOS PRODUCTOS Y GUARDO EL RESULTADO EN UNA VARIABLE
        float valorBase = (float) carrito1.precio();

        // CREO EL DECUENTO FIJO
        Descuento desFijo = new DescuentoFijo();
        desFijo.setValor(1200f);

        float valorDescF = desFijo.obtenerDescuento(valorBase);
        float valorFinalF = valorBase - valorDescF;

        System.out.println("EL DESCUENTO TOTAL ES DE : $" + valorDescF);
        System.out.println("EL VALOR FINAL ES DE : $" + valorFinalF);

        // CREO EL DESCUENTO PORCENTAGE
        Descuento desPor = new DescuentoPorcentage();
        desPor.setValor(0.2f);


        float valorDescP = desPor.obtenerDescuento(valorBase); // VALOR DEL DESCUENTO
        float valorFinalP = valorBase - valorDescP; // VALOR FINAL CON EL DESCUENTO

        System.out.println("EL DESCUENTO TOTAL ES DE : $" + valorDescP);
        System.out.println("EL VALOR FINAL ES DE: $" + valorFinalP);

        // CREO EL DESCUENTO FIJO CON TOPE; (en caso de poner un descuento mayor a 50% (0.5) el descuento se traducira en un 0)
        Descuento descTope = new DescuentoPorcentageConTope();
        descTope.setValor(0.6f);


        float valorDescT = descTope.obtenerDescuento(valorBase);
        float valorFinalFT = valorBase - valorDescT;

        System.out.println("EL DESCUENTO TOTAL ES DE : $" + valorDescT);
        System.out.println("EL VALOR FINAL ES DE: $" + valorFinalFT);



    }
}