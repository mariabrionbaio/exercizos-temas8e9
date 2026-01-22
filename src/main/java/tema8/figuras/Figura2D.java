package tema8.figuras;

public class Figura2D {
    //v1//public float ancho = 8.5f;
    //v1//public float alto = 5.6f;
    //v2: se ponen los parámetros privados y se añaden getters y setters
    private float ancho;
    private float alto;
    private String nombre;
    
    Figura2D(){
        ancho = alto = 0.0f;
    }
    
    public Figura2D(Figura2D fig){
        this.ancho = fig.getAncho();
        this.alto = fig.getAlto();
        this.nombre = fig.getNombre();
    }
    
    public Figura2D(float lado){
        ancho = alto = lado;
    }
    
    //v4 con constructor en clase madre
    public Figura2D(float alto, float ancho, String n){
        this.alto = alto;
        this.ancho = ancho;
        nombre = n;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void verDim(){
        System.out.printf("Alto: %.2f - Ancho: %.2f%n", alto, ancho);
    }
   
}
