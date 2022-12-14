/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol16;

/**
 *
 * @author dam1
 */
public class CuentaAhorro extends NewClass{
    private double c,r,t;
    private double interesSimple;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double c, double r, double t) {
        this.c = c;
        this.r = r;
        this.t = t;
    }

    public CuentaAhorro(long numeroConta, double saldo, Persona clase) {
        super(numeroConta, saldo, clase);
    }
    

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getInteresSimple() {
        return interesSimple;
    }

    public void setInteresSimple(double c, double r,double t) {
        interesSimple = c*r*t/100;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "c=" + c + ", r=" + r + ", t=" + t + ", interesSimple=" + interesSimple + '}';
    }
    
    
}
