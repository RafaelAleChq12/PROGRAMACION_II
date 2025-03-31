/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJER_1;

/**
 *
 * @author Trabajo

*/
public class AlgebraVectorial {
    private double x, y, z;

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //perpendicularidad
    // Caso a: |a + b| = |a - b|
    public String perpendicular(AlgebraVectorial v) {
        double mag1 = Math.sqrt(Math.pow(this.x + v.x, 2) + Math.pow(this.y + v.y, 2) + Math.pow(this.z + v.z, 2));
        double mag2 = Math.sqrt(Math.pow(this.x - v.x, 2) + Math.pow(this.y - v.y, 2) + Math.pow(this.z - v.z, 2));
        if (Math.abs(mag1 - mag2) < 1e-6) {
            return "Si, los vectores cumplen la condicion |a + b| = |a - b|";
        } else {
            return "No, los vectores no cumplen la condicion";
        }
    }
    // Caso b: |a - b| = |b - a|
    public static String perpendicular(AlgebraVectorial v1, AlgebraVectorial v2) {
        double mag1 = Math.sqrt(Math.pow(v1.x - v2.x, 2) + Math.pow(v1.y - v2.y, 2) + Math.pow(v1.z - v2.z, 2));
        double mag2 = Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2) + Math.pow(v2.z - v1.z, 2));
        if (Math.abs(mag1 - mag2) < 1e-6) {
            return "Si, los vectores cumplen la condicion |a - b| = |b - a|";
        } else {
            return "No, los vectores no cumplen la condición";
        }
    }
    // Caso c: a · b = 0 (producto escalar)
    public String perpendicular(double escalar, AlgebraVectorial v) {
        double productoEscalar = (this.x * v.x) + (this.y * v.y) + (this.z * v.z);
        if (Math.abs(productoEscalar) < 1e-6) {
            return "Si, los vectores son perpendiculares (producto escalar = 0)";
        } else {
            return "No, los vectores no son perpendiculares";
        }
    }
    // Caso d: |a + b|² = |a|² + |b|²
    public String perpendicular(AlgebraVectorial v, boolean cuadrado) {
        double sumaMagCuad = Math.pow(this.x + v.x, 2) + Math.pow(this.y + v.y, 2) + Math.pow(this.z + v.z, 2);
        double magCuad = (this.x * this.x + this.y * this.y + this.z * this.z) +
                         (v.x * v.x + v.y * v.y + v.z * v.z);
        if (Math.abs(sumaMagCuad - magCuad) < 1e-6) {
            return "Si, los vectores cumplen la condicion |a + b|² = |a|² + |b|²";
        } else {
            return "No, los vectores no cumplen la condicion";
        }
    }

    //paralelismo
    // Caso e: a = r * b (proporcionalidad)
    public String paralela(AlgebraVectorial v) {
        if (v.x == 0 || v.y == 0 || v.z == 0) {
            return "No se puede determinar, division por cero";
        }
        double r1 = this.x / v.x;
        double r2 = this.y / v.y;
        double r3 = this.z / v.z;
        if (Math.abs(r1 - r2) < 1e-6 && Math.abs(r2 - r3) < 1e-6) {
            return "Si, los vectores son paralelos (a = r * b)";
        } else {
            return "No, los vectores no son paralelos";
        }
    }
    // Caso f: a × b = 0 (producto cruzado)
    public String paralela(AlgebraVectorial v, boolean cruz) {
        double px = (this.y * v.z - this.z * v.y);
        double py = (this.z * v.x - this.x * v.z);
        double pz = (this.x * v.y - this.y * v.x);
        if (Math.abs(px) < 1e-6 && Math.abs(py) < 1e-6 && Math.abs(pz) < 1e-6) {
            return "Si, los vectores son paralelos (producto cruzado = 0)";
        } else {
            return "No, los vectores no son paralelos";
        }
    }
    // Caso g: Proyeccion_de_a_sobre_b. La proyección ortogonal de a sobre b.
    public AlgebraVectorial proyeccion_de_a_sobre_b(AlgebraVectorial v) {
        double escalar = ((this.x * v.x) + (this.y * v.y) + (this.z * v.z)) / 
                         ((v.x * v.x) + (v.y * v.y) + (v.z * v.z));
        return new AlgebraVectorial(v.x * escalar, v.y * escalar, v.z * escalar);
    }
    // Caso h: Componente_de_a_en_b. El componente de a en la dirección de b.
    public double componente_de_a_en_b(AlgebraVectorial v) {
        double magnitudV = Math.sqrt(v.x * v.x + v.y * v.y + v.z * v.z);
        return ((this.x * v.x) + (this.y * v.y) + (this.z * v.z)) / magnitudV;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
