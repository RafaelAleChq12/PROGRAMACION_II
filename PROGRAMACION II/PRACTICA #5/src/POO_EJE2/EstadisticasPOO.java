package POO_EJE2;
public class EstadisticasPOO {
    
    private double[] numeros;

    /* Constructor que recibe el arreglo de números */
    public EstadisticasPOO(double[] numeros) {
        this.numeros = numeros;
    }
    /* Método que obtiene el promedio de los números */
    public double promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    /* Método que calcula la desviación estándar */
    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}
