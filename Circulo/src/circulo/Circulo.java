/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

/**
 *
 * @author dam1
 */
public class Circulo {
double radio;
final double  pi=Math.PI;

public Circulo() {
        
}
public Circulo(double radio) {
        this.radio = radio;
}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }
public double calcularArea(){
double area=Math.pow(radio, 2)*pi;
return area;
}    
public double calcularLong(){
double lomgi=2*pi*radio;
return lomgi;
}
}
