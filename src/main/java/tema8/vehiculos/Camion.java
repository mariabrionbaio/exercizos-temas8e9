package tema8.vehiculos;

public class Camion extends Vehiculo {
    public int cargaMax;
    
    public Camion(String marca, int velocidadMax, int cargaMax){
        super(marca, velocidadMax);
        this.cargaMax = cargaMax;
        this.rodas = 8;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Carga Máxima: " + cargaMax);
    }
    
}

