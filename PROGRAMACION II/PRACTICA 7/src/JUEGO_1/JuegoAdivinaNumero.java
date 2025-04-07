package JUEGO_1;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    
    public JuegoAdivinaNumero(int vidas) {
        setNumeroDeVidas(vidas);
    }
    
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adivina un número entre 0 y 10. Tienes " + getNumeroDeVidas() + " vidas.");

        while (true) {
            System.out.print("Tu intento: ");
            int intento = scanner.nextInt();
            
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            }
            
            if (!quitaVida()) {
                System.out.println("¡Game over! El número era: " + numeroAAdivinar);
                break;
            }
            
            System.out.println("El número es " + (intento < numeroAAdivinar ? "mayor" : "menor"));
            System.out.println("Vidas restantes: " + getNumeroDeVidas());
        }
        scanner.close();
    }
}