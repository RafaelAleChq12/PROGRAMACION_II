/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO_2;
import java.util.Random;
/**
 *
 * @author Trabajo
 */
public class TestFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();
        String[] colores = {"rojo", "verde", "azul", "amarillo", "negro"};
        
        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(1) + 1; // 1 o 2
            String color = colores[rand.nextInt(colores.length)];
            double medida = 1 + rand.nextDouble() * 9; // Entre 1 y 10
            
            if (tipo == 1) {
                figuras[i] = new Cuadrado(color, medida);
            } else {
                figuras[i] = new Circulo(color, medida);
            }
        }
        
        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.println("Area: " + figura.area());
            System.out.println("Perimetro: " + figura.perimetro());
            
            if (figura instanceof Coloreado) {
                Coloreado coloreado = (Coloreado) figura;
                System.out.println(coloreado.comoColorear());
            }
            System.out.println();
        }
    }
}
    

