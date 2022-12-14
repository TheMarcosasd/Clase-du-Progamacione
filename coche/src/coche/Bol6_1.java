/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;

/**
 *
 * @author dam1
 */
public class Bol6_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche obj1 = new Coche();
        obj1.acelerar(69);
        System.out.println("El coche acelera "+obj1.getVelocidad());
        obj1.frenar(50);
        System.out.println("El coche frena "+obj1.getVelocidad());
    }
}
