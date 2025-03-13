package PRACTICA_1;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PRACTICAS_1 extends JPanel {
    private final Punto punto;

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

    public PRACTICAS_1(Punto punto) {
        this.punto = punto;
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
        g.drawString(punto.coord_cartesianas(), puntoX + 5, puntoY - 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la coordenada x: ");
        float x = scanner.nextFloat();
        System.out.print("Ingresa la coordenada y: ");
        float y = scanner.nextFloat();
        scanner.close();
        
        Punto punto = new Punto(x, y);
        System.out.println("Coordenadas Cartesianas: " + punto.coord_cartesianas());
        System.out.println("Coordenadas Polares: " + punto.coord_polares());
        
        JFrame frame = new JFrame("Gráfica de Punto");
        PRACTICAS_1 panel = new PRACTICAS_1(punto);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
