/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author Trabajo
 */
public class PRACTICA8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Probando todos los métodos desde D
        D obj = new D(1, 2, 3);
        System.out.println("Inicial: x=" + obj.x + ", y=" + obj.y + ", z=" + obj.z);
        obj.incrementaXZ();  // De A
        System.out.println("Tras incrementaXZ(): x=" + obj.x + ", z=" + obj.z);   
        obj.incrementaYZ();  // De B
        System.out.println("Tras incrementaYZ(): y=" + obj.y + ", z=" + obj.z);
        obj.incrementaZ();  // Resuelto
        System.out.println("Tras incrementaZ(): z=" + obj.z);
        obj.incrementaXYZ();  // De D
        System.out.println("Tras incrementaXYZ(): x=" + obj.x + ", y=" + obj.y + ", z=" + obj.z);
    }
}
    

