/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol13;
import Bol132.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Academica {
    public static int numRef=2018;
    private String nome;
    private int nota;
    private Personal alum=new Personal();

    public Academica() {
        Academica.numRef ++;
    }

    public Academica(String nome, int nota,Personal alum) {
        Academica.numRef ++;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }
    public Academica(String nome, int nota,String tel, String cor) {
        Academica.numRef ++;
        this.nome = nome;
        this.nota = nota;
        alum.setTelefono(tel);
        alum.setCorreo(cor);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Personal getAlum() {
        return alum;
    }

    public void setAlum(Personal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", alum=" + alum + '}';
    }
    public int validanota(){
    do{
        nota=Integer.parseInt(JOptionPane.showInputDialog("Mete la nota retrasado!!!!!!!!!", nota));
    }while(nota<0||nota>10);
    return nota;
    }
}
