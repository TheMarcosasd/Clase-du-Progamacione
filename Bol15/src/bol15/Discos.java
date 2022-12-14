/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol15;

/**
 *
 * @author dam1
 */
public class Discos extends Multimedia{
    private String genero;

    public Discos() {
    }

    public Discos(String genero, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+"Discos{" + "genero=" + genero + '}';
    }
    
}
