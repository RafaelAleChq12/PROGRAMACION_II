package JUEGO_2;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
        
    }
    
    @Override
    protected void generarNumero() {
        this.numeroAAdivinar = rand.nextInt(6) * 2;
    }
    
    @Override
    public boolean validaNumero(int num) {
        if (!super.validaNumero(num)) {
            System.out.println("Numero no valido. Debe estar entre 0 y 10");
            return false;
        }
        if (num % 2 != 0) {
            System.out.println("Debes ingresar un numero par");
            return false;
        }
        return true;
    }
}