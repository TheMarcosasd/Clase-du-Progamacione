
package math;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author dam1
 */
public class Math {

    
    public static final double PI = 3.14;
    public static void main(String[] args) {
        // Progrmama que calcula la longitud y el area de una circumferencia
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Dame radio");
        float radio = objScanner.nextFloat();
        double longitud = 2*PI*radio;
        float area = (float)((Math.pow(radio, 2)));
        System.out.println("La longitud es de "+longitud);
        System.out.println("El area es de "+area);
    }
    
}
