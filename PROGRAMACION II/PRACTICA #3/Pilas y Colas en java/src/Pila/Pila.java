package Pila;

public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    // Constructor
    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }

    // Método para apilar un elemento (push)
    public void push(long e) {
        if (!isFull()) {
            arreglo[++top] = e;
        } else {
            throw new IllegalStateException("Pila llena");
        }
    }

    // Método para desapilar un elemento (pop)
    public long pop() {
        if (!isEmpty()) {
            return arreglo[top--];
        } else {
            throw new IllegalStateException("Pila vacía");
        }
    }

    // Método para obtener el elemento en la parte superior de la pila sin quitarlo (peek)
    public long peek() {
        if (!isEmpty()) {
            return arreglo[top];
        } else {
            throw new IllegalStateException("Pila vacía");
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == -1;
    }

    // Método para verificar si la pila está llena
    public boolean isFull() {
        return top == n - 1;
    }

    public static void main(String[] args) {
        Pila pilaA = new Pila(5);
        Pila pilaB = new Pila(5);
        Pila pilaC = new Pila(5);

        System.out.println("Apilando elementos en la pila A...");
        pilaA.push(10);
        pilaA.push(15);
        pilaA.push(20);
        pilaA.push(25);

        System.out.println("Elemento en la parte superior de la pila A (peek): " + pilaA.peek());

        // Interacciones adicionales
        System.out.println("Desapilando un elemento de la pila A: " + pilaA.pop());
        System.out.println("Desapilando otro elemento de la pila A: " + pilaA.pop());
        pilaA.push(30);
        pilaA.push(35);
        System.out.println("Elemento en la parte superior de la pila A (peek): " + pilaA.peek());
        System.out.println("Desapilando un elemento de la pila A: " + pilaA.pop());
        System.out.println("Desapilando otro elemento de la pila A: " + pilaA.pop());
    }
}
