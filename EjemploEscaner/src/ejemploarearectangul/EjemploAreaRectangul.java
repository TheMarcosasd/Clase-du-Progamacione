
package ejemploarearectangul;

import java.util.Scanner;

public class EjemploAreaRectangul {
    public static void main(String[] args) {
        //proyecto que calcula el area de un rectangulo de base 2 y altura 5
        Scanner objScanner = new Scanner(System.in);
        int dinero = objScanner.nextInt();
        int cien = dinero/100;
        System.out.println("Billetes de cien "+cien);
        int vente = (int)(dinero-cien*100)/20;
        System.out.println("Billetes de veinte "+vente);
        int cinco = (int)(dinero-(cien*100+vente*20))/5;
        System.out.println("Billetes de  cinco "+cinco);
        int uno = (int)(dinero-(cien*100+vente*20))/5;
                
