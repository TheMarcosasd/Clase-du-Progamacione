/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalsimp;

/**
 *
 * @author dam1
 */
public class CondicionalDouble {
    public void consultaredad(int edad){
    if(edad>=18){
        System.out.println("Eres mayor de edad");
    }else{
    System.out.println("Eres menor de edad");
    }
    }
    public void operarEdad(int edad){
        String  res=(edad>=18)? "mayor":"menor";
        System.out.println(res);
    }
    
}
