
package ejemploobjetos;

public class Rectangulo {
    // declaro atributos
    public float base;
    private float altura;
    //Constructores
    public Rectangulo(float ba, float alt){  //constructor con parametros o parametrizado
    base=ba;
    altura=alt;
    }
    public Rectangulo(){ //constructor por defecto
        
    }
    //metodos de acceso getters & setters
    public void darValorAlt(float altu){ //equivale a set altura
       altura=altu;
    }
    public float devolverValorAltura(){ //equivale a get altura
        return altura;
    }
    public void setBase(float base){ //equivale a set base
       this.base=base;
    }
    public float getBase(){ //equivale a get base
        return base;
    }
    
    
    
    
    
    
    
    
    
    //defino metodos
    public float calcularArea (float b, float alt) {
        float area = b*alt;
        return area;
    }   
     public void calcularPerimetro (float b, float a) {
         float peri = 2*b+2*a;
         //System.out.println(" perimetro = "+ peri);
         System.out.println(" peri = "+ (2*b+2*a));   
     }  

}
