/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol11ej1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol11ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int contador =0;
        Scanner sc = new Scanner(System.in);
        int contNegativo=0;
        int contPositivo=0;
        int contCero=0;
        for(int i=0;i<11;i++){
        numero = sc.nextInt();
        System.out.println("numero "+numero);
        if(numero<0){
        contNegativo++;
        }else if(numero==0){
        contCero++;
        }else if(numero>0){
        contPositivo++;
        }
        }
        System.out.println("Total numeros negativos "+contNegativo);
        System.out.println("Total numeros positivos "+contPositivo);
        System.out.println("Total ceros "+contCero);
    }
    
}
