/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol14;

import com.marcos.Partes.*;


public class Bol14 {
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor mo = new Monitor((float)5.6);
        Teclado te = new Teclado("marca");
        CPU pro = new CPU(45);
        Ordenador ord = new Ordenador((float)17.36, mo, pro, te);
    }
    
}
