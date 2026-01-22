package tema8.padre;

public class Hijo extends Padre {

    public int edad;

    public Hijo(String n) {
        super(n);
        edad = 10;
    }

    @Override
    void cambiaNombre() {
        super.cambiaNombre();
        this.nombre += " (es Hijo)";
    }
    
    void cambiaNombre(String s){
        System.out.println("O novo nome é " + s);
    }

    void cumple() {
        edad++;
    }
}
