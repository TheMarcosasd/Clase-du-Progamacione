/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol3_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Cuanto dinero tienes?");
        int dinero=objScanner.nextInt();
        int bcien=dinero/100;
        int bvente=(dinero-(bcien*100))/20;
        int bcinco=(dinero-(bcien*100+bvente*20))/5;
        int buno=(dinero-(bcien*100+bvente*20+bcinco*5));
        System.out.println("Tienes billetes de 100 "+bcien);
        System.out.println("Tienes billetes de 20 "+bvente);
        System.out.println("Tienes billetes de 5 "+bcinco);
        System.out.println("Tienes billetes de 1 "+buno);
    }
    
}
