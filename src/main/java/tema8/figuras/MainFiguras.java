package tema8.figuras;

import java.util.ArrayList;

public class MainFiguras {

    public static void main(String[] args) {
       
        //v1//Figura2D f = new Figura2D();
        Figura2D f = new Figura2D(8.54f,2.0145f,"cuadrado");
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
        
        
        Rectangulo r1 = new Rectangulo(5.26f,5.26f);
        Rectangulo r2 = new Rectangulo(1.2f,3.26f);
        Rectangulo r3 = new Rectangulo(5.2f,8.5f);
        Rectangulo r4 = new Rectangulo(8.1f,8.1f);
        
        ArrayList<Rectangulo> cosas = new ArrayList<>();
        
        cosas.add(r1);
        cosas.add(r2);
        cosas.add(r3);
        cosas.add(r4);
        
        System.out.println("Elementos en el ArrayList:");
        for (Rectangulo r: cosas){
            System.out.println(r.getNombre()); 
        }
        
        TrianColor tc = new TrianColor("escaleno", 6.3f, 5.4f, "rosa");
        System.out.println("El triángulo " + tc.estilo + " es de color " + tc.getColor() + " y ...");
        tc.area();
    }
    
    
}
