package tema8.figuras;

public class Rectangulo extends Figura2D {

    public Rectangulo(float alto, float ancho, String nome) {
        super(alto, ancho, nome);
    }

    public Rectangulo(float ancho, float alto) {
        super.setAncho(ancho);
        super.setAlto(alto);
        if (esCuadrado()) {
            super.setNombre("cuadrado");
        } else {
            super.setNombre("rectángulo");
        }
    }

    public boolean esCuadrado() {
        if (super.getAlto() == super.getAncho()) {
            return true;
        } else {
            return false;
        }
    }

    public float area() {
        //v2 con los parámetros privados:
        float alto = getAlto();
        float ancho = getAncho();
        //el resto queda igual que estaba en la v1
        System.out.printf("El área del rectángulo es %.2f x %.2f / 2 = %.2f%n", alto, ancho, alto * ancho);
        return alto * ancho;
    }

}
