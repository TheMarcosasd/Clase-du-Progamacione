/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol11ej4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol11ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int por=0;
        int opcion=1;
        while(opcion==1){
        System.out.println("Dame un numero");
        int n =sc.nextInt();
        for(int i=1;i<11;i++){
        por=n*i;
        System.out.println(n+" * "+i+" ="+por);
        }
        System.out.println("Presiona 0 para salir y 1 para continuar");
        opcion=sc.nextInt();
    }
    }
    
}
