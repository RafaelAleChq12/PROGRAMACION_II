/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PRACTICA_2;

import java.util.Scanner;


public class PRACTICA_2_CIR {

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

    public static class Circulo {
        public Punto centro;
        public float radio;

        // Constructor
        public Circulo(Punto c, float r) {
            this.centro = c;
            this.radio = r;
        }

        public String toString() {
            return "Círculo con centro en " + centro + " y radio " + radio;
            
        }

        public void dibujaCirculo() {
            System.out.println("Dibujando círculo: " + this);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la coordenada x del centro: ");
        float x = scanner.nextFloat();
        System.out.print("Ingresa la coordenada y del centro: ");
        float y = scanner.nextFloat();
        Punto centro = new Punto(x, y);

        System.out.print("Ingresa el radio del círculo: ");
        float radio = scanner.nextFloat();

        Circulo circulo = new Circulo(centro, radio);

        System.out.println(circulo.toString());
        circulo.dibujaCirculo();
    }
    
}
