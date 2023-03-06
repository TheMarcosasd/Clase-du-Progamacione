/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol21;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Archivos {
    public void aleatorio(){
    Random r = new Random();
    int n;
    int numi= PedirDatos.pedirInt("Cuantos numeros quieres?");
    int []lista=new int[numi];
    for(int i=0;i<=numi;i++){
    n = r.nextInt(50-0)+0;
    lista[i]=n;
    }
    for(int i=0;i<=numi;i++){
    System.out.println(lista[i]);
    }
    for(int i=numi;i>=0;i--){
    System.out.println(lista[i]);
    }
    }
    
    public float[] notas(){
    int aprobado=0,suspenso=0,num= PedirDatos.pedirInt("Cuantos alumnos quieres");
    float [] nota=new float[num];
    Random ra = new Random();
    for(int j=0;j<nota.length;j++){
    nota[j]=ra.nextInt(10-0)+0;
    if(nota[j]>=5){
        aprobado++;
    }else{
        suspenso++;}
    }
        System.out.println("han aprobado "+aprobado+" alumnos y suspendido "+suspenso);
        return nota;
    }
    
    public void medi(float[] nota){
    float suma=0,media=0;
    for(int o=0;o<nota.length;o++){
    suma=suma+nota[o];
    }
    media=suma/nota.length;
        System.out.println("La media de todas las notas es de "+media);
    }
    
    public void notmaxima(float[] nota){
    float notmax=0;
    for(int k=0;k<nota.length;k++){
    if(nota[k]>notmax){
    notmax=nota[k];
    }
    }
        System.out.println("La nota maxima es de "+notmax);
    }
    public String[][] alum(float[] nota){
    String[][] alumny=new String[nota.length][2];
    for(int c=0;c<nota.length;c++){
    alumny[c][0]=PedirDatos.pedirString("Dame un nombre pendejo");
        System.out.println("Alumno "+alumny[c][0]);
        Arrays.sort(nota);
    alumny[c][1]=String.valueOf(nota[c]); 
    }
    return alumny;
    }
    
    /**
     *
     * @param persona
     */
    public void buscar(String [][]persona){
    String nombre=JOptionPane.showInputDialog("De quien quieres saber la nota");
        for (int i = 0; i < persona.length; i++) {
           for (int j = 0; j < persona.length; j++) {
            if(nombre==persona[j][0]){
                System.out.println(persona[j][0]+" ,"+persona[j][1]);
            }
           }
        }
        System.out.println("No hay nadie con eses nombre");
        }
    
    public void dni(int numero){
    int divi=numero/23;
    char letra;
    if(divi==0){
    letra='T';
    }else if(divi==1){
    letra='R';
    }else if(divi==2){
    letra='W';
    }else if(divi==3){
    letra='A';
    }else if(divi==4){
    letra='G';
    }else if(divi==5){
    letra='M';
    }else if(divi==6){
    letra='Y';
    }else if(divi==7){
    letra='F';
    }else if(divi==8){
    letra='P';
    }else if(divi==9){
    letra='D';
    }else if(divi==10){
    letra='X';
    }else if(divi==11){
    letra='B';
    }else if(divi==12){
    letra='N';
    }else if(divi==13){
    letra='J';
    }else if(divi==14){
    letra='Z';
    }else if(divi==15){
    letra='S';
    }else if(divi==16){
    letra='Q';
    }else if(divi==17){
    letra='V';
    }else if(divi==18){
    letra='H';
    }else if(divi==19){
    letra='L';
    }else if(divi==20){
    letra='C';
    }else if(divi==21){
    letra='K';
    }else if(divi==22){
    letra='E';
    }else{
    System.out.println("Error");
    }
    }
    
    }

