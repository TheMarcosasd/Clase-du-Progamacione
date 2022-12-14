
package ejemploobjetos;

public class EjemploObjetos {

    public static void main(String[] args) {
        
        
        Rectangulo obxRec1 = new Rectangulo();
        float resultado = obxRec1.calcularArea(2, 3.0f);
        System.out.println("area = "+ resultado);
        obxRec1.calcularPerimetro(2, 3);
    
    //instancio objeto tipo rectangulo con el constructor parametrizado
    Rectangulo obxRec2 = new Rectangulo(5,8);
    float base =obxRec2.getBase();
    float altura=obxRec2.devolverValorAltura();
    float re=obxRec2.calcularArea(base,altura);
    System.out.println("nueva area = "+re);
    }
}
