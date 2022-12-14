/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol3_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objScanner = new Scanner(System.in);
        double sfijo,ventas;
        System.out.println("Cual es tu sueldo fijo?");
        sfijo=objScanner.nextDouble();
        System.out.println("Cuantas ventas has tenido?");
        ventas=objScanner.nextDouble();
        System.out.println("Cuantos km has hecho es mes?");
        int km=objScanner.nextInt();
        double comision=0.05*ventas;
        double kmetraje=2*km;
        double sbruto = sfijo+comision+kmetraje+30;
        double sliquido =sbruto-(0.18*sbruto)-36;
        System.out.println("Tu sueldo liquido es de "+sliquido);
    }
    
}
