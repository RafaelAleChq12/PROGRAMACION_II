/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author Trabajo
 */
public class D extends B {
    public D(int x, int y, int z) {
        super(y, z);
        this.x = x; 
    }
    
    public void incrementaXYZ() {
        this.x++;
        this.y++;
        this.z++;
    }
    
    
}
