/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marcos.Partes;

/**
 *
 * @author dam1
 */
public class CPU {
    private int velocidad;

    public CPU() {
    }

    public CPU(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "CPU{" + "velocidad=" + velocidad + '}';
    }
    
}
