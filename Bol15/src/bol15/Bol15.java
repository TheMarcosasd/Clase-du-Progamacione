/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol15;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Bol15 {
    static String actorp;
    static String actrizp;
    static String genero;
    static String titulo;
    static String autor;
    static String formato;
    static String duracion;
    public static void main(String[] args) {
        // TODO code application logic here
        Peliculas pel = new Peliculas(actorp,actrizp,titulo,autor,formato,duracion);
        Discos dis = new Discos(genero,titulo,autor,formato,duracion);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre peli");
        pel.setTitulo(sc.nextLine());
        System.out.println("Autor peli");
        pel.setAutor(sc.nextLine());
        System.out.println("Formato peli");
        pel.setFormato(sc.nextLine());
        System.out.println("Duracion Peli");
        pel.setDuracion(sc.nextLine());
        System.out.println("Nombre peli");
        pel.setTitulo(sc.nextLine());
        
        System.out.println("Pelicula "+pel);
        System.out.println("Pelicula "+dis);
    }
    
}
