package Cola;

public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int cantidad;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.cantidad = 0;
    }

    public void insert(long e) {
        if (!isFull()) {
            fin = (fin + 1) % n;
            arreglo[fin] = e;
            cantidad++;
        } else {
            throw new IllegalStateException("Cola llena");
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long temp = arreglo[inicio];
            inicio = (inicio + 1) % n;
            cantidad--;
            return temp;
        } else {
            throw new IllegalStateException("Cola vacía");
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            throw new IllegalStateException("Cola vacía");
        }
    }

    public boolean isEmpty() {
        return cantidad == 0;
    }

    public boolean isFull() {
        return cantidad == n;
    }

    public int size() {
        return cantidad;
    }

    public static void main(String[] args) {
        Cola colaA = new Cola(10);
        Cola colaB = new Cola(10);
        Cola colaC = new Cola(10);

        colaA.insert(22);
        colaA.insert(5);
        colaA.insert(10);
        colaA.insert(11);

        System.out.println("Elemento al frente de la cola A: " + colaA.peek());
        System.out.println("Tamaño de la cola A: " + colaA.size());
        System.out.println("¿La cola A está vacía? " + colaA.isEmpty());
        System.out.println("¿La cola A está llena? " + colaA.isFull());

        System.out.println("Removiendo un elemento de la cola A: " + colaA.remove());
        System.out.println("Tamaño de la cola A después de remover: " + colaA.size());

        System.out.println("Elemento al frente de la cola A después de remover: " + colaA.peek());
    }
}
