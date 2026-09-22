package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida implements ConsumoResponsable {
    int azucarPorLitro;


    public BebidaSinAlcohol(String chicha, int i, int i1, int i2) {
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
