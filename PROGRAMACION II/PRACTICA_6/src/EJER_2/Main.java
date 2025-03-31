/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER_2;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de vectores
        AlgebraVectorialTridi v1 = new AlgebraVectorialTridi(1, 2, 3);
        AlgebraVectorialTridi v2 = new AlgebraVectorialTridi(4, -8, 12);
        // Inciso a: Suma de vectores
        AlgebraVectorialTridi suma = v1.sumar(v2);
        System.out.println("Suma de v1 y v2: " + suma);
        // Inciso b: Multiplicación por escalar
        AlgebraVectorialTridi multiplicado = v1.multiplicarPorEscalar(2);
        System.out.println("v1 multiplicado por 2: " + multiplicado);
        // Inciso e: Producto escalar
        double productoEscalar = v1.producto(v2);
        System.out.println("Producto escalar de v1 y v2: " + productoEscalar);
        // Inciso f: Producto vectorial
        AlgebraVectorialTridi productoVectorial = v1.producto(v2, true);
        System.out.println("Producto vectorial de v1 y v2: " + productoVectorial);
        // Inciso c: Longitud de v1
        System.out.println("Longitud de v1: " + v1.longitud());
        // Inciso d: Normalización de v1
        AlgebraVectorialTridi v1Normalizado = v1.normalizar();
        System.out.println("Normal de v1: " + v1Normalizado);
    }
}

    
