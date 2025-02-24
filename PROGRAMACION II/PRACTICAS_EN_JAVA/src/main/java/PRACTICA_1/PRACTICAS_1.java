/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRACTICA_1;

import java.util.Scanner;

public class PRACTICAS_1 {
    public static class Punto {
        public float x;
        public float y;

       
        public Punto(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public String coord_cartesianas() {
            return "(" + x + ", " + y + ")";
        }
        public String coord_polares() {
            double r = Math.sqrt(x * x + y * y);
            double theta = Math.atan2(y, x);
            return "(" + r + ", " + Math.toDegrees(theta) + "°)";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la coordenada x: ");
        float x = scanner.nextFloat();
        System.out.print("Ingresa la coordenada y: ");
        float y = scanner.nextFloat();
        Punto punto = new Punto(x, y);
        System.out.println("Coordenadas Cartesianas: " + punto.coord_cartesianas());
        System.out.println("Coordenadas Polares: " + punto.coord_polares());

      
    }

 
}
