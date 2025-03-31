/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJER_1;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgebraVectorial v1 = new AlgebraVectorial(1, 1, 1);
        AlgebraVectorial v2 = new AlgebraVectorial(1, 1, 1);
        // Perpendcularidad
        System.out.println("a) " + v1.perpendicular(v2));
        System.out.println("b) " + AlgebraVectorial.perpendicular(v1, v2));
        System.out.println("c) " + v1.perpendicular(0, v2));
        System.out.println("d) " + v1.perpendicular(v2, true));
        // Paralelismo
        System.out.println("e) " + v1.paralela(v2));
        System.out.println("f) " + v1.paralela(v2, true));
        // Proyección y componente
        System.out.println("g) Proyeccion_de_a_sobre_b: " + v1.proyeccion_de_a_sobre_b(v2));
        System.out.println("h) Componente_de_a_en_b: " + v1.componente_de_a_en_b(v2));
    }
}
