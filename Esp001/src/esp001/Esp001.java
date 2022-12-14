/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esp001;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Esp001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Dame la base imponible");
        double baseimponible =objScanner.nextDouble();
        double ivageneral=0.21*baseimponible;
        double ivareducido=0.10*baseimponible;
        double ivasuper=0.04*baseimponible;
        double total=ivageneral+baseimponible;
        double total1=ivareducido+baseimponible;
        double total2=ivasuper+baseimponible;
        System.out.println("Con una base imponible de "+baseimponible);
        System.out.println("Tenemos "+ivageneral+" con un iva del 21%, el total seria de "+total);
        System.out.println("Tenemos "+ivareducido+" con un iva del 21%, el total seria de "+total1);
        System.out.println("Tenemos "+ivasuper+" con un iva del 21%, el total seria de "+total2);
    
    }
    
}
