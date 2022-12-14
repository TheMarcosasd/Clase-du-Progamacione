
package boletin2.pkg3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cambiar de euros a dolares
        float euros=20,dolares,cambio;
        Scanner objScanner = new Scanner(System.in);
        System.out.println("¿Cual es el valor del dolares?");
        cambio =objScanner.nextFloat();
        dolares = euros*cambio;
        System.out.println("Con "+euros+"€ te quedas con "+dolares+"$");
    }
    
}
