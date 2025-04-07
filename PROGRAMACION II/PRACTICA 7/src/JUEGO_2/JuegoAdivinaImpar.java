package JUEGO_2;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }
    
    @Override
    protected void generarNumero() {
        this.numeroAAdivinar = rand.nextInt(5) * 2 + 1;
    }
    
    @Override
    public boolean validaNumero(int num) {
        if (!super.validaNumero(num)) {
            System.out.println("Numero no valido. Debe estar entre 0 y 10");
            return false;
        }
        if (num % 2 == 0) {
            System.out.println("Debes ingresar un numero impar");
            return false;
        }
        return true;
    }
}