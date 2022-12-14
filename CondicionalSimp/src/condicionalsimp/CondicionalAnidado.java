/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalsimp;

/**
 *
 * @author dam1
 */
public class CondicionalAnidado {
    public void verEdad(int edad){
    if(edad>=18){
    System.out.println("Tiene mas de 18 años");
    }else if(edad==18){
    System.out.println("Tiene 18 años");
    }else{
    System.out.println("Tiene menos de 18 años");
    }
    }
    
    public void verDiaSwitchCase(int dia){
    switch(dia){
        case 1:System.out.println("Lunes");
        break;
        case 2:System.out.println("Martes");
        break;
        case 3:System.out.println("Miercoles");
        break;
        case 4:System.out.println("jueves");
        break;
        case 5:System.out.println("Viernes");
        break;
        case 6:System.out.println("Sabado");
        break;
        case 7:System.out.println("Domingo");
        break;
        default:System.out.println("Error");
    }
    }
}
