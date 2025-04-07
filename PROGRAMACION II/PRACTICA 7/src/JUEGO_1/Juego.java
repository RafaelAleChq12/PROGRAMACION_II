package JUEGO_1;

public class Juego {
    private int numeroDeVidas;
    private int record;
    
    public void reiniciaPartida() {
        
        numeroDeVidas = getRecord() > 0 ? getRecord() : numeroDeVidas;
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

    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }
    
    public void setNumeroDeVidas(int vidas) {
        this.numeroDeVidas = vidas;

        if (this.record == 0) {
            this.record = vidas;
        }
    }
    
    public int getRecord() {
        return record;
    }
}