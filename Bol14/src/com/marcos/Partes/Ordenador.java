/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.Partes;

/**
 *
 * @author dam1
 */
public class Ordenador {
    private float precio;
    private Monitor moni;
    private CPU cup;
    private Teclado tecla;

    public Ordenador() {
    }

    public Ordenador(float precio, Monitor moni, CPU cup, Teclado tecla) {
        this.precio = precio;
        this.moni=moni;
        this.cup=cup;
        this.tecla=tecla;
    }
    
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Monitor getMoni() {
        return moni;
    }

    public void setMoni(Monitor moni) {
        this.moni = moni;
    }

    public CPU getCup() {
        return cup;
    }

    public void setCup(CPU cup) {
        this.cup = cup;
    }

    public Teclado getTecla() {
        return tecla;
    }

    public void setTecla(Teclado tecla) {
        this.tecla = tecla;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + ", moni=" + moni + ", cup=" + cup + ", tecla=" + tecla + '}';
    }
    
    
}
