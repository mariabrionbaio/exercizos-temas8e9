package tema8.figuras;

public class Rectangulo extends Figura2D {
    
    public Rectangulo(float alto, float ancho, String nome){
        super(alto, ancho, nome);
    }
    
    public Rectangulo(float ancho, float alto){
        super.setAncho(ancho);
        super.setAlto(alto);
        if(esCuadrado())    super.setNombre("cuadrado");
        else                super.setNombre("rectángulo");
    }
    
    public boolean esCuadrado(){
        if(super.getAlto() == super.getAncho()) return true;
        else return false;
    }
}
