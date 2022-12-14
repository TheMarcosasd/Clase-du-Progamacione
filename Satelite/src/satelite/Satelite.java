/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package satelite;

/**
 *
 * @author dam1
 */
public class Satelite{
    private double meridiano ;
    private double paralelo;
    private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0;
}

public Satelite ( double m, double p , double d ){
meridiano = m ;
paralelo = p;
distanciaTerra = d ;
}

public void verPosicion ( ) {
System.out.println("El satelite se encuentra en el paralelo "+paralelo +" y el meridiano " + meridiano +" a unha distancia da terra " + distanciaTerra);
}
}