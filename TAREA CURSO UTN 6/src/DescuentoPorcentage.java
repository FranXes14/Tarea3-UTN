public class DescuentoPorcentage extends Descuento{

    @Override
    public float obtenerDescuento(float valorBase) {
        return this.getValor() * valorBase;
    }

    @Override
    public float obtenerValorFinal(float valorBase) {
        return valorBase - this.obtenerDescuento(valorBase);
    }

}
