/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol3_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Cuantos billetes de 100 tienes?");
        int bcien=objScanner.nextInt();
        System.out.println("Cuantos billetes de 20 tienes?");
        int bvente=objScanner.nextInt();
        System.out.println("Cuantos billetes de 5 tienes?");
        int bcinco=objScanner.nextInt();
        System.out.println("Cuantas monedas de 1 tienes?");
        int muno=objScanner.nextInt();
        int cantidad=bcien*100+bvente*20+bcinco*5+muno;
        System.out.println("Tu tienes "+cantidad+" €");
    }
    
}
