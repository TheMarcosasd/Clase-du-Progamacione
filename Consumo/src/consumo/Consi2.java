/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consumo;

/**
 *
 * @author dam1
 */
public class Consi2 {
    int km;
        int litros;
        int vMed;
        double pGas;
    public Consi2() {
    }
    public Consi2(int km, int litros, int vMed,double pGas) {
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    public int getTempo(int km, int vMed){
        int tempo = km/vMed;
        return tempo;
    }
    public float consumoMedio(int litros,int km){
        int cMed=(litros/km)*100;
        return cMed;
    }
    public double consumoEuros(int litros, int km, double pGas){
        double precioGas=((litros/km)*100)*pGas;
        return precioGas;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public void setvMed(int vMed) {
        this.vMed = vMed;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }

    public int getKm() {
        return km;
    }

    public int getLitros() {
        return litros;
    }

    public int getvMed() {
        return vMed;
    }

    public double getpGas() {
        return pGas;
    }
    
}
