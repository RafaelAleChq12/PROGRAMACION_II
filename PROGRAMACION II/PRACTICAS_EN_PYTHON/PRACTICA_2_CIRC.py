import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"


class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibuja_circulo(self):

        fig, ax = plt.subplots()

        circulo_plot = plt.Circle((self.centro.x, self.centro.y), self.radio, color='blue', fill=False)

        ax.add_artist(circulo_plot)

        ax.set_xlim(self.centro.x - self.radio - 1, self.centro.x + self.radio + 1)
        ax.set_ylim(self.centro.y - self.radio - 1, self.centro.y + self.radio + 1)


        ax.set_aspect('equal', 'box')

     
        plt.grid(True)
        plt.title(f"Círculo con centro en {self.centro} y radio {self.radio}")
        plt.show()


x = float(input("Ingresa la coordenada x del centro: "))
y = float(input("Ingresa la coordenada y del centro: "))
centro = Punto(x, y)

radio = float(input("Ingresa el radio del círculo: "))

circulo = Circulo(centro, radio)

print(circulo)

circulo.dibuja_circulo()

