/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol12ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Bol12ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=Integer.parseInt(JOptionPane.showInputDialog("Dame un numero entre el 1 y el 50"));
        int intentos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos tiene?"));
        int n2 =0;
        while(n2!=num||intentos!=0){
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar mi numero, tiene que ser del 1 al 50 tienes "+intentos+" intnetos"));
        if(n2==num){
        JOptionPane.showMessageDialog(null, "Numero Correcto");
        break;
        }else if (n2!=num){
        intentos--;
        if(n2>(num-5)&& n2<(num+5)){
        JOptionPane.showMessageDialog(null, "Tu numero esta muy cerca");
        }else if(n2>(num-10) && n2<(num+10)){
        JOptionPane.showMessageDialog(null, "Tu numero esta cerca");
        }else if(n2<=(num-10)&& n2>=(num-20)||n2>=(num+10)&& n2<=(num+20)){
        JOptionPane.showMessageDialog(null, "Tu numero esta lejos");
        }else if(n2<(num-20)|| n2>(num+20)){
        JOptionPane.showMessageDialog(null, "Tu numero esta muy lejos");
        }
        }
        }
        System.out.println("Juego terminado");
    }
    
}
