package EJERCICIO_1;

public class Galeria extends Boleto {
    private int diasAnticipacion;
    
    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        calcularPrecio();
    }
    
    @Override
    public void calcularPrecio() {
        double precioPalco = (diasAnticipacion >= 10) ? 50.00 : 60.00;
        this.precio = precioPalco * 0.5; // 50% del Palco
    }
}