package tema8.figuras;

public class TrianColor extends Triangulo {

    private String color;

    public TrianColor(String estilo, float alto, float ancho, String color) {
        super(estilo, alto, ancho, "triangulo");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float area() {
        //v2 con los parámetros privados:
        float alto = getAlto();
        float ancho = getAncho();
        //el resto queda igual que estaba en la v1
        System.out.printf("El área del triángulo es %.2f x %.2f / 2 = %.2f%n", alto, ancho, alto * ancho / 2);
        return alto * ancho / 2;
    }

}
