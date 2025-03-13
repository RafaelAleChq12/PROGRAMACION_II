class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self) -> str:
        return f"({self.x}, {self.y})"

    def coord_polares(self) -> str:
        r = (self.x ** 2 + self.y ** 2) ** 0.5
        theta = math.atan2(self.y, self.x)
        return f"(r={r}, θ={math.degrees(theta)}°)"

    def __str__(self) -> str:
        return f"Punto: {self.coord_cartesianas()}"

if __name__ == "__main__":
    import math
    x = float(input("Ingrese la coordenada x: "))
    y = float(input("Ingrese la coordenada y: "))
    p = Punto(x, y)
    print(p)
    print("Coordenadas polares:", p.coord_polares())
