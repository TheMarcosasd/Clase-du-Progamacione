/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hacer distintas operaciones con dos numeros
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        int n1=objScanner.nextInt();
        System.out.println("Dame otra numero");
        int n2=objScanner.nextInt();
        int suma = n1+n2;
        int resta = n1-n2;
        int multiplicador = n1*n2;
        int cociente=n1/n2;
        System.out.println("La suma es de "+suma);
        System.out.println("La resta es de "+resta);
        System.out.println("La multiplicacion es de "+multiplicador);
        System.out.println("La cociente es de "+cociente);
    }
    
}
