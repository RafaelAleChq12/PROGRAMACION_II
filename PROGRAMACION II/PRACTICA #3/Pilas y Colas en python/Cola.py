class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.cantidad = 0

    def insert(self, e):
        if not self.isFull():
            self.fin = (self.fin + 1) % self.n
            self.arreglo[self.fin] = e
            self.cantidad += 1
        else:
            raise Exception("Cola llena")

    def remove(self):
        if not self.isEmpty():
            temp = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n
            self.cantidad -= 1
            return temp
        else:
            raise Exception("Cola vacía")

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        else:
            raise Exception("Cola vacía")

    def isEmpty(self):
        return self.cantidad == 0

    def isFull(self):
        return self.cantidad == self.n

    def size(self):
        return self.cantidad


if __name__ == "__main__":
    colaA = Cola(10)
    colaB = Cola(10)
    colaC = Cola(10)

    colaA.insert(22)
    colaA.insert(5)
    colaA.insert(10)
    colaA.insert(11)

    print("Elemento al frente de la cola A:", colaA.peek())
    print("Tamaño de la cola A:", colaA.size())
    print("¿La cola A está vacía?", colaA.isEmpty())
    print("¿La cola A está llena?", colaA.isFull())

    print("Removiendo un elemento de la cola A:", colaA.remove())
    print("Tamaño de la cola A después de remover:", colaA.size())

    print("Elemento al frente de la cola A después de remover:", colaA.peek())
