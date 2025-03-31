/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER_2;

/**
 *
 * @author Trabajo
 */
public class AlgebraVectorialTridi {
    private double x, y, z;
    public AlgebraVectorialTridi(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Inciso a: Suma de vectores
    public AlgebraVectorialTridi sumar(AlgebraVectorialTridi v) {
        return new AlgebraVectorialTridi(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    // Inciso b: Multiplicación por un escalar
    public AlgebraVectorialTridi multiplicarPorEscalar(double r) {
        return new AlgebraVectorialTridi(this.x * r, this.y * r, this.z * r);
    }
    // Inciso c: Longitud del vector
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    // Inciso d: Normalización del vector
    public AlgebraVectorialTridi normalizar() {
        double mag = longitud();
        return new AlgebraVectorialTridi(this.x / mag, this.y / mag, this.z / mag);
    }
    // Inciso e: Producto escalar
    public double producto(AlgebraVectorialTridi v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    // Inciso f: Producto vectorial
    public AlgebraVectorialTridi producto(AlgebraVectorialTridi v, boolean vectorial) {
        if (vectorial) {
            double px = this.y * v.z - this.z * v.y;
            double py = this.z * v.x - this.x * v.z;
            double pz = this.x * v.y - this.y * v.x;
            return new AlgebraVectorialTridi(px, py, pz);
        }
        return null;
    }

    
    
    
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


