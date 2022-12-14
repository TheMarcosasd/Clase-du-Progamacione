/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;

/**
 *
 * @author dam1
 */
public class Coche {
    private int velocidad;

    public Coche(){
    velocidad =0 ;
}

    public int getVelocidad() {
        return velocidad;
    }
    public void acelerar(int valor){
    int velocidad;
    velocidad=this.velocidad;
    this.velocidad=velocidad+valor;
    }
    public void frenar(int valor){
    int velocidad;
    velocidad=this.velocidad;
    this.velocidad=velocidad-valor;
    }
}
