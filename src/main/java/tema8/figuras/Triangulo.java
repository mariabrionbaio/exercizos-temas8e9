package tema8.figuras;

public class Triangulo extends Figura2D {
    public String estilo;
    
    public Triangulo(){
        super();
        estilo = null;
    }
    
    public Triangulo(float igual){
        super(igual);
    }
    
    public Triangulo(Triangulo tri){
        this.estilo = tri.estilo;
    }
    
    //v3 con constructor vacío en clase hija
    //v4 con constructor + param en clase hija
    public Triangulo(String estilo, float alto, float ancho, String nome){
        super(alto, ancho, nome); 
        
        this.estilo = estilo;
        super.setAlto(alto);
        super.setAncho(ancho);

    }
        
    public float area(){
        //v2 con los parámetros privados:
        float alto = getAlto();
        float ancho = getAncho();
        //el resto queda igual que estaba en la v1
        System.out.printf("El área del triángulo es %.2f x %.2f / 2 = %.2f%n", alto, ancho, alto*ancho/2);
        return alto * ancho / 2;
    }
    
    public void verEstilo(){
        System.out.printf("Es un triángulo %s", estilo);
    }
}
