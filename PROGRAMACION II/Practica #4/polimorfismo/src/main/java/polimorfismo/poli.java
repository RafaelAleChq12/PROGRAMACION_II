package polimorfismo;
public class poli {

    
    //CIRCULO
    double area(double radio) {
        return Math.PI * radio * radio; // Círculo
    }
    //RECTANGULO
    double area(double base, double altura) {
        return base * altura; // Rectángulo
    }
    //TRIANGULO RACTANGULO
    double area(double base, double altura, int tipo) {
        return (base * altura) / 2; // Triángulo rectángulo
    }
    //TRAPECIO
    double area(double baseMayor, double baseMenor, double altura, int tipo) {
        return ((baseMayor + baseMenor) * altura) / 2; // Trapecio
    }
    //HEXAGONO
    double area(double lado, int lados) {
        return ((3 * Math.sqrt(3)) / 2) * lado * lado; // Hexágono 
    }

    public static void main(String[] args) {
        poli f1 = new poli();
        poli f2 = new poli();
        poli f3 = new poli();
        poli f4 = new poli();
        poli f5 = new poli();
        
        System.out.println("CÍRCULO: " + f1.area(1));
        System.out.println("RECTÁNGULO: " + f2.area(1, 3));
        System.out.println("TRIÁNGULO RECTÁNGULO: " + f3.area(3, 4, 3));
        System.out.println("TRAPECIO: " + f4.area(3, 5, 4, 4));
        System.out.println("HEXÁGONO: " + f5.area(2, 6));
    }
}

