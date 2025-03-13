package PRACTICA_2;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class PRACTICA_2_CIR {

    public static class Punto {
        public float x;
        public float y;

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

        public Circulo(Punto c, float r) {
            this.centro = c;
            this.radio = r;
        }

        public String toString() {
            return "Círculo con centro en " + centro + " y radio " + radio;
        }

        public void dibujaCirculo() {
            System.out.println("Dibujando círculo: " + this);
            
            // Crear y mostrar la ventana gráfica para dibujar el círculo
            JFrame frame = new JFrame("Círculo");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.BLUE);
                    // Dibujar el círculo
                    g.drawOval((int)(centro.x - radio), (int)(centro.y - radio), (int)(2 * radio), (int)(2 * radio));
                }
            };
            
            frame.add(panel);
            frame.setVisible(true);
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
