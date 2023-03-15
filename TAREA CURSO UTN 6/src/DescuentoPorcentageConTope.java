public class DescuentoPorcentageConTope extends Descuento {

    @Override
    public float obtenerDescuento(float valorBase) {
        if (this.getValor() < 0.5) {
            return this.getValor() * valorBase;
        } else {
           return 0;
        }
    }

    @Override
    public float obtenerValorFinal(float valorBase) {
        return valorBase - this.obtenerDescuento(valorBase);
    }
}