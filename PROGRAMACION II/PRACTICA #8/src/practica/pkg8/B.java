/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg8;

/**
 *
 * @author Trabajo
 */
public class B extends A {
    public int y;
    // z está heredado de A
    
    public B(int y, int z) {
        super(0, z); 
        this.y = y;
    }
    
    public void incrementaYZ() {
        this.y++;
        this.z++;
    }
    
    
}
