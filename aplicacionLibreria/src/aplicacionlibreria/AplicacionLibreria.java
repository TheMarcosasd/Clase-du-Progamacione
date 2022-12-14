/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionlibreria;


/**
 *
 * @author dam1
 */
public class AplicacionLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = PedirDatos.pedirString("Teclea el nombre de tus padres");
        System.out.println(valor);
        
        int nu = PedirDatos.pedirInt(22);
        System.out.println(nu);
    }
    
}
