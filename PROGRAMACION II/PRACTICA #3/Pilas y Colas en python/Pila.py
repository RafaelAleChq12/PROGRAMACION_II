class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    # Método para apilar un elemento (push)
    def push(self, e):
        if not self.isFull():
            self.top += 1
            self.arreglo[self.top] = e
        else:
            raise Exception("Pila llena")

    # Método para desapilar un elemento (pop)
    def pop(self):
        if not self.isEmpty():
            valor = self.arreglo[self.top]
            self.top -= 1
            return valor
        else:
            raise Exception("Pila vacía")

    # Método para obtener el elemento en la parte superior de la pila sin quitarlo (peek)
    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.top]
        else:
            raise Exception("Pila vacía")

    # Método para verificar si la pila está vacía
    def isEmpty(self):
        return self.top == -1

    # Método para verificar si la pila está llena
    def isFull(self):
        return self.top == self.n - 1


if __name__ == "__main__":
    pilaA = Pila(5)
    pilaB = Pila(5)
    pilaC = Pila(5)

    print("Apilando elementos en la pila A...")
    pilaA.push(10)
    pilaA.push(15)
    pilaA.push(20)
    pilaA.push(25)

    print("Elemento en la parte superior de la pila A (peek):", pilaA.peek())

    # Interacciones adicionales
    print("Desapilando un elemento de la pila A:", pilaA.pop())
    print("Desapilando otro elemento de la pila A:", pilaA.pop())
    pilaA.push(30)
    pilaA.push(35)
    print("Elemento en la parte superior de la pila A (peek):", pilaA.peek())
    print("Desapilando un elemento de la pila A:", pilaA.pop())
    print("Desapilando otro elemento de la pila A:", pilaA.pop())
