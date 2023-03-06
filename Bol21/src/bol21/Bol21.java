/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bol21;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Bol21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Archivos obj = new Archivos();
        float []aux=obj.notas();
        int opcion;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("***ENU***\nl------>Numero aleatorio \n"
                + "2-->Aprobados\n3 ---> Media\n4 --->Mayor Nota \n5 --->Alumnos\n6 --->Buscar nota\n7 --->DNI"));
        
        switch(opcion){
            case 1:obj.aleatorio();
                break;
            case 2:obj.notas();
                break;
            case 3:obj.medi(aux);
                break;
            case 4:obj.notmaxima(aux);
                break;
            case 5:obj.alum(aux);
                break;
            case 6:obj.buscar(obj.alum(aux));
                break;
            case 7:obj.dni(PedirDatos.pedirInt(JOptionPane.showInputDialog("Numero dni")));
                break;
            case 8:System.exit(0);
                break;
            default:System.out.println("OPCION INCORRECTA");
        }
    }while(opcion<=8);
    }
    }
    

