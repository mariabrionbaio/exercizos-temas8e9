package tema8.padre;

public class MainPadre {

    public static void main(String[] args) {
        
        Padre p1 = new Hijo("Juan");
        
        p1.minusc();
       
        System.out.println("O nome é " + p1.nombre);   //funciona
        
        ((Hijo)p1).cumple();
        
        System.out.println("A idade é " + ((Hijo)p1).edad);
        
        p1.cambiaNombre();
        
        System.out.println(p1.nombre);
        
        ((Hijo)p1).cambiaNombre("Maruja");
        
    }
    
}
