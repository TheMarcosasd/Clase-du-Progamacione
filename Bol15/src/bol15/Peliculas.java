/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol15;

/**
 *
 * @author dam1
 */
public class Peliculas extends Multimedia{
    private String actorp;
    private String actrizp;
    
    public Peliculas() {
    }

    public Peliculas(String actorp, String actrizp, String titulo, String autor, String formato, String duracion) {
        super(titulo, autor, formato, duracion);
        this.actorp = actorp;
        this.actrizp = actrizp;
    }

    public String getActorp() {
        return actorp;
    }

    public void setActorp(String actorp) {
        this.actorp = actorp;
    }

    public String getActrizp() {
        return actrizp;
    }

    public void setActrizp(String actrizp) {
        this.actrizp = actrizp;
    }

    @Override
    public String toString() {
        return super.toString()+"Peliculas{" + "actorp=" + actorp + ", actrizp=" + actrizp + '}';
    }
    
}
