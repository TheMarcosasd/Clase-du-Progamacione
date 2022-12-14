/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol3_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objScanner = new Scanner(System.in);
        double ptarifa,ppagado;
        System.out.println("Dame el precio de la tarifa");
        ptarifa=objScanner.nextDouble();
        System.out.println("Dame el precio pagado");
        ppagado=objScanner.nextDouble();
        double descuento=100-(ptarifa*100/ppagado);
        System.out.println("Te han descontado "+descuento);
    }
    
}
