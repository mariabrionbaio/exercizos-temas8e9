package tema8.vehiculos;

public class Moto extends Vehiculo{
    public String tipoManillar;
    
    public Moto(String marca, int velocidadMax, String tipoManillar){
        super(marca, velocidadMax);
        this.tipoManillar = tipoManillar;
        rodas = 2;
        
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de manillar: " + tipoManillar);
    }
    
}
