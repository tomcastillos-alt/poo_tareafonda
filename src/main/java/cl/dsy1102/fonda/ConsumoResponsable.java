package cl.dsy1102.fonda;

public interface ConsumoResponsable {
    int consumoMax = 2;
    boolean tieneVentaRestringida();
    void restringirVenta();
    boolean superaLimite (int unidades);



}
