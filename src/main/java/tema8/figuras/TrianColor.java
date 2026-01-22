package tema8.figuras;

public class TrianColor extends Triangulo{
    private String color;
    
    public TrianColor( String estilo, float alto, float ancho, String color){
        super(estilo, alto, ancho, "triangulo");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
