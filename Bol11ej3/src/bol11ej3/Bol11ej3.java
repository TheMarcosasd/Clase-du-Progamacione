/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol11ej3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Bol11ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int base= sc.nextInt();
        int altura= sc.nextInt();
        while(base<=0 || altura<=0){
        if(base<=0){
            System.out.println("Base incorrecta, repite base");
        base= sc.nextInt();
        }else if(altura<=0){
            System.out.println("Altura incorrecta, repite altura");
        altura= sc.nextInt();
        }
        }
        System.out.println("Altura ="+altura);
        System.out.println("Base ="+base);
        int arearec=base*altura/2;
        System.out.println("El area es igual a "+arearec);
    }
    
}
