/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

/**
 *
 * @author dam1
 */
public class Bol6_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Circulo obj1=new Circulo(2);
       System.out.println("Radio "+obj1.getRadio());
       obj1.calcularArea();
       System.out.println("El area del circulo es "+obj1.calcularArea());
       obj1.calcularLong();
       System.out.println("La longitud de lcirculo es "+obj1.calcularLong());
    }
}
