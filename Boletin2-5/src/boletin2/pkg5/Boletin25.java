/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2.pkg5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static final float cambio=1852;
    public static void main(String[] args) {
        // De millas marinas a metros
        float metros,millasMarinas;
        System.out.println("Dame millas marinas");
        Scanner objScanner = new Scanner(System.in);
        millasMarinas=objScanner.nextFloat();
        metros=millasMarinas*cambio;
        System.out.println(millasMarinas+" millas marinas son "+metros+" metros");
    }
    
}
