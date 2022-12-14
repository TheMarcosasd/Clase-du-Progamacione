/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalsimp;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Nein {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**CondicionalSimp obj1 = new CondicionalSimp();
        obj1.mayoredad(18);
        
        String res =JOptionPane.showInputDialog("La cecina esta muy rika");
        int edad=Integer.parseInt(res);
        obj1.mayoredad(edad);
        CondicionalDouble obj2 = new CondicionalDouble();
        obj2.consultaredad(edad);
        obj2.operarEdad(edad);**/
        int ed=pedirInt(" dame valor edad");
        CondicionalAnidado obj3 = new CondicionalAnidado();
        obj3.verEdad(ed);
    }
    public static int pedirInt(String mens){
    return Integer.parseInt(JOptionPane.showInputDialog(mens));
    }
    public void ver(){
    int respuesta = pedirInt("dame valor");
    System.out.println(respuesta);
    }
}
