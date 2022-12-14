/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumo;

/**
 *
 * @author dam1
 */
public class Consumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consi2 obj1 = new Consi2();
        obj1.setLitros(50);
        obj1.setpGas(1.57);
        
        Consi2 obj2 = new Consi2(200,50,80,1.57);
        obj2.consumoMedio(100, 600);
        obj2.setLitros(100);
        System.out.println("Consumo medio "+obj2.consumoMedio(100, 600));
        System.out.println("Velocidad "+obj2.getvMed());
    }
}
