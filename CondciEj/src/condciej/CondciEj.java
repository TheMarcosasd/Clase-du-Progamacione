/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condciej;

/**
 *
 * @author dam1
 */
public class CondciEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i =1;
    int sw=0;
    int contador = 0;
    int acumular=1;
    while(i<11){
    if(sw==1){
    contador =contador+i;
    sw=0;
    }else{
    acumular=acumular*i;
    sw=1;
    }
    i++;
    }
    System.out.println("Contador final "+contador);
    System.out.println("Acumular final "+acumular);
        }
    }
    
