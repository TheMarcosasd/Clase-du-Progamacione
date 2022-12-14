/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol16;

import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Bol16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long dato1,dato3;
        double dato2,dato4;
        
        Persona pe1 = new Persona();
        pe1.setNombre(JOptionPane.showInputDialog("Dame tu nombre"));
        pe1.setApellidos(JOptionPane.showInputDialog("Dame tus apellidos"));
        pe1.setNif(JOptionPane.showInputDialog("Dame tu NIF"));
        dato1 =parseLong(JOptionPane.showInputDialog("Dame un numero longorl"));
        dato2=parseDouble(JOptionPane.showInputDialog("Dame un numero double"));
        CuentaCorriente obj= new CuentaCorriente(dato1,dato2,pe1);
        
        double c,r,t;
        c = parseDouble(JOptionPane.showInputDialog("Dame tu capital"));
        r = parseDouble(JOptionPane.showInputDialog("Dame tu tasa de interes"));
        t = parseDouble(JOptionPane.showInputDialog("Dime durante cuanto tiempo"));
        Persona pe2 = new Persona();
        pe2.setNombre(JOptionPane.showInputDialog("Dame tu nombre"));
        pe2.setApellidos(JOptionPane.showInputDialog("Dame tus apellidos"));
        pe2.setNif(JOptionPane.showInputDialog("Dame tu NIF"));
        dato3 =parseLong(JOptionPane.showInputDialog("Dame un numero longorl"));
        dato4=parseDouble(JOptionPane.showInputDialog("Dame un numero double"));
        CuentaAhorro obj2=new CuentaAhorro(dato3,dato4,pe2);
        obj2.setInteresSimple(c, r, t);
    }
    
}
