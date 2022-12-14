/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condciej;

/**
 *
 * @author dam1
 */
public class Metodos {
    public void calcParoImp(){
    int i =1;
    int sw=0;
    int contador = 0;
    int acumular=1;
    while(i<11){
    if(sw==0){
    contador =contador+i;
    sw=1;
    }else{
    acumular=acumular*i;
    sw=0;
    }
    i++;
    }
    System.out.println("Contador final "+contador);
    System.out.println("Acumular final "+acumular);
    }
}
