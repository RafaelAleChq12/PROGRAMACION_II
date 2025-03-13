package PRACTICA_2;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class PRACTICA_2_LINEA {

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
            
            // Crear y mostrar la ventana gráfica para dibujar la línea
            JFrame frame = new JFrame("Línea");
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.RED);
                    // Dibujar la línea entre los puntos p1 y p2
                    g.drawLine((int)p1.x, (int)p1.y, (int)p2.x, (int)p2.y);
                }
            };
            
            frame.add(panel);
            frame.setVisible(true);
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
