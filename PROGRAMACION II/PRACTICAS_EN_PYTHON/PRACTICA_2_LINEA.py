import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f'({self.x}, {self.y})'

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f'Línea desde {self.p1} hasta {self.p2}'

    def dibuja_linea(self):
        print(f'Dibujando línea: {self}')
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], marker='o', color='b')
        plt.xlim(min(self.p1.x, self.p2.x) - 1, max(self.p1.x, self.p2.x) + 1)
        plt.ylim(min(self.p1.y, self.p2.y) - 1, max(self.p1.y, self.p2.y) + 1)
        plt.grid(True)
        plt.title(f'Línea desde {self.p1} hasta {self.p2}')
        plt.show()

if __name__ == "__main__":
    x1 = float(input("Ingresa la coordenada x1: "))
    y1 = float(input("Ingresa la coordenada y1: "))
    punto1 = Punto(x1, y1)

    x2 = float(input("Ingresa la coordenada x2: "))
    y2 = float(input("Ingresa la coordenada y2: "))
    punto2 = Punto(x2, y2)

    linea = Linea(punto1, punto2)

    print(linea)
    linea.dibuja_linea()
