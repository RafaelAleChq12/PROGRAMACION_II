package JUEGO_2;
import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    public int numeroAAdivinar;
    private Scanner scanner;
    public Random rand;
    
    public JuegoAdivinaNumero(int vidas) {
        setNumeroDeVidas(vidas);
        this.scanner = new Scanner(System.in);
        this.rand = new Random();
    }
    
    public boolean validaNumero(int num) {
        return num >= 0 && num <= 10;
    }
    
    protected void generarNumero() {
        this.numeroAAdivinar = rand.nextInt(11);
    }
    
    public void juega() {
        reiniciaPartida();
        generarNumero();
        System.out.println("Adivina un numero entre 0 y 10");

        while (getNumeroDeVidas() > 0) {
            System.out.print("Introduce tu numero: ");
            int intento = scanner.nextInt();
            
            if (!validaNumero(intento)) {
                System.out.println("Numero no valido. Debe estar entre 0 y 10");
                continue;
            }
            
            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                return;
            }
            
            if (!quitaVida()) {
                System.out.println("Game over. El numero era: " + numeroAAdivinar);
                return;
            }
            
            System.out.println("El numero es " + (intento < numeroAAdivinar ? "mayor" : "menor"));
            System.out.println("Vidas restantes: " + getNumeroDeVidas());
        }
    }
}