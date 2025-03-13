package PRACTICA_2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PRACTICA_2_CIR extends JPanel {
    private final Punto punto;
    private final Circulo circulo;

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

        public Circulo(Punto centro, float radio) {
            this.centro = centro;
            this.radio = radio;
        }
    }

    public PRACTICA_2_CIR(Punto punto, Circulo circulo) {
        this.punto = punto;
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        
        g.setColor(Color.BLACK);
        g.drawLine(0, centerY, width, centerY);
        g.drawLine(centerX, 0, centerX, height);

        int escala = 50;
        int puntoX = centerX + (int) (punto.x * escala);
        int puntoY = centerY - (int) (punto.y * escala);
        
        g.setColor(Color.RED);
        g.fillOval(puntoX - 5, puntoY - 5, 10, 10);
        
        g.setColor(Color.BLUE);
        g.drawString(punto.toString(), puntoX + 5, puntoY - 5);

        int centroCirculoX = centerX + (int) (circulo.centro.x * escala);
        int centroCirculoY = centerY - (int) (circulo.centro.y * escala);
        int radioEscalado = (int) (circulo.radio * escala);
        
        g.setColor(Color.GREEN);
        g.drawOval(centroCirculoX - radioEscalado, centroCirculoY - radioEscalado, radioEscalado * 2, radioEscalado * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la coordenada x del centro: ");
        float cx = scanner.nextFloat();
        System.out.print("Ingresa la coordenada y del centro: ");
        float cy = scanner.nextFloat();
        System.out.print("Ingresa el radio del círculo: ");
        float radio = scanner.nextFloat();
        scanner.close();

        Punto centro = new Punto(cx, cy);
        Circulo circulo = new Circulo(centro, radio);

        System.out.println("Círculo con centro en " + circulo.centro + " y radio " + radio);
        
        JFrame frame = new JFrame("Gráfica de Círculo");
        PRACTICA_2_CIR panel = new PRACTICA_2_CIR(centro, circulo);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
