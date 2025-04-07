package JUEGO_2;

public class Juego {
    public int numeroDeVidas;
    public int record;
    
    public void reiniciaPartida() {
        // Metodo basico de reinicio
    }
    
    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
    }
    
    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
    
    // Getters y Setters
    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }
    
    public void setNumeroDeVidas(int vidas) {
        this.numeroDeVidas = vidas;
    }
    
    public int getRecord() {
        return record;
    }
}