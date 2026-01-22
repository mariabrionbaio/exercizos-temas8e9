package tema8.vehiculos;

public class Vehiculo {
    public String marca;
    public int velocidadMax;
    public int rodas;
    
    public Vehiculo(String marca, int velocMax){
        this.marca = marca;
        velocidadMax = velocMax;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade máxima: " + velocidadMax + "km/h");
        System.out.println("Rodas: " + rodas);
    }
}
