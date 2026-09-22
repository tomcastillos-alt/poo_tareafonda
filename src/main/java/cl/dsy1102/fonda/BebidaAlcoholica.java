package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {

    int LIMITE_UNIDADES_POR_CLIENTE = 0;
    double gradosAlcohol;
    boolean certificada;
    boolean ventaRestringida;

    public BebidaAlcoholica(String piscoSour, int i, int i1, double v, boolean b) {
        super();
    }

    @Override
    public boolean tieneVentaRestringida() {
        return false;
    }

    @Override
    public void restringirVenta() {

    }

    @Override
    public boolean superaLimite(int unidades) {
        return false;
    }
}
