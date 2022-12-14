/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol16;

/**
 *
 * @author dam1
 */
public class CuentaCorriente extends NewClass{
    private final double interes=1.5/100;
    
    public CuentaCorriente() {
    }

    public CuentaCorriente(long numeroConta, double saldo, Persona clase) {
        super(numeroConta, saldo, clase);
    }

    @Override
    public String toString() {
        return super.toString()+"CuentaCorriente{" + "interes=" + interes + '}';
    }
    
}
