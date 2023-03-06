/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bol21;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Byte.parseByte;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Short.parseShort;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class PedirDatos {
    public static String pedirString(String mensaje){
    return JOptionPane.showInputDialog(mensaje);
    }
    
    public static int pedirInt(String mensaje){
    return parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public static short pedirShort(String mensaje){
    return parseShort(JOptionPane.showInputDialog(mensaje));
    }
    public static byte pedirByte(String mensaje){
    return parseByte(JOptionPane.showInputDialog(mensaje));
    }
    public static long pedirSlong(String mensaje){
    return parseLong(JOptionPane.showInputDialog(mensaje));
    }
    public static float pedirFloat(String mensaje){
    return parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    public static double pedirDouble(String mensaje){
    return parseDouble(JOptionPane.showInputDialog(mensaje));
    }
    public static boolean pedirBoolean(String mensaje){
    return parseBoolean(JOptionPane.showInputDialog(mensaje));
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
