/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol16;

/**
 *
 * @author dam1
 */
public class NewClass extends Persona{
    private long numeroConta;
    private double saldo;
    private Persona clase;

    public NewClass() {
    }

    public NewClass(long numeroConta, double saldo, Persona clase) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clase = clase;
    }

    

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getClase() {
        return clase;
    }

    public void setClase(Persona clase) {
        this.clase = clase;
    }
    public double ingresar(double saldo1){
    saldo=saldo+saldo1;
    return saldo;
    }
    public double retirar(double saldos){
    saldo=saldo+saldos;
    return numeroConta;
    }
    public double actualizar(){
    return saldo;
    }
}
