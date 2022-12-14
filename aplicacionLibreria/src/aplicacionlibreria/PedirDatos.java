/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionlibreria;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class PedirDatos {
    public static String pedirString(String mensaje){
    return JOptionPane.showInputDialog(mensaje);
    }
    
    public static int pedirInt(int numero){
    return numero;
    }
    public static short pedirShort(short numerox){
    return numerox;
    }
    public static byte pedirByte(byte numeropeque){
    return numeropeque;
    }
    public static long pedirSlong(long numerogrande){
    return numerogrande;
    }
    public static float pedirFloat(float decimal){
    return decimal;
    }
    public static double pedirDouble(double centadecimal){
    return centadecimal;
    }
    public static boolean pedirBoolean(boolean truth){
    return truth;
    }
    public static int validarDatos(int nota){
    if(nota>=0){
    if(nota<=10){
    return nota;
    }else{
    return 0;}
    }else{
    return 0;}
    }
}
