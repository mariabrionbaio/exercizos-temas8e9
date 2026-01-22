package tema8.vehiculos;

public class CocheElectrico extends Coche{
    int autonomia;
    public CocheElectrico(String marca, int vm, int autonomia ){
        super(marca, vm);
        this.autonomia = autonomia;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Autonomía: " + autonomia);
    }
}
