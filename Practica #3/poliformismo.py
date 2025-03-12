import math

class Poli:
    def area(self, *args):
        if len(args) == 1:
            # Círculo: área = π * r^2
            return math.pi * args[0] ** 2
        elif len(args) == 2:
            # Rectángulo: área = base * altura
            return args[0] * args[1]
        elif len(args) == 3:
            # Triángulo rectángulo: área = (base * altura) / 2
            return (args[0] * args[1]) / 2
        elif len(args) == 4:
            # Trapecio: área = ((baseMayor + baseMenor) * altura) / 2
            return ((args[0] + args[1]) * args[2]) / 2
        elif len(args) == 2 and args[1] == 6:
            # Hexágono: área = ((3 * sqrt(3)) / 2) * lado^2
            return ((3 * math.sqrt(3)) / 2) * args[0] ** 2
        else:
            return "Parámetros inválidos"

if __name__ == "__main__":
    poli = Poli()
    print("CÍRCULO:", poli.area(1))
    print("RECTÁNGULO:", poli.area(1, 3))
    print("TRIÁNGULO RECTÁNGULO:", poli.area(3, 4, 3))
    print("TRAPECIO:", poli.area(3, 5, 4, 4))
    print("HEXÁGONO:", poli.area(2, 6))