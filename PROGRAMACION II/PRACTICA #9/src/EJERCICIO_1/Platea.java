package EJERCICIO_1;

public class Platea extends Boleto {
    private int diasAnticipacion;
    
    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        calcularPrecio();
    }
    
    @Override
    public void calcularPrecio() {
        this.precio = (diasAnticipacion >= 10) ? 50.00 : 60.00;
    }
}