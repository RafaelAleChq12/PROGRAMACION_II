/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICA_2;

import java.util.Scanner;


public class PRACTICA_2_LINEA {

    public static class Punto {
        public float x;
        public float y;

        // Constructor
        public Punto(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Linea {
        public Punto p1;
        public Punto p2;

        public Linea(Punto p1, Punto p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public String toString() {
            return "Línea desde " + p1 + " hasta " + p2;
        }

        public void dibujaLinea() {
            System.out.println("Dibujando línea: " + this);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la coordenada x1: ");
        float x1 = scanner.nextFloat();
        System.out.print("Ingresa la coordenada y1: ");
        float y1 = scanner.nextFloat();
        Punto punto1 = new Punto(x1, y1);

        System.out.print("Ingresa la coordenada x2: ");
        float x2 = scanner.nextFloat();
        System.out.print("Ingresa la coordenada y2: ");
        float y2 = scanner.nextFloat();
        Punto punto2 = new Punto(x2, y2);

        Linea linea = new Linea(punto1, punto2);

        System.out.println(linea.toString());
        linea.dibujaLinea();
    }
    
}
