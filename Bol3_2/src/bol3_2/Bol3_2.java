/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objScanner = new Scanner(System.in);
        int celsius;
        System.out.println("Dame la temperatura en grados celsius");
        celsius=objScanner.nextInt();
        double farenheit=celsius*1.8+32;
        double kelvin = celsius+273.15;
        System.out.println("La temperatura en celsius es "+celsius+", en Farenheit "+farenheit+" y en kelvin "+kelvin);
    }
    
}
