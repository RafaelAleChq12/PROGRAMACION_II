package MODULAR_EJE2;

import java.util.Scanner;
public class Estadisticas {

        /* Método que obtiene el promedio de los números */
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

        /* Método que calcula la desviación estándar */
    public static double desviacion(double[] numeros, double promedio) {
        double sumaCuadrados = 0;
        for (double num : numeros) {
            sumaCuadrados += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
        /** Método Principal */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }
        double prom = promedio(numeros);
        double desv = desviacion(numeros, prom);
        System.out.printf("El promedio es: %.2f\n", prom);
        System.out.printf("La desviacion estandar es: %.5f\n", desv);    
    }
}
