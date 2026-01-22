package tema8.vehiculos;

public class Coche extends Vehiculo{
    public int portas;
    
    public Coche(String marca, int velocidadMax){
        super(marca, velocidadMax);
        portas = 5;
        super.rodas = 4;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Portas: " + portas);
    }
    
}
