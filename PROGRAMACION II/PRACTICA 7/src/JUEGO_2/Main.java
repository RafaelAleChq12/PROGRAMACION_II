/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JUEGO_2;

import java.util.Scanner;

/**
 *
 * @author Trabajo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("JUEGO NORMAL");
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        juego1.juega();
        
        System.out.println("\nJUEGO PAR");
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        juego2.juega();
        
        System.out.println("\nJUEGO IMPAR");
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        juego3.juega();
    }
}

