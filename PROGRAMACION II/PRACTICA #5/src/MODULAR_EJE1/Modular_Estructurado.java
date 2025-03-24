package MODULAR_EJE1;

import java.util.Scanner;
public class Modular_Estructurado {
        /* Retorna el discriminante */
    public static double getDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }
        /* Retorna la primera raíz */
    public static double getRaiz1(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        if (discriminante < 0) return Double.NaN;
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
        /* Retorna la segunda raíz */
    public static double getRaiz2(double a, double b, double c) {
        double discriminante = getDiscriminante(a, b, c);
        if (discriminante < 0) return Double.NaN;
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
        /** Método Principal */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminante = getDiscriminante(a, b, c);
        if (discriminante > 0) {
            System.out.println("La ecuación tiene dos raíces " + getRaiz1(a, b, c) + " y " + getRaiz2(a, b, c));
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una raíz " + getRaiz1(a, b, c));
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
