/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploobj;

/**
 *
 * @author dam1
 */
public class EjemploObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo obxRec1 = new Rectangulo();
        float resultado = obxRec1.calcularArea(2, 3.0f);
        System.out.println("area = "+ resultado);
        obxRec1.calcularPerimetro(2, 3);
    }
    //instancio objeto tipo rectangulo con el constructor parametrizado
    Rectangulo objRec2 = new Rectangulo(5,8);
    float base =objRec2.getBase();
    float altura=objRec2.devolverValorAltura();
    float re=objRec2.calcularArea(base,altura);
    System.out.println("nuevo area ="+Rec1);
}
