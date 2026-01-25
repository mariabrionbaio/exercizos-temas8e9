package tema8.figuras;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFiguras {

    public static void main(String[] args) {

        //v1//Figura2D f = new Figura2D();
        Figura2D f = new Figura2D(8.54f, 2.0145f, "cuadrado");
        f.verDim();

        Figura2D fv = new Figura2D();
        fv.setAlto(5.555f);

        System.out.println("O alto é " + fv.getAlto());

        //v1y2//Triangulo t = new Triangulo();
        //v3 crea el triángulo con constructor
        Triangulo t = new Triangulo("escaleno", 5.369f, 7.2015f, "triángulo");
        t.area();
        t.verDim();
        t.verEstilo();

        System.out.println("------------------------- TEMA 9 -----------------");

        Rectangulo re1 = new Rectangulo(0.25f, 3.65f);
        Rectangulo re2 = new Rectangulo(0.88f, 0.88f);

        System.out.println(re1.getNombre());
        System.out.println(re2.getNombre());

        Rectangulo r1 = new Rectangulo(5.26f, 5.26f);
        Rectangulo r2 = new Rectangulo(1.2f, 3.26f);
        Rectangulo r3 = new Rectangulo(5.2f, 8.5f);
        Rectangulo r4 = new Rectangulo(8.1f, 8.1f);

        ArrayList<Rectangulo> cosas = new ArrayList<>();

        cosas.add(r1);
        cosas.add(r2);
        cosas.add(r3);
        cosas.add(r4);

        System.out.println("Elementos en el ArrayList:");
        for (Rectangulo r : cosas) {
            System.out.println(r.getNombre());
        }

        TrianColor tc = new TrianColor("escaleno", 6.3f, 5.4f, "rosa");
        System.out.println("El triángulo " + tc.estilo + " es de color " + tc.getColor() + " y ...");
        tc.area();

        exercizo9_1();
        exercizo9_2();
    }

    public static void exercizo9_1() {
        Figura2D f = new Triangulo(5.05f);
        f.verDim();
        ((Triangulo) f).area();
    }

    public static void exercizo9_2() {
        Scanner teclado = new Scanner(System.in);
        String fig = " ";
        Figura2D f2d;

        do {
            System.out.println("Menú Elige tu figura: ");
            System.out.println("1) Triángulo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Triángulo de color");
            System.out.println("0) Salir");

            fig = teclado.nextLine();

            switch (fig) {
                case "1":
                    System.out.println("Pon una medida: ");
                    float med = teclado.nextFloat();
                    teclado.nextLine();
                    f2d = new Triangulo(2.35f);
                    f2d.verDim();
                    ((Triangulo) f2d).area();
                    break;
                case "2":
                    System.out.println("Pon alto y ancho en líneas separadas: ");
                    float med1 = teclado.nextFloat();
                    teclado.nextLine();
                    float med2 = teclado.nextFloat();
                    teclado.nextLine();
                    f2d = new Rectangulo(2.3f, 5.6f);
                    f2d.verDim();
                    System.out.println("Es cuadrado? " + ((Rectangulo) f2d).esCuadrado());
                    break;
                case "3":
                    System.out.println("Pon la medida y el color en 2 líneas diferentes");
                    float med4 = teclado.nextFloat();
                    teclado.nextLine();
                    String cor = teclado.nextLine();
                    f2d = new TrianColor("escaleno", med4, med4, cor);
                    System.out.println(f2d.toString());
                    ((Triangulo) f2d).area();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Valor no válido. Vuelve a intentarlo...");
            }
        } while (!fig.equals("0"));

    }

}
